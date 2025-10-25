# Write your MySQL query statement below
with cte as(
    select num, 
    lead(num) over() as lead_,
    lag(num) over() as lag_
    from Logs
)
SELECT distinct num as ConsecutiveNums
from cte 
where num=lead_
and num=lag_