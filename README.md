# HomeWorkKt-1_5
## Домашнее задание к занятию «2.2. ООП: Объекты и классы» (full description in README.md)

### Задача №1 - Посты

❗❗❗ **ВАЖНОЕ** правило - перед выполнением работы необходимо проанализировать систему, с которой предстоит работать, и продумать, как бы сделали вы.

> В качестве примера берётся VKontakte: https://vk.com/dev/objects/post 

Исходя из полученных данных в итоге получаем:

    - Data класс Post.
    - Объект WallService, который внутри себя хранит посты в массиве.


### Задача №2 - Wall

Добавление функционала сервису методами:

- Создание записи.
- Обновление записи.

#### Создание записи

    fun add(post: Post): Post {}
📌 Метод добавлять запись в массив и назначает посту уникальный среди всех постов идентификатор.
Возвращает пост с уже выставленным идентификатором.

#### Обновление записи

    fun update(post: Post): Boolean {}
📌 Метод находит среди всех постов запись с тем же id, что и у post и обновляет все свойства, кроме id владельца и даты создания.
Если пост с таким id не найден, то ничего не происходит и возвращается false, в противном случае - возвращается true.

### Задача №3 - Wall Tests

На созданные методы написаны автотесты :
- на метод *add* - тест проверяет, что после добавления поста id стал не равным 0.
- на метод *update* : (1) - изменяем пост с существующим id, возвращается true; (2) - изменяем пост с несуществующим id, возвращается false.

___
## Домашнее задание к занятию «2.3. ООП: Композиция, наследование и интерфейсы»

### Задача №1 - Посты (без Attachments)

Доработки к предыдущей задачи, в отношении отображении полей объекта (кроме attachments), описанного в документации. Некотроые поля помечены как *Nullable*.

В итоге получаем:

    - Data класс Post
    - Внутри Post могут быть Nullable свойства.
    - WallService, который внутри себя хранит посты в массиве.

Результат выполнения работы выполнен как Pull Request к предыдущему проекту.

### Задача №2 - Attachments

`Attachment` определён абстрактным классом.

Описаны наследники `Attachment`, которые хранят данные по типу (фото, аудио, видео и т.д.). Данные Audio, Video (то, что вложено в наследников Attachment) лучше оформлены в виде отдельных классов.

К классу Post добавлен массив из объектов Attachment и описаны классы Attachment, его наследников и классы для хранения данных о вложениях.

___
## Домашнее задание к занятию «3.1. Исключения»

### Задача №1 - PostNotFoundException

Добавление в сервис с постами возможности комментирования постов при помощи добавления метода **createComment** в *WallService* :

Функция **createComment** сначала должна проверяет, существует ли в массиве posts пост с id равным postId. Если ✔️ существует, то добавить комментарий в массив comments и вернуть только что добавленный комментарий. А если 🚫 не существует - выкинуть исключение *PostNotFoundException*.

### Задача №2 - JUnit

Написание двух тестов на созданную функцию:

    - Функция отрабатывает правильно, если добавляется комментарий к правильному посту.
    - Функция выкидывает исключение, если была попытка добавить комментарий к несуществующему посту.

Для тестирования, что какой-то код выкидывает исключение, применён метод:

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {}

Вместо assert в конце теста, реализован вызов функции, которая должна выкинуть исключение.
