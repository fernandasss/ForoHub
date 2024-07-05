CREATE TABLE topicos (
 id BIGINT NOT NULL AUTO_INCREMENT,
 titulo VARCHAR(100) NOT NULL,
 mensaje VARCHAR(300) NOT NULL,
 fechaDeCreacion TIMESTAMP default current_timestamp,
 estatus tinyint (1) ,
 autor VARCHAR(100) NOT NULL,
 curso VARCHAR(100) NOT NULL,

 PRIMARY KEY (id)
);