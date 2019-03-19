package com.hr.springboot4.dao;

import com.hr.springboot4.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentDao extends JpaRepository<student,Integer> {

}
