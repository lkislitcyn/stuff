insert into employee (id, job_title, salary)
values (1, 'Macjob', 100),
       (2, 'KFCjob', 150),
       (3, 'Rostic''sjob', 200),
       (4, 'TastyAndPoint', 250),
       (5, 'Cleanerjob', 100);

insert into employee_person_rel(employee_id, person_id)
values (1, 3),
       (1, 5),
       (2, 1),
       (5,1);