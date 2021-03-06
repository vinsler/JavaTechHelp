<h2 align = "center"> Паттерны проектирования.  </h2>

- - -  

||Поведенческие <br> `behavioral`|Порождающие <br> `creational`|Структурные <br> `structural`|
|:-:|:-:|:-:|:-:|
|1|Цепочка обязанностей <br> `Chain of responsibility`|Абстрактная фабрика <br> [`Abstract factory`](Patterns/Creational/AbstractFactory.md)|Адаптер <br> `Adapter`|
|2|Команда <br> `Command`|Строитель <br> [`Builder`](Patterns/Creational/Builder.md)|Мост <br> `Bridge`|
|3|Интерпертатор <br> `Interpreter`|Фабричный метод <br> `Factory method`|Компоновщик <br> [`Composite`](Patterns/Structural/Composite.md)|
|4|Итератор <br> `Iterator`	|Прототип <br> `Prototype`|Декоратор <br> `Decorator`|
|5|Посредник<br> `Mediator`|Одиночка <br> [`Singleton`](Patterns/Creational/Singleton.md)|Фасад <br> `Facade`|
|6|Хранитель<br> `Memento`||Приспособленец <br> `Flyweight`|
|7|Наблюдатель<br> `Observer`||Заместитель <br> `Proxy`|
|8|Состояние<br> `State`|||
|9|Стратегия<br> `Strategy`|||
|10|Шаблонный метод	<br> `Template method`|||
|11|Посетитель<br> `Visitor`|||
|||||
||Заботятся об эффективной коммуникации между объектами.|Беспокоятся о гибком создании объектов без внесения в программу лишних зависимостей.|Показывают различные способы построения связей между объектами.|

- - -  

- Что такое шаблон проектирования или паттерн?  

Архитектурная конструкция, для решения определенных, часто возникающих задач.  

- - -  

- Какие бывают паттерны?  

Основных паттернов 23, распределены на 3 вида.


- - -  

<h3 align = "center">  Prototype - Прототип. </h3>

Копирует объекты, не вдаваясь в подробности их реализации.  

- - -  

Пример:  

    interface Ne4toInterface {  
        Object copy();  
        }  
  
    Class Ne4toClass implements Ne4toInterface {  
        int age;  
        String name;  
  
        public Ne4toClass (int age, string name){  
            this.age = age;  
            this.name = name;  
            }  
  
        public Object copy(){  
            Ne4toClass copy = new Ne4toClass (age, name);  
            return copy;  
            }  
    }  

[Prototype](https://refactoring.guru/ru/design-patterns/prototype)  

- - -  

<h3 align = "center"> Adapter - Адаптер. </h3>

От слова адаптировать.  

`Object Adapter (Адаптер объекта)`  
- Композиция.  

Создается класс-Адаптер, который реализует нужный интерфейс и который хранит в себе  
поле адаптируемого класса. Происходит стыковка 2 частей.  


	public class ObjectAdapter implements TargetInterface {
		private Adaptee adaptee;

		public void targetMethod() {
			adaptee.method()
		}
	}
- - -  
`Class Adapter (Адаптер класса)`  
- Множественное наследование.  

Создается класс-Адаптер, который реализует нужный интерфейс и который наследуется от
адаптируемого класса. Происходит стыковка 2 частей.  

	public class ClassAdapter extends Adaptee implements TargetInterface {
		public void targetMethod() {
			method();
		}
	}

- - -  

`Отличие от Фасад.`  
- Facade определяет новый интерфейс, Адаптер использует существующие.
	
[Adapter javenue](http://www.javenue.info/post/63#object-adapter)  

- - -   

<h3 align = "center"> Facade - Фасад. </h3>

Простой интерфейс к сложной системе, скрывает сложность, делегируя выполнение  
кучи действий одному объекту.  

Заменяем кучу методов на один метод и предоставляем его клиенту. Внутри  
этого метода сами стыкуем все данные с необходимыми классами. А клиент делает  
самые простые действия.  

[wiki - Фасад](https://ru.wikipedia.org/wiki/%D0%A4%D0%B0%D1%81%D0%B0%D0%B4_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))  
[RG - Фасад](https://refactoring.guru/ru/design-patterns/facade)  

- - -  

<h3 align = "center"> Factory method - Фабричный метод. </h3>

[Разница фабрик](https://refactoring.guru/ru/design-patterns/factory-comparison)  

Фабричный метод - потому что создается метод на фабрике, через который  
создаются новые объекты.

`В чем суть:`  

Создание новых объектов на фабрике, для этого:  
Создаем абстракцию(интерфейс) и реализации для нужных нам классов.  
Создаем абстракцию(фабрику) со ссылкой на абстракцию по созданию этих классов.  

В основе лежит интерфейс и реализации, это самая главная часть всего паттерна.  
Мы создали то, что нам нужно, машины, часы, окна, да что угодно. А уже потом  
мы объявляем новую абстракцию в виде фабрики, в которую запихиваем поле этого  
интерфейса, другими словами делаем ссылку на него, и добавляем метод для  
действия - создать, который возвращает определенную реализацию. Т.е. мы просто  
переносим создание новых объектов из главной иерархии в фабрику. Где мы для  
каждой реализации из основы, создаем новую реализацию с возвращаемым  
значением, которое соответствует реализации из основы. Вот и все.  

- - -   

`Пример:`  

	interface Osnova {} // абстракция  
	class KotoriyNugenOdin implements Osnova {} // реализация 1  
	class KotoriyNugenDva implements Osnova {}  // реализация 2  


	interface Fabrika { // абстракция фабрика  
		Osnova sozdatOsnovu(); // ссылка на абстракцию основы   
	}  

	class SozdatKotoriyNugenOdin implements Fabrika{ // создание реализации 1  
		public Osnova sozdatOsnovu(){ // метод создать  
			return new KotoriyNugenOdin(); // создаем и возвращаем реализацию 1  
		}   
	}  
	
	class SozdatKotoriyNugenDva implements Fabrika{ // создание реализации 2
		public Osnova sozdatOsnovu(){ // метод создать  
			return new KotoriyNugenDva(); // создаем и возвращаем реализацию 2  
		}   
	}  
	
	public class FactoryExample {
		public static void main(String[] args){
		Fabrika fabrika = new SozdatKotoriyNugenOdin(); // создаем фабрику нужного нам класса.
		Osnova osnova = fabrika.sozdatOsnovu(); // создаем класс.
		
		fabrika = new SozdatKotoriyNugenDva();
		fabrika.sozdatOsnovu();
		}
	}

- - -  
	
`пример ПРОСТАЯ ФАБРИКА, есть метод с оператором, выбирающим продукт.`  
	
	class SimpleFactory {
		public static Osnova create(String number) { // какой класс нужно создать odin или dva ?
			switch (number) { // смотря что прописали, то и создаем или выдаем ошибку.
				case "odin": return new KotoriyNugenOdin();
				case "dva": return new KotoriyNugenDva();
				default:
					throw new Exception('Wrong factory name!');
			}
		}
	}
	
- - -   
	
`пример простого СОЗДАЮЩЕГО МЕТОДА.`  

	class CreateMethod {
		private CreateMethod value = new CreateMethod(); // создаем наш объект
        
		private CreateMethod(){} // запрещаем создавать новые объекты
		public CreateMethod getInstance(){  // даем создавать новые объекты только так
			return value;
		}
	}
	
- - -   
	
[Factory method - youtube](https://www.youtube.com/watch?time_continue=3&v=HZ4ciLNWX4E)  
[Factory method - RG](https://refactoring.guru/ru/design-patterns/factory-method)  

- - -  

<h3 align = "center"> Bridge - Мост. </h3>

Разделяет абстракцию и реализацию, `ВАЖНО!!!` чб они могли изменяться `НЕЗАВИСИМО.`  

Конкретно паттерн мост это 2 иерархии, и, в целом, это абстракция и еще одна  
абстракция, а так же их может быть ни 2, а сколько угодно. Но в случае второй,  
реализация подразумевает использование интерфейса, чб на его место можно было  
подставить любую из его реализаций.  

`далее по классике:`  

Создается 2 иерархий, с абстракцией во главе. Одна из них берется за основу,  
в которую ссылается другая. Можно менять первую и вторую независимо друг от  
друга. Иерархии строятся на принципах ООП, от абстракции к конкретики.  

Разделяется абстракция и реализация, обе их можно дополнять новыми классами.  
В целом вторую можно просто запихнуть в первую через добавление поля и  
методов, но тогда независимости не будет и при добавлении еще новых, придется  
снова добавлять поля и методы, сильно увеличится сложность и читаемость кода.  
А так добавляется новый класс, и он прописывается как ссылка вместо  
интерфейса. Стоит заметить, что вторая абстракция, определена как  
реализация/интерфейс, это указывает, что там должны быть действия/поведение.  

[Google wtf мост](https://www.google.com/search?source=hp&ei=TwPaW9OHKsOLsgGK3p74Bg&q=%D0%BF%D0%B0%D1%82%D1%82%D0%B5%D1%80%D0%BD+%D0%BC%D0%BE%D1%81%D1%82+java&oq=%D0%BF%D0%B0%D1%82%D1%82%D0%B5%D1%80%D0%BD+%D0%BC%D0%BE%D1%81%D1%82+&gs_l=psy-ab.3.2.0l5j0i22i30k1l5.2631.5623.0.7485.14.12.0.1.1.0.128.868.11j1.12.0....0...1c.1.64.psy-ab..1.13.871.0..35i39k1j0i131k1.0.rSpdcGqdqgw)  
[Bridge pattern EN](https://www.youtube.com/watch?v=F1YQ7YRjttI)  
[Паттерн Мост ](https://www.youtube.com/watch?v=moMF84Mp1tw)  
[wiki - Мост](https://ru.wikiedia.org/wiki/%D0%9C%D0%BE%D1%81%D1%82_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))  
[RG - Мост](https://refactoring.guru/ru/design-patterns/bridge/java/example)  

- - -  




[Шаблон проектирования](https://ru.wikipedia.org/wiki/%D0%A8%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)  
[wiki-design-patterns](https://ru.wikipedia.org/wiki/Design_Patterns)  
[Шаблоны банды четырёх](https://jopr.org/blog/detail/gof-design-patterns)  
[Pattern GOF HABR](https://habr.com/post/210288/)  
[Каталог паттернов refactoring-guru](https://refactoring.guru/ru/design-patterns/catalog)  

- - -  

<h1 align = "center"> Additional patterns. </h1>

- - -  

<h3 align = "center"> Delegate - Делегирование. </h3>

- Передача полномочий/действий/работы.
- - -  
Пример:

	class A {
		void z(){
		System.out.println("delegate pattern");
		}
	}

	class B { // делегирует работу классу А.
	A a = new A(); // использует класс А.
		void z(){
		a.z():
		}
	}
	
[первые 5 мин видео Delegate, потом добавка ковариантности](https://www.youtube.com/watch?v=qfKX4xQ4Yos)  

- - -  

[todo]  

$ Снимок  


















