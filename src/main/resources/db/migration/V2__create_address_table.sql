create table t_address
(
    id          bigint primary key auto_increment,
    province    varchar2(11),
    city        varchar2(11),
    area        varchar2(11),
    name        varchar2(255),
    version     int(11),
    create_by   varchar2(11),
    update_by   varchar2(11),
    create_time timestamp,
    update_time timestamp
);

insert into t_address
values (1, '广东省', '广州市', '天河区', '华南农业大学',0, 'Admin', 'Admin', systimestamp, systimestamp),
       (2, '广东省', '佛山市', '南海区', '罗村街道', 0, 'Admin', 'Admin', systimestamp, systimestamp),
       (3, '广东省', '珠海市', '香洲区', '唐家湾镇', 0, 'Admin', 'Admin', systimestamp, systimestamp)