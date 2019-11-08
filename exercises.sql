select avg(pprice) as price from product;

select * from product;

select * from product
where pprice  >   (select pprice from product where pdescr = 'Printer injekt' )
;

select avg(pprice) from product
where pdescr = 'Printer injekt' or pdescr = 'Printer 24pin'
;

select avg(pprice) from product -- allos tropos
where pdescr like '%Printer%'
;

select * from sales
group by pcode
;
select * from product
where pcode not in (select pcode from sales group by pcode);

select * from salesman
where scomm  > (select scomm from salesman where sname = 'Raptis')
;

select * from salesman
where scomm> 0.15 and not scity= 'Athens';

select salesman from family;

select * from customer
where cname like '%los';

select * from customer
order by cname;

select * from sales
where ccode in (select ccode from customer where cname = 'Aleksiadis');

select avg(cost) from sales
where smcode = 104;

select sum(quant) from sales
where pcode = 1311;

select sum(quant) from sales -- ex 13 den to brika pws ginete
where sdate = 02/11/1992 ;