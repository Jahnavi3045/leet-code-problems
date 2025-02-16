with total_users as (
    select count(*) as total from users
)

select r.contest_id,Round(count(r.user_id)*100.0/t.total,2) as percentage
from register r
cross join total_users t
group by r.contest_id,t.total
order by percentage desc,contest_id asc;
