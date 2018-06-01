package Composition;
import javax.persistence.*;
public class App {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jdemeis.jpa");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Employee e = new Employee();
		e.setName("Bob");
		Address a = new Address();
		a.setEmployee(e);
		e.setAddress(a);
		a.setAddressName("12371 Catawba Ave");
		a.setZipCode(28031);
		
		manager.persist(a);
		manager.persist(e);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
