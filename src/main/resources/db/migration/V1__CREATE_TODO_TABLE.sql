drop table if exists Todos;

create table Todos (
    id varchar(35) not null,
    title varchar(255) not null,
    description varchar(255) not null,
    done boolean not null,
    primary key (id)
) engine=InnoDB;