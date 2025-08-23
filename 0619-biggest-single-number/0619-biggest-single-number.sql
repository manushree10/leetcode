# Write your MySQL query statement below
-- SELECT num FROM MyNumbers
-- GROUP BY num HAVING count(num)=1
-- ORDER BY num  DESC
-- LIMIT 1;
SELECT MAX(num) AS num
FROM(SELECT num FROM MyNumbers
GROUP BY num HAVING count(num)=1
ORDER BY num  DESC) as num;