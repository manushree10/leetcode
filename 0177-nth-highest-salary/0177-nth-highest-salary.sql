-- CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
-- BEGIN
-- SET N=N-1;
--   RETURN (
--       # Write your MySQL query statement below.
       
--       SELECT DISTINCT salary
--       FROM Employee
--       ORDER BY salary DESC
--       LIMIT 1 OFFSET N

--   );
-- END

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT DISTINCT salary
      FROM (
          SELECT salary, 
                 DENSE_RANK() OVER (ORDER BY salary DESC) as rnk
          FROM Employee
      ) as temp
      WHERE rnk = N
  );
END