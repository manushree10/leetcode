# Write your MySQL query statement below
-- SELECT  ROUND(COUNT(DISTINCT a.player_id)/COUNT(DISTINCT b.player_id),2) AS fraction
-- FROM activity a
-- JOIN
-- (SELECT player_id, MIN(event_date) AS f_login
-- FROM Activity
-- GROUP BY player_id) b
-- ON a.player_id = b.player_id
-- AND a.event_date = DATE_ADD(b.f_login, INTERVAL 1 DAY);

SELECT 
  ROUND(
    COUNT(DISTINCT a.player_id) / COUNT(DISTINCT b.player_id),
  2) AS fraction
FROM Activity b
LEFT JOIN Activity a
  ON a.player_id = b.player_id
  AND a.event_date = DATE_ADD(b.event_date, INTERVAL 1 DAY)
WHERE b.event_date = (
  SELECT MIN(event_date)
  FROM Activity c
  WHERE c.player_id = b.player_id
);
