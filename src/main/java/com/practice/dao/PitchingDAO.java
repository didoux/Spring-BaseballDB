package com.practice.dao;

import java.util.List;

import com.practice.model.Pitching;
import com.practice.model.PitchingPK;

public interface PitchingDAO {
	
	public void addPitching(Pitching pitching);

	public Pitching getPitching(PitchingPK id);
	
	public List<Pitching> listPitching();

	public void removePitching(Pitching pitching);

}
