package com.practice.model;

import java.io.Serializable;


import javax.persistence.*;


/**
 * The persistent class for the master database table.
 * 
 */
@Entity
@Table(name="master")
public class Master implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Integer lahmanID;
	@Column(length=10)
	private String playerID;
	@Column(length=1)
	private String bats;
	@Column(length=9)
	private String bbrefID;
	@Column(length=50)
	private String birthCity;
	@Column(length=50)
	private String birthCountry;
	private int birthDay;
	private int birthMonth;
	@Column(length=2)
	private String birthState;
	private int birthYear;
	@Column(length=50)
	private String college;
	@Column(length=50)
	private String deathCity;
	@Column(length=50)
	private String deathCountry;
	private int deathDay;
	private int deathMonth;
	@Column(length=2)
	private String deathState;
	private int deathYear;
	@Column(length=10)
	private String debut;
	@Column(length=10)
	private String finalGame;
	private double height;
	@Column(length=10)
	private String hofID;
	@Column(length=9)
	private String holtzID;
	@Column(length=9)
	private String lahman40ID;
	@Column(length=9)
	private String lahman45ID;
	@Column(length=10)
	private String managerID;
	@Column(length=50)
	private String nameFirst;
	@Column(length=255)
	private String nameGiven;
	@Column(length=50)
	private String nameLast;
	@Column(length=255)
	private String nameNick;
	@Column(length=255)
	private String nameNote;
	@Column(length=9)
	private String retroID;
	@Column(name="throws", length=1)
	private String throws_;
	private int weight;
	
	//bi-directional many-to-one association to Batting
	//@OneToMany(mappedBy="master", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//private List<Batting> battingList = new ArrayList<Batting>();
	
	//bi-directional many-to-one association to Pitching
	//@OneToMany(mappedBy="masterPitching", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//private List<Pitching> pitchingList = new ArrayList<Pitching>();
	
	public Master() {
	}

	public Integer getLahmanID() {
		return this.lahmanID;
	}

	public void setLahmanID(Integer lahmanID) {
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

	public String getDeathCity() {
		return this.deathCity;
	}

	public void setDeathCity(String deathCity) {
		this.deathCity = deathCity;
	}

	public String getDeathCountry() {
		return this.deathCountry;
	}

	public void setDeathCountry(String deathCountry) {
		this.deathCountry = deathCountry;
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

	public String getDeathState() {
		return this.deathState;
	}

	public void setDeathState(String deathState) {
		this.deathState = deathState;
	}

	public int getDeathYear() {
		return this.deathYear;
	}

	public void setDeathYear(int deathYear) {
		this.deathYear = deathYear;
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

	public String getPlayerID() {
		return this.playerID;
	}

	public void setPlayerID(String playerID) {
		this.playerID = playerID;
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

	@Override
	public String toString() {
		return "Master [lahmanID=" + lahmanID + ", playerID=" + playerID
				+ ", bats=" + bats + ", bbrefID=" + bbrefID + ", birthCity="
				+ birthCity + ", birthCountry=" + birthCountry + ", birthDay="
				+ birthDay + ", birthMonth=" + birthMonth + ", birthState="
				+ birthState + ", birthYear=" + birthYear + ", college="
				+ college + ", deathCity=" + deathCity + ", deathCountry="
				+ deathCountry + ", deathDay=" + deathDay + ", deathMonth="
				+ deathMonth + ", deathState=" + deathState + ", deathYear="
				+ deathYear + ", debut=" + debut + ", finalGame=" + finalGame
				+ ", height=" + height + ", hofID=" + hofID + ", holtzID="
				+ holtzID + ", lahman40ID=" + lahman40ID + ", lahman45ID="
				+ lahman45ID + ", managerID=" + managerID + ", nameFirst="
				+ nameFirst + ", nameGiven=" + nameGiven + ", nameLast="
				+ nameLast + ", nameNick=" + nameNick + ", nameNote="
				+ nameNote + ", retroID=" + retroID + ", throws_=" + throws_
				+ ", weight=" + weight + "]";
	}
	

//	public List<Batting> getBattingList() {
//		return this.battingList;
//	}
//
//	public void setBattingList(List<Batting> battingList) {
//		this.battingList = battingList;
//	}
//	
//	
//
//	public List<Pitching> getPitchingList() {
//		return this.pitchingList;
//	}
//
//	public void setPitchings(List<Pitching> pitchingList) {
//		this.pitchingList = pitchingList;
//	}

	
	
}