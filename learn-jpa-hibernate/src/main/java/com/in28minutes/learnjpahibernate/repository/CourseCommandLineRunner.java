package com.in28minutes.learnjpahibernate.repository;

import com.in28minutes.learnjpahibernate.model.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    private final CourseSpringJpaRepository courseSpringJpaRepository;

    public CourseCommandLineRunner(CourseSpringJpaRepository courseSpringJpaRepository) {
        this.courseSpringJpaRepository = courseSpringJpaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        courseSpringJpaRepository.save(new Course(1l, "Aprende Java", "in28minutes"));
        courseSpringJpaRepository.save(new Course(2l, "Aprende AWS", "in28minutes"));
        courseSpringJpaRepository.save(new Course(3l, "Aprende Azure", "in28minutes"));

        courseSpringJpaRepository.deleteById(1l);

        System.out.println(courseSpringJpaRepository.findById(2l));
        System.out.println(courseSpringJpaRepository.findById(3l));

        System.out.println(courseSpringJpaRepository.findAll());
        System.out.println(courseSpringJpaRepository.count());

        System.out.println(courseSpringJpaRepository.findByAuthor("in28minutes"));
        System.out.println(courseSpringJpaRepository.findByName("Aprende AWS"));

    }
}
