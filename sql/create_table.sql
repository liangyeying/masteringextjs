create table groups(id int not null primary key , name varchar(50) not null )

create table users(
  id int not null identity(1,1),
  username varchar(100) not null,
  name nvarchar(100) not null,
  password varchar(100) not null,
  email varchar(100),
  picture varchar(100),
  group_id int,
  primary key (id, group_id)
)
ALTER TABLE users ADD CONSTRAINT AK_Username UNIQUE (username);

insert into groups values ('admin')
insert into users values ('mike', 'Mike Leong', '111111', 'leongfeng@163.com', '', 1)
