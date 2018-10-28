### Context.

Application context – представляет собой Spring IoC контейнер и необходим для инициализации,
настройки и сборки бинов для построения приложения.

Context – используется 4 возможных контекста.

Context — это описание бинов, то есть классов, другими словами это
некий синтаксис описания классов для спринга. На 2018 год 4 способа:

- XML
- Автоматический/Аннотации
- Java-Config
- Groovy.

Возможно пройдет еще пару тройку лет и будет еще 12 новых контекстов, ну а пока их 4.
Каждый ваш бин, это уже созданный класс сущности/модели/класса POJO итп. в какой-то папке со всеми сущностями.

### Пример контекста через *.xml.
Это бины в файле, самый простой вариант с пустым конструктором, если нужно что-то инициализировать в конструторе, тогда нужно добавить еще <constructor-arg type=”” value=””> в общем найдете в инете.

<?xml version="1.0" encoding="UTF-8"?>

    <beans xmlns="http://www.springframework.org/schema/beans"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd">

        <bean id="user" class="springNotes.entities.User"/>
        <bean id="note" class="springNotes.entities.Note"/>

    </beans>


Далее нужно создать какой-нибудь мейн и вписать туда создание контекста,
прописать там путь к нашему xml файлу с бинами и вытащить из него наши объекты. Все.

    public class Main {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("springNotes/resources/xmlnote.xml");
            User user = (User) context.getBean("user");
            Note note = (Note) context.getBean("note");

            System.out.println(user.getName());
            System.out.println(note.getName());
        }
    }

### Пример контекста Автоматического.

Перед вашим классом пишите @Component.

    @Component
    public class Note {
        private int id;
        private String Name;
        private String description;
        private Date createDate;
        private int Status;
        private User user;

Структура будет примерно такой же, только без папки и файла *xml.

А сам мейн будет примерно такой:

    public class Main {
        public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext("springNotes/entities");
            User user = context.getBean(User.class);
            Note note = context.getBean(Note.class);

            System.out.println(user.getName());
            System.out.println(note.getName());
        }
    }

намного проще и быстрее.

### Далее пример через Java-config.

Нужно создать папку config и там какой-нибудь класс confignote например.
@Configuration // указывает, что после идет конфигурация
@ComponentScan // указывает, что нужно просканировать автоматические аннотации до использования конфигурации
// Component - автоматическая аннотация перед классом, Scan - сканировать.

    public class ConfigNote {

        @Bean
        public Note getNote(){
            return new Note();
        }

        @Bean
        public User getUser(){
            return new User();
        }
    }

Ну и мейн почти такой же, только ссылается на конфигурацию.

    public class Main {
        public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext("springNotes/config");
            User user = context.getBean(User.class);
            Note note = context.getBean(Note.class);

            System.out.println(user.getName());
            System.out.println(note.getName());
        }
    }


C groovy пока не разобрался. )))

