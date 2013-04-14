package com.practice.dao.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.practice.dao.BattingDAO;
import com.practice.model.Batting;
import com.practice.model.BattingPK;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration
@ContextConfiguration(locations = { "classpath:dao-test-context.xml" })
public class BattingDAOImplTest {

	@Autowired
	BattingDAO testedObject;

	@Test
	public void testAddBatting() throws Exception {

		Batting batting = new Batting();
		BattingPK id = new BattingPK();
		id.setYearID(2013);
		id.setStint(1);
		id.setPlayerID("didoux");

		batting.setAb(4);
		batting.setH(1);
		batting.set_3b(0);
		batting.set_2b(0);
		batting.setHbp(0);
		batting.setBb(1);
		batting.setCs(1);
		batting.setG(1);
		batting.setG_batting(1);
		batting.setGidp(0);
		batting.setHr(1);
		batting.setId(id);
		batting.setIbb(0);
		batting.setR(1);
		batting.setRbi(1);
		batting.setSb(0);
		batting.setSf(0);
		batting.setSh(0);
		batting.setSo(2);
		batting.setLgID("NL");
		batting.setTeamID("STN");

		Batting persistedBatting = testedObject.addBatting(batting);

		//Batting persistedBatting = testedObject.getBatting(batting.getId());

		assertEquals(batting, persistedBatting);
		assertEquals(batting.getId().getPlayerID(), persistedBatting.getId()
				.getPlayerID());
		assertEquals(batting.getId().getYearID(), persistedBatting.getId()
				.getYearID());
		assertEquals(batting.getId().getStint(), persistedBatting.getId()
				.getStint());
		assertEquals("STN", persistedBatting.getTeamID());
		assertEquals("NL", persistedBatting.getLgID());
		assertEquals(2013, persistedBatting.getId().getYearID());
	}
	
	@Test
	public void testRemoveBatting() throws Exception {

		BattingPK id = new BattingPK();
		id.setYearID(2012);
		id.setStint(1);
		id.setPlayerID("didoux");
		
		Batting persistedBatting = testedObject.getBatting(id);

		testedObject.removeBatting(persistedBatting);
	}
	
	@Test
	public void testListBatting() {
		List<Batting> battingList = testedObject.listBatting();
		assertEquals(96600,battingList.size());
	}
	
	

}
