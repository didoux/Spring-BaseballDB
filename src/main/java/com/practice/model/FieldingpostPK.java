package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the fieldingpost database table.
 * 
 */
@Embeddable
public class FieldingpostPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=9)
	private String playerID;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=10)
	private String round;

	@Column(unique=true, nullable=false, length=2)
	private String pos;

	public FieldingpostPK() {
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
	public String getPos() {
		return this.pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FieldingpostPK)) {
			return false;
		}
		FieldingpostPK castOther = (FieldingpostPK)other;
		return 
			this.playerID.equals(castOther.playerID)
			&& (this.yearID == castOther.yearID)
			&& this.round.equals(castOther.round)
			&& this.pos.equals(castOther.pos);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.playerID.hashCode();
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.round.hashCode();
		hash = hash * prime + this.pos.hashCode();
		
		return hash;
	}
}