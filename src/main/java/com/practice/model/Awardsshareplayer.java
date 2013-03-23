package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the awardsshareplayers database table.
 * 
 */
@Entity
@Table(name="awardsshareplayers")
public class Awardsshareplayer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AwardsshareplayerPK id;

	private int pointsMax;

	private double pointsWon;

	private double votesFirst;

	public Awardsshareplayer() {
	}

	public AwardsshareplayerPK getId() {
		return this.id;
	}

	public void setId(AwardsshareplayerPK id) {
		this.id = id;
	}

	public int getPointsMax() {
		return this.pointsMax;
	}

	public void setPointsMax(int pointsMax) {
		this.pointsMax = pointsMax;
	}

	public double getPointsWon() {
		return this.pointsWon;
	}

	public void setPointsWon(double pointsWon) {
		this.pointsWon = pointsWon;
	}

	public double getVotesFirst() {
		return this.votesFirst;
	}

	public void setVotesFirst(double votesFirst) {
		this.votesFirst = votesFirst;
	}

}