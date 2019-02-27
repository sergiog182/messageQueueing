Proyecto manejo de colas activeMQ 
=========================================

Los archivos que estan en la carpeta files/incomig/backup se deben copiar a la carpta files/incoming

El resultado del procesamiento se verá en las rutas configuradas en el archivo config.properties (outgoing)

Para correr el proyecto, desde consola ejecutar:

    mvn celan camel:run

Desde JBoss developer studio, crear un perfil de ejecución:

	clean camel:run