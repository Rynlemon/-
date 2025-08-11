-- 创建数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS user;
USE user;

-- 用户表
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(20) DEFAULT 'USER',
    email VARCHAR(100),
    phone VARCHAR(20),
    create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 学生表（如果不存在则创建）
CREATE TABLE IF NOT EXISTS student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    grade VARCHAR(20),
    user_id INT,
    CONSTRAINT fk_student_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE SET NULL
);

-- 教师表（如果不存在则创建）
CREATE TABLE IF NOT EXISTS teacher (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    subject VARCHAR(50),
    user_id INT,
    CONSTRAINT fk_teacher_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE SET NULL
);

-- 插入测试数据
INSERT IGNORE INTO users (username, password, role, email, phone) VALUES
('admin', 'admin123', 'ADMIN', 'admin@example.com', '13800138000'),
('teacher1', 'teacher123', 'TEACHER', 'teacher1@example.com', '13800138001'),
('student1', 'student123', 'STUDENT', 'student1@example.com', '13800138002');

-- 插入测试学生数据
INSERT IGNORE INTO student (name, age, grade, user_id) VALUES
('张三', 18, '高三', (SELECT id FROM users WHERE username='student1'));

-- 插入测试教师数据
INSERT IGNORE INTO teacher (name, subject, user_id) VALUES
('李老师', '数学', (SELECT id FROM users WHERE username='teacher1'));

-- 查看创建结果
SELECT 'Users table:' AS info;
SELECT * FROM users;

SELECT 'Student table:' AS info;
SELECT * FROM student;

SELECT 'Teacher table:' AS info;
SELECT * FROM teacher;