package com.wise.jpa.hibernate.hibernateapp;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wise.jpa.hibernate.hibernateapp.entity.Course;
import com.wise.jpa.hibernate.hibernateapp.entity.Review;
import com.wise.jpa.hibernate.hibernateapp.repository.CourseRepository;
import com.wise.jpa.hibernate.hibernateapp.repository.StudentRepository;

@SpringBootApplication
public class HibernateAppApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(HibernateAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// studentRepository.saveStudentWithPassport();
				// repository.playWithEntityManager();
				// courseRepository.addHardcodedReviewsForCourse();
				// List<Review> reviews = new ArrayList<>();

				// reviews.add(new Review("5", "Great Hands-on Stuff."));
				// reviews.add(new Review("5", "Hatsoff."));

				// courseRepository.addReviewsForCourse(10003L, reviews );
				// studentRepository.insertHardcodedStudentAndCourse();
				// studentRepository.insertStudentAndCourse(new Student("Jack"),
				// new Course("Microservices in 100 Steps"));

				// Jack FullTimeEmployee salary - 10000$
				// Jill PartTimeEmployee - 50$ per hour
				/*
				employeeRepository.insert(new PartTimeEmployee("Jill", new BigDecimal("50")));
				employeeRepository.insert(new FullTimeEmployee("Jack", new BigDecimal("10000")));

				logger.info("Full Time Employees -> {}", 
						employeeRepository.retrieveAllFullTimeEmployees());
				
				logger.info("Part Time Employees -> {}", 
						employeeRepository.retrieveAllPartTimeEmployees());*/
	}

}

