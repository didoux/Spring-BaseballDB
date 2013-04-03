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
	private Integer _2b;
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
	private Integer r;
	private Integer rbi;
	private Integer sb;
	private Integer sf;
	private Integer sh;
	private Integer so;
	private Master master;
	private Team battingTeam;


	public Batting() {
	}

	public BattingPK getId() {
		return this.id;
	}

	public void setId(BattingPK id) {
		this.id = id;
	}

	@Column(name="2B")
	public int get_2b() {
		return this._2b;
	}

	public void set_2b(Integer _2b) {
		this._2b = _2b;
	}

	@Column(name="3B")
	public Integer get_3b() {
		return this._3b;
	}

	public void set_3b(Integer _3b) {
		this._3b = _3b;
	}

	public int getAb() {
		return this.ab;
	}

	public void setAb(Integer ab) {
		this.ab = ab;
	}

	public Integer getBb() {
		return this.bb;
	}

	public void setBb(Integer bb) {
		this.bb = bb;
	}

	public int getCs() {
		return this.cs;
	}

	public void setCs(Integer cs) {
		this.cs = cs;
	}

	public Integer getG() {
		return this.g;
	}

	public void setG(Integer g) {
		this.g = g;
	}

	public Integer getG_batting() {
		return this.g_batting;
	}

	public void setG_batting(Integer g_batting) {
		this.g_batting = g_batting;
	}

	public Integer getG_old() {
		return this.g_old;
	}

	public void setG_old(Integer g_old) {
		this.g_old = g_old;
	}

	public Integer getGidp() {
		return this.gidp;
	}

	public void setGidp(Integer gidp) {
		this.gidp = gidp;
	}

	public Integer getH() {
		return this.h;
	}

	public void setH(Integer h) {
		this.h = h;
	}

	public Integer getHbp() {
		return this.hbp;
	}

	public void setHbp(Integer hbp) {
		this.hbp = hbp;
	}

	public Integer getHr() {
		return this.hr;
	}

	public void setHr(Integer hr) {
		this.hr = hr;
	}

	public Integer getIbb() {
		return this.ibb;
	}

	public void setIbb(Integer ibb) {
		this.ibb = ibb;
	}


	public Integer getR() {
		return this.r;
	}

	public void setR(Integer r) {
		this.r = r;
	}

	public Integer getRbi() {
		return this.rbi;
	}

	public void setRbi(Integer rbi) {
		this.rbi = rbi;
	}

	public Integer getSb() {
		return this.sb;
	}

	public void setSb(Integer sb) {
		this.sb = sb;
	}

	public Integer getSf() {
		return this.sf;
	}

	public void setSf(int sf) {
		this.sf = sf;
	}

	public Integer getSh() {
		return this.sh;
	}

	public void setSh(Integer sh) {
		this.sh = sh;
	}

	public Integer getSo() {
		return this.so;
	}

	public void setSo(Integer so) {
		this.so = so;
	}
	//bi-directional many-to-one association to Master
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="playerID", referencedColumnName="playerID", updatable = false, nullable = false)	
	public Master getMaster() {
		return this.master;
	}

	protected void setMaster(Master master) {
		this.master = master;
	}
	
	public void defineMaster(Master master) {
        this.setMaster(master);
        if (!master.getBattings().contains(this)) {
        	master.getBattings().add(this);
        }
    }
	
	//bi-directional many-to-one association to Team
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="yearID", referencedColumnName="yearID"),
		@JoinColumn(name="lgID", referencedColumnName="lgID"),
		@JoinColumn(name="teamID", referencedColumnName="teamID")

		})
	public Team getBattingTeam() {
		return this.battingTeam;
	}

	public void setBattingTeam(Team battingTeam) {
		this.battingTeam = battingTeam;
	}
}