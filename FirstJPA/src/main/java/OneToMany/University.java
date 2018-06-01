package OneToMany;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="universityID")
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy="university")
	private ArrayList<Student> students = new ArrayList<Student>();

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void addStudents(Student s){
		students.add(s);
	}
	public void removeStudents(Student s){
		students.remove(s);
	}
	
	
}
