package com.eryou.mapper;

import com.eryou.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.attoparser.dom.INestableNode;

import java.util.List;

@Mapper
public interface StudentMapper {

    public List<Student> queryAll();

    public Student queryById(int id);

    public void add(Student student);

    public void deleteById(int id);

    public void update(Student student);

    public Integer countAll();

    public Integer countMale();

    public Integer countFemale();

    public List<Student> list();
}
