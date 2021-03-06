package com.songshuang.hive.demo.domain.api;

import com.songshuang.hive.demo.service.PokesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokesController {

  private final PokesService pokesService;

  public PokesController(PokesService pokesService) {
    this.pokesService = pokesService;
  }

  @GetMapping("/pokes")
  public Object pokes() {
    return pokesService.query();
  }
}
