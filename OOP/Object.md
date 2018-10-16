java.lang.Object - Объект


- - -  
`Все в Java является объектом, кроме примитивов. (int, long, double etc.)`  
- - -  
Что это значит?  
То, что любой созданный класс будет наследовать методы первого объекта.  
- - -
А что это за методы?  
С ходу я бы разбил их сразу на 2 части, простые и мультипоточные.  

###`Simple`

|pre modificator |method name|post throw exception|  
|:-:|:-:|:-:|  
|public final native Class|getClass()||  
|public native int |hashCode()||  
|public boolean |equals(Object obj)||  
|protected native Object |clone()| throws CloneNotSupportedException|  
|public String | toString() |||  

- - -   
###`Multithreading`

|pre modificator |method name|post throw exception|  
|:-:|:-:|:-:|  
|public final native void |notify ||  
|public final native void |notifyAll() ||  
|public final native void |wait(long timeout)| throws InterruptedException |  
|public final void |wait(long timeout, int nanos)| throws InterruptedException |  
|public final void |wait()| throws InterruptedException |  
|protected void |finalize()| throws Throwable |  


0123456789012345678901234567890123456789012345678901234567890123456789012345
`...in progress`

[Климов про object](http://developer.alexanderklimov.ru/android/java/object.php)  
[java.lang.Object](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html)  
[object без super.class](https://habr.com/post/265373/)