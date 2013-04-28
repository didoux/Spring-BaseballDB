package com.practice.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

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
import com.practice.dao.PitchingDAO;
import com.practice.model.Master;
import com.practice.model.Pitching;
import com.practice.util.BaseballHelper;


@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration
@ContextConfiguration(locations = { "classpath:dao-test-context.xml" })
public class PitchingDAOImplTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	PitchingDAO testObject;
	
	@Autowired 
	MasterDAO masterDAO;
	
    Pitching p;
    Master   m;
	
    @Before
    public void setUp() {
        m = BaseballHelper.createMaster();
        m.setPlayerID("didoux");
		p = BaseballHelper.createPitching(BaseballHelper.createPitchingPK());
    }
    
    @Test
    public void removePitching() {
    	masterDAO.addMaster(m);
    	Pitching persistantPitching = testObject.addPitching(p);
    	
    	testObject.removePitching(persistantPitching);
    	
    	Pitching findPitching = testObject.getPitching(persistantPitching.getId());
    	assertNull(findPitching);
    	
    }
    
    @Test
    public void findPitchingById() {
    	masterDAO.addMaster(m);
    	Pitching persistantPitching = testObject.addPitching(p);
    	
    	Pitching findPitching = testObject.getPitching(persistantPitching.getId());
    	
    	assertNotNull(findPitching);
    	assertEquals(findPitching, persistantPitching);
    	
    }
    
    @Test
    public void findPitchingByYear() {
    	masterDAO.addMaster(m);
    	Pitching persistantPitching = testObject.addPitching(p);
    	
    	List<Pitching> pitchingList = testObject.getPitchingByPlayerID("didoux");
    	
    	assertNotNull(persistantPitching);
    	assertNotNull(pitchingList);
    	assertEquals(1, pitchingList.size());
    }
        
	
	@Test
	public void testAddPitching() throws Exception {
		
    	masterDAO.addMaster(m);
		Pitching persistantPitching = testObject.addPitching(p);
		
		assertNotNull(persistantPitching);
		
		assertEquals("didoux",p.getId().getPlayerID());
		assertEquals(2012, p.getId().getYearID());
		assertEquals(1, p.getId().getStint());
		assertEquals("SLN", p.getTeamID());
		assertEquals("NL", p.getLgID());	
	
		
		
		
		
	}
}
