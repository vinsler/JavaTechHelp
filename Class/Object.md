java.lang.Object - Объект


- - -  
`Все в Java является объектом, кроме примитивов. (int, long, double etc.)`  
- - -  
Что это значит?  
То, что любой созданный класс будет наследовать методы первого объекта.  
- - -
А что это за методы?  
С ходу я бы разбил их сразу на 2 части, простые и мультипоточные.  
Простые можно разбить еще на 2 части, сравнения и информации.  
Мультипоточные так же разбить на 2 части, основные и повторяющиеся.  

### `Simple`

|pre modificator |method name|post throw exception|  
|:-:|:-:|:-:|  
||...Сравнение||  
|public native int |hashCode()||  
|public boolean |equals(Object obj)||  
||...Информация||  
|public String | toString() ||  
|protected native Object |clone()| throws CloneNotSupportedException|  
|public final native Class|getClass()|||  


- - -   
### `Multithreading`

|pre modificator |method name|post throw exception|  
|:-:|:-:|:-:|  
||...Основные||
|public final void |wait()| throws InterruptedException |  
|public final native void |notify ||  
|protected void |finalize()| throws Throwable |  
||...Повторяющиеся||
|public final native void |wait(long timeout)| throws InterruptedException |  
|public final void |wait(long timeout, int nanos)| throws InterruptedException |  
|public final native void |notifyAll() ||  

  
`...in progress`

[Hashcode/Equals from Habr.com](https://habr.com/ru/post/168195/)  
[object from Klimov](http://developer.alexanderklimov.ru/android/java/object.php)  
[java.lang.Object](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html)  
[object без super.class from Habr](https://habr.com/post/265373/)