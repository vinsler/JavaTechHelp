### Queue - очередь.

	Абстрактный тип данных, список элементов FIFO.  
	Доступ только к одному элементу, первому в очереди.  
	Кладем первым, достаем последним.  

Пример:  
	Реальная очередь, конвейер.  
   
Часто используется в программах для организации буфера.  

[Очередь - wiki](https://ru.wikipedia.org/wiki/%D0%9E%D1%87%D0%B5%D1%80%D0%B5%D0%B4%D1%8C_(%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5))
  
Программно:  
Вы запускаете 20 потоков, которым необходим доступ к некоторому  
элементу базы данных, обработку которого все должны делать по-порядку.  
Все потоки стоят в очереди, как за колбасой и ждут пока не получен  
доступ. Освободили ресурс, заняли, сделали вычисления, освободили.  
Следующий, свободная касса, по очереди проходим.  

Enqueue -  добавление элемента.  
Dequeue -  удаление, Peek и Count.  
