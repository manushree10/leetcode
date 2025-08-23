# Write your MySQL query statement below
UPDATE salary SET sex =
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;

-- UPDATE Salary SET sex = IF(sex = 'm', 'f', 'm')