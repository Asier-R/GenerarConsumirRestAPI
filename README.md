# GenerarConsumirRestAPI
Proyecto creado a partir de guia online, para el aprendizaje de generación y consumo de Rest API 

## demo
Aplicación que consume el web service generado por "quoters-master" en localhost:8080/api. Demo utiliza el puerto 8081.

## quoters-master
Aplicación que genera el web service "quoters-master" en localhost:8080/api.
localhost:8080/api    => Todas las citas.
localhost:8080/1      => La primera de las citas. Para obtener cualquier otra solo hay que indicar el id.
localhost:8080/random => Cita aleatoria.

## Info
Ambas aplicaciones ya tienen sus .jar generados, solo hay que ejecutarlos mediante "java -jar ruta/al/fichero.jar".
Para poder utilizar "demo" primero hay que arrancar "quoters-master".
Para generar los .jar, utilizar el comando "mvn clean install".

