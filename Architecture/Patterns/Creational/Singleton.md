- - -  

<h3 align = "center"> Singleton - Одиночка.  </h3>

- - -  

[Паттерны проектирования](../../Patterns.md)  

- - -  

Создает единственный объект класса, предоставляет к нему доступ.  

- - -  

`Example:`

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

- - -  