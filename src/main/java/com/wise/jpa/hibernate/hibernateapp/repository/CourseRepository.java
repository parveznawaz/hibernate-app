package com.wise.jpa.hibernate.hibernateapp.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wise.jpa.hibernate.hibernateapp.entity.Course;

@Repository
public class CourseRepository {
	@Autowired
	EntityManager em;
	
	public Course findById(Long id){
		return em.find(Course.class, id);
	}
	
	//public Course save(Course course) -> insert or update
	
	//public void deleteById(Long id)
}
