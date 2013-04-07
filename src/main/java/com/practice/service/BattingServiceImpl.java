package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.dao.BattingDAO;
import com.practice.model.Batting;
import com.practice.model.BattingPK;


@Service
public class BattingServiceImpl implements BattingService {

	@Autowired
	private BattingDAO battingDAO;
	
	@Transactional
	public Batting addBatting(Batting batting) {
		return battingDAO.addBatting(batting);
	}

	@Transactional
	public List<Batting> listBatting() {
		return battingDAO.listBatting();
	}
	
	@Transactional
	public Batting getBatting(BattingPK id) {
		return battingDAO.getBatting(id);
	}

	@Transactional
	public void removeBatting(BattingPK id) {
		Batting bat = battingDAO.getBatting(id);
		if( bat != null ) {
		battingDAO.removeBatting(bat);
		} else {
			throw new RuntimeException("Batting  id " + id.getPlayerID() + ":" + id.getStint() + ":" + id.getYearID() + "does not exist");
		}
	}
	
	@Transactional
	public void removeBatting(Batting batting) {
		battingDAO.removeBatting(batting);
	}
}
