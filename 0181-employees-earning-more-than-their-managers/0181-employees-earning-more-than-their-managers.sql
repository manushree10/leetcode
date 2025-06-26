# Write your MySQL query statement below
SELECT 
    Employee.name  as Employee
FROM 
    Employee 
JOIN 
    Employee M 
ON 
    Employee.managerId = M.id
WHERE 
    Employee.salary > M.salary;
