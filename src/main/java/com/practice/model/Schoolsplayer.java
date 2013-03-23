package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the schoolsplayers database table.
 * 
 */
@Entity
@Table(name="schoolsplayers")
public class Schoolsplayer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SchoolsplayerPK id;

	private int yearMax;

	private int yearMin;

	public Schoolsplayer() {
	}

	public SchoolsplayerPK getId() {
		return this.id;
	}

	public void setId(SchoolsplayerPK id) {
		this.id = id;
	}

	public int getYearMax() {
		return this.yearMax;
	}

	public void setYearMax(int yearMax) {
		this.yearMax = yearMax;
	}

	public int getYearMin() {
		return this.yearMin;
	}

	public void setYearMin(int yearMin) {
		this.yearMin = yearMin;
	}

}