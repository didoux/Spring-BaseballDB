package com.practice.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the teams database table.
 * 
 */
@Entity
@Table(name="teams")
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TeamPK id;
	private int _2b;
	private int _3b;
	private int ab;
	private int attendance;
	private int bb;
	private int bba;
	private int bpf;
	private int cg;
	private int cs;
	private String divID;
	private String divWin;
	private int dp;
	private int e;
	private int er;
	private double era;
	private double fp;
	private String franchID;
	private int g;
	private int ghome;
	private int h;
	private int ha;
	private int hbp;
	private int hr;
	private int hra;
	private int IPouts;
	private int l;
	private String lgWin;
	private String name;
	private String park;
	private int ppf;
	private int r;
	private int ra;
	private int rank;
	private int sb;
	private int sf;
	private int sho;
	private int so;
	private int soa;
	private int sv;
	@Column(length=3)
	private String teamIDBR;
	@Column(length=3)
	private String teamIDlahman45;
	@Column(length=3)
	private String teamIDretro;
	private int w;
	@Column(length=1)
	private String WCWin;
	@Column(length=1)
	private String WSWin;
	
	//bi-directional many-to-one association to Batting
	//@OneToMany(mappedBy="battingTeam", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//private List<Batting> battings = new ArrayList<Batting>();

	//bi-directional many-to-one association to Pitching
	//@OneToMany(mappedBy="pitchingTeam", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//private List<Pitching> pitchings = new ArrayList<Pitching>();

	public Team() {
	}

	public TeamPK getId() {
		return this.id;
	}

	public void setId(TeamPK id) {
		this.id = id;
	}

	@Column(name="2B")
	public int get_2b() {
		return this._2b;
	}

	public void set_2b(int _2b) {
		this._2b = _2b;
	}

	@Column(name="3B")
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

	public int getAttendance() {
		return this.attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getBb() {
		return this.bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getBba() {
		return this.bba;
	}

	public void setBba(int bba) {
		this.bba = bba;
	}

	public int getBpf() {
		return this.bpf;
	}

	public void setBpf(int bpf) {
		this.bpf = bpf;
	}

	public int getCg() {
		return this.cg;
	}

	public void setCg(int cg) {
		this.cg = cg;
	}

	public int getCs() {
		return this.cs;
	}

	public void setCs(int cs) {
		this.cs = cs;
	}

	@Column(length=1)
	public String getDivID() {
		return this.divID;
	}

	public void setDivID(String divID) {
		this.divID = divID;
	}

	@Column(length=1)
	public String getDivWin() {
		return this.divWin;
	}

	public void setDivWin(String divWin) {
		this.divWin = divWin;
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

	public double getFp() {
		return this.fp;
	}

	public void setFp(double fp) {
		this.fp = fp;
	}

	@Column(length=3)
	public String getFranchID() {
		return this.franchID;
	}

	public void setFranchID(String franchID) {
		this.franchID = franchID;
	}

	public int getG() {
		return this.g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getGhome() {
		return this.ghome;
	}

	public void setGhome(int ghome) {
		this.ghome = ghome;
	}

	public int getH() {
		return this.h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getHa() {
		return this.ha;
	}

	public void setHa(int ha) {
		this.ha = ha;
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

	public int getHra() {
		return this.hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
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

	@Column(length=1)
	public String getLgWin() {
		return this.lgWin;
	}

	public void setLgWin(String lgWin) {
		this.lgWin = lgWin;
	}

	@Column(length=50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=255)
	public String getPark() {
		return this.park;
	}

	public void setPark(String park) {
		this.park = park;
	}

	public int getPpf() {
		return this.ppf;
	}

	public void setPpf(int ppf) {
		this.ppf = ppf;
	}

	public int getR() {
		return this.r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getRa() {
		return this.ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
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

	public int getSoa() {
		return this.soa;
	}

	public void setSoa(int soa) {
		this.soa = soa;
	}

	public int getSv() {
		return this.sv;
	}

	public void setSv(int sv) {
		this.sv = sv;
	}

	public String getTeamIDBR() {
		return this.teamIDBR;
	}

	public void setTeamIDBR(String teamIDBR) {
		this.teamIDBR = teamIDBR;
	}

	public String getTeamIDlahman45() {
		return this.teamIDlahman45;
	}

	public void setTeamIDlahman45(String teamIDlahman45) {
		this.teamIDlahman45 = teamIDlahman45;
	}

	public String getTeamIDretro() {
		return this.teamIDretro;
	}

	public void setTeamIDretro(String teamIDretro) {
		this.teamIDretro = teamIDretro;
	}

	public int getW() {
		return this.w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public String getWCWin() {
		return this.WCWin;
	}

	public void setWCWin(String WCWin) {
		this.WCWin = WCWin;
	}

	public String getWSWin() {
		return this.WSWin;
	}

	public void setWSWin(String WSWin) {
		this.WSWin = WSWin;
	}



}