select database(),user();
desc dog;

select id, kind, price, image, country, height, weight, content, readcount from dog;
select id, kind, price, image, country, height, weight, content, readcount from dog where id=1;

insert into dog (kind, price, image, country, height, weight, content) values ('푸들', 1000,'pu.jpg','프랑스',1,20,'털 많다');

update dog set kind=?, price=?, image=?, country=? ,height=?,weight=?,content where id=?