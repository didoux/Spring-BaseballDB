package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the appearances database table.
 * 
 */
@Embeddable
public class AppearancePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=3)
	private String teamID;

	@Column(unique=true, nullable=false, length=9)
	private String playerID;

	public AppearancePK() {
	}
	public int getYearID() {
		return this.yearID;
	}
	public void setYearID(int yearID) {
		this.yearID = yearID;
	}
	public String getTeamID() {
		return this.teamID;
	}
	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}
	public String getPlayerID() {
		return this.playerID;
	}
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AppearancePK)) {
			return false;
		}
		AppearancePK castOther = (AppearancePK)other;
		return 
			(this.yearID == castOther.yearID)
			&& this.teamID.equals(castOther.teamID)
			&& this.playerID.equals(castOther.playerID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.teamID.hashCode();
		hash = hash * prime + this.playerID.hashCode();
		
		return hash;
	}
}