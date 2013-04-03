package com.practice.dao.impl;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.practice.dao.BattingDAO;
import com.practice.dao.GenericDAO;
import com.practice.model.Batting;
import com.practice.model.BattingPK;

@Repository
public class BattingDAOImpl extends GenericDAO<BattingPK, Batting> implements BattingDAO {



	public void addBatting(Batting batting) {
		persist(batting);
	}

	public Batting getBatting(BattingPK id) {
		return findById(id);
	}
	
	public List<Batting> listBatting() {
		return loadAll();
	}

	public void removeBatting(Batting batting) {
		delete(batting);
	}
}
