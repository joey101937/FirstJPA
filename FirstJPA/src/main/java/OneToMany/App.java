package OneToMany;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jdemeis.jpa");	
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		University u = new University();
		u.setName("UNCC");
		Student s = new Student("Joe",u);
		Student s2 = new Student("Bob",u);
		
		manager.persist(u);
		manager.persist(s2);
		manager.persist(s);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
