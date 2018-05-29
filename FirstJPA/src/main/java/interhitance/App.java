package interhitance;

import javax.persistence.*;
import javax.persistence.Persistence;

public class App {
	
	public static void main(String[] args){
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.jdemeis.jpa");	
	EntityManager manager = factory.createEntityManager();
	manager.getTransaction().begin();
	
	Car car = new Car("ferrari",100);
	Bus bus = new Bus("CATs",200);
	
	manager.persist(car);
	manager.persist(bus);
	
	manager.getTransaction().commit();
	manager.close();
	factory.close();
	}
}
