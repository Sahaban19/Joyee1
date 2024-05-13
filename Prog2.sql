CREATE TABLE Employee (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone_number VARCHAR(20),
    hire_date DATE,
    job_title VARCHAR(100),
    department VARCHAR(100),
    salary DECIMAL(10, 2),
    manager_id INT
);
