# Write your MySQL query statement below
SELECT name,IFNULL(SUM(distance),0)AS travelled_distance
FROM USERS 
 LEFT JOIN  RIDES ON USERS.id= RIDES.user_id
GROUP BY USERS.name,USERS.id
ORDER BY travelled_distance DESC,
USERS.name ASC;