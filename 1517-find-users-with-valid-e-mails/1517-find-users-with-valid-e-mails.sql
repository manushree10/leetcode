# Write your MySQL query statement below
SELECT user_id,name,mail
FROM Users 
WHERE mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$' COLLATE utf8mb4_bin
-- '^[A-Za-z][A-Za-z0-9_\.\-]*@leetcode(\\?com)?\\.com$';