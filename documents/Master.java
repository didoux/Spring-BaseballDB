package com.practice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the master database table.
 * 
 */
@Entity
public class Master implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int lahmanID;

	private String bats;

	private String bbrefID;

	private String birthCity;

	private String birthCountry;

	private int birthDay;

	private int birthMonth;

	private String birthState;

	private int birthYear;

	private String college;

	private int deathDay;

	private int deathMonth;

	private String debut;

	private String finalGame;

	private double height;

	private String hofID;

	private String holtzID;

	private String lahman40ID;

	private String lahman45ID;

	private String managerID;

	private String nameFirst;

	private String nameGiven;

	private String nameLast;

	private String nameNick;

	private String nameNote;

	private String retroID;

	@Column(name="throws")
	private String throws_;

	private int weight;

	//bi-directional many-to-one association to Batting
	@OneToMany(mappedBy="master")
	private List<Batting> battings;

	//bi-directional many-to-one association to Pitching
	@OneToMany(mappedBy="master")
	private List<Pitching> pitchings;

    public Master() {
    }

	public int getLahmanID() {
		return this.lahmanID;
	}

	public void setLahmanID(int lahmanID) {
		this.lahmanID = lahmanID;
	}

	public String getBats() {
		return this.bats;
	}

	public void setBats(String bats) {
		this.bats = bats;
	}

	public String getBbrefID() {
		return this.bbrefID;
	}

	public void setBbrefID(String bbrefID) {
		this.bbrefID = bbrefID;
	}

	public String getBirthCity() {
		return this.birthCity;
	}

	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	public String getBirthCountry() {
		return this.birthCountry;
	}

	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}

	public int getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int getBirthMonth() {
		return this.birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getBirthState() {
		return this.birthState;
	}

	public void setBirthState(String birthState) {
		this.birthState = birthState;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getDeathDay() {
		return this.deathDay;
	}

	public void setDeathDay(int deathDay) {
		this.deathDay = deathDay;
	}

	public int getDeathMonth() {
		return this.deathMonth;
	}

	public void setDeathMonth(int deathMonth) {
		this.deathMonth = deathMonth;
	}

	public String getDebut() {
		return this.debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFinalGame() {
		return this.finalGame;
	}

	public void setFinalGame(String finalGame) {
		this.finalGame = finalGame;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getHofID() {
		return this.hofID;
	}

	public void setHofID(String hofID) {
		this.hofID = hofID;
	}

	public String getHoltzID() {
		return this.holtzID;
	}

	public void setHoltzID(String holtzID) {
		this.holtzID = holtzID;
	}

	public String getLahman40ID() {
		return this.lahman40ID;
	}

	public void setLahman40ID(String lahman40ID) {
		this.lahman40ID = lahman40ID;
	}

	public String getLahman45ID() {
		return this.lahman45ID;
	}

	public void setLahman45ID(String lahman45ID) {
		this.lahman45ID = lahman45ID;
	}

	public String getManagerID() {
		return this.managerID;
	}

	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}

	public String getNameFirst() {
		return this.nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameGiven() {
		return this.nameGiven;
	}

	public void setNameGiven(String nameGiven) {
		this.nameGiven = nameGiven;
	}

	public String getNameLast() {
		return this.nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	public String getNameNick() {
		return this.nameNick;
	}

	public void setNameNick(String nameNick) {
		this.nameNick = nameNick;
	}

	public String getNameNote() {
		return this.nameNote;
	}

	public void setNameNote(String nameNote) {
		this.nameNote = nameNote;
	}

	public String getRetroID() {
		return this.retroID;
	}

	public void setRetroID(String retroID) {
		this.retroID = retroID;
	}

	public String getThrows_() {
		return this.throws_;
	}

	public void setThrows_(String throws_) {
		this.throws_ = throws_;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public List<Batting> getBattings() {
		return this.battings;
	}

	public void setBattings(List<Batting> battings) {
		this.battings = battings;
	}
	
	public List<Pitching> getPitchings() {
		return this.pitchings;
	}

	public void setPitchings(List<Pitching> pitchings) {
		this.pitchings = pitchings;
	}
	
}