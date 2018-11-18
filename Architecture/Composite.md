### Composite - компоновщик, дерево.  

Позволяет сгруппировать множество объектов в древовидную структуру.  

Понравилась аналогия с чемоданом. Создаем чемодан, в который можно положить   
предметы и другие сумки, чемоданы, в которые можно положить другие пакеты и  
более мелкие предметы итд.  

	// component - нужный общий метод
	interface Bag {
		void print(); // показать что в чемодане
	}

	// composite - контейнер - сумка/чемодан
	class BagImpl implements Bag {
		private List<Bag> bagList = new ArrayList<>(); // список чемоданов внутри

		public void add(Bag bag) {  // добавить чемодан
			bagList.add(bag);
		}

		public void remove(Bag bag) { // удалить чемодан
			bagList.remove(bag);
		}

		public void print() { // показать все что в чемодане/ах
			for (Bag forBag : bagList) {
				forBag.print();
			}
		}
	}

	// leaf - часть/компонент - вещь 1
	class Dress implements Bag {
		public void print() {
			System.out.println("Платье");
		}
	}

	// leaf - часть/компонент - вещь 2
	class Pants implements Bag {
		public void print() {
			System.out.println("Штаны");
		}
	}


	public class TestComposite {
		public static void main(String[] args) {
			Dress dress1 = new Dress();
			Dress dress2 = new Dress();
			Pants pants1 = new Pants();
			Pants pants2 = new Pants();

			BagImpl forDress = new BagImpl(); //  чемодан для платьев
			forDress.add(dress1);
			forDress.add(dress2);

			BagImpl forPants = new BagImpl(); // чемодан для штанов
			forPants.add(pants1);
			forPants.add(pants2);

			BagImpl bagMain = new BagImpl(); // большой чемодан
			bagMain.add(forDress);
			bagMain.add(forPants);

			bagMain.print(); // что лежит в большом чемодане
		}
	}



[composite - youtube](https://www.youtube.com/watch?time_continue=24&v=Fj-6Zgn0Nuk)  
[RG - composite](https://refactoring.guru/ru/design-patterns/composite)  
[wiki - composite](https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%BC%D0%BF%D0%BE%D0%BD%D0%BE%D0%B2%D1%89%D0%B8%D0%BA_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))  