package com.practice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.model.Pitching;
import com.practice.model.PitchingPK;
import com.practice.repositories.PitchingRepository;

@Service
public class PitchingServiceImpl implements PitchingService {

	@Autowired
	//private PitchingDAO pitchingDAO;
	private PitchingRepository pitchingRepository;
	
	@Override
	@Transactional
	public Pitching addPitching(Pitching pitching) {
		//return pitchingDAO.addPitching(pitching);
		return pitchingRepository.save(pitching);
	}

	@Override
	@Transactional
	public Pitching getPitching(PitchingPK id) {
		//return pitchingDAO.getPitching(id);
		return pitchingRepository.findOne(id);
	}

	@Override
	@Transactional
	public List<Pitching> listPitching() {
		List<Pitching> pitchingList = new ArrayList<Pitching>();
		Iterable<Pitching> pitchingIterable = pitchingRepository.findAll();
		 for ( Iterator<Pitching> pitchingItor = pitchingIterable.iterator(); pitchingItor.hasNext(); ) {
			 pitchingList.add(pitchingItor.next());
		 }
		return pitchingList;
	}

	@Override
	@Transactional
	public void removePitching(Pitching pitching) {
		//pitchingDAO.removePitching(pitching);
		pitchingRepository.delete(pitching);
		
	}

	@Override
	@Transactional
	public void removePitching(PitchingPK id) {
//    	Pitching findPitching = pitchingDAO.getPitching(id);
//
//		pitchingDAO.removePitching(findPitching);
		pitchingRepository.delete(id);
	}

	@Override
	public List<Pitching> getPitchingByPlayerID(String playerID) {
		//return pitchingDAO.getPitchingByPlayerID(playerID);
		return pitchingRepository.findByPlayerID(playerID);
	}

}
