# ATHLETE APPLICATION
## Бизнес требования

1. Пользователь должен авторизоваться
2. Пользователь может получить список атлетов 
3. Пользователь может добавить нового атлета
4. Пользователь может редактировать данные атлета
5. Пользователь может удалить атлета


## Модель данных

**Athelete**

***id, name, surName, birthDate, age, profile, 
phoneNumber, password***


## DTO

**AtheleteView**

***name, surName, birthDate, age, profile,
phoneNumber***

## Postman 

Перед использованием Postman надо открыть http://localhost:8080/login

Залогиниться (username: "user", password: "password")

Открыть Cookies страницы и скопировать значение JSESSIONID

После этого вставить это значение в Postman в заголовках запросов в таком виде:

![Screenshot 2024-05-02 at 20.11.27.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fn0%2F6p92qlr57lg50h015161bzp40000gp%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_EfZjo7%2FScreenshot%202024-05-02%20at%2020.11.27.png)

Повторить, если сессия истекла


## Описание эндпоинтов

***метод GET*** возвращает пользователей<br/>
URL: http://localhost:8080/api/v1/athletes 

request body<br/>
{
“name”: “user_name”,  	// имя пользователя<br/>
“surName”: “user_surName”, // фамилия пользователя<br/>
“birthDate”: “user_birthDate”     	// дата рождения пользователя<br/>
“age”: “user_age”     	// возраст пользователя<br/>
“profile”: “user_profile”     	// профиль пользователя<br/>
“phoneNumber”: “user_phoneNumber”     	//  номер телефона пользователя<br/>
}

- в случае успеха
статус 200

- в случае ошибки
статус 500

***метод Post*** добавляет нового пользователя<br/>
URL: http://localhost:8080/api/v1/athletes/save_athlete

- в случае успеха
  статус 200
возвращает "Athlete saved successfully" 

- в случае ошибки
  статус 500

***метод Get*** возвращает искомого пользователя по номеру телефона<br/>
URL: http://localhost:8080/api/v1/athletes/{phoneNumber}



***метод Put*** редактирует данные пользователя<br/>
URL: http://localhost:8080/api/v1/athletes/update_athlete



***метод Delete*** удаляет пользователя по номеру телефона<br/>
URL: http://localhost:8080/api/v1/athletes/delete_athlete/{phoneNumber}



## Комментарий
Не удастся отправить Post запрос (через Postman) из-за ограничений Spring Security

Для решения данной проблемы не хватило времени



