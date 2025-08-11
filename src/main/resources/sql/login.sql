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

-- 插入测试数据
INSERT INTO users (username, password, role, email, phone) VALUES
('admin', 'admin123', 'ADMIN', 'admin@example.com', '13800138000'),
('teacher1', 'teacher123', 'TEACHER', 'teacher1@example.com', '13800138001'),
('student1', 'student123', 'STUDENT', 'student1@example.com', '13800138002');

-- 学生表扩展
ALTER TABLE student ADD COLUMN user_id INT;
ALTER TABLE student ADD CONSTRAINT fk_student_user 
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE SET NULL;

-- 教师表扩展  
ALTER TABLE teacher ADD COLUMN user_id INT;
ALTER TABLE teacher ADD CONSTRAINT fk_teacher_user 
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE SET NULL;