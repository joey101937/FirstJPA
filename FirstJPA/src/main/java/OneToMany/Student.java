package OneToMany;

import javax.persistence.*;

//Table is implied because of Entity tag
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	public Student(String name, University university) {
		super();
		this.name = name;
		this.university = university;
	}
	
	public Student(){
		
	}

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

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	private String name;

	@ManyToOne
	@JoinColumn(name="universityID")
	private University university;
}
