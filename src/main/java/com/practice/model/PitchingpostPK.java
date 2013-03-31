package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pitchingpost database table.
 * 
 */
@Embeddable
public class PitchingpostPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=9)
	private String playerID;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=10)
	private String round;

	public PitchingpostPK() {
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
	public String getRound() {
		return this.round;
	}
	public void setRound(String round) {
		this.round = round;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PitchingpostPK)) {
			return false;
		}
		PitchingpostPK castOther = (PitchingpostPK)other;
		return 
			this.playerID.equals(castOther.playerID)
			&& (this.yearID == castOther.yearID)
			&& this.round.equals(castOther.round);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.playerID.hashCode();
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.round.hashCode();
		
		return hash;
	}
}