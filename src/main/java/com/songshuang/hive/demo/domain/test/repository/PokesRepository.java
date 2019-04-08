package com.songshuang.hive.demo.domain.test.repository;

import com.songshuang.hive.demo.domain.test.model.Pokes;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PokesRepository {

  private final JdbcTemplate jdbcTemplate;

  PokesRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Pokes> queryList() {
    RowMapper<Pokes> rowMapper = new BeanPropertyRowMapper<>(Pokes.class);
    return jdbcTemplate.query("select foo, bar from pokes limit 0,10", rowMapper);
  }
}
