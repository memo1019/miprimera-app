# AREP LABORATORIO 1 - INTRODUCCION A COMPLEJOS SISTEMAS JAVA, MVN, AND GIT 

se realizo el taller propuesto de "Introducción a los sistemas complejos, JAVA,MVN y GIT" utilizando listas enlazadas

### PREREQUISITOS

Los prerrequisitos que manejaremos para lograr con exito el desarrollo del laboratorio son:
- Maven
- Git  
- Java

### Ejecucion e instalacion
se debe clonar el proyecto con el siguiente comando:

```
git clone https://github.com/memo1019/miprimera-app
```
luego ingresaremos a la carpeta dede el cmd o la consola:
```
cd /CalculadoraEstadisticaAREP
```
```
 mvn package
```
Finalmente coonstruiremos y compilaremos el proyecto para asi poder ejecutarlo.

## Correr Pruebas

para correr pruebas podemos usar el comando:

```
 mvn test
```
## Pruebas 

![Pruebas](/src/site/Resources/pruebas.png)

## Correr

Para correr el programa tenemos que ejecutar el siguiente comando :

```
java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.AREP.Calculadora.CalculadoraMS.Calculadora
```
con este comando podemos ejecutar la clase encargado de hacer el uso de la ejecucion, para asi ver con una entrada de texto el resultado de la media y la desviacion estandar
## Diseño

![Diagrama de Clases](/src/site/Resources/Diagrama%20de%20clases.png)

## Documentacion
para ver la documentacion haga click [aqui](https://memo1019.github.io/miprimera-app/)

para ver la documentacion de javadoc use estos comandos y aqui podra ver esta documentacion.
```
mvn javadoc:javadoc
```
```
mvn site
```
```
mvn site:run
```

Podemos ver la descripcion del proyecto en este pdf [file](/src/site/Resources/lab1.pdf) mostrando el diseño y la estructura del proyecto

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* Git - Version Control  

## Autor

* **Guillermo Alfonso Castro Camelo** - [Memo1019](https://github.com/memo1019)

## Licensia

This project is licensed under the GNU v3.0 License - see the [LICENSE](LICENSE.txt) file for details

