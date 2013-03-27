package com.practice.model;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.Test;

public class BaseballTest extends AbstractTest {
	
	@Test
    public void testFindBattingByBattingId() {

        EntityManager entityManager = Persistence.createEntityManagerFactory("baseballPU").createEntityManager();

        entityManager.getTransaction().begin();

        BattingPK battingPK = new BattingPK();
        battingPK.setPlayerID("1234");
        battingPK.setStint(1234);
        battingPK.setYearID(2012);
        Batting batting = new Batting();
        batting.setLgID("NL");
        batting.setId(battingPK);
        
//        Team team = new Team();
//        team.setName("My Team");
//        TeamPK teamPK = new TeamPK();
//        teamPK.setTeamID("ABC");
//
//        team.setId(teamPK);
      
        batting.setTeamID("ABC");
        entityManager.remove(batting);
        
        entityManager.persist(batting);

        entityManager.getTransaction().commit();

        // see that the ID of the user was set by Hibernate
        System.out.println("batting Id=" + batting.getId().getPlayerID() + ", yearID=" + batting.getId().getYearID());

        Batting foundBatting = entityManager.find(Batting.class, batting.getId());

        // note that foundUser is the same instance as user and is a concrete class (not a proxy)
        System.out.println("foundBatting =" + foundBatting);

        assertEquals(batting.getId().getPlayerID(), foundBatting.getId().getPlayerID());
        assertEquals(batting.getId().getYearID(), foundBatting.getId().getYearID());

        entityManager.close();
    }
	

}
