package com.practice.dao.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


import com.practice.dao.MasterDAO;
import com.practice.model.Master;
import com.practice.util.BaseballHelper;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration
@ContextConfiguration(locations = { "classpath:dao-test-context.xml" })
public class MasterDAOImplTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	MasterDAO testedObject;
	
	Master master;
	
	@Before
	public void setUp() {
		master = BaseballHelper.createMaster();
	}
	
	@Test
	public void testAddMaster() throws Exception {
		
		Master persistedMaster = testedObject.addMaster(master);
		System.out.println(master.getLahmanID());
		
		assertMaster(master,persistedMaster);
		
	}


	
	@Test
	public void testGetMasterByLahmanID() {
		testedObject.addMaster(master);
		
		Master persistedMaster = testedObject.getMaster(master.getLahmanID());
		
		assertMaster(master,persistedMaster);
		
	}
	
	@Test
	public void testRemoveMaster() {
		testedObject.addMaster(master);
		testedObject.removeMaster(master);
		Master findMaster = testedObject.getMaster(master.getLahmanID());
		assertNull(findMaster);
	}
	
	protected void assertMaster(Master master, Master persistedMaster) {
		assertNotNull(master);
		assertNotNull(persistedMaster);
		assertEquals(master.getLahmanID(), persistedMaster.getLahmanID());
		assertEquals(master.getPlayerID(), persistedMaster.getPlayerID());
		assertEquals(master.getBats(), persistedMaster.getBats());
		assertEquals(master.getBbrefID(),persistedMaster.getBbrefID());
		assertEquals(master.getBirthCity(), persistedMaster.getBirthCity());
		assertEquals(master.getBirthCountry(), persistedMaster.getBirthCountry());
		assertEquals(master.getBirthDay(), persistedMaster.getBirthDay());
		assertEquals(master.getBirthMonth(), persistedMaster.getBirthMonth());
		assertEquals(master.getBirthState(), persistedMaster.getBirthState());
		assertEquals(master.getBirthYear(), persistedMaster.getBirthYear());
		assertEquals(master.getCollege(), persistedMaster.getCollege());
		assertEquals(master.getDeathCity(), persistedMaster.getDeathCity());
		assertEquals(master.getDeathDay(), persistedMaster.getDeathDay());
		assertEquals(master.getDeathMonth(), persistedMaster.getDeathMonth());
		assertEquals(master.getDeathState(), persistedMaster.getDeathState());
		assertEquals(master.getDeathYear(), persistedMaster.getDeathYear());
		assertEquals(master.getDebut(), persistedMaster.getDebut());
		assertEquals(master.getFinalGame(), persistedMaster.getFinalGame());
		assertEquals(master.getHeight(), persistedMaster.getHeight(),0.01);
		assertEquals(master.getHofID(), persistedMaster.getHofID());
		assertEquals(master.getHoltzID(), persistedMaster.getHoltzID());
		assertEquals(master.getLahman40ID(), persistedMaster.getLahman40ID());
		assertEquals(master.getLahman45ID(), persistedMaster.getLahman45ID());
		assertEquals(master.getManagerID(), persistedMaster.getManagerID());
		assertEquals(master.getNameFirst(), persistedMaster.getNameFirst());
		assertEquals(master.getNameGiven(), persistedMaster.getNameGiven());
		assertEquals(master.getNameLast(), persistedMaster.getNameLast());
		assertEquals(master.getNameNick(), persistedMaster.getNameNick());
		assertEquals(master.getNameNote(), persistedMaster.getNameNote());
		assertEquals(master.getPlayerID(), persistedMaster.getPlayerID());
		assertEquals(master.getRetroID(), persistedMaster.getRetroID());
		assertEquals(master.getThrows_(), persistedMaster.getThrows_());
		assertEquals(master.getWeight(), persistedMaster.getWeight());
	}	
	
	
}
