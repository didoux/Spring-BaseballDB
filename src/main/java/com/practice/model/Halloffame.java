package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the halloffame database table.
 * 
 */
@Entity
@Table(name="halloffame")
public class Halloffame implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HalloffamePK id;

	private int ballots;

	@Column(length=20)
	private String category;

	@Column(length=1)
	private String inducted;

	private int needed;

	@Column(length=64)
	private String votedBy;

	private int votes;

	public Halloffame() {
	}

	public HalloffamePK getId() {
		return this.id;
	}

	public void setId(HalloffamePK id) {
		this.id = id;
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

	public int getNeeded() {
		return this.needed;
	}

	public void setNeeded(int needed) {
		this.needed = needed;
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

}