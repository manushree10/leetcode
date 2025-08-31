# Write your MySQL query statement below
SELECT name,sum(amount) AS balance
FROM USERS
INNER JOIN Transactions ON Users.account=Transactions.account
GROUP BY name
HAVING sum(amount)>10000;