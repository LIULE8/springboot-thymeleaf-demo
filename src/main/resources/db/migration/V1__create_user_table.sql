create table t_user
(
    id          bigint primary key auto_increment,
    name        varchar2(11),
    gender      varchar2(11),
    age         int(11),
    address_id   bigint,
    version     int(11),
    create_by   varchar2(11),
    update_by   varchar2(11),
    create_time timestamp,
    update_time timestamp
);

insert into t_user
values (1, '张三', '男', 16, 1, 0, 'Admin', 'Admin', systimestamp, systimestamp),
       (2, '李四', '女', 19, 2, 0, 'Admin', 'Admin', systimestamp, systimestamp),
       (3, '王五', '男', 12, 3, 0, 'Admin', 'Admin', systimestamp, systimestamp)