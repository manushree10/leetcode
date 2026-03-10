# Write your MySQL query statement below
-- SELECT 
--     query_name,
--     ROUND(AVG(rating / position),2) AS quality,
--     ROUND(AVG(IF(rating < 3,1,0))*100,2) AS poor_query_percentage 
-- FROM Queries
-- GROUP BY query_name

SELECT DISTINCT  query_name,ROUND(AVG(rating / position) OVER( partition by query_name),2) AS quality,
ROUND(AVG(CASE WHEN rating<3 then 1 else 0 end) OVER(Partition BY query_name)*100,2) as poor_query_percentage 
FROM Queries
WHERE query_name IS NOT NULL;
