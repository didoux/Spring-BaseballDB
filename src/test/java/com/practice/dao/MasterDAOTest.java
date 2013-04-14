package com.practice.dao;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


import com.practice.model.Master;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration
@ContextConfiguration(locations = { "classpath:dao-test-context.xml" })
public class MasterDAOTest {
	
	@Autowired
	MasterDAO testedObject;
	
	//musiast01
	
	@Test
	public void testAddMaster() throws Exception {
		
		Master master = new Master();
		//master.setLahmanID(Integer.MAX_VALUE);
		master.setPlayerID("musiast01");
		master.setManagerID(null);
		master.setHofID("musiast01h");
		master.setBirthYear(1920);
		master.setBirthMonth(11);
		master.setBirthDay(21);
		master.setBirthCountry("USA");
		master.setBirthState("PA");
		master.setDeathYear(2013);
		master.setDeathMonth(1);
		master.setDeathDay(19);
		master.setDeathCountry("USA");
		master.setDeathState("MO");
		master.setDeathCity("Ladue");
		master.setNameFirst("Stan");
		master.setNameLast("Musial");
		master.setNameNote(null);
		master.setNameGiven("Stanley Frank");
		master.setNameNick("Stan the Man");
		master.setWeight(175);
		master.setHeight(72);
		master.setBats("L");
		master.setThrows_("L");
		master.setDebut("9/17/1941");
		master.setFinalGame("9/29/1963");
		master.setCollege(null);
		master.setLahman40ID("musiast01");
		master.setLahman45ID("musiast01");
		master.setRetroID("musis101");
		master.setHoltzID("musiast01");
		master.setBbrefID("musiast01");
		
		testedObject.addMaster(master);
		System.out.println(master.getLahmanID());
		
		Master persistedMaster = testedObject.getMaster(master.getLahmanID());
		assertNotNull(persistedMaster);
		
		assertEquals(persistedMaster.getLahmanID(), persistedMaster.getLahmanID());
		
		
	}
	
}
