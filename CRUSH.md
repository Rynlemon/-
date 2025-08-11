# CRUSH.md - Java Spring Boot Project

## Build/Test Commands
- `mvn clean compile` - Clean and compile
- `mvn test` - Run all tests
- `mvn test -Dtest=ClassName` - Run single test class
- `mvn test -Dtest=ClassName#methodName` - Run single test method
- `mvn spring-boot:run` - Start application
- `mvn package` - Build JAR

## Code Style
- **Java 8** - Uses streams, lambdas, Optional
- **Spring Boot 2.4.6** with MyBatis
- **Naming**: PascalCase classes, camelCase methods/variables, lowercase packages
- **Annotations**: @RestController, @Service, @Autowired for DI
- **Response**: ResponseResult wrapper for consistent API responses
- **Swagger**: @Api and @ApiOperation for API docs
- **Error handling**: Return ResponseResult.failure() with message
- **Imports**: Group by: java.*, javax.*, org.*, com.*, static imports
- **POJOs**: Private fields with getters/setters, lowercase class names (student.java)
- **Controllers**: @RequestMapping at class level, method names describe action

## API Documentation

### 认证接口 (Auth API)

#### 1. 用户登录
- **URL**: POST `/api/auth/login`
- **描述**: 用户登录接口，返回JWT token
- **请求体**:
```json
{
  "username": "admin",
  "password": "admin123"
}
```
- **响应**:
```json
{
  "code": 200,
  "message": "success",
  "data": {
    "token": "eyJhbGciOiJIUzI1NiJ9...",
    "username": "admin",
    "role": "ADMIN",
    "expireTime": 1640995200000
  }
}
```

#### 2. 用户登出
- **URL**: POST `/api/auth/logout`
- **描述**: 用户登出接口
- **请求头**: `Authorization: Bearer {token}`
- **响应**:
```json
{
  "code": 200,
  "message": "登出成功",
  "data": null
}
```

#### 3. 获取当前用户信息
- **URL**: GET `/api/auth/info`
- **描述**: 根据token获取当前登录用户信息
- **请求头**: `Authorization: Bearer {token}`
- **响应**:
```json
{
  "code": 200,
  "message": "success",
  "data": {
    "id": 1,
    "username": "admin",
    "role": "ADMIN",
    "email": "admin@example.com",
    "phone": "13800138000"
  }
}
```

### 错误码说明
- **200**: 成功
- **400**: 请求参数错误
- **401**: 未授权/登录失败
- **500**: 服务器内部错误

### 测试账号
- **管理员**: admin/admin123 (ADMIN角色)
- **教师**: teacher1/teacher123 (TEACHER角色)
- **学生**: student1/student123 (STUDENT角色)

### 数据库配置
- **用户表**: users (id, username, password, role, email, phone)
- **外键关联**: student.user_id -> users.id, teacher.user_id -> users.id

### 使用说明
1. 运行SQL脚本创建用户表: `src/main/resources/sql/login.sql`
2. 启动应用: `mvn spring-boot:run`
3. 访问Swagger文档: http://localhost:8083/swagger-ui.html
4. 使用测试账号登录获取token
5. 在后续请求中添加请求头: `Authorization: Bearer {token}`