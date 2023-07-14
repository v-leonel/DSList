package com.victorleonel.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorleonel.dslist.dto.GameMinDTO;
import com.victorleonel.dslist.entities.Game;
import com.victorleonel.dslist.repositories.GameRepository;

@Service
public abstract class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public abstract List<GameMinDTO> findAll();{
		List<GameMinDTO> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
		
			
}
