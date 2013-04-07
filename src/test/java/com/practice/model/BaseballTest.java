package com.practice.model;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BaseballTest extends AbstractTest {
	private EntityManager entityManager;
	
	private BattingPK id;
	
	@Before
	public void setUp() {
		entityManager = Persistence.createEntityManagerFactory(
				"baseballPU").createEntityManager();
		entityManager.getTransaction().begin();

	}
	
	@After
	public void tearDown() {
		entityManager.getTransaction().rollback();
		entityManager.close();
	}
	
	@Test
	public void testFindAndRemove() {
		
		id = createBattingPK();

		Batting foundBatting = entityManager.find(Batting.class, id);

		if (foundBatting != null) {
			entityManager.remove(foundBatting);
		}
	}
	
	@Test
	@Ignore
	public void testFindBattingByBattingId() {

		Batting batting = new Batting();

		batting.setAb(4);
		batting.setH(1);
		batting.set_3b(0);
		batting.set_2b(0);
		batting.setHbp(0);
		batting.setBb(1);
		batting.setCs(1);
		batting.setG(1);
		batting.setG_batting(1);
		batting.setGidp(0);
		batting.setHr(1);
		batting.setId(createBattingPK());
		batting.setIbb(0);
		batting.setR(1);
		batting.setRbi(1);
		batting.setSb(0);
		batting.setSf(0);
		batting.setSh(0);
		batting.setSo(2);
		// batting.setLgID("NL");
		// batting.setTeamID("STL");
		// batting.setYearId(2013);
		TeamPK teamId = new TeamPK();
		teamId.setTeamID("SLN");
		teamId.setLgID("NL");
		teamId.setYearID(2013);
		Team team = new Team();
		team.setId(teamId);

		entityManager.persist(batting);

//		System.out.println("batting Id=" + batting.getId().getPlayerID()
//				+ ", yearID=" + batting.getId().getYearID());

		Batting persistedBatting = entityManager.find(Batting.class,
				batting.getId());


		//System.out.println("persistedBatting =" + persistedBatting);

		assertEquals(batting.getId().getPlayerID(), persistedBatting.getId()
				.getPlayerID());
		assertEquals(batting.getId().getYearID(), persistedBatting.getId()
				.getYearID());


	}
	
	private BattingPK createBattingPK() {
		BattingPK id = new BattingPK();
		id.setYearID(2012);
		id.setStint(1);
		id.setPlayerID("didoux");
		return id;
	}

}
