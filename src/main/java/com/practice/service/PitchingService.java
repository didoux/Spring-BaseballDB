package com.practice.service;

import java.util.List;

import com.practice.model.Pitching;
import com.practice.model.PitchingPK;

public interface PitchingService {

		
		public Pitching addPitching(Pitching batting);
		public Pitching getPitching(PitchingPK id);
		public List<Pitching> listPitching();
		public List<Pitching> getPitchingByPlayerID(String playerID);
		public void removePitching(Pitching pitching);
		public void removePitching(PitchingPK id);


}
