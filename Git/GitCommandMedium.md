### Блок средних команд.  

||command|action|flags|
|:-:|:-:|:-:|:-:|
|1|merge|слить||
|2|branch|<ветка> с флагом удалить|-d|
|3|push|<затолкнуть> удаление <ветки>|--delete <branch>|
|4|clone|<клонировать> репозиторий ||
|5|-|-|-|

- `merge` слить новую/измененную ветку для коммита  
git merge user  


- `branch`  
git branch -d user  

- `push`  
git push origin --delete user  

- `clone` клонировать/скопировать репозиторий  
git clone https://github.com/JavaOPs/topjava  



[Git branch](https://habr.com/post/195674/)  
[Git merge](https://git-scm.com/book/ru/v1/%D0%92%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B2-Git-%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D1%8B-%D0%B2%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B8-%D1%81%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D1%8F)  