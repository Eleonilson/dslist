package com.eleonilson.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.eleonilson.dslist.dto.GameListDTO;
import com.eleonilson.dslist.entities.GameList;
import com.eleonilson.dslist.repositories.GameListRepository;
@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}
}
