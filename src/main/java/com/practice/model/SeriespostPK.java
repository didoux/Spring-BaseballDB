package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the seriespost database table.
 * 
 */
@Embeddable
public class SeriespostPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private int yearID;

	@Column(unique=true, nullable=false, length=5)
	private String round;

	public SeriespostPK() {
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
		if (!(other instanceof SeriespostPK)) {
			return false;
		}
		SeriespostPK castOther = (SeriespostPK)other;
		return 
			(this.yearID == castOther.yearID)
			&& this.round.equals(castOther.round);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.yearID;
		hash = hash * prime + this.round.hashCode();
		
		return hash;
	}
}