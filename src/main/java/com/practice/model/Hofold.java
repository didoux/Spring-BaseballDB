package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hofold database table.
 * 
 */
@Entity
@Table(name="hofold")
public class Hofold implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=10)
	private String hofID;

	private int ballots;

	@Column(length=20)
	private String category;

	@Column(length=1)
	private String inducted;

	@Column(length=10)
	private String votedBy;

	private int votes;

	private int yearid;

	public Hofold() {
	}

	public String getHofID() {
		return this.hofID;
	}

	public void setHofID(String hofID) {
		this.hofID = hofID;
	}

	public int getBallots() {
		return this.ballots;
	}

	public void setBallots(int ballots) {
		this.ballots = ballots;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getInducted() {
		return this.inducted;
	}

	public void setInducted(String inducted) {
		this.inducted = inducted;
	}

	public String getVotedBy() {
		return this.votedBy;
	}

	public void setVotedBy(String votedBy) {
		this.votedBy = votedBy;
	}

	public int getVotes() {
		return this.votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public int getYearid() {
		return this.yearid;
	}

	public void setYearid(int yearid) {
		this.yearid = yearid;
	}

}