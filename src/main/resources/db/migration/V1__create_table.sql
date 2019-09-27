create table t_user
(
    id          bigint primary key auto_increment,
    name        varchar2(11),
    gender      varchar2(11),
    age         int(11),
    addressId   bigint,
    create_by   varchar2(11),
    update_by   varchar2(11),
    create_time timestamp,
    update_time timestamp
);

create table t_address
(
    id          bigint primary key auto_increment,
    province    varchar2(11),
    city        varchar2(11),
    area        varchar2(11),
    name        varchar2(255),
    create_by   varchar2(11),
    update_by   varchar2(11),
    create_time timestamp,
    update_time timestamp
);