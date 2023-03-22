CREATE TABLE tb_user(
    user_id BIGINT NOT NULL,
    email VARCHAR(150) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(20) NOT NULL,
    PRIMARY KEY (user_id)
);