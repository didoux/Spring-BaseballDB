package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the teamshalf database table.
 * 
 */
@Embeddable
public class TeamshalfPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=3)
	private String teamID;

	@Column(unique=true, nullable=false, length=2)
	private String lgID;

	@Column(unique=true, nullable=false, length=1)
	private String half;

	public TeamshalfPK() {
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
	public String getLgID() {
		return this.lgID;
	}
	public void setLgID(String lgID) {
		this.lgID = lgID;
	}
	public String getHalf() {
		return this.half;
	}
	public void setHalf(String half) {
		this.half = half;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TeamshalfPK)) {
			return false;
		}
		TeamshalfPK castOther = (TeamshalfPK)other;
		return 
			(this.yearID == castOther.yearID)
			&& this.teamID.equals(castOther.teamID)
			&& this.lgID.equals(castOther.lgID)
			&& this.half.equals(castOther.half);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.teamID.hashCode();
		hash = hash * prime + this.lgID.hashCode();
		hash = hash * prime + this.half.hashCode();
		
		return hash;
	}
}