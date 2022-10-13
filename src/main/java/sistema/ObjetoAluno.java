package sistema;

import java.util.List;

import estudante.Aluno;

public class ObjetoAluno {
	
	public static void main(String[] args) {
//		Aluno a1 = new Aluno ();
//		a1.setNome("Gabriel Santos");
//		a1.setIdade(28);
//		a1.setMatricula("123456789");
		
		Aluno a2 = new Aluno ();
		a2.setNome("Diogo Di Blasi");
		a2.setIdade(30);
		a2.setMatricula("123456780");
		
//		Aluno a3 = new Aluno ();
//		a3.setNome("Felipe Beser");
//		a3.setIdade(33);
//		a3.setMatricula("123456781");
//		
	
		AlunoController ac = new AlunoController();
		
//		ac.salvar(a1);
		ac.salvar(a2);
//		ac.salvar(a3);
		
//		ac.remover(a2);
		
//		List<Aluno> lista = ac.listar();
//		
//		for (int i = 0; i < lista.size(); i++) {
//			
//			System.out.println("Nome: " +lista.get(i).getNome() + " - Idade: " +lista.get(i).getIdade() + " - Matricula: " +lista.get(i).getMatricula() );
//		}
	}
}
