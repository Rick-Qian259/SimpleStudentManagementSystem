package com.rick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rick.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
