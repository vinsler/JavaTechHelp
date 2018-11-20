- - -   

<h3 align = "center"> Abstract factory - Абстрактная фабрика. </h3>

- - -  

[Паттерны проектирования](../../Patterns.md)  

- - -  
Расширенный фабричный метод, фабрика из абстракций, абстракция из абстракций.  
Абстрактная фабрика, создает абстрактные продукты, которые потом реализуют  
конкретные фабрики, которых может быть сколько угодно. Для каждого нового  
продукта создается абстракция, которая после добавления в абстрактную фабрику,  
должна быть добавлена в каждую конкретную фабрику, потому что все они ее  
реализуют.  

- - -  

`Example:`  

	interface AbstractFactory { // основа, абстрактная фабрика.
		AbstractProductA createProductA(); // абстрактный продукт 1  
		AbstractProductB createProductB();   // абстрактный продукт 2  
	}
	
- - -  
	
	interface AbstractProductA {} // абстрактный продукт 1  
	interface AbstractProductB {} // абстрактный продукт 2  
	
- - -  
	
	// первая конкретная фабрика/реализация абстрактной фабрики
	class ConcreteFactory1 implements AbstractFactory {
		ProductA createProductA(){  // первая реализации абстрактного продукта 1
			return new ProductA1();  
		}  
		ProductB createProductB(){  // первая реализация абстрактного продукта 2
			return new ProductB1();  
		}  
	}  
	
- - -  

	// чертежи абстрактного продукта 1 и 2 для первой фабрики  
	class ProductA1 implements AbstractProductA {}  
	class ProductB1 implements AbstractProductB {}  
	
- - -  

	// вторая конкретная фабрика/реализация абстрактной фабрики
	class ConcreteFactory2 implements AbstractFactory {  
		ProductA createProductA(){  // вторая реализации абстрактного продукта 1
			return new ProductA2();  
		}  
		ProductB createProductB(){  // вторая реализации абстрактного продукта 2  
			return new ProductB2();  
		}  
	}  
	
- - -  

	// чертежи абстрактного продукта 1 и 2 для второй фабрики  
	class ProductA2 implements AbstractProductA {}  
	class ProductB2 implements AbstractProductB {}  

- - -   