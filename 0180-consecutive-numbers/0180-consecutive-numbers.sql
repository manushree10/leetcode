# Write your MySQL query statement below
-- SELECT DISTINCT l1.num AS ConsecutiveNums
-- FROM Logs l1, Logs l2, Logs l3
-- WHERE l1.num = l2.num
--   AND l2.num = l3.num
--   AND l1.id = l2.id - 1
--   AND l2.id = l3.id - 1;

SELECT DISTINCT num AS  ConsecutiveNums 
FROM (SELECT num ,LAG(num,1) OVER(ORDER BY id) AS pr1,
       LAG(num,2) OVER(ORDER BY id) AS pr2 
       FROM Logs
       ) AS cons
WHERE num=pr1 AND num=pr2;