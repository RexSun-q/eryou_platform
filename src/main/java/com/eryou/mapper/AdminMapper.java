package com.eryou.mapper;

import com.eryou.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    Admin findByEmail(Admin admin);
}
