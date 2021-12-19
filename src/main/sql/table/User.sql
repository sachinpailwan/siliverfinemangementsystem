create table t_sfms_user (
    user_id serial PRIMARY KEY,
    username VARCHAR ( 50 ) UNIQUE NOT NULL,
    password VARCHAR ( 50 ) NOT NULL,
    email VARCHAR ( 255 ) UNIQUE NOT NULL,
    created_on TIMESTAMP NOT NULL,
    last_login TIMESTAMP,
    outletId INT
  );

  insert into t_sfms_user (username,password,email,created_on,outletId)
  values ('sachinpailwan','temp123','sachinpailwan@gmail.com',current_timestamp,1);