package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the managers database table.
 * 
 */
@Entity
@Table(name="managers")
public class Manager implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ManagerPK id;

	private int g;

	private int l;

	@Column(length=2)
	private String lgID;

	@Column(length=10)
	private String managerID;

	@Column(length=1)
	private String plyrMgr;

	private int rank;

	private int w;

	public Manager() {
	}

	public ManagerPK getId() {
		return this.id;
	}

	public void setId(ManagerPK id) {
		this.id = id;
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

	public String getLgID() {
		return this.lgID;
	}

	public void setLgID(String lgID) {
		this.lgID = lgID;
	}

	public String getManagerID() {
		return this.managerID;
	}

	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}

	public String getPlyrMgr() {
		return this.plyrMgr;
	}

	public void setPlyrMgr(String plyrMgr) {
		this.plyrMgr = plyrMgr;
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