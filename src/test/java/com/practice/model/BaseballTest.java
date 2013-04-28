package com.practice.model;


import javax.persistence.ManyToOne;
import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.practice.util.BaseballHelper;

public class BaseballTest extends AbstractTest {
	private EntityManager entityManager;
	
	@ManyToOne
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
		
		id = BaseballHelper.createBattingPK();

		Batting foundBatting = entityManager.find(Batting.class, id);

		if (foundBatting != null) {
			entityManager.remove(foundBatting);
		}
	}
	
	@Test
	public void testFindBattingByBattingId() {
		
		BattingPK id = new BattingPK();
		id.setPlayerID("pujolal01");
		id.setStint(1);
		id.setYearID(2011);

		Batting findBatting = entityManager.find(Batting.class, id);

		assertEquals(id.getPlayerID(), findBatting.getId()
				.getPlayerID());
		assertEquals(id.getYearID(), findBatting.getId()
				.getYearID());
		assertEquals(id.getStint(), findBatting.getId().getStint());
		
		assertEquals(37, findBatting.getHr().intValue());


	}
	


}
