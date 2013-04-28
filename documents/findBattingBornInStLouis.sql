select distinct m.playerID, nameFirst, nameLast, birthDay, birthMonth, birthYear, min(yearID), max(yearID)
from batting b
inner join
(select playerID, nameFirst, nameLast, birthDay, birthMonth, birthYear, deathDay, deathMonth, deathYear
from master 
where birthState = 'MO' 
and birthCity = 'St. Louis'
and deathYear is  null ) m on m.playerID = b.playerID
where b.teamID = 'SLN' 
group by m.playerID, nameFirst, nameLast, birthDay, birthMonth, birthYear
order by birthYear desc;

select * from master where nameLast = 'Freese'

select * from schoolsplayers where playerID = 'freesda01';

select * from schools where schoolID = 'salabama';
