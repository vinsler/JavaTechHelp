### Пояснения к HW0.

1) Проходим по списку, формируем мапу с ключом датой и добавляем  
все калории, ну если такой ключ уже есть, то прибавляем ес-но.  

2) Проходим еще раз и сравниваем с датами до и после,  
если устравивает, то сравниваем текущую дату с ключом в мапе и  
регистрируем тру/фолз, добавляем в новый список, возвращаем.  

`Если делать решение через стримы, как по видео разбору:`  

	public static List<UserMealWithExceed> getFilteredWithExceeded
			(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {

		// Разберем и распишем все по порядку.

			// тут делаются некие локальные подсчеты, через проход по стриму из списка для последующего стрима.
			Map<LocalDate, Integer> caloriesSumByDate = mealList // это создаем мапу для калорий и стримим из списка
				.stream() // создание стрима, для работы через стрим со списком
				.collect(Collectors.groupingBy(um -> um.getDateTime().toLocalDate(), 
						Collectors.summingInt(UserMeal::getCalories)));
				// собираем новую коллекцию группировкой из коллекции по дате из UserMeal и
				// суммированием из коллекции калории из того же UserMeal

				return mealList // а потом возвращаем список
						.stream() // создаем стрим, для работы через стрим со списком
						.filter(um -> TimeUtil.isBetween(um.getDateTime().toLocalTime(), startTime, endTime))
						// фильтруем UserMeal через класс TimeUtil, попадающему для UserMeal.getDateTime между временем начала и конца
						.map(um -> new UserMealWithExceed(um.getDateTime(), um.getDescription(), um.getCalories(),
								caloriesSumByDate.get(um.getDateTime().toLocalDate()) > caloriesPerDay))
						// собираем это все в коллекцию, путем создания новой коллекции c UserMealWithExceed и булеана,
						// который проверяет кол-во калории больше установленных или нет.
						.collect(Collectors.toList());
						// запихиваем коллекцию в список и возращаем. все.
			}
	

`Чтобы подставлять выражение переменной, нужно встать в конец выражения и нажать alt + ctrl + V.`  
