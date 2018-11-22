- - -  

<h3 align = "center"> Builder - Строитель. </h3>

- - -  

[Паттерны проектирования](../../Patterns.md)  

- - -  

Использование одного и того же кода для построения разных объектов.  
Я бы назвал его `КОМПОНОВЩИК` или `СОБИРАТЕЛЬ`.  

- - -  

`Для чего он нужен?`  

Для создания неких составных объектов, в которых часто меняется внутреннее  
наполнение. Например пицца, там много ингридиентов и они могут миксоваться.  
Машина, в ней много разных сборок, от стока до полного наполнения. Итп.  

`Суть.`  

Создаем какой-то класс, для него создаем абстракцию для построения, потом  
пишем класс/классы с реализацией этой абстракции, и потом пишем класс для  
управления этими реализациями через ссылку на абстракцию.  

Например у нас есть класс машина, создаем абстрактный класс с необходимыми  
в нашей программе элементами. Далее пишем конкретный класс, например  
MercedesAMG, в нем прописываем всю реализацию, все поля итп, потом пишем  
класс директор, в котором выбираем конкретный класс, и собираем объект.  

`Грубо.`

В мейне мы создадим директора, конкретную модель, установим директору эту  
к.модель и вызовем один метод создать, и все. Если понадобится другая  
к.модель, просто создадим ее и установим директору. Меняться будет только  
к.модель, все остальное будет одинаковым.  

- - -  

`Пример`  

- - -  

	// У нас есть какой-то ПРОДУКТ с его составными элементами.  
	
	class Product{  
		private String element1;  
		private String element2;  
		private String element3;  
		
		public void setElement1(String str){ this.element1 = str; }
		public void setElement2(String str){ this.element2 = str; }
		public void setElement3(String str){ this.element3 = str; }
	}

- - -  

	// АБСТРАКТНЫЙ строитель 
	
	abstract class Builder{  
		protected Product product;

		public Product getProduct(){ return product; }
		public void createNewProduct(){ this.product = new Product(); }
		
		void builderElement1();	
		void builderElement2();	
		void builderElement3();
	}

- - -  

	// КОНКРЕТНЫЙ строитель 1

	class ConcreteBuilder1() implements Builder { 
		public void builderElement1(){ product.setElement1("Тут у нас первая реализация"); }
		public void builderElement2(){ product.setElement2("Идет дождь"); }
		public void builderElement3(){ product.setElement3("Сидим дома"); }
	}

- - -  

	// КОНКРЕТНЫЙ строитель 2  

	class ConcreteBuilder2() implements Builder { 
		public void builderElement1(){ product.setElement1("Это вторая реализация"); }
		public void builderElement2(){ product.setElement2("Чистое небо и солнце"); }
		public void builderElement3(){ product.setElement3("Играем в футбол"); }
	}

- - -  

	// ДИРЕКТОР   

	class Director(){  
		private Builder builder; 
		
		public void setConcreteBuilder(Builder b){ this.builder = b; }
		public Product getProduct(){return this.builder.getProduct();}
		
		public void construct(){  // строительство
			builder.createNewProduct();
			builder.builderElement1();
			builder.builderElement2();
			builder.builderElement3();
		}
	}

- - -  

	public static void main (String[] args){
		Director director = new Director();
		
		Builder b = new ConcreteBuilder1(); // Создаем новую к.модель.  
		director.setConcreteBuilder(b);  // Устанавливаем.  
		
		director.construct();
		Product product = director.getProduct();
	}

- - -  

[Builder - wiki](https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D1%80%D0%BE%D0%B8%D1%82%D0%B5%D0%BB%D1%8C_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))  
[Builder](https://www.youtube.com/watch?time_continue=1162&v=kn9H6e5hwMY)  

- - -  