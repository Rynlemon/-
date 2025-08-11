@echo off
echo Starting MySQL server...
cd /d "D:\mysql-5.7.26-winx64\mysql-5.7.26-winx64\bin"
mysqld.exe --console
echo MySQL server started!
pause