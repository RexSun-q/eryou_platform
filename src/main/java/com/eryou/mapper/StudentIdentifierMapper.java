package com.eryou.mapper;

import com.eryou.entity.StudentIdentifier;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentIdentifierMapper {

    void create(String cardId);

    void deleteById(int studentId);

    void update(StudentIdentifier si);

    List<StudentIdentifier> queryAll();

    StudentIdentifier queryById(int studentId);

    StudentIdentifier queryByCardId(String cardId);

}
