package com.in28minutes.database.databasedemo.jpa;

import com.in28minutes.database.databasedemo.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public void deleteById(int id) {
        var person = findById(id);
        entityManager.remove(person);
    }

    public List<Person> findAll() {
        var namedQuery = entityManager.createNamedQuery("find_all", Person.class);
        return namedQuery.getResultList();
    }

//    public List<Person> findAll() {
//        return entityManager.find(Person.class,);
//    }
}
