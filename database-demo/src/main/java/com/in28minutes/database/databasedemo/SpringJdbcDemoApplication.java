package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.dao.PersonJdbcDao;
import com.in28minutes.database.databasedemo.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(SpringJdbcDemoApplication.class);

    @Autowired
    PersonJdbcDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        LOG.info("All users->{}", dao.findAll());
        var person = dao.findById(10001);
        LOG.info("User id 10001->{}", person);
        LOG.info("Deleting 10002-> No of rows deleted- {}", dao.deleteById(10002));
        LOG.info("Inserting 10004 ->", dao.insert(new Person("Faisal", "Gopalganj", Date.valueOf("2012-12-12"))));
        person.setName("updated-faisal");
        person.setLocation("Siwan");
        LOG.info("Updating 10001 -> ", dao.update(person));
        LOG.info("All users->{}", dao.findAll());
    }
}
