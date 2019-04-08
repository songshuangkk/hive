package com.songshuang.hive.demo.service.impl;

import com.songshuang.hive.demo.domain.test.model.Pokes;
import com.songshuang.hive.demo.domain.test.repository.PokesRepository;
import com.songshuang.hive.demo.service.PokesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PokesServiceImpl implements PokesService {

  @Resource
  private PokesRepository pokesRepository;

  @Override
  public List<Pokes> query() {
    return pokesRepository.queryList();
  }
}
