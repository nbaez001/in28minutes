package com.in28minutes.learnjpahibernate.repository;

import com.in28minutes.learnjpahibernate.model.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    private final CourseJdbcRepository courseJdbcRepository;

    public CourseJdbcCommandLineRunner(CourseJdbcRepository courseJdbcRepository) {
        this.courseJdbcRepository = courseJdbcRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(1l, "Aprende Java", "in28minutes");
        courseJdbcRepository.insert(course);
    }
}
