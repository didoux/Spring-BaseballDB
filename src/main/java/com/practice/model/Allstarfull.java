package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the allstarfull database table.
 * 
 */
@Entity
@Table(name="allstarfull")
public class Allstarfull implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AllstarfullPK id;

	@Column(length=12)
	private String gameID;

	private int gp;

	@Column(length=2)
	private String lgID;

	private int startingPos;

	@Column(length=3)
	private String teamID;

	public Allstarfull() {
	}

	public AllstarfullPK getId() {
		return this.id;
	}

	public void setId(AllstarfullPK id) {
		this.id = id;
	}

	public String getGameID() {
		return this.gameID;
	}

	public void setGameID(String gameID) {
		this.gameID = gameID;
	}

	public int getGp() {
		return this.gp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}

	public String getLgID() {
		return this.lgID;
	}

	public void setLgID(String lgID) {
		this.lgID = lgID;
	}

	public int getStartingPos() {
		return this.startingPos;
	}

	public void setStartingPos(int startingPos) {
		this.startingPos = startingPos;
	}

	public String getTeamID() {
		return this.teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

}