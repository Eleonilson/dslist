package com.eleonilson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eleonilson.dslist.entities.GameList;
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
