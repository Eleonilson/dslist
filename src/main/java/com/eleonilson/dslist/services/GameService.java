package com.eleonilson.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eleonilson.dslist.dto.GameMinDTO;
import com.eleonilson.dslist.entities.Game;
import com.eleonilson.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
			List<Game> result = gameRepository.findAll();
			return result.stream().map(GameMinDTO::new).toList();
	
	}
}
