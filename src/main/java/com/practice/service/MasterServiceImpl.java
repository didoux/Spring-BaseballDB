package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.dao.MasterDAO;
import com.practice.model.Master;

@Service
public class MasterServiceImpl implements MasterService {
	
	@Autowired
	private MasterDAO masterDAO;

	@Override
	@Transactional
	public Master addMaster(Master master) {
		return masterDAO.addMaster(master);
	}

	@Override
	@Transactional
	public Master getMaster(Integer lahmanID) {
		return masterDAO.getMaster(lahmanID);
	}

	@Override
	public List<Master> listMaster() {
		return masterDAO.listMaster();
	}

	@Override
	@Transactional
	public void removeMaster(Master master) {
		masterDAO.removeMaster(master);

	}


	@Override
	@Transactional
	public void removeMaster(Integer lahmanID) {
		
		Master findMaster = masterDAO.getMaster(lahmanID);
		
		if( findMaster != null ) {
			masterDAO.removeMaster(findMaster);
		}
		
	}

}
