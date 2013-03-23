package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the awardsmanagers database table.
 * 
 */
@Entity
@Table(name="awardsmanagers")
public class Awardsmanager implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AwardsmanagerPK id;

	@Column(length=100)
	private String notes;

	@Column(length=1)
	private String tie;

	public Awardsmanager() {
	}

	public AwardsmanagerPK getId() {
		return this.id;
	}

	public void setId(AwardsmanagerPK id) {
		this.id = id;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getTie() {
		return this.tie;
	}

	public void setTie(String tie) {
		this.tie = tie;
	}

}