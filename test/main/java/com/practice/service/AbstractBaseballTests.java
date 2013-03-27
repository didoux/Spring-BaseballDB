package com.practice.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.practice.dao.BattingDAO;
import com.practice.model.Batting;
import com.practice.service.BattingService;
 
//@ContextConfiguration
@ContextConfiguration(locations = {"classpath:dao-test-context.xml"})
public class AbstractBaseballTests extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    protected BattingDAO battingDAO;
    @Autowired
    protected BattingService battingService;
    @Test
    public void sampleTest(){
        System.out.println("Number of rows is: " + battingService.listBatting().size());
        System.out.println("Creating a new batting");
        Batting bat = new Batting();
       
        battingService.addBatting(bat);
        System.out.println("After saving batting. Id is: " + bat.getId());
        System.out.println("Number of rows now is: " + battingService.listBatting().size());
    }
}
