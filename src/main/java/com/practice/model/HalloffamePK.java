package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the halloffame database table.
 * 
 */
@Embeddable
public class HalloffamePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=10)
	private String hofID;

	@Column(unique=true, nullable=false)
	private int yearid;

	public HalloffamePK() {
	}
	public String getHofID() {
		return this.hofID;
	}
	public void setHofID(String hofID) {
		this.hofID = hofID;
	}
	public int getYearid() {
		return this.yearid;
	}
	public void setYearid(int yearid) {
		this.yearid = yearid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HalloffamePK)) {
			return false;
		}
		HalloffamePK castOther = (HalloffamePK)other;
		return 
			this.hofID.equals(castOther.hofID)
			&& (this.yearid == castOther.yearid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.hofID.hashCode();
		hash = hash * prime + this.yearid;
		
		return hash;
	}
}