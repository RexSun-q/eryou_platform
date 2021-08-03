package com.eryou;

import com.eryou.entity.Parent;
import com.eryou.entity.StudentIdentifier;
import com.eryou.mapper.ParentMapper;
import com.eryou.mapper.StudentMapper;
import com.eryou.util.PageUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class EryouPlatformApplicationTests {
    @Autowired
    JdbcTemplate template;
    @Autowired
    StudentMapper studentMapper;

    @Test
    void contextLoads() {
        // 测试连接
       String sql = "select * from student_identifier";
        List<StudentIdentifier> list = template.query(sql, new RowMapper<StudentIdentifier>() {
            @Override
            public StudentIdentifier mapRow(ResultSet resultSet, int i) throws SQLException {
                StudentIdentifier si = new StudentIdentifier();
                si.setStudentId(resultSet.getInt("student_id"));
                si.setCardId(resultSet.getString("card_id"));
                return si;
            }
        });

        for (StudentIdentifier si : list) {
            System.out.println(si);
        }
    }

    @Test
    void test01() {
        Integer num = studentMapper.countAll();
        System.out.println(num);

    }

    @Autowired
    ParentMapper parentMapper;
    @Test
    void testParent() {

       Parent parent = new Parent();
       parent.setChildId(12);
       parent.setParentName("面膜的爸爸");
       parent.setParentGender("男");
       parent.setCategoryId(0);
       parentMapper.add(parent);
    }

}
