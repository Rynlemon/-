@echo off
echo Setting up database...
cd /d "D:\mysql-5.7.26-winx64\mysql-5.7.26-winx64\bin"
mysql -u root -e "CREATE DATABASE IF NOT EXISTS user; USE user; source D:/javaProject/second/setup-database.sql;"
echo Database setup complete!
pause