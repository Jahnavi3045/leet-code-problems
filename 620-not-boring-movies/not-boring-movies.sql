select id,movie,description,rating
from Cinema
where description<>"boring" and Mod(id,2)=1 order by rating desc;
