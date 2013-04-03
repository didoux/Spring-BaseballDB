package com.practice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.practice.model.Master;
import com.practice.dao.GenericDAO;
import com.practice.dao.MasterDAO;

@Repository
public class MasterDAOImpl extends GenericDAO<Integer, Master> implements MasterDAO{

	@Override
	public void addMaster(Master master) {
		persist(master);
	}

	@Override
	public Master getMaster(Integer lahmanID) {
		return findById(lahmanID);
	}

	@Override
	public List<Master> listMaster() {
		return loadAll();
	}

	@Override
	public void removeMaster(Master master) {
		delete(master);
	}

}
