package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the schools database table.
 * 
 */
@Entity
@Table(name="schools")
public class School implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=15)
	private String schoolID;

	@Column(length=55)
	private String schoolCity;

	@Column(length=255)
	private String schoolName;

	@Column(length=55)
	private String schoolNick;

	@Column(length=55)
	private String schoolState;

	public School() {
	}

	public String getSchoolID() {
		return this.schoolID;
	}

	public void setSchoolID(String schoolID) {
		this.schoolID = schoolID;
	}

	public String getSchoolCity() {
		return this.schoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolNick() {
		return this.schoolNick;
	}

	public void setSchoolNick(String schoolNick) {
		this.schoolNick = schoolNick;
	}

	public String getSchoolState() {
		return this.schoolState;
	}

	public void setSchoolState(String schoolState) {
		this.schoolState = schoolState;
	}

}