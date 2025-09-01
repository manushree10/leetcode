# Write your MySQL query statement below

SELECT a1.machine_id, ROUND(AVG(a2.timestamp-a1.timestamp),3) as processing_time
FROM Activity a1
JOIN Activity a2
ON a1.machine_id=a2.machine_id and a1.process_id=a2.process_id
and a1.activity_type='start' and a2.activity_type='end'
group by a1.machine_id;  





-- SELECT a.machine_id,ROUND((SELECT AVG(a1.timestamp) FROM Activity a1 where a1.activity_type='end' and a1.machine_id = a.machine_id)-(SELECT AVG(a1.timestamp) FROM Activity a1 where a1.activity_type='start' and a1.machine_id = a.machine_id),3) as processing_time
-- from Activity a
-- group by a.machine_id
