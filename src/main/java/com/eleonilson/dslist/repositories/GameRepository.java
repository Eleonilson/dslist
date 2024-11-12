package com.eleonilson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleonilson.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
	