package com.portifolio.portifoliopringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.portifoliopringboot.Entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
