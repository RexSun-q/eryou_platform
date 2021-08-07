##数据库表
###region
CREATE TABLE `region` (
region_id INT PRIMARY KEY AUTO_INCREMENT,
region_name VARCHAR(20) NOT NULL,
region_level INT NOT NULL,
region_parent_id INT NOT NULL
);
###student_identifier


###添加学生信息

{studentName=学生, 
studentCardId=522501199612300011, 
studentIndex=男, 
birthday=2021-08-07, 
sregion1=北京市,北京市,东城区, 
slocation1=住地, 
sregion2=北京市,北京市,东城区, 
slocation2=户籍, 
parentName=家长, 
parentIndex=父亲, 
parentCardId=522501199808070033, 
company=安顺, 
pregion1=北京市,北京市,东城区, 
plocation1=住地2, 
pregion2=北京市,北京市,东城区, 
plocation2=户籍2, 
phoneNum=15574329960}