package com.practice.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.practice.model.Master;
import com.practice.util.BaseballHelper;


@ContextConfiguration(locations = {"classpath:dao-test-context.xml"})
public class MasterServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
	    
	    @Autowired 
	    protected MasterService testObject;
	    
	    Master m;
	    
	    @Before
	    public void setUp() {
	    	m = BaseballHelper.createMaster();
	    	m.setPlayerID("didoux");	    	
	    }
	    
	    @Test
	    public void removeMaster() {
	    	Master persistantMaster = testObject.addMaster(m);
	    	
	    	testObject.removeMaster(persistantMaster);
	    	
	    	Master findMaster = testObject.getMaster(persistantMaster.getLahmanID());
	    	assertNull(findMaster);
	    	
	    }
	    
	    
	    @Test 
	    public void removeMasterById() {
	    	Master persistantMaster = testObject.addMaster(m);
	    	
	    	testObject.removeMaster(persistantMaster.getLahmanID());
	    	
	    	Master findMaster = testObject.getMaster(persistantMaster.getLahmanID());
	    	assertNull(findMaster);
	    }
	    
	    @Test
	    public void getMaster() {
	    	Master persistantMaster = testObject.addMaster(m);
	    	
	    	Master findMaster = testObject.getMaster(persistantMaster.getLahmanID());
	    	
	    	assertNotNull(persistantMaster);
	    	assertMaster(findMaster, persistantMaster);
	    	
	    }
	    
		
		@Test
	    public void addMaster() {	

	    	Master persistantMaster = testObject.addMaster(m);
			
			assertNotNull(persistantMaster);
			
			assertMaster(m, persistantMaster);
		
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