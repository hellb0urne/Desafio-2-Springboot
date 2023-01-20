# Ejercicio técnico by Tulkaz

# Construido por

| Cargo                | Nombre                           |
|----------------------|----------------------------------|
| Analista programador | [Roberto Nicolas Delgado Cartes] |

# Modo de uso

Paso 1:
Una vez descargado este proyecto, se debe descargar las dependencias de maven, a través del comando

```
mvn clean install -U
```

Paso 2:
Luego de descargar las dependencias, se debe ir a la application DesafioTulkazN2Application.class y desde allí ejecutar el
método main.

Paso 3:
Para realizar la prueba del registro de Activity a través de postman:

```CURL
curl --location --request POST 'http://localhost:8080/api/saveActivityType/'
```

Paso 4:
Para realizar revisión de la persistencia de los datos en H2, se debe ingresar a la siguiente URL

```
http://localhost:8080/h2-ui
```

Paso 5:
Una vez dentro de la consola, se debe realizar la siguiente Query a la tabla USUARIO

```SQL
SELECT * FROM ACTIVITY;
```

recordar que el proyecto debe estar corriendo en springboot previamente, los datos para ingresar a la consola son los
siguientes:

```
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: sin password
```

Paso 6:
Para realizar la prueba de ver ActivityDto a traves de postman:

```CURL
curl --location --request GET 'http://localhost:8080/api/getActivity' \
```

Paso 7:
Para realizar la prueba de activityReturnDtoList a traves de postman se debe usar el siguiente JSON:

```CURL
curl --location --request POST 'http://localhost:8080/api/activityReturnDtoList' \
--header 'Content-Type: application/json' \
--data-raw '[
        1 
]'
```



"# Desafio-2-Activity" 
# Desafio-2-Springboot
