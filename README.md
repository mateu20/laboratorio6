# Laboratorio 6
## Patrones arquitecturales AWS

##### Creando maquinas virtuales con EC2
Primero vamos a crear una instancia de EC2 en el boton Launch Instance. 
![](/img/crearInstancia.PNG)

Seleccionamos la segunda opción.
![](/img/instanciaJava.PNG)

Le damos next a las opciones de edicion.
![](/img/primerNext.PNG)
![](/img/segundoNext.PNG)
![](/img/tercerNext.PNG)
![](/img/cuartoNext.PNG)

Ahora configuramos el security group dando click en "add rule" configurando
los puertos de tomcat(8080) y de aurora Sql (3306) y posteriormente seleccionando Rewiew and Launch.
![](/img/securityGroup.PNG)
Deberiamos ver algo parecido a lo siguiente
![](/img/securityGroup2.PNG)
Y la instancia ya corriendo deberia verse asi
![](/img/instanciaPrendidad.PNG)

##### Creando base de datos
Seleccionamos la creacion estandar para la base de datos SQL

![](/img/dbSQL.PNG)

Seleccionamos la version sin costos free tier

![](/img/freeTier.PNG)

En settings ahora configuramos el nombre de usuario y la contraseña

![](/img/dbSettings.PNG)

En additional connectivity configuration establecemos el acceso publico y seleccionamos el security gruop que creamos en la maquina de EC2

![](/img/additionalDB.PNG)

Por ultimo seleccionamos el nombre de nuestra base de datos

![](/img/dbName.PNG)

Deberiamos ver algo como lo siguiente 

![](/img/dbVerificacion.PNG)

Para la conexión a la base de datos necesitaremos el endpoint que sera el Server Host en nuestra conexion, para esto accedemos a la base de datos 

![](/img/dbEndpoint.PNG)

Para probar la conexion deberemos propiciar todos los datos creados en los pasos anteriores dentro de nuestro motor de creación para la base de datos en esta ocasión en DBeaver. 

![](/img/dbConexion.PNG)

Ahora podemos crear las tablas y los datos que consultaremos posteriormente.

![](/img/dbpoblar.PNG)

#### Configurar adicional backend para probar la consulta

Configuramos el archivo "aplication properties con la url de la base de datos, el usuario y la contraseña.
![](/img/properties.PNG)

Configuramos los controllers de la aplicación con las acciones get y post que nos permitiran consultar los recursos, de igual manera les indicamos la ruta a consultar en esta ocasión /index y /formulario y tambian creamos nuestro formulario dinamico dentro del metodo POST.
![](/img/controladores.PNG)

#### Probando

Nos conectamos a nuestra maquina virtaul EC2 mediante el comando ssh.

![](/img/sshEC2.PNG)

Ahora verificamos el correcto funcionamiento de la pagina accediento a la ruta que indicamos en nustra clase "controller" pasandole el parametro Mateo a nuestra busqueda.

![](/img/pruebaFormulario.PNG)

Y verificamos la correcta busqueda de nuestra consulta.

![](/img/jsonPrueba.PNG)

#### Creado S3

Dentro de s3 seleccionamos la creación de un nuevo bucket.

![](/img/crearS3.PNG)

Le asignamos un nombre al buckey y dejamos la zona por defecto.

![](/img/nombreBucket.PNG)

Quitamos el bloqueo al acceso del publico y verificamos dicha decisión.

![](/img/seguridadBucket.PNG)

Por ultimo verificamos la creación del bucket.

![](/img/crearBucket.PNG)

Ya dentro del bucket podemos cargar los archivos .js, .html e imagenes.

![](/img/cargarBucket.PNG)

Verificamos que el servicio web cargue correctamente.

![](/img/prruebaBucket.PNG)

## Authors

* **Mateo González**  - [mateu20](https://github.com/mateu20)

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details

