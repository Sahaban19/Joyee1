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
/*show the employee first_name, last_name ,salary and the salary after 1000 bonus*/
SELECT 
    first_name AS f_name, 
    last_name AS l_name, 
    salary,
    (salary + 1000) AS salary_after_bonus
FROM 
    Employee;
/*Show the employees annual salary with a 1000rs. Yearly bonus and the annual salary

with a 100rs. Monthly bonus.*/
SELECT 
    first_name AS f_name, 
    last_name AS l_name, 
    salary * 12 + 1000 AS annual_salary_with_yearly_bonus,
    salary * 12 + (100 * 12) AS annual_salary_with_monthly_bonus
FROM 
    Employee;
/*Show f_name as NAME and annual salary as ANNSAL from the employee table.*/


