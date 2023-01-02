package com.in28minutes.jpa.hibernate.Section5.in8.minutes.repository;

import com.in28minutes.jpa.hibernate.Section5.in8.minutes.entity.Course;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

    @Autowired
    EntityManager entityManager;

    public Course findById(Long id) {
        return entityManager.find(Course.class, id);
    }
}
