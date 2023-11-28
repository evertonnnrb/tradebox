INSERT INTO tb_users (name, email, password) VALUES ('Bob Sponja', 'bob@gmail.com','');
INSERT INTO tb_users (name, email, password) VALUES ('Ana Maria', 'ana@gmail.com','');
INSERT INTO tb_users (name, email, password) VALUES ('Jao das neves', 'jao@gmail.com','');

INSERT INTO tb_roles (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_roles (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_roles (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_users_roles (users_id, roles_id) VALUES (1,1);
INSERT INTO tb_users_roles (users_id, roles_id) VALUES (2,1);
INSERT INTO tb_users_roles (users_id, roles_id) VALUES (2,2);
INSERT INTO tb_users_roles (users_id, roles_id) VALUES (3,2);
INSERT INTO tb_users_roles (users_id, roles_id) VALUES (3,3);

