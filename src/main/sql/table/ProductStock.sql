create sequence product_stock_sequence increment 1 start 1;

create table t_sfms_product_stock (
          id INT PRIMARY KEY,
          product_id INT,
          weight DECIMAL,
          Labor_cost DECIMAL,
          created_on TIMESTAMP,
          updated_on TIMESTAMP,
          del VARCHAR(5)
      );

insert into t_sfms_product_stock (id,product_id,weight,labor_cost,created_on,updated_on,del)
  values (nextval('product_stock_sequence'),5,10000,2000,current_timestamp,current_timestamp,'f');