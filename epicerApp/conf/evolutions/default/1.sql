# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table control.user (
  id                        bigint not null,
  username                  varchar(255),
  password                  varchar(255),
  firstname                 varchar(255),
  lastname                  varchar(255),
  email                     varchar(255),
  created_date              timestamp,
  active                    boolean,
  constraint pk_user primary key (id))
;

create sequence control.user_seq;




# --- !Downs

drop table if exists control.user cascade;

drop sequence if exists control.user_seq;

