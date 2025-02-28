drop database if exists library_management;
create database library_management;
use library_management;

create table book(
	bno int auto_increment,
    bname varchar(100),
    bwriter varchar(50),
    bpub varchar(50),
    constraint primary key (bno)
);
select * from book;

# book 샘플
insert into book(bname, bwriter, bpub) values('파과', '구병모', '창비');
insert into book(bname, bwriter, bpub) values('채식주의자', '한강', '창비');
insert into book(bname, bwriter, bpub) values('모순', '양귀자', '쓰다');
insert into book(bname, bwriter, bpub) values('초역 부처의 말', '코이케 류노스케', '포레스트북스');
insert into book(bname, bwriter, bpub) values('소년이 온다', '한강', '창비');
insert into book(bname, bwriter, bpub) values('스토너', '존 윌리엄스', '알에이치코리아');
insert into book(bname, bwriter, bpub) values('어른의 행복은 조용하다', '태수', '페이지2북스');
insert into book(bname, bwriter, bpub) values('포스트맨은 벨을 두 번 울린다', '제임스 M. 케인', '민음사');
insert into book(bname, bwriter, bpub) values('원피스 110 시대의 일렁임', '오다 에이치로 ', '대원씨아이');


create table member(
	mno int auto_increment,
    mid varchar(50),
    mpwd varchar(50),
    mname varchar(50),
    constraint primary key (mno)
);
select * from member;

# member 샘플
insert into member(mid, mpwd, mname) values('qwe123', '123123', '전은서');
insert into member(mid, mpwd, mname) values('aaa1', '456456', '유재석');
insert into member(mid, mpwd, mname) values('bbb2', '789789', '강호동');
insert into member(mid, mpwd, mname) values('ccc3', '121212', '신동엽');
insert into member(mid, mpwd, mname) values('ddd4', '131313', '서장훈');

