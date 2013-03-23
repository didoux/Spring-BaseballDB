package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fielding database table.
 * 
 */
@Entity
@Table(name="fielding")
public class Fielding implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FieldingPK id;

	private int a;

	private int cs;

	private int dp;

	private int e;

	private int g;

	private int gs;

	private int innOuts;

	@Column(length=2)
	private String lgID;

	private int pb;

	private int po;

	private int sb;

	@Column(length=3)
	private String teamID;

	private int wp;

	private double zr;

	public Fielding() {
	}

	public FieldingPK getId() {
		return this.id;
	}

	public void setId(FieldingPK id) {
		this.id = id;
	}

	public int getA() {
		return this.a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getCs() {
		return this.cs;
	}

	public void setCs(int cs) {
		this.cs = cs;
	}

	public int getDp() {
		return this.dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}

	public int getE() {
		return this.e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getG() {
		return this.g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getGs() {
		return this.gs;
	}

	public void setGs(int gs) {
		this.gs = gs;
	}

	public int getInnOuts() {
		return this.innOuts;
	}

	public void setInnOuts(int innOuts) {
		this.innOuts = innOuts;
	}

	public String getLgID() {
		return this.lgID;
	}

	public void setLgID(String lgID) {
		this.lgID = lgID;
	}

	public int getPb() {
		return this.pb;
	}

	public void setPb(int pb) {
		this.pb = pb;
	}

	public int getPo() {
		return this.po;
	}

	public void setPo(int po) {
		this.po = po;
	}

	public int getSb() {
		return this.sb;
	}

	public void setSb(int sb) {
		this.sb = sb;
	}

	public String getTeamID() {
		return this.teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public int getWp() {
		return this.wp;
	}

	public void setWp(int wp) {
		this.wp = wp;
	}

	public double getZr() {
		return this.zr;
	}

	public void setZr(double zr) {
		this.zr = zr;
	}

}