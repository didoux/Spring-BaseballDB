package com.practice.util;

import com.practice.model.Master;
import com.practice.model.Pitching;
import com.practice.model.PitchingPK;

public class BaseballHelper {
	
	public static Pitching createPitching(PitchingPK id) {
		Pitching p = new Pitching();
		p.setId(id);
		p.setTeamID("SLN");
		p.setLgID("NL");
		p.setW(1);
		p.setL(2);
		p.setG(3);
		p.setGs(4);
		p.setGs(5);
		p.setCg(6);
		p.setSho(7);
		p.setSv(8);
		p.setIPouts(9);
		p.setH(10);
		p.setEr(11);
		p.setHr(12);
		p.setBb(13);
		p.setSo(14);
		p.setBAOpp(15.0);
		p.setEra(16.23);
		p.setIbb(17);
		p.setWp(18);
		p.setHbp(19);
		p.setBk(20);
		p.setBfp(11);
		p.setGf(12);
		p.setR(13);
		p.setSh(14);
		p.setSf(15);
		p.setGidp(16);
		return p;
	}


	public static PitchingPK createPitchingPK() {
		PitchingPK id = new PitchingPK();
		id.setPlayerID("didoux");
		id.setYearID(2012);
		id.setStint(1);
		return id;
	}
	
	public static Master createMaster() {
		Master master = new Master();
		master.setPlayerID("musiast01");
		master.setManagerID(null);
		master.setHofID("musiast01h");
		master.setBirthYear(1920);
		master.setBirthMonth(11);
		master.setBirthDay(21);
		master.setBirthCountry("USA");
		master.setBirthState("PA");
		master.setDeathYear(2013);
		master.setDeathMonth(1);
		master.setDeathDay(19);
		master.setDeathCountry("USA");
		master.setDeathState("MO");
		master.setDeathCity("Ladue");
		master.setNameFirst("Stan");
		master.setNameLast("Musial");
		master.setNameNote(null);
		master.setNameGiven("Stanley Frank");
		master.setNameNick("Stan the Man");
		master.setWeight(175);
		master.setHeight(72);
		master.setBats("L");
		master.setThrows_("L");
		master.setDebut("9/17/1941");
		master.setFinalGame("9/29/1963");
		master.setCollege(null);
		master.setLahman40ID("musiast01");
		master.setLahman45ID("musiast01");
		master.setRetroID("musis101");
		master.setHoltzID("musiast01");
		master.setBbrefID("musiast01");
		return master;
	}

}
