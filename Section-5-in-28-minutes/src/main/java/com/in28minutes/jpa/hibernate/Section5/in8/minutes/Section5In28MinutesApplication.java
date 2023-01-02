package com.in28minutes.jpa.hibernate.Section5.in8.minutes;

import com.in28minutes.jpa.hibernate.Section5.in8.minutes.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Section5In28MinutesApplication implements CommandLineRunner {
    private static final Logger LOG = LoggerFactory.getLogger(Section5In28MinutesApplication.class);
    @Autowired
    CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(Section5In28MinutesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var course = courseRepository.findById(10001L);
        LOG.info("Course Details: {}", course);
    }
}
