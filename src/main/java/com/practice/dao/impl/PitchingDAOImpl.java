package com.practice.dao.impl;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.practice.dao.PitchingDAO;
import com.practice.dao.GenericDAO;
import com.practice.model.Pitching;
import com.practice.model.PitchingPK;

@Repository
public class PitchingDAOImpl extends GenericDAO<PitchingPK, Pitching> implements PitchingDAO {

	@Override
	public void addPitching(Pitching batting) {
		persist(batting);
	}

	@Override
	public Pitching getPitching(PitchingPK id) {
		return findById(id);
	}
	
	@Override
	public List<Pitching> listPitching() {
		return loadAll();
	}

	@Override
	public void removePitching(Pitching pitching) {
		delete(pitching);
	}
}
