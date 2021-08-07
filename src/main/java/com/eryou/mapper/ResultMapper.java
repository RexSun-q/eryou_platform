package com.eryou.mapper;

import com.eryou.entity.Result;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResultMapper {

    public Integer getResult(String studentId);
}
