package com.github.anole.gen.service;

import com.github.anole.gen.service.MysqlGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author db1995
 */
@Service
public class MysqlGeneratorServiceImpl implements MysqlGeneratorService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createTable() {
        jdbcTemplate.execute("");
    }
}