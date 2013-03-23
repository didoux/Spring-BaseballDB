package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the awardsshareplayers database table.
 * 
 */
@Embeddable
public class AwardsshareplayerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=25)
	private String awardID;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=2)
	private String lgID;

	@Column(unique=true, nullable=false, length=9)
	private String playerID;

	public AwardsshareplayerPK() {
	}
	public String getAwardID() {
		return this.awardID;
	}
	public void setAwardID(String awardID) {
		this.awardID = awardID;
	}
	public int getYearID() {
		return this.yearID;
	}
	public void setYearID(int yearID) {
		this.yearID = yearID;
	}
	public String getLgID() {
		return this.lgID;
	}
	public void setLgID(String lgID) {
		this.lgID = lgID;
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
		if (!(other instanceof AwardsshareplayerPK)) {
			return false;
		}
		AwardsshareplayerPK castOther = (AwardsshareplayerPK)other;
		return 
			this.awardID.equals(castOther.awardID)
			&& (this.yearID == castOther.yearID)
			&& this.lgID.equals(castOther.lgID)
			&& this.playerID.equals(castOther.playerID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.awardID.hashCode();
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.lgID.hashCode();
		hash = hash * prime + this.playerID.hashCode();
		
		return hash;
	}
}