select * from sales s, product p ,salesman sm 
where s.pcode = p.pcode and s.smcode = sm.scode
and sname= 'Vasileiou';

select * from sales s, product p ,customer sm 
where s.pcode = p.pcode and s.ccode = sm.ccode
and cname= 'Drakopoulos';

select count(*) from sales s, product p ,customer sm 
where s.pcode = p.pcode and s.ccode = sm.ccode
and cname= 'Aleksiadis';

select * from salesman;
select avg(cost) from sales s ,salesman sm
where s.smcode = sm.scode and
sm.scity= 'Athens'
 ;
 
select * from sales s, product p ,customer sm 
where s.pcode = p.pcode and s.ccode = sm.ccode
and p.pdescr like '%printer%';

select sum(s.quant) from sales s, product p 
where s.pcode = p.pcode 
and p.pdescr= 'keyboard';

select count(*) from salesman sm ,sales s
where s.smcode = sm.scode
group by sm.scity

;

select distinct sname from sales s , salesman sa
where s.smcode = sa.scode and monthname(sdate) = 'april' or monthname(sdate) = 'may';

select count(*) poliseis,sname from sales s , salesman sa
where s.smcode = sa.scode and sa.sname = 'Antoniou' ;

select count(*)polises, sname from sales s , salesman sa
where s.smcode = sa.scode 
group by sname;

select count(*) agores,cname from sales s , customer cu
where s.ccode = cu.ccode
group by cname ;
 
select sum(pprice) price,pdescr from sales s , product sa
where s.pcode = sa.pcode 
group by pdescr;

select sum(pprice) price ,pdescr from sales s , product sa
where s.pcode = sa.pcode
and pdescr like '%printer%' ;

select count(*) from sales s , salesman sa
where s.smcode = sa.scode and sname = 'Dimou';

select count(*) from sales s , customer sa
where s.ccode = sa.ccode 
and cname = 'papamarkou';

select count(*) from sales s , salesman sa
where s.smcode = sa.scode and sa.scity ='athens';

select count(*) poliseis, scity from sales s , salesman sa
where s.smcode = sa.scode
group by scity ;

select count(*) p ,pdescr from sales s , product sa
where s.pcode = sa.pcode
group by pdescr  ;

select max(p) ,pdescr from (select count(*) p ,pdescr from sales s , product sa
where s.pcode = sa.pcode
group by pdescr ) everydeliverdtablemusthaveitsownalias ;

select max(p) , sname from (select count(*) p ,sname from sales s , salesman sa
where s.smcode = sa.scode
group by sa.sname ) everydeliverdtablemusthaveitsownalias ;
