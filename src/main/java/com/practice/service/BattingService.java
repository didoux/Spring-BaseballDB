package com.practice.service;

import java.util.List;

import com.practice.model.Batting;
import com.practice.model.BattingPK;


public interface BattingService {
	
	public Batting addBatting(Batting batting);
	public Batting getBatting(BattingPK id);
	public List<Batting> listBatting();
	public void removeBatting(Batting batting);
	public void removeBatting(BattingPK id);
}
