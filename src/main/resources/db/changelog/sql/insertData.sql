insert into address (id, country, city, street, home_number)
values  (1, 'Russia', 'Ulan-Ude', 'Radnaeva', 1),
        (2, 'Russia', 'Ulan-Ude', 'Radnaeva', 3),
        (3, 'Russia', 'Ulan-Ude', 'Radnaeva', 4),
        (4, 'Russia', 'Ulan-Ude', 'Radnaeva', 5),
        (5, 'Russia', 'Ulan-Ude', 'Lenina', 1),
        (6, 'Russia', 'Ulan-Ude', 'Lenina', 2),
        (7, 'Russia', 'Ulan-Ude', 'Lenina', 3);

insert into person (id, first_name, middle_name, last_name, address_id)
values  (1, 'Ivanov', 'Ivan', 'Ivanovich', 1),
        (2, 'Petrov', 'Petr', 'Petrovich', 2),
        (3, 'Sidorov', 'Sidr', 'Sidorovich', 3),
        (5, 'Belov', 'Ivan', 'Arkadyevich', 5),
        (6, 'Zelenkin', 'Vladimir', 'Evgenyvich', 6),
        (7, 'Livanon', 'Vasiluy', 'Borisovich', 6),
        (8, 'Belov', 'Vasiluy', 'Borisovich', 7),
        (9, 'Sidorov', 'Ivan', 'Arkadyevich', 7);