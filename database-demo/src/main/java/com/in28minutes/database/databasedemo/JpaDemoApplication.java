package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.dao.PersonJdbcDao;
import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(JpaDemoApplication.class);

    @Autowired
    PersonJpaRepository personJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        LOG.info("All users->{}", personJpaRepository.findAll());
        var person = personJpaRepository.findById(10001);
        LOG.info("User id 10001->{}", person);
        personJpaRepository.deleteById(10002);
        LOG.info("After deletion : All users->{}", personJpaRepository.findAll());
        LOG.info("Inserting 10004 ->", personJpaRepository.insert(new Person("Faisal", "Gopalganj", Date.valueOf("2012-12-12"))));
        person.setName("updated-faisal");
        person.setLocation("Siwan");
        LOG.info("Updating 10001 -> ", personJpaRepository.update(person));
        LOG.info("All users->{}", personJpaRepository.findAll());
    }
}
