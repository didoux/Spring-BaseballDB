package com.practice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.practice.dao.MasterDAO;
import com.practice.model.Master;
import com.practice.repositories.MasterRepository;

@Service
public class MasterServiceImpl implements MasterService {
	

	//private MasterDAO masterDAO;
	@Autowired
	private MasterRepository masterRepository;

	@Override
	@Transactional
	public Master addMaster(Master master) {
		//return masterDAO.addMaster(master);
		return masterRepository.save(master);
	}

	@Override
	@Transactional
	public Master getMaster(Integer lahmanID) {
		//return masterDAO.getMaster(lahmanID);
		return masterRepository.findOne(lahmanID);
	}

	@Override
	public List<Master> listMaster() {
		List<Master> masterList = new ArrayList<Master>();
		//return masterDAO.listMaster();
		Iterable<Master> masterIterable = masterRepository.findAll();
		 for ( Iterator<Master> masterItor = masterIterable.iterator(); masterItor.hasNext(); ) {
			 masterList.add(masterItor.next());
		 }
		return masterList;
	}

	@Override
	@Transactional
	public void removeMaster(Master master) {
		//masterDAO.removeMaster(master);
		masterRepository.delete(master);
	}


	@Override
	@Transactional
	public void removeMaster(Integer lahmanID) {
		
//		Master findMaster = masterDAO.getMaster(lahmanID);
//		
//		if( findMaster != null ) {
//			masterDAO.removeMaster(findMaster);
//		}
		masterRepository.delete(lahmanID);
	}

}
