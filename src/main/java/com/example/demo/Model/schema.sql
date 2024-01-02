create table if not exists customer (
 id INT PRIMARY KEY AUTO_INCREMENT,
  number varchar(255),
  password varchar(255),
   name varchar(255),
   email varchar(800),
 	address varchar(800),
 	gender varchar(255)
   
);
create table if not exists product (
  productid INT PRIMARY KEY AUTO_INCREMENT,
   name varchar(255),
   catagory varchar(255)
   price int,
   discount int,,
   imgurl varchar(800)
);
create table if not exists cart (
  productid INT PRIMARY KEY AUTO_INCREMENT,
   name varchar(255),
   catagory varchar(255)
   price int,
   discount int,,
   imgurl varchar(800)
);
