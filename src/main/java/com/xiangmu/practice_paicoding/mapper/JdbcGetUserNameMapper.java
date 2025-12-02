package com.xiangmu.practice_paicoding.mapper;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcGetUserNameMapper implements GetUserNameMapper {
    private final JdbcTemplate jdbcTemplate;

    public JdbcGetUserNameMapper(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String getName(String articleId) {
        try {
            return jdbcTemplate.queryForObject(
                    "SELECT username FROM username WHERE article_id = ?",
                    String.class,
                    articleId
            );
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }
}
