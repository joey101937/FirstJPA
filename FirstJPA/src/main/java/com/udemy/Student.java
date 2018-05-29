package com.udemy;

import javax.persistence.*;

@Entity
// this name is defaulting to class name
@Table(name = "STUDENT_TABLE")
// this name is explicitly defined
public class Student {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	// auto generate primary key id
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	
	
	public Student() {

	}

	// ////GETTERS AND SETTERS///////////

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
