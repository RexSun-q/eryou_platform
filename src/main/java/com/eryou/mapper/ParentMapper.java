package com.eryou.mapper;

import com.eryou.entity.Parent;
import com.eryou.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ParentMapper {
    public List<Parent> queryAll();

    public List<Parent> queryByStudentId(int studentId);

    public void add(Parent parent);

    public void deleteById(int parentId);

    public void update(Parent parent);

    public List<Parent> list();
}
