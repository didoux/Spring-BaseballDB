package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the managershalf database table.
 * 
 */
@Embeddable
public class ManagershalfPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=3)
	private String teamID;

	@Column(unique=true, nullable=false, length=10)
	private String managerID;

	@Column(unique=true, nullable=false)
	private int half;

	public ManagershalfPK() {
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
	public String getManagerID() {
		return this.managerID;
	}
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}
	public int getHalf() {
		return this.half;
	}
	public void setHalf(int half) {
		this.half = half;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ManagershalfPK)) {
			return false;
		}
		ManagershalfPK castOther = (ManagershalfPK)other;
		return 
			(this.yearID == castOther.yearID)
			&& this.teamID.equals(castOther.teamID)
			&& this.managerID.equals(castOther.managerID)
			&& (this.half == castOther.half);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.teamID.hashCode();
		hash = hash * prime + this.managerID.hashCode();
		hash = hash * prime + this.half;
		
		return hash;
	}
}