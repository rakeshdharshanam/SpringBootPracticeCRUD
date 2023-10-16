package com.example.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entity.student_entity;

public interface studentRepository extends JpaRepository<student_entity, Long>{

}
