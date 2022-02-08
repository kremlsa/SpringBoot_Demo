# SpringBoot_Demo
Demo project for springboot

# Создание проекта SpringBoot
Проект с поддержкой spring можно создать как с помощью IDE (например IntelliJ Idea Ultimate) так и с помощью специального сервиса - https://start.spring.io/.
Создадим проект со следующими настройками
![image](https://user-images.githubusercontent.com/55805583/152954689-7161723c-eec6-4a64-a4f0-7cf101b31fc0.png)
Сгененрируем и скачаем в виде архива.
Запустим IDE склонируем проект - https://github.com/kremlsa/SpringBoot_Demo
Создадим свою ветку - new branch
Отредактируем файл .gitignore, воспользуемся сервисом https://www.toptal.com/developers/gitignore
Скопируем в gitignore в проект
Скопируем содержимое папки demo в корневую папку проекта в ide
Перейдем к файлу pom.xml И правой кнопкой - add as a maven project
Ждём когда всё проиндексируется и проект подгрузится
Правой кнопкой запускаем DemoApplication
![image](https://user-images.githubusercontent.com/55805583/152958232-75c08c7b-bef5-409b-a3ee-821fc0981333.png)
Запущен сервер tomcat на localhost:8080
Добавим в pom.xml зависимость для валидатора
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-validator</artifactId>
			<version>6.1.0.Final</version>
		</dependency>
обновить проект скачать зависимости
Создать 2 класса (брать здесь https://github.com/kremlsa/SpringBoot_Demo/tree/sasha/src) 
SimpleController, SimpleRequestDTO
Запустить проект т проверить через postman
![image](https://user-images.githubusercontent.com/55805583/152962033-d395ac4e-18c0-413b-b267-ae9a880bb277.png)
Создать класс DemoApplicationTests
Запустить тесты. mvn test


