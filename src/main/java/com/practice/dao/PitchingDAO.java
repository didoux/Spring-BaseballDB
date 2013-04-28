package com.practice.dao;

import java.util.List;

import com.practice.model.Pitching;
import com.practice.model.PitchingPK;

public interface PitchingDAO {
	
	public Pitching addPitching(Pitching pitching);

	public Pitching getPitching(PitchingPK id);
	
	public List<Pitching> listPitching();
	
	public List<Pitching> getPitchingByPlayerID(String playerID);

	public void removePitching(Pitching pitching);

}
