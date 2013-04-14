Practice Eclipse Project using JPA, MYSQL & Hibernate creating a wrapper around Lahman 2012 Baseball database.

This wrapper can be used by other projects.  For example, Vaadin 

Sean Lahman Baseball statistics database see: http://www.seanlahman.com/baseball-archive/statistics/

This database is copyright 1996-2013 by Sean Lahman and licensed under a Creative Commons 
Attribution-ShareAlike 3.0 Unported License.  

Lahman Readme:  http://seanlahman.com/files/database/readme2012.txt 

For details see: http://creativecommons.org/licenses/by-sa/3.0/

Added the following changes to the Lahman database

ALTER TABLE batting
add constraint `fk_batting_master`
FOREIGN KEY (playerID)
REFERENCES master(playerID);

ALTER TABLE pitching
add constraint `fk_pitching_master`
FOREIGN KEY (playerID)
REFERENCES master(playerID);

ALTER TABLE batting
ADD CONSTRAINT `fk_batting_teams`
FOREIGN KEY (yearID, lgID, teamID)
REFERENCES teams(yearID, lgID, teamID);

ALTER TABLE pitching
ADD CONSTRAINT `fk_pitching_teams`
FOREIGN KEY (yearID, lgID, teamID)
REFERENCES teams(yearID, lgID, teamID);

ADDED the following VIEW:

create view career_batting as
select
playerID,
sum(G) as G,
sum(AB) as AB,
sum(R) as R,
sum(H) as H,
sum(`2B`) as `2B`,
sum(`3B`) as `3B`,
sum(HR) as HR,
sum(RBI) as RBI,
sum(SB) as SB,
sum(CS) as CS,
sum(BB) as BB,
sum(SO) as SO,
sum(IBB) as IBB,
sum(HBP) as HBP,
sum(SH) as SH,
sum(SF) as SF,
sum(GIDP) as GIDP
FROM batting
GROUP BY playerID;

create view career_pitching as
select playerID, sum(W), sum(L), sum(G), sum(GS), sum(CG), sum(SHO), sum(SV), sum(IPouts), sum(H), sum(ER), sum(HR), sum(BB), sum(SO), sum(IBB), sum(WP), sum(HBP), sum(BK), sum(BFP), sum(GF), sum(R), sum(SH), sum(SF), sum(GIDP)
from pitching 
group by playerID
order by W DESC;