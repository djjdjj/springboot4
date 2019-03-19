package com.hr.springboot4.service.imp;

import com.hr.springboot4.dao.studentDao;
import com.hr.springboot4.entity.student;
import com.hr.springboot4.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class stuServiceImpl implements studentService {
    @Autowired
    private studentDao studentDao;
    @Override
    public List<student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public List<student> find(student s) {
        return null;
    }

    @Override
    public void save(student s) {
        studentDao.save(s);
    }




    @Override
    public void delete(Integer id) {
        studentDao.deleteById(id);
    }
}
