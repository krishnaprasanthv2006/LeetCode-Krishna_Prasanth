-- Last updated: 11/08/2026, 14:15:41
# Write your MySQL query statement below
SELECT player_id,
       MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;