# Cadastro Aluno
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/gbsantstech/cadastroaluno/blob/master/LICENSE) 

Cadastro Aluno é um projeto back-end que consiste executar as operações de SELECT, INSERT E DELETE, do SQL usando o framework Hibernate.  

## Conhecimentos adquiridos:
- JPA (Java Persistence API)
- Hibernate
- MVC

## Explicação:
- JPA e Hibernate foram usadas para a conexão com o banco de dados e também para efetuar as operações básicas do SQL, como SELECT,INSERT e DELETE
- De acordo com o padrão JPA foi criado o arquivo de configuração "persistence.xml" o qual contém a URL do banco e a implementação do framework Hibernate.
- View é a tela do banco de dados visualizada pelo usuário do sistema; 
- Controller foi criada uma classe que contém todas as transações que executam as operações SQL, ou seja, por meio da classe AlunoController é feita as requisições ao banco de dados; 
- Model é onde essa requisições são recebidas, segundo as regras de negócio e os objetos instanciados na classe ObjetoAluno.

## Pré-requisitos:
- JavaSE-11

Saber qual a versão do Java usado no projeto é importante para a compilação correta do código. 

## Autor:
Gabriel Santos

https://www.linkedin.com/in/gabrielsants/
