package com.practice.service;

import java.util.List;

import com.practice.model.Master;


public interface MasterService {
	
	public Master addMaster(Master master);
	public Master getMaster(Integer lahmanID);
	public List<Master> listMaster();
	public void removeMaster(Master master);
	public void removeMaster(Integer lahmanID);

}
