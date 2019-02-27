Proyecto manejo de colas activeMQ 
=========================================

Los archivos que estan en la carpeta files/incomig/backup se deben copiar a la carpta files/incoming

El resultado del procesamiento se verá en las rutas configuradas en el archivo config.properties (outgoing)

Para ejecutar el proyecto, instalar en el servidor de JBOSS:

clean install

Desde la consola del servidor:

install -s mvn:com.test.queue/test-queue/1.0.0-SNAPSHOT