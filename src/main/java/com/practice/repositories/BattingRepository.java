package com.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.practice.model.Batting;
import com.practice.model.BattingPK;

/**
 * Repository interface for {@link Batting} instances.  Provides basic CRUD operation due to the extension of
 * {@link JpaRepository}. Includes custom implemented functionality by extending {@link BattingRepositoryCustom}.
 * 
 * @author didoux
 *
 */
public interface BattingRepository extends CrudRepository<Batting, BattingPK>  {

}

