/* 关闭外键检查便于重建表 */
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 学生信息表
-- 存储学生的基本信息数据
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
                            `id` int NOT NULL AUTO_INCREMENT COMMENT '学生ID（主键）',
                            `name` varchar(50) NOT NULL COMMENT '学生姓名',
                            `gender` ENUM('男','女') NOT NULL COMMENT '性别',
                            `age` TINYINT UNSIGNED NOT NULL COMMENT '年龄',
                            `department` varchar(50) NOT NULL COMMENT '所属院系',
                            `class_name` varchar(50) NOT NULL COMMENT '班级名称',
                            `phone` varchar(11) NOT NULL COMMENT '手机号码',
                            `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            PRIMARY KEY (`id`) USING BTREE,
                            UNIQUE INDEX `udx_phone`(`phone`) COMMENT '手机号唯一索引',
                            CONSTRAINT `chk_phone_length` CHECK (LENGTH(`phone`) = 11),
                            CONSTRAINT `chk_age_range` CHECK (`age` BETWEEN 15 AND 50)
) ENGINE = InnoDB COMMENT = '学生基本信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 健康档案表
-- 记录学生的定期体检数据
-- ----------------------------
DROP TABLE IF EXISTS `health_record`;
CREATE TABLE `health_record`  (
                                  `record_id` int NOT NULL AUTO_INCREMENT COMMENT '体检记录ID（主键）',
                                  `student_id` int NOT NULL COMMENT '关联学生ID',
                                  `height` SMALLINT UNSIGNED NOT NULL COMMENT '身高（厘米）',
                                  `weight` SMALLINT UNSIGNED NOT NULL COMMENT '体重（千克）',
                                  `chest` SMALLINT UNSIGNED NOT NULL COMMENT '胸围（厘米）',
                                  `measure_date` DATE NOT NULL COMMENT '测量日期',
                                  PRIMARY KEY (`record_id`) USING BTREE,
                                  INDEX `idx_student`(`student_id`) USING BTREE,
                                  CONSTRAINT `fk_student_health`
                                      FOREIGN KEY (`student_id`)
                                          REFERENCES `student` (`id`)
                                          ON DELETE RESTRICT
                                          ON UPDATE CASCADE,
                                  CONSTRAINT `chk_height` CHECK (`height` BETWEEN 50 AND 250),
                                  CONSTRAINT `chk_weight` CHECK (`weight` BETWEEN 0 AND 400)
) ENGINE = InnoDB COMMENT = '学生健康体检记录表' ROW_FORMAT = Dynamic;


-- ----------------------------
-- 医疗记录表
-- 记录学生的门诊就诊信息
-- ----------------------------
DROP TABLE IF EXISTS `medical_record`;
CREATE TABLE `medical_record`  (
                                   `record_id` int NOT NULL AUTO_INCREMENT COMMENT '就诊记录ID（主键）',
                                   `student_id` int NOT NULL COMMENT '关联学生ID',
                                   `doctor_name` varchar(50) NOT NULL COMMENT '接诊医生姓名',
                                   `visit_time` datetime NOT NULL COMMENT '就诊时间',
                                   `diagnosis` varchar(500) NOT NULL COMMENT '诊断结果',
                                   `prescription` varchar(500) NULL COMMENT '处方内容',
                                   PRIMARY KEY (`record_id`) USING BTREE,
                                   INDEX `idx_student_medical`(`student_id`) USING BTREE,
                                   CONSTRAINT `fk_student_medical`
                                       FOREIGN KEY (`student_id`)
                                           REFERENCES `student` (`id`)
                                           ON DELETE RESTRICT
                                           ON UPDATE CASCADE
) ENGINE = InnoDB COMMENT = '学生就诊记录表' ROW_FORMAT = Dynamic;

/* 重新启用外键检查 */
SET FOREIGN_KEY_CHECKS = 1;