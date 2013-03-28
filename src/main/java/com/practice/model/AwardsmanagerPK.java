package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the awardsmanagers database table.
 * 
 */
@Embeddable
public class AwardsmanagerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=25)
	private String awardID;

	@Column(unique=true, nullable=false, length=2)
	private String lgID;

	@Column(unique=true, nullable=false, length=10)
	private String managerID;

	public AwardsmanagerPK() {
	}
	public int getYearID() {
		return this.yearID;
	}
	public void setYearID(int yearID) {
		this.yearID = yearID;
	}
	public String getAwardID() {
		return this.awardID;
	}
	public void setAwardID(String awardID) {
		this.awardID = awardID;
	}
	public String getLgID() {
		return this.lgID;
	}
	public void setLgID(String lgID) {
		this.lgID = lgID;
	}
	public String getManagerID() {
		return this.managerID;
	}
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AwardsmanagerPK)) {
			return false;
		}
		AwardsmanagerPK castOther = (AwardsmanagerPK)other;
		return 
			(this.yearID == castOther.yearID)
			&& this.awardID.equals(castOther.awardID)
			&& this.lgID.equals(castOther.lgID)
			&& this.managerID.equals(castOther.managerID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.awardID.hashCode();
		hash = hash * prime + this.lgID.hashCode();
		hash = hash * prime + this.managerID.hashCode();
		
		return hash;
	}
}