package com.wise.jpa.hibernate.hibernateapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wise.jpa.hibernate.hibernateapp.entity.Course;
import com.wise.jpa.hibernate.hibernateapp.repository.CourseRepository;

@SpringBootApplication
public class HibernateAppApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(HibernateAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Course course=repository.findById(10001L);
		logger.info("Course 10001 -> {}", course);
		
	}

}

