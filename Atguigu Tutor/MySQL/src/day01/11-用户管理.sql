/*
 DCL:数据控制语言Data Control Language
 通过创建用户，授予和回收权限对数据库进行管理

 mysql.user表记录了系统里的用户，包括用户名，密码以及权限信息
 不要使用 update/insert/delete 语句直接操作 mysql.user 表
 需要通过一些命令来增加，删除用户以及控制用户权限

 mysql.user 表里字段说明:
    host: 表示允许用户登录的主机
    user: 用户名
    authentication_string: 用户加密以后的密码
    xxxx_priv: 表示用户的权限
*/

-- 创建了一个用户jack,只能通过本机访问，密码是 abcd1234
create user jack@localhost identified by 'abcd1234';

show privileges; -- 显示所有可用的权限

show grants; -- 显示当前用户的权限
show grants for jack@localhost;

-- 让 jack 用户可以对 demo数据库的t1表执行插入操作
grant insert on demo.t1 to jack@localhost;
flush privileges;

-- 将 jack 写入demo.t1表的权限收回
revoke insert on demo.t1 from jack@localhost;

-- jack用户可以对所有库的所有表进行所有的操作
-- with grant option jack用户可以将自己的权限下发给其他用户
grant all privileges on *.* to jack@localhost with grant option ;
revoke all privileges on *.* from jack@localhost;

drop user jack@localhost;  -- 删除用户