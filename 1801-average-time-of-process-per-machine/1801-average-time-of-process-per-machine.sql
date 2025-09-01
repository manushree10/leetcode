# Write your MySQL query statement below
SELECT a.machine_id,ROUND((SELECT AVG(a1.timestamp) FROM Activity a1 where a1.activity_type='end' and a1.machine_id = a.machine_id)-(SELECT AVG(a1.timestamp) FROM Activity a1 where a1.activity_type='start' and a1.machine_id = a.machine_id),3) as processing_time
from Activity a
group by a.machine_id
