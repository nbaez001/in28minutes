package com.in28minutes.learnjpahibernate.repository;

import com.in28minutes.learnjpahibernate.model.Course;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    private final JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY = """
            INSERT INTO COURSE (id, name, author)
            VALUES(?, ?, ?)
            """;

    public CourseJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.id(), course.name(), course.author());
    }
}
