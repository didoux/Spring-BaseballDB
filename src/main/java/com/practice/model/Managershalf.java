package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the managershalf database table.
 * 
 */
@Entity
@Table(name="managershalf")
public class Managershalf implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ManagershalfPK id;

	private int g;

	private int inseason;

	private int l;

	@Column(length=2)
	private String lgID;

	private int rank;

	private int w;

	public Managershalf() {
	}

	public ManagershalfPK getId() {
		return this.id;
	}

	public void setId(ManagershalfPK id) {
		this.id = id;
	}

	public int getG() {
		return this.g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getInseason() {
		return this.inseason;
	}

	public void setInseason(int inseason) {
		this.inseason = inseason;
	}

	public int getL() {
		return this.l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public String getLgID() {
		return this.lgID;
	}

	public void setLgID(String lgID) {
		this.lgID = lgID;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getW() {
		return this.w;
	}

	public void setW(int w) {
		this.w = w;
	}

}