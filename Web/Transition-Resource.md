- - -  

### HTML - гиперссылка.

    <a href = "/index.html"> Перейти на index.html </a>

- - -  

### HTML - форма.

    <form action = "https://yandex.ru/">
        <input type="text" name="aaa" value="">
        <input type="hidden" name="zzz" value="images">
        <button type="submit"> найти </a>
    </form>
	
- - -  

### HTML - ресурсы.

    <link rel = "stylesheet" href="/css/index.css">
    <script src = "http://code.jquery.com/jquery-2.1.4.js"> </script>
    <img src = "pictures/network.jpg" width="150">

- - -  

### CSS - ресурсы.

    .slide {
        background-image: url(../pictures/network.jpq)
    }
    @font-face {
        font-family: Terminus;
        src: url(fonts/terminus.ttf)
    }

- - -  

### JavaScript - url  

    var addApiUrl = '/items/add/';
    var newTitle = 'Some action';
        $.ajax({
            type: 'POST',
            url: addApiUrl,
            data: {id: 10, title: newTitle}
        });

- - -  



