package com.practice.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.practice.dao.BattingDAO;
import com.practice.model.Batting;
import com.practice.model.BattingPK;
import com.practice.util.BaseballHelper;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration
@ContextConfiguration(locations = { "classpath:dao-test-context.xml" })
public class BattingDAOImplTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	BattingDAO testedObject;

	@Test
	public void testAddBatting() throws Exception {

		BattingPK id = BaseballHelper.createBattingPK();
		Batting batting = BaseballHelper.createBatting(id);

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

		BattingPK id = BaseballHelper.createBattingPK();
		Batting batting = BaseballHelper.createBatting(id);

		Batting persistedBatting = testedObject.addBatting(batting);
		
		assertNotNull(persistedBatting);
		testedObject.removeBatting(persistedBatting);
	}
	
	@Test
	public void testListBatting() {
		List<Batting> battingList = testedObject.listBatting();
		assertEquals(96600,battingList.size());
	}
	
	

}
