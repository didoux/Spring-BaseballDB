package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the seriespost database table.
 * 
 */
@Entity
@Table(name="seriespost")
public class Seriespost implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SeriespostPK id;

	@Column(length=2)
	private String lgIDloser;

	@Column(length=2)
	private String lgIDwinner;

	private int losses;

	@Column(length=3)
	private String teamIDloser;

	@Column(length=3)
	private String teamIDwinner;

	private int ties;

	private int wins;

	public Seriespost() {
	}

	public SeriespostPK getId() {
		return this.id;
	}

	public void setId(SeriespostPK id) {
		this.id = id;
	}

	public String getLgIDloser() {
		return this.lgIDloser;
	}

	public void setLgIDloser(String lgIDloser) {
		this.lgIDloser = lgIDloser;
	}

	public String getLgIDwinner() {
		return this.lgIDwinner;
	}

	public void setLgIDwinner(String lgIDwinner) {
		this.lgIDwinner = lgIDwinner;
	}

	public int getLosses() {
		return this.losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public String getTeamIDloser() {
		return this.teamIDloser;
	}

	public void setTeamIDloser(String teamIDloser) {
		this.teamIDloser = teamIDloser;
	}

	public String getTeamIDwinner() {
		return this.teamIDwinner;
	}

	public void setTeamIDwinner(String teamIDwinner) {
		this.teamIDwinner = teamIDwinner;
	}

	public int getTies() {
		return this.ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	public int getWins() {
		return this.wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

}