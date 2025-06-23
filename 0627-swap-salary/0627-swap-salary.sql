# Write your MySQL query statement below
update Salary
set sex = (CASE WHEN sex = 'f' THEN 'm' ELSE 'f' END);