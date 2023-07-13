package com.devpessoa.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devpessoa.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
