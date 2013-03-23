package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the schoolsplayers database table.
 * 
 */
@Embeddable
public class SchoolsplayerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=9)
	private String playerID;

	@Column(unique=true, nullable=false, length=15)
	private String schoolID;

	public SchoolsplayerPK() {
	}
	public String getPlayerID() {
		return this.playerID;
	}
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}
	public String getSchoolID() {
		return this.schoolID;
	}
	public void setSchoolID(String schoolID) {
		this.schoolID = schoolID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SchoolsplayerPK)) {
			return false;
		}
		SchoolsplayerPK castOther = (SchoolsplayerPK)other;
		return 
			this.playerID.equals(castOther.playerID)
			&& this.schoolID.equals(castOther.schoolID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.playerID.hashCode();
		hash = hash * prime + this.schoolID.hashCode();
		
		return hash;
	}
}