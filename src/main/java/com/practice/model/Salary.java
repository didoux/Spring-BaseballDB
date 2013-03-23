package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the salaries database table.
 * 
 */
@Entity
@Table(name="salaries")
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalaryPK id;

	private double salary;

	public Salary() {
	}

	public SalaryPK getId() {
		return this.id;
	}

	public void setId(SalaryPK id) {
		this.id = id;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}