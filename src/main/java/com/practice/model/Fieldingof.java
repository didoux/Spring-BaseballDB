package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fieldingof database table.
 * 
 */
@Entity
@Table(name="fieldingof")
public class Fieldingof implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FieldingofPK id;

	private int gcf;

	private int glf;

	private int grf;

	public Fieldingof() {
	}

	public FieldingofPK getId() {
		return this.id;
	}

	public void setId(FieldingofPK id) {
		this.id = id;
	}

	public int getGcf() {
		return this.gcf;
	}

	public void setGcf(int gcf) {
		this.gcf = gcf;
	}

	public int getGlf() {
		return this.glf;
	}

	public void setGlf(int glf) {
		this.glf = glf;
	}

	public int getGrf() {
		return this.grf;
	}

	public void setGrf(int grf) {
		this.grf = grf;
	}

}