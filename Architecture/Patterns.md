### Паттерны проектирования.  

- - -  

- Что такое шаблон проектирования или паттерн?  

Архитектурная конструкция, для решения определенных, часто возникающих задач.  

- - -  

- Какие бывают паттерны?  

Основных паттернов 24, распределены на 3 вида.

- - -  

||Поведенческие <br> `behavioral`|Порождающие <br> `creational`|Структурные <br> `structural`|
|:-:|:-|:-|:-|
|1|Цепочка обязанностей <br> `Chain of responsibility`|Абстрактная фабрика <br> `Abstract factory`|Адаптер <br> `Adapter`|
|2|Команда <br> `Command`|Строитель <br> `Builder`|Мост <br> `Bridge`|
|3|Интерпертатор <br> `Interpreter`|Фабричный метод <br> `Factory method`|Компоновщик <br> `Composite`|
|4|Итератор <br> `Iterator`	|Прототип <br> `Prototype`|Декоратор <br> `Decorator`|
|5|Посредник<br> `Mediator`|Одиночка <br> `Singleton`|Фасад <br> `Facade`|
|6|Хранитель<br> `Memento`|Простая фабрика <br> `Simple factory`|Приспособленец <br> `Flyweight`|
|7|Наблюдатель<br> `Observer`||Заместитель <br> `Proxy`|
|8|Состояние<br> `State`|||
|9|Стратегия<br> `Strategy`|||
|10|Шаблонный метод	<br> `Template method`|||
|11|Посетитель<br> `Visitor`|||

- - -  

### Singleton - одиночка.  
Создает единственный объект класса, предоставляет к нему доступ.  

Примеры:  

	public class Singleton {
		public static final Singleton INSTANCE = new Singleton();
	}
- - -  
    public class Singleton {

        public static class SingletonHolder {
            public static final Singleton HOLDER_INSTANCE = new Singleton();
        }

        public static Singleton getInstance() {
            return SingletonHolder.HOLDER_INSTANCE;
        }
    }

[Singleton - habr](https://habr.com/post/129494/)  


[Шаблон проектирования](https://ru.wikipedia.org/wiki/%D0%A8%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)  
[wiki-design-patterns](https://ru.wikipedia.org/wiki/Design_Patterns)  
[Шаблоны банды четырёх](https://jopr.org/blog/detail/gof-design-patterns)  
[Pattern GOF HABR](https://habr.com/post/210288/)  
[Каталог паттернов refactoring-guru](https://refactoring.guru/ru/design-patterns/catalog)  