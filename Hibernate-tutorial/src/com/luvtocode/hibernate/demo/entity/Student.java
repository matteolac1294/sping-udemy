package com.luvtocode.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	public Student(String firstNamae, String lasttNamae, String email) {
		super();
		this.firstName = firstNamae;
		this.lastNamae = lasttNamae;
		this.email = email;
	}

	public Student() {
		super();
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastNamae;

	@Column(name = "email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstNamae() {
		return firstName;
	}

	public void setFirstNamae(String firstNamae) {
		this.firstName = firstNamae;
	}

	public String getLasttNamae() {
		return lastNamae;
	}

	public void setLasttNamae(String lasttNamae) {
		this.lastNamae = lasttNamae;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
