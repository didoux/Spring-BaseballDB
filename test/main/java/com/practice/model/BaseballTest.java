package com.practice.model;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.Test;

public class BaseballTest extends AbstractTest {

	@Test
	public void testFindBattingByBattingId() {

		EntityManager entityManager = Persistence.createEntityManagerFactory(
				"baseballPU").createEntityManager();

		entityManager.getTransaction().begin();

		BattingPK id = new BattingPK();
		id.setYearID(2012);
		id.setStint(1);
		id.setPlayerID("didoux");

		Batting foundBatting = entityManager.find(Batting.class, id);

		if (foundBatting != null) {
			entityManager.remove(foundBatting);
		}

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
		batting.setId(id);
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
		batting.setBattingTeam(team);

		entityManager.persist(batting);

		entityManager.getTransaction().commit();

		// see that the ID of the user was set by Hibernate
		System.out.println("batting Id=" + batting.getId().getPlayerID()
				+ ", yearID=" + batting.getId().getYearID());

		Batting persistedBatting = entityManager.find(Batting.class,
				batting.getId());

		// note that foundUser is the same instance as user and is a concrete
		// class (not a proxy)
		System.out.println("persistedBatting =" + persistedBatting);

		assertEquals(batting.getId().getPlayerID(), persistedBatting.getId()
				.getPlayerID());
		assertEquals(batting.getId().getYearID(), persistedBatting.getId()
				.getYearID());

		entityManager.close();
	}

}
