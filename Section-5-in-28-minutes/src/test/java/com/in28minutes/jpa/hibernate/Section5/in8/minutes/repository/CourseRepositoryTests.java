package com.in28minutes.jpa.hibernate.Section5.in8.minutes.repository;

import com.in28minutes.jpa.hibernate.Section5.in8.minutes.Section5In28MinutesApplication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = Section5In28MinutesApplication.class)
class CourseRepositoryTests {

    private static final Logger LOG = LoggerFactory.getLogger(CourseRepositoryTests.class);

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        assertEquals("JPA in 50 Steps", courseRepository.findById(10001L).getName());
    }

}
