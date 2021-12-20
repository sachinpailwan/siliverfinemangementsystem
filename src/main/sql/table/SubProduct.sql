create sequence sub_product_sequence increment 1 start 1;

create table t_sfms_sub_product (
      id int PRIMARY KEY,
      name VARCHAR(200),
      type VARCHAR(100),
      sub_type VARCHAR(100),
      fine DECIMAL default 0
  );

insert into t_sfms_sub_product (id,name,type,fine) values
(nextVal('sub_product_sequence'),'Salem patti','S',65);