package com.practice.dao;

import java.util.List;

import com.practice.model.Master;

public interface MasterDAO {

	public Master addMaster(Master master);

	public Master getMaster(Integer lahmanID);
	
	public List<Master> listMaster();

	public void removeMaster(Master master);

}
