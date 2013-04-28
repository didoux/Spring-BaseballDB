package com.practice.service;


import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.practice.model.Batting;
import com.practice.model.BattingPK;
//import com.practice.model.Team;
//import com.practice.model.TeamPK;
import com.practice.service.BattingService;
 
@ContextConfiguration(locations = {"classpath:dao-test-context.xml"})
public class BattingServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    protected BattingService battingService;
    
    @Test
    public void addBatting(){
        //System.out.println("Number of rows is: " + battingService.listBatting().size());
        //System.out.println("Creating a new batting");

        BattingPK id = new BattingPK();
        id.setYearID(2012);
        id.setStint(1);
        id.setPlayerID("didoux");

        Batting foundBatting = battingService.getBatting(id);
        
        if( foundBatting != null) {
        	battingService.removeBatting(id);
        }
        
        Batting bat = new Batting();
        bat.setAb(4);
        bat.setH(1);
        bat.set_3b(0);
        bat.set_2b(0);
        bat.setHbp(0);
        bat.setBb(1);
        bat.setCs(1);
        bat.setG(1);
        bat.setG_batting(1);
        bat.setGidp(0);
        bat.setHr(1);
        bat.setId(id);
        bat.setIbb(0);
        bat.setLgID("NL");
        bat.setR(1);
        bat.setRbi(1);
        bat.setSb(0);
        bat.setSf(0);
        bat.setSh(0);
        bat.setSo(2);
        bat.setTeamID("STL");
        
        Batting persistBatting = battingService.addBatting(bat);
        
        assertNotNull(persistBatting);
        //System.out.println("After saving batting. Id is: " + bat.getId());
        //System.out.println("Number of rows now is: " + battingService.listBatting().size());
    }
    
    @Test
    public void removeNonExistingBatting() {
    	 BattingPK id = new BattingPK();
         id.setYearID(2012);
         id.setStint(1);
         id.setPlayerID("didoux");

         Batting batting = battingService.getBatting(id);
         
         assertNull(batting);
         try {
             battingService.removeBatting(id);
             fail("Test did not throw an exception");
         } catch( RuntimeException re) {
        	 //This is expected
         }

    	    	
    	
    }
}
