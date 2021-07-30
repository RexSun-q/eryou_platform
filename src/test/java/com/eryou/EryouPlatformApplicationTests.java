package com.eryou;

import com.eryou.entity.StudentIdentifier;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

    @Test
    void contextLoads() {
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

}
