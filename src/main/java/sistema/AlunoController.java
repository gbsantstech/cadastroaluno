package sistema;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import estudante.Aluno;

public class AlunoController {

	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("aluno-jpa");
	 EntityManager em = emf.createEntityManager();
	 
	 public void salvar(Aluno aluno) {
		 em.getTransaction().begin();
		 em.merge(aluno);
		 em.getTransaction().commit();
		 em.close();
		 emf.close();
	 }
	 
	 public void remover(Aluno aluno) {
		 em.getTransaction().begin();
		 Query q = em.createNativeQuery("DELETE aluno FROM aluno WHERE matricula = " +aluno.getMatricula());
		 q.executeUpdate();
		 em.getTransaction().commit();
		 em.close();
		 emf.close();
	 }
	 
	 public List<Aluno> listar (){
		 em.getTransaction().begin();
		 Query consulta = em.createQuery("SELECT  aluno FROM Aluno aluno");
		 List<Aluno> lista = consulta.getResultList();
		 em.getTransaction().commit();
		 em.close();
		 emf.close();
		 return lista;
	 }
}
