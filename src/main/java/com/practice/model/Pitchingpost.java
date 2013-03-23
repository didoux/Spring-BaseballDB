package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pitchingpost database table.
 * 
 */
@Entity
@Table(name="pitchingpost")
public class Pitchingpost implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PitchingpostPK id;

	private double BAOpp;

	private int bb;

	private int bfp;

	private int bk;

	private int cg;

	private int er;

	private double era;

	private int g;

	private int gf;

	private int gidp;

	private int gs;

	private int h;

	private int hbp;

	private int hr;

	private int ibb;

	private int IPouts;

	private int l;

	@Column(length=2)
	private String lgID;

	private int r;

	private int sf;

	private int sh;

	private int sho;

	private int so;

	private int sv;

	@Column(length=3)
	private String teamID;

	private int w;

	private int wp;

	public Pitchingpost() {
	}

	public PitchingpostPK getId() {
		return this.id;
	}

	public void setId(PitchingpostPK id) {
		this.id = id;
	}

	public double getBAOpp() {
		return this.BAOpp;
	}

	public void setBAOpp(double BAOpp) {
		this.BAOpp = BAOpp;
	}

	public int getBb() {
		return this.bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getBfp() {
		return this.bfp;
	}

	public void setBfp(int bfp) {
		this.bfp = bfp;
	}

	public int getBk() {
		return this.bk;
	}

	public void setBk(int bk) {
		this.bk = bk;
	}

	public int getCg() {
		return this.cg;
	}

	public void setCg(int cg) {
		this.cg = cg;
	}

	public int getEr() {
		return this.er;
	}

	public void setEr(int er) {
		this.er = er;
	}

	public double getEra() {
		return this.era;
	}

	public void setEra(double era) {
		this.era = era;
	}

	public int getG() {
		return this.g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getGf() {
		return this.gf;
	}

	public void setGf(int gf) {
		this.gf = gf;
	}

	public int getGidp() {
		return this.gidp;
	}

	public void setGidp(int gidp) {
		this.gidp = gidp;
	}

	public int getGs() {
		return this.gs;
	}

	public void setGs(int gs) {
		this.gs = gs;
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

	public int getIPouts() {
		return this.IPouts;
	}

	public void setIPouts(int IPouts) {
		this.IPouts = IPouts;
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

	public int getR() {
		return this.r;
	}

	public void setR(int r) {
		this.r = r;
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

	public int getSho() {
		return this.sho;
	}

	public void setSho(int sho) {
		this.sho = sho;
	}

	public int getSo() {
		return this.so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public int getSv() {
		return this.sv;
	}

	public void setSv(int sv) {
		this.sv = sv;
	}

	public String getTeamID() {
		return this.teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public int getW() {
		return this.w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getWp() {
		return this.wp;
	}

	public void setWp(int wp) {
		this.wp = wp;
	}

}