package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pitching database table.
 * 
 */
@Embeddable
public class PitchingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=9, insertable=false, updatable=false)
	private String playerID;

	@Column(unique=true, nullable=false, insertable=false, updatable=false)
	private int yearID;

	@Column(unique=true, nullable=false, insertable=false, updatable=false)
	private int stint;

	public PitchingPK() {
	}
	public String getPlayerID() {
		return this.playerID;
	}
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}
	public int getYearID() {
		return this.yearID;
	}
	public void setYearID(int yearID) {
		this.yearID = yearID;
	}
	public int getStint() {
		return this.stint;
	}
	public void setStint(int stint) {
		this.stint = stint;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PitchingPK)) {
			return false;
		}
		PitchingPK castOther = (PitchingPK)other;
		return 
			this.playerID.equals(castOther.playerID)
			&& (this.yearID == castOther.yearID)
			&& (this.stint == castOther.stint);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.playerID.hashCode();
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.stint;
		
		return hash;
	}
}