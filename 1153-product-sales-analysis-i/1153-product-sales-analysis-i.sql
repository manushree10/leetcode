# Write your MySQL query statement below
SELECT p.product_name ,s.year  , s.price
FROM  Product p
join Sales s
ON s.product_id=p.product_id
ORDER BY year ;
