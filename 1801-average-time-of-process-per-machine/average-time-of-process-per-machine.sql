with processTime as(
    select a.machine_id,
    (b.timestamp-a.timestamp) as processing_time from 
    activity a
    join
    activity b on
    a.process_id=b.process_id
    and
    a.machine_id=b.machine_id
    where a.activity_type='start' and b.activity_type='end'
)

select machine_id,round(avg(processing_time),3) as processing_time
from processTime 
group by
machine_id;
