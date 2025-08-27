# Write your MySQL query statement below
SELECT product_name,SUM(Orders.unit) AS unit
FROM Products
JOIN Orders  on Orders.product_id=Products.product_id
where order_date >="2020-02-01" and order_date < "2020-03-01"
GROUP BY Products.product_id,Products.product_name
HAVING SUM(Orders.unit)>=100;