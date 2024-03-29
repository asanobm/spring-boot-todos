drop table if exists todos;

create table todos (
    id varchar(36) not null,
    title varchar(255) not null,
    description varchar(255) not null,
    done boolean not null,
    primary key (id)
) engine=InnoDB;