### for Example:  

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);  
		numbers.forEach(System.out::println);  
        
	//В данном примере есть список, созданный из массива.  
	//Перебираются все значения списка и выводятся.  

	//Вот эту строку:  
		numbers.forEach(System.out::println);  

	//можно представить как:  
		numbers.forEach(x -> System.out.println(x));  

	//где используя лямбда выражение, перебираются все значения и выводятся.  

	
[Лямбда выражения - метанит](https://metanit.com/java/tutorial/9.1.php)  
[Ссылка на метод - метанит](https://metanit.com/java/tutorial/9.2.php)   
[Habr - лямбда, ссылки, стримы](https://habr.com/post/216431/)  

### Видео про Лямбда / Lambda.  

[from ZhirniToni](https://www.youtube.com/watch?v=QyDYbFkHJmY)  
[from Source code](https://www.youtube.com/watch?v=WmMavkXMXDg)  


### Видео про Ссылка на метод / Method reference.  

[from Source code](https://www.youtube.com/watch?v=fqmcKTngRkY)  
