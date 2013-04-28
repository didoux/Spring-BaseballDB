package com.practice.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.practice.model.Master;
import com.practice.model.Pitching;
import com.practice.util.BaseballHelper;

@ContextConfiguration(locations = {"classpath:dao-test-context.xml"})
public class PitchingServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    protected PitchingService testObject;
    
    @Autowired 
    protected MasterService masterService;
    
    Pitching p;
    
    @Before
    public void setUp() {
    	Master m = BaseballHelper.createMaster();
    	m.setPlayerID("didoux");
    	masterService.addMaster(m);
    	
		p = BaseballHelper.createPitching(BaseballHelper.createPitchingPK());
    }
    
    @Test
    public void removePitching() {
    	Pitching persistantPitching = testObject.addPitching(p);
    	
    	testObject.removePitching(persistantPitching);
    	
    	Pitching findPitching = testObject.getPitching(persistantPitching.getId());
    	assertNull(findPitching);
    	
    }
    
    
    @Test 
    public void removePitchingById() {
    	Pitching persistantPitching = testObject.addPitching(p);
    	
    	testObject.removePitching(persistantPitching.getId());
    	
    	Pitching findPitching = testObject.getPitching(persistantPitching.getId());
    	assertNull(findPitching);
    }
    
    @Test
    public void findPitchingById() {
    	Pitching persistantPitching = testObject.addPitching(p);
    	
    	Pitching findPitching = testObject.getPitching(persistantPitching.getId());
    	
    	assertNotNull(findPitching);
    	assertEquals(findPitching, persistantPitching);
    	
    }
    
    @Test
    public void findPitchingByYear() {
    	Pitching persistantPitching = testObject.addPitching(p);
    	
    	List<Pitching> pitchingList = testObject.getPitchingByPlayerID("didoux");
    	
    	assertNotNull(persistantPitching);
    	assertNotNull(pitchingList);
    	assertEquals(1, pitchingList.size());
    }
    
	
	@Test
    public void addPitching() {	

		Pitching persistantPitching = testObject.addPitching(p);
		
		assertNotNull(persistantPitching);
		
		assertEquals("didoux",p.getId().getPlayerID());
		assertEquals(2012, p.getId().getYearID());
		assertEquals(1, p.getId().getStint());
		assertEquals("SLN", p.getTeamID());
		assertEquals("NL", p.getLgID());
	
	}
	
	


	
}
