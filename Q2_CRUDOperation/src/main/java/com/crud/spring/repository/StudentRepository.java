package com.crud.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.spring.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
