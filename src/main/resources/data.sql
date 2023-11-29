INSERT INTO tb_users (name, email, password) VALUES ('Bob Sponja', 'bob@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_users (name, email, password) VALUES ('Ana Maria', 'ana@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_users (name, email, password) VALUES ('Jao das neves', 'jao@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_roles (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_roles (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_roles (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_users_roles (users_id, roles_id) VALUES (1,1);
INSERT INTO tb_users_roles (users_id, roles_id) VALUES (2,1);
INSERT INTO tb_users_roles (users_id, roles_id) VALUES (2,2);
INSERT INTO tb_users_roles (users_id, roles_id) VALUES (3,2);
INSERT INTO tb_users_roles (users_id, roles_id) VALUES (3,3);

INSERT INTO tb_courses (name, img_uri, img_gray_uri) VALUES ('Web dev - front end beginner','img uri', 'img gray uri');
INSERT INTO tb_courses (name, img_uri, img_gray_uri) VALUES ('Back end - Bakc end with Java 17','img uri', 'img gray uri');
INSERT INTO tb_courses (name, img_uri, img_gray_uri) VALUES ('Html Css - One more step','img uri', 'img gray uri');
INSERT INTO tb_courses (name, img_uri, img_gray_uri) VALUES ('JS/Type Scritp/Node JS - JS on server','img uri', 'img gray uri');

INSERT INTO tb_offers (edition, start_moment, endt_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2023-07-13T20:50:07',TIMESTAMP WITH TIME ZONE '2023-12-13T20:50:07',1);
INSERT INTO tb_offers (edition, start_moment, endt_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2023-07-13T20:50:07',TIMESTAMP WITH TIME ZONE '2023-12-13T20:50:07',2);
INSERT INTO tb_offers (edition, start_moment, endt_moment, course_id) VALUES ('1.1', TIMESTAMP WITH TIME ZONE '2023-07-13T20:50:07',TIMESTAMP WITH TIME ZONE '2023-12-13T20:50:07',3);
INSERT INTO tb_offers (edition, start_moment, endt_moment, course_id) VALUES ('2.1', TIMESTAMP WITH TIME ZONE '2023-07-13T20:50:07',TIMESTAMP WITH TIME ZONE '2023-12-13T20:50:07',4);
INSERT INTO tb_offers (edition, start_moment, endt_moment, course_id) VALUES ('2.1', TIMESTAMP WITH TIME ZONE '2023-07-13T20:50:07',TIMESTAMP WITH TIME ZONE '2023-12-13T20:50:07',1);

INSERT INTO tb_resources (title, description, position, img_uri, type, external_link, offer_id) VALUES ('JS level one','Development a mario world',0, 'img gray uri',0,'link external',1);
INSERT INTO tb_resources (title, description, position, img_uri, type, external_link, offer_id) VALUES ('JS level two','Development a dinamic wev',1, 'img gray uri',2,'link external',3);
INSERT INTO tb_resources (title, description, position, img_uri, type, external_link, offer_id) VALUES ('Lambdas with java','Lambdas',2, 'img gray uri',2,'link external',2);
INSERT INTO tb_resources (title, description, position, img_uri, type, external_link, offer_id) VALUES ('JS arrays ans vectors','Development snack game',3, 'img gray uri',0,'link external',4);

INSERT INTO tb_sections (title, description, position,img_uri,resource_id,prerequisite_id) VALUES ('Bgining','init',1, 'img gray uri',1,null);
INSERT INTO tb_sections (title, description, position,img_uri,resource_id,prerequisite_id) VALUES ('JS ','Init ',1, 'img gray uri',1,1);
INSERT INTO tb_sections (title, description, position,img_uri,resource_id,prerequisite_id) VALUES ('JS arrays ans vectors','First step',1, 'img gray uri',1,2);

INSERT INTO tb_enrollments (user_id, offer_id, enroll_moment, refund_moment, available, only_update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2023-07-13T20:50:07',null,true, false);

INSERT INTO tb_lesson(title, position, section_id) VALUES ( 'One',1, 1);
INSERT INTO tb_content(id, text_content, video_uri) VALUES (1, 'Material of ...','https://www.youtube.com/watch?v=bIPd');

INSERT INTO tb_lesson(title, position, section_id) VALUES ( 'two',2, 2);
INSERT INTO tb_content(id, text_content, video_uri) VALUES (2, 'Material of ...','https://www.youtube.com/watch?v=bIPd');


INSERT INTO tb_lesson(title, position, section_id) VALUES ( 'three',3, 3);
INSERT INTO tb_task(id, description, question_count, aproval_count,due_date,weight)values(1, 'desc task', 1,1,TIMESTAMP WITH TIME ZONE '2023-07-13T20:50:07',1.5);

INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (1,1,1);