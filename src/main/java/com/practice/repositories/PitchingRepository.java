package com.practice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.practice.model.Pitching;
import com.practice.model.PitchingPK;

public interface PitchingRepository extends CrudRepository<Pitching, PitchingPK> {
	
	@Query("SELECT p FROM Pitching p where p.id.playerID=:playerID")
	List<Pitching> findByPlayerID(@Param("playerID") String playerID);
	
	

}
