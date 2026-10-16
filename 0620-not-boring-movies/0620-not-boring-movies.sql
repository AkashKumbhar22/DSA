# Write your MySQL query statement bel88'''''
SELECT *
FROM Cinema
WHERE (id % 2) != 0
AND description NOT IN ('boring')
ORDER BY rating DESC;