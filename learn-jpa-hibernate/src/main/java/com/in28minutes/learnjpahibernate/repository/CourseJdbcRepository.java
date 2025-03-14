package com.in28minutes.learnjpahibernate.repository;

import com.in28minutes.learnjpahibernate.model.Course;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    private final JdbcTemplate jdbcTemplate;
    private static String QUERY_INSERT = """
            INSERT INTO COURSE (id, name, author)
            VALUES(?, ?, ?)
            """;

    private static String QUERY_DELETE = """
            DELETE FROM COURSE
            WHERE id = ?
            """;

    private static String QUERY_SELECT = """
            SELECT * FROM COURSE
            WHERE id = ?
            """;

    public CourseJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Course course) {
        jdbcTemplate.update(QUERY_INSERT, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        jdbcTemplate.update(QUERY_DELETE, id);
    }

    public Course findById(long id) {
        return jdbcTemplate.queryForObject(QUERY_SELECT,
                new BeanPropertyRowMapper<>(Course.class), id);
    }
}
