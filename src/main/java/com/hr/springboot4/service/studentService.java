package com.hr.springboot4.service;

import com.hr.springboot4.entity.student;

import java.util.List;

public interface studentService {
    public List<student> findAll();

    public List<student> find(student s);

    public void save(student s);

    public void  delete(Integer id);

}
