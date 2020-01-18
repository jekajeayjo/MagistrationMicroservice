# Установка проекта  на Linux Mint
- Установка jdk
- Установка серды разработки
## Установка дополнительный средств
- Установка  Apache
- Установка Базы данных
- Первый Запуск

## Установка  Jdk
- Заходим в Google и пишем скачать jdk 


![Снимок экрана от 2019-09-17 14-50-38](https://user-images.githubusercontent.com/37213273/65039756-a7160400-d95b-11e9-9361-391ea8bdc5ea.png)
- Заходим на первую страницу и выбираем rpm


![Снимок экрана от 2019-09-17 14-50-52](https://user-images.githubusercontent.com/37213273/65040272-a92c9280-d95c-11e9-9ce2-fdbadc81ed58.png)

- Находим куда скачался файл

![Снимок экрана от 2019-09-17 15-07-19](https://user-images.githubusercontent.com/37213273/65040437-13453780-d95d-11e9-9c29-9e24bb435adc.png)

- Открываем консоль и вводим

```

- Вводим sudo rpm -i jdk-12.0.2_linux-x64_bin.rpm 


```


![Снимок экрана от 2019-09-17 15-07-19](https://user-images.githubusercontent.com/37213273/65040512-396ad780-d95d-11e9-8714-aa72411a9608.png)

- После завершения вводим в консоле java -version

![Снимок экрана от 2019-09-17 15-11-54](https://user-images.githubusercontent.com/37213273/65040717-b26a2f00-d95d-11e9-963b-a8100c6fbed3.png)


## Установка среды разработки

- заходим в Google и вводим intelij idea

![Снимок экрана от 2019-09-17 15-36-46](https://user-images.githubusercontent.com/37213273/65042468-8f417e80-d961-11e9-81e3-40b73d34c499.png)

- Нажимаем Download

![Снимок экрана от 2019-09-17 15-38-07](https://user-images.githubusercontent.com/37213273/65042496-9c5e6d80-d961-11e9-9ad2-39bf2342dcdb.png)

- Выбираем Community


![Снимок экрана от 2019-09-17 15-39-01](https://user-images.githubusercontent.com/37213273/65042509-a54f3f00-d961-11e9-80cd-0af0a4269d8e.png)

- Распаковываем и запускаем

## Установка дополнительных средств


### Установка Apache2


- Откройте терминал и выполните в нём следующие две команды:


```


 sudo apt-get update
sudo apt-get install apache2 mysql-server php libapache2-mod-php php-mysql php-xml php-gd php-imap php-gettext phpmyadmin


```


![11-1](https://user-images.githubusercontent.com/37213273/65042847-68377c80-d962-11e9-944f-4b7846c96292.jpg)

- Рекомендуется сразу установить пароль, это нужно для безопасности, также в своих стандартных настройках phpMyAdmin не даст войти без пароля.

- Если для локального веб-сервера вы не хотите указывать пароль, то оставьте поле пустым, переключитесь клавишей TAB на OK и нажмите ENTER.

![12](https://user-images.githubusercontent.com/37213273/65042885-856c4b00-d962-11e9-8470-5e11292e3ad1.jpg)

- В этом окне оставьте всё без изменений, переключитесь клавишей TAB на OK и нажмите ENTER.

- На вопрос «Настроить базу данных для phpmyadmin с помощью dbconfig-common?» клавишей TAB выберите «Нет» и нажмите ENTER:

- Вот и всё! Веб-сервер (связка Apache, PHP, MySQL, phpMyAdmin) установлен и готов к работе. Откройте в браузере ссылку http://localhost/

- Вы увидите стандартную страницу Apache:

- Чтобы веб-сервер запускался вместе с каждым включением компьютера, выполните команду:

```

sudo systemctl enable apache2


```


## Настройка phpMyAdmin


- Нам нужно сделать небольшую настройку для phpMyAdmin. Введите команду



```


sudo gedit /etc/apache2/apache2.conf

```

- Она откроет текстовый файл. Пролистните этот файл до самого конца и в самый низ добавьте строку:

```


 Include /etc/phpmyadmin/apache.conf

```


![14](https://user-images.githubusercontent.com/37213273/65043045-d7ad6c00-d962-11e9-8dbf-7036b8b6aed6.jpg)

- Перезапустите веб-сервер, чтобы изменения вступили в силу:

```

sudo systemctl restart apache2


```
- Теперь phpMyAdmin доступен по ссылке http://localhost/phpmyadmin/




- [установка (Apache, PHP, MySQL, phpMyAdmin) ](https://zalinux.ru/?p=1142)



## Настраиваем пользователя 
- Открываем Консоль и вводим команды

```

 sudo mysql -u root -p
CREATE USER 'kob'@'localhost' IDENTIFIED BY '1';
GRANT ALL PRIVILEGES ON * . * TO 'kob'@'localhost';
FLUSH PRIVILEGES;


```



## Создание Бд

- Заходим по ссылке http://localhost/phpmyadmin/  и вводим логин и пароль mysql 
![Снимок экрана от 2019-09-17 16-20-20](https://user-images.githubusercontent.com/37213273/65045349-4a204b00-d967-11e9-844d-d439e09df43a.png)
- Кликаем по кнопке создать Бд

![Снимок экрана от 2019-09-17 16-20-32](https://user-images.githubusercontent.com/37213273/65045765-1265d300-d968-11e9-9a59-2a92e9ad6103.png)

- Создаем Бд

![Снимок экрана от 2019-09-17 16-20-39](https://user-images.githubusercontent.com/37213273/65045838-30333800-d968-11e9-9987-8e7f09ff6a11.png)

## Если не запускаетс проект
- Проверьте логин и пароль входа в бд

![Снимок экрана от 2019-09-17 16-15-40](https://user-images.githubusercontent.com/37213273/65045122-ea29a480-d966-11e9-9907-e7f77edc05c4.png)



```

## Использование 
Ввоидте по ссылке http://localhost:8080


```
