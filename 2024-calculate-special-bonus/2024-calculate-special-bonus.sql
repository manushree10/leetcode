# Write your MySQL query statement below
SELECT employee_id,salary as bonus
FROM employees
WHERE employee_id%2<>0 and name NOT LIKE 'M%'

UNION

SELECT employee_id,0 as bonus
FROM employees
WHERE employee_id%2=0 OR name LIKE 'M%'
ORDER BY employee_id; 