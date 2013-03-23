package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the awardssharemanagers database table.
 * 
 */
@Entity
@Table(name="awardssharemanagers")
public class Awardssharemanager implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AwardssharemanagerPK id;

	private int pointsMax;

	private int pointsWon;

	private int votesFirst;

	public Awardssharemanager() {
	}

	public AwardssharemanagerPK getId() {
		return this.id;
	}

	public void setId(AwardssharemanagerPK id) {
		this.id = id;
	}

	public int getPointsMax() {
		return this.pointsMax;
	}

	public void setPointsMax(int pointsMax) {
		this.pointsMax = pointsMax;
	}

	public int getPointsWon() {
		return this.pointsWon;
	}

	public void setPointsWon(int pointsWon) {
		this.pointsWon = pointsWon;
	}

	public int getVotesFirst() {
		return this.votesFirst;
	}

	public void setVotesFirst(int votesFirst) {
		this.votesFirst = votesFirst;
	}

}