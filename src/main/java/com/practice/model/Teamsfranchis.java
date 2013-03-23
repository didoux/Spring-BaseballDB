package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the teamsfranchises database table.
 * 
 */
@Entity
@Table(name="teamsfranchises")
public class Teamsfranchis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=3)
	private String franchID;

	@Column(length=2)
	private String active;

	@Column(length=50)
	private String franchName;

	@Column(length=3)
	private String NAassoc;

	public Teamsfranchis() {
	}

	public String getFranchID() {
		return this.franchID;
	}

	public void setFranchID(String franchID) {
		this.franchID = franchID;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getFranchName() {
		return this.franchName;
	}

	public void setFranchName(String franchName) {
		this.franchName = franchName;
	}

	public String getNAassoc() {
		return this.NAassoc;
	}

	public void setNAassoc(String NAassoc) {
		this.NAassoc = NAassoc;
	}

}