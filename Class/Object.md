java.lang.Object - Объект


- - -  
`Все в Java является объектом, кроме примитивов. (int, long, double etc.)`  
- - -  
Что это значит?  
То, что любой созданный класс будет наследовать методы первого объекта.  
- - -
А что это за методы?  
С ходу я бы разбил их сразу на 2 части, простые и мультипоточные.  

### `Simple`

|pre modificator |method name|post throw exception|  
|:-:|:-:|:-:|  
|public native int |hashCode()||  
|public boolean |equals(Object obj)||  
|public String | toString() ||  
|protected native Object |clone()| throws CloneNotSupportedException|  
|public final native Class|getClass()|||  


- - -   
### `Multithreading`

|pre modificator |method name|post throw exception|  
|:-:|:-:|:-:|  
|public final void |wait()| throws InterruptedException |  
|public final native void |notify ||  
|public final native void |notifyAll() ||  
|protected void |finalize()| throws Throwable |  
|public final native void |wait(long timeout)| throws InterruptedException |  
|public final void |wait(long timeout, int nanos)| throws InterruptedException |  

  
`...in progress`

[Hashcode/Equals from Habr.com](https://habr.com/ru/post/168195/)  
[object from Klimov](http://developer.alexanderklimov.ru/android/java/object.php)  
[java.lang.Object](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html)  
[object без super.class from Habr](https://habr.com/post/265373/)