package mappedSuperclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Person extends AbstractPerson{
	private String name;
	private int age;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return this.getName();
	}
	
	public Person(String name, int age, boolean drive){
		this.name=name;
		this.age=age;
		this.drivingLicence = drive;
	}
	
}
