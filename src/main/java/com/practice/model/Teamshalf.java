package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the teamshalf database table.
 * 
 */
@Entity
@Table(name="teamshalf")
public class Teamshalf implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TeamshalfPK id;

	@Column(length=1)
	private String divID;

	@Column(length=1)
	private String divWin;

	private int g;

	private int l;

	private int rank;

	private int w;

	public Teamshalf() {
	}

	public TeamshalfPK getId() {
		return this.id;
	}

	public void setId(TeamshalfPK id) {
		this.id = id;
	}

	public String getDivID() {
		return this.divID;
	}

	public void setDivID(String divID) {
		this.divID = divID;
	}

	public String getDivWin() {
		return this.divWin;
	}

	public void setDivWin(String divWin) {
		this.divWin = divWin;
	}

	public int getG() {
		return this.g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getL() {
		return this.l;
	}

	public void setL(int l) {
		this.l = l;
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