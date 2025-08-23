# Write your MySQL query statement below
SELECT class FROM Courses
GROUP BY class having count(student)>=4