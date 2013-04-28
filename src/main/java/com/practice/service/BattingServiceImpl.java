package com.practice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.model.Batting;
import com.practice.model.BattingPK;
import com.practice.repositories.BattingRepository;


@Service
public class BattingServiceImpl implements BattingService {

	@Autowired
	//private BattingDAO battingDAO;
	private BattingRepository battingRepository;
	
	@Transactional
	public Batting addBatting(Batting batting) {
		//return battingDAO.addBatting(batting);
		return battingRepository.save(batting);
	}

	@Transactional
	public List<Batting> listBatting() {
		//return battingDAO.listBatting();
		List<Batting> battingList = new ArrayList<Batting>();
		//return masterDAO.listMaster();
		Iterable<Batting> battingIterable = battingRepository.findAll();
		 for ( Iterator<Batting> battingItor = battingIterable.iterator(); battingItor.hasNext(); ) {
			 battingList.add(battingItor.next());
		 }
		return battingList;
	}
	
	@Transactional
	public Batting getBatting(BattingPK id) {
		//return battingDAO.getBatting(id);
		return battingRepository.findOne(id);
	}

	@Transactional
	public void removeBatting(BattingPK id) {
		battingRepository.delete(id);
//		Batting bat = battingDAO.getBatting(id);
//		if( bat != null ) {
//		battingDAO.removeBatting(bat);
//		} else {
//			throw new RuntimeException("Batting  id " + id.getPlayerID() + ":" + id.getStint() + ":" + id.getYearID() + "does not exist");
//		}
	}
	
	@Transactional
	public void removeBatting(Batting batting) {
		//battingDAO.removeBatting(batting);
		battingRepository.delete(batting);
	}
}
