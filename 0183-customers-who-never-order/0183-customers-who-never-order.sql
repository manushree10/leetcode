# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers c
left JOIN Orders o
 ON c.id=o.customerId
WHERE o.customerId is NULL;