### Enum / Перечисления  

- - -  

Что это такое?  

Список/Перечисление констант.  

    Enum {
    Alexei, Alexandr, Anton
    }

идентично

    Enum {
    public static final Alexei, Alexandr, Anton
    }


- - -  


Зачем это нужно?  

...todo
В отличие от простых констант.  
Могут иметь конструкторы, методы и переменные.  

- - -  


Где это находится?  

	java.lang.Enum   <-   java.lang.Object  

JDK, пакет java.lang, файл rt.jar.  

Ищем свой JDK-ХХ-Х-Х, далее:

LIB -> SRC.ZIP -> JAVA.BASE -> JAVA -> LANG -> ...

	Library Class <- JRE <- JDK

- - -  