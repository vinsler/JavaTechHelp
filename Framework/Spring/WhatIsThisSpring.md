### Когда я еще ничего не знаю про Spring.

Spring framework по сути та же библиотека, но,  
обрабатывает и держит в себе какие-то данные,  
для удобной в самой себе различной обработки,  
а так же передачи в другие части программы или  
модули или другие framework'и, ORM'ы, итп.  
которые ес-но каким-то образом да связаны с  
этой программой или с ее модулями итп.  

Spring создает объекты, инициализирует, тут  
приходит куча разных:  

    - BeanDefinitionReader
    - BeanDefinitions
    - BeanFactory
    - ContextListener
    - BeanPostProcessor
    - BeanFactoryPostProcessor
    - ClassPathBeanDefinitonScaner

которые как раз и работают над этой системой бинов.  
Что куда положить, как создать, на каком этапе итп.  

Вот и появился бин, точнее в переводе БОБ(предок гороха).  

Bean - читается как Бин, переводится как Боб.  
если грубо, то в спринге я бы сказал наверно, что  
Bean = Class + Object в одном флаконе, но в целом  
это описание класса, инициализацию делает сам спринг,  
а дает вам объект, когда вы его запросите, вытащив  
из контейнера - некая область памяти, в которой лежат  
все бины описанные в контексте программы.  

В спринге можно инициализировать бины 3 раза, т.е.  
если создавая объект мы инициализируем его 1 раз в  
конструкторе, то тут можно сделать это аж 3 раза.  

Советую посмотреть:  
[Евгений Борисов - Spring потрошитель](https://www.youtube.com/watch?v=BmBr5diz8WA)
