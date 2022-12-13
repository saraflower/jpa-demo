-- Drop db and users
DROP DATABASE IF EXISTS bookdb;
DROP USER IF EXISTS 'book-admin'@'%';
DROP USER IF EXISTS 'book-user'@'%';

-- Create db and users
CREATE DATABASE IF NOT EXISTS bookdb;
CREATE USER IF NOT EXISTS 'book-admin'@'%' IDENTIFIED WITH mysql_native_password BY 'password';
CREATE USER IF NOT EXISTS 'book-user'@'%' IDENTIFIED WITH mysql_native_password BY 'password';

-- Grant permissions to users
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
    CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON bookdb.* TO 'book-admin'@'%';
GRANT SELECT, INSERT, UPDATE, DELETE, SHOW VIEW ON bookdb.* TO 'book-user'@'%';

-- Flush privileges
FLUSH PRIVILEGES;