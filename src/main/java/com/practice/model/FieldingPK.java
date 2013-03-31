package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the fielding database table.
 * 
 */
@Embeddable
public class FieldingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=9)
	private String playerID;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false)
	private int stint;

	@Column(unique=true, nullable=false, length=2)
	private String pos;

	public FieldingPK() {
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
		if (!(other instanceof FieldingPK)) {
			return false;
		}
		FieldingPK castOther = (FieldingPK)other;
		return 
			this.playerID.equals(castOther.playerID)
			&& (this.yearID == castOther.yearID)
			&& (this.stint == castOther.stint)
			&& this.pos.equals(castOther.pos);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.playerID.hashCode();
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.stint;
		hash = hash * prime + this.pos.hashCode();
		
		return hash;
	}
}