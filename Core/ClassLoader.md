### Загрузчики классов. / ClassLoader.

|ClassLoader| part of|control from|
|:-:|:-:|:-:|
|Bootstrap or Premordial|JVM|key -Xbootclasspath|
|System|JRE|key -classpath or system option java.class.path|
|Extension|JRE|system option java.ext.dirs|

Загрузчики:  

    bootsrap - базовый.  
    system - системный.  
    extension - расширенный.  