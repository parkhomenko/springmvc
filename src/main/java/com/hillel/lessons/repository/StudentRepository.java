package com.hillel.lessons.repository;

import com.hillel.lessons.model.Student;

import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
public class StudentRepository {

  @PersistenceContext
  EntityManager entityManager;

  @Transactional
  public List<Student> getStudents() {
    Query query = entityManager.createQuery("from Student");
    return query.getResultList();
  }
}
