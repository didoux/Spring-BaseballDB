package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the appearances database table.
 * 
 */
@Entity
@Table(name="appearances")
public class Appearance implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AppearancePK id;

	private int g_1b;

	private int g_2b;

	private int g_3b;

	private int g_all;

	private int g_batting;

	private int g_c;

	private int g_cf;

	private int g_defense;

	private int g_dh;

	private int g_lf;

	private int g_of;

	private int g_p;

	private int g_ph;

	private int g_pr;

	private int g_rf;

	private int g_ss;

	@Column(length=2)
	private String lgID;

	public Appearance() {
	}

	public AppearancePK getId() {
		return this.id;
	}

	public void setId(AppearancePK id) {
		this.id = id;
	}

	public int getG_1b() {
		return this.g_1b;
	}

	public void setG_1b(int g_1b) {
		this.g_1b = g_1b;
	}

	public int getG_2b() {
		return this.g_2b;
	}

	public void setG_2b(int g_2b) {
		this.g_2b = g_2b;
	}

	public int getG_3b() {
		return this.g_3b;
	}

	public void setG_3b(int g_3b) {
		this.g_3b = g_3b;
	}

	public int getG_all() {
		return this.g_all;
	}

	public void setG_all(int g_all) {
		this.g_all = g_all;
	}

	public int getG_batting() {
		return this.g_batting;
	}

	public void setG_batting(int g_batting) {
		this.g_batting = g_batting;
	}

	public int getG_c() {
		return this.g_c;
	}

	public void setG_c(int g_c) {
		this.g_c = g_c;
	}

	public int getG_cf() {
		return this.g_cf;
	}

	public void setG_cf(int g_cf) {
		this.g_cf = g_cf;
	}

	public int getG_defense() {
		return this.g_defense;
	}

	public void setG_defense(int g_defense) {
		this.g_defense = g_defense;
	}

	public int getG_dh() {
		return this.g_dh;
	}

	public void setG_dh(int g_dh) {
		this.g_dh = g_dh;
	}

	public int getG_lf() {
		return this.g_lf;
	}

	public void setG_lf(int g_lf) {
		this.g_lf = g_lf;
	}

	public int getG_of() {
		return this.g_of;
	}

	public void setG_of(int g_of) {
		this.g_of = g_of;
	}

	public int getG_p() {
		return this.g_p;
	}

	public void setG_p(int g_p) {
		this.g_p = g_p;
	}

	public int getG_ph() {
		return this.g_ph;
	}

	public void setG_ph(int g_ph) {
		this.g_ph = g_ph;
	}

	public int getG_pr() {
		return this.g_pr;
	}

	public void setG_pr(int g_pr) {
		this.g_pr = g_pr;
	}

	public int getG_rf() {
		return this.g_rf;
	}

	public void setG_rf(int g_rf) {
		this.g_rf = g_rf;
	}

	public int getG_ss() {
		return this.g_ss;
	}

	public void setG_ss(int g_ss) {
		this.g_ss = g_ss;
	}

	public String getLgID() {
		return this.lgID;
	}

	public void setLgID(String lgID) {
		this.lgID = lgID;
	}

}