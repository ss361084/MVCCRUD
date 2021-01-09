package com.sumit.crudapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Student {

	enum Gender {
		MALE,FEMALE,OTHER
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studId;
	@NotBlank(message = "Please Enter Name")
	@Column(name = "name")
	private String name;
	@Min(value = 1, message = "Number shold be Positive")
	@Column(name = "age")
	private int age;
	@NotNull(message = "Please Enter gender")
	@Column(name = "gender")
	private Gender gender;
	
	public long getStudId() {
		return studId;
	}
	public void setStudId(long studId) {
		this.studId = studId;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Student(long studId, String name, int age, Gender gender) {
		super();
		this.studId = studId;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
