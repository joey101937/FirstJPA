package mappedSuperclass;

import javax.persistence.*;


public class App {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jdemeis.jpa");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Person p = new Person("zach",21,false);
		manager.persist(p);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();		
	}
}
