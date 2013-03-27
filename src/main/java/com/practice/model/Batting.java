package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the batting database table.
 * 
 */
@Entity
@Table(name="batting")
public class Batting implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BattingPK id;

	@Column(name="2B")
	private Integer _2b;

	@Column(name="3B")
	private Integer _3b;

	private Integer ab;

	private Integer bb;

	private Integer cs;

	private Integer g;

	private Integer g_batting;

	private Integer g_old;

	private Integer gidp;

	private Integer h;

	private Integer hbp;

	private Integer hr;

	private Integer ibb;

	@Column(length=2)
	private String lgID;

	private Integer r;

	private Integer rbi;

	private Integer sb;

	private Integer sf;

	private Integer sh;

	private Integer so;

	@Column(length=3)
	private String teamID;

	public Batting() {
	}

	public BattingPK getId() {
		return this.id;
	}

	public void setId(BattingPK id) {
		this.id = id;
	}

	public int get_2b() {
		return this._2b;
	}

	public void set_2b(int _2b) {
		this._2b = _2b;
	}

	public int get_3b() {
		return this._3b;
	}

	public void set_3b(int _3b) {
		this._3b = _3b;
	}

	public int getAb() {
		return this.ab;
	}

	public void setAb(int ab) {
		this.ab = ab;
	}

	public int getBb() {
		return this.bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getCs() {
		return this.cs;
	}

	public void setCs(int cs) {
		this.cs = cs;
	}

	public int getG() {
		return this.g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getG_batting() {
		return this.g_batting;
	}

	public void setG_batting(int g_batting) {
		this.g_batting = g_batting;
	}

	public Integer getG_old() {
		return this.g_old;
	}

	public void setG_old(Integer g_old) {
		this.g_old = g_old;
	}

	public int getGidp() {
		return this.gidp;
	}

	public void setGidp(int gidp) {
		this.gidp = gidp;
	}

	public int getH() {
		return this.h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getHbp() {
		return this.hbp;
	}

	public void setHbp(int hbp) {
		this.hbp = hbp;
	}

	public int getHr() {
		return this.hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getIbb() {
		return this.ibb;
	}

	public void setIbb(int ibb) {
		this.ibb = ibb;
	}

	public String getLgID() {
		return this.lgID;
	}

	public void setLgID(String lgID) {
		this.lgID = lgID;
	}

	public int getR() {
		return this.r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getRbi() {
		return this.rbi;
	}

	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	public int getSb() {
		return this.sb;
	}

	public void setSb(int sb) {
		this.sb = sb;
	}

	public int getSf() {
		return this.sf;
	}

	public void setSf(int sf) {
		this.sf = sf;
	}

	public int getSh() {
		return this.sh;
	}

	public void setSh(int sh) {
		this.sh = sh;
	}

	public int getSo() {
		return this.so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public String getTeamID() {
		return this.teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

}