package com.practice.dao;

import java.util.List;

import com.practice.model.Batting;
import com.practice.model.BattingPK;

public interface BattingDAO {
	
	public Batting addBatting(Batting batting);

	public Batting getBatting(BattingPK id);
	
	public List<Batting> listBatting();

	public void removeBatting(Batting batting);

}
