package com.practice.dao.impl;

import java.util.List;

import javax.persistence.Query;


import org.springframework.stereotype.Repository;

import com.practice.dao.PitchingDAO;
import com.practice.dao.GenericDAO;
import com.practice.model.Pitching;
import com.practice.model.PitchingPK;

@Repository
public class PitchingDAOImpl extends GenericDAO<PitchingPK, Pitching> implements PitchingDAO {

	@Override
	public Pitching addPitching(Pitching pitching) {
		return persist(pitching);
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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pitching> getPitchingByPlayerID(String playerID) {
		Query query = entityManager.createNamedQuery("findPitchingByPlayerID");
		query.setParameter("playerID", playerID);
        return (List<Pitching>) query.getResultList();
		
	}
}
