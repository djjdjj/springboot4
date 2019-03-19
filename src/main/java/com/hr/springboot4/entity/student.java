package com.hr.springboot4.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
public class student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stuId;
    @Column(name ="stuName" )
    private String name;
    @Column
    private String sex;
    @Column
    private Integer age;
    @Column(name = "stuClass")
    private Integer stuClass;

    public student() {
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStuClass() {
        return stuClass;
    }

    public void setStuClass(Integer stuClass) {
        this.stuClass = stuClass;
    }
}
