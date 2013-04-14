package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.dao.PitchingDAO;
import com.practice.model.Pitching;
import com.practice.model.PitchingPK;

@Service
public class PitchingServiceImpl implements PitchingService {

	@Autowired
	private PitchingDAO pitchingDAO;
	
	@Override
	@Transactional
	public Pitching addPitching(Pitching pitching) {
		return pitchingDAO.addPitching(pitching);
	}

	@Override
	@Transactional
	public Pitching getPitching(PitchingPK id) {
		return pitchingDAO.getPitching(id);
	}

	@Override
	@Transactional
	public List<Pitching> listPitching() {
	
		return null;
	}

	@Override
	@Transactional
	public void removePitching(Pitching pitching) {
		pitchingDAO.removePitching(pitching);
		
	}

	@Override
	@Transactional
	public void removePitching(PitchingPK id) {
    	Pitching findPitching = pitchingDAO.getPitching(id);

		pitchingDAO.removePitching(findPitching);
		
	}

	@Override
	public List<Pitching> getPitchingByPlayerID(String playerID) {
		return pitchingDAO.getPitchingByPlayerID(playerID);
	}

}
