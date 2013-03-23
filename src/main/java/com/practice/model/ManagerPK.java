package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the managers database table.
 * 
 */
@Embeddable
public class ManagerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=3)
	private String teamID;

	@Column(unique=true, nullable=false)
	private int inseason;

	public ManagerPK() {
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
	public int getInseason() {
		return this.inseason;
	}
	public void setInseason(int inseason) {
		this.inseason = inseason;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ManagerPK)) {
			return false;
		}
		ManagerPK castOther = (ManagerPK)other;
		return 
			(this.yearID == castOther.yearID)
			&& this.teamID.equals(castOther.teamID)
			&& (this.inseason == castOther.inseason);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.teamID.hashCode();
		hash = hash * prime + this.inseason;
		
		return hash;
	}
}