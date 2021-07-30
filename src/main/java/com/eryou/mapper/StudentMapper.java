package com.eryou.mapper;

import com.eryou.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    public List<Student> queryAll();

    public Student queryById(int id);
}
