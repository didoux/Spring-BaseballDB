package com.practice.dao;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.practice.model.Batting;
import com.practice.model.BattingPK;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration
@ContextConfiguration(locations = {"classpath:dao-test-context.xml"})
public class BattingDAOTest {
	
	@Autowired
	BattingDAO testedObject;
	
	
	@Test
	public void testAddBatting() throws Exception {

     BattingPK battingPK = new BattingPK();
     battingPK.setPlayerID("1234");
     battingPK.setStint(1234);
     battingPK.setYearID(2012);
     Batting batting = new Batting();
     batting.setLgID("NL");
     batting.setId(battingPK);
     batting.setTeamID("ABC");

     testedObject.addBatting(batting);
     
     Batting persistedBatting  = testedObject.getBatting(batting.getId());
     
     assertEquals(batting, persistedBatting);
     assertEquals(batting.getId().getPlayerID(), persistedBatting.getId().getPlayerID());
     assertEquals(batting.getId().getYearID(), persistedBatting.getId().getYearID());
     assertEquals(batting.getId().getStint(), persistedBatting.getId().getStint());
	 assertEquals("ABC", persistedBatting.getTeamID());
	}

}
