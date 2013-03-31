package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the battingpost database table.
 * 
 */
@Embeddable
public class BattingpostPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=10)
	private String round;

	@Column(unique=true, nullable=false, length=9)
	private String playerID;

	public BattingpostPK() {
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
		if (!(other instanceof BattingpostPK)) {
			return false;
		}
		BattingpostPK castOther = (BattingpostPK)other;
		return 
			(this.yearID == castOther.yearID)
			&& this.round.equals(castOther.round)
			&& this.playerID.equals(castOther.playerID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.round.hashCode();
		hash = hash * prime + this.playerID.hashCode();
		
		return hash;
	}
}