package com.practice.dao.impl;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.practice.dao.BattingDAO;
import com.practice.dao.GenericDAO;
import com.practice.model.Batting;
import com.practice.model.BattingPK;

@Repository
public class BattingDAOImpl extends GenericDAO<BattingPK, Batting> implements BattingDAO {

	@Override
	public Batting addBatting(Batting batting) {
		return persist(batting);
	}
	
	@Override
	public Batting getBatting(BattingPK id) {
		return findById(id);
	}
	
	@Override
	public List<Batting> listBatting() {
		return loadAll();
	}
	
	@Override
	public void removeBatting(Batting batting) {
		delete(batting);
	}
}
