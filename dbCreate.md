##数据库表
###region
CREATE TABLE `region` (
region_id INT PRIMARY KEY AUTO_INCREMENT,
region_name VARCHAR(20) NOT NULL,
region_level INT NOT NULL,
region_parent_id INT NOT NULL
);
###student_identifier
