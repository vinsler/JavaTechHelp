# POJO / DTO
---
### POJO
(Plain Old Java Object) — простой старый Java объект.
---
    Class Pojo {
        private long id;
        private String name;
        private int age;

        getters/setters
    }
---
### POCO = POJO
(Plain old CLR object) - простой старый CLR объект.
Абсолютно тоже самое, только в языке C#, C++.
---
### DTO = VO
DTO - Data Transfer Object - объект передачи данных.
VO - Value Object - объект ценности.
VO(depricated) - устаревшее название, теперь называют DTO.

Некий объект для подмены основного, может быть частью или целым или еще большим, чем основной.

    Class DTO1 {
        private String id;
        private String age;
    }

    Class DTO2 {
        private long id;
        private String name;
        private long age;
        private boolean correct;
    }

Например нам нужно ввести данные, проверить их правильность,
передать на форму, и ждать подтверждения от пользователя,
что их нужно занести в базу. Мы принимаем данные в один объект,
проверяем правильность ввода, передаем на второй объект,
подтверждаем правильность и выводим на экран, или не подтверждаем
правильность и выводим ошибку. Ну и по просьбе пользователя можем
занести их уже на настоящий POJO и сохранить в базу.

(https://en.wikipedia.org/wiki/Plain_old_Java_object)
(https://stackoverflow.com/questions/725348/plain-old-clr-object-vs-data-transfer-object/725365#725365)
(https://martinfowler.com/eaaCatalog/dataTransferObject.html)
(http://programmerz.ru/questions/314/difference-between-dto-vo-pojo-javabeans-question.html)
