-- 学生表
create table `student` (
`stu_id` varchar (20) not null comment '学号',
`stu_name` varchar (10) not null comment '姓名',
`stu_age` int (10) not null comment '年龄',
`stu_depart_id` varchar (20) not null comment '系别',
`stu_address` varchar (20) not null comment '联系地址',
`stu_class_id` varchar (20) not null comment '班别',
PRIMARY KEY (`stu_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='学生表';

-- 系别表
create table `department`(
`depart_id` varchar (20) not null comment '系别编号',
`depart_name` varchar (20) not null comment '系别名称',
PRIMARY KEY (`depart_id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='系别表';

-- 班级表
create table `class`(
`class_id` varchar (20) not null comment '班级编号',
`class_name` varchar (20) not null comment '班级名称',
PRIMARY KEY (`class_id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='班级表';

-- 科目表
create table `subject`(
`subject_id` varchar (20) not null comment '科目编号',
`subject_name` varchar (20) not null comment '科目名称',
PRIMARY KEY (`subject_id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='科目表';

-- 成绩表
create table `grade`(
`grade_id` INT(8) NOT NULL AUTO_INCREMENT COMMENT '成绩流水id',
`stu_id` varchar (20) not null comment '学号',
`subject_id` varchar (20) not null comment '科目编号',
`subject_mark` decimal (5,1) not null comment '分数',
`exam_name` varchar (20) not null comment '考试名称',
`create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY (`grade_id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='成绩表';
