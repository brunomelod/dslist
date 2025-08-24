package com.portifolio.portifoliopringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.portifoliopringboot.Entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
