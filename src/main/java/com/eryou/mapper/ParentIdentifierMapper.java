package com.eryou.mapper;

import com.eryou.entity.ParentIdentifier;
import com.eryou.entity.StudentIdentifier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ParentIdentifierMapper {

    void add(ParentIdentifier pi);

    void deleteById(int parentId);

    void update(ParentIdentifier pi);

    List<ParentIdentifier> queryAll();

    ParentIdentifier queryById(int parentId);
}
