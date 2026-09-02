&#x20;***Trabajo Práctico N° 1 - Programación Orientada a Objetos***



&#x20;**Información del Alumno**

\- Materia: Paradigmas de Programación

\- Carrera: Ingeniería en Sistemas de Información

\- Universidad: Universidad Tecnológica Nacional - Facultad Regional Mendoza



&#x20;**Descripción del Proyecto**

Implementación en Java bajo el paradigma de Programación Orientada a Objetos (POO) del sistema de gestión para eventos universitarios:



**- Ejercicio 1:**

&#x20; - Modelado de la clase `EventoUniversitario` aplicando encapsulamiento (modificadores de acceso `private` y `public`).

&#x20; - Implementación de constructores parametrizados y constructor de copia.

&#x20; - Métodos de instancia y control de contador de instancias creadas mediante variables de clase (`static`).



**- Ejercicio 2:** 

&#x20; - Incorporación de relaciones entre clases:

&#x20;   - \*\*Agregación:\*\* `Sala` vinculada al evento (con existencia independiente).

&#x20;   - \*\*Composición:\*\* Colección de actividades administradas por el evento.

&#x20;   - \*\*Asociación:\*\* Gestión de inscripciones vinculando estudiantes con cada actividad.



**- Ejercicio 3:**

&#x20; - Refactorización aplicando Herencia y Polimorfismo:

&#x20;   - Transformación de `Actividad` en una clase abstracta.

&#x20;   - Especialización en subclases concretas: `Charla` y `Taller` (con cálculo polimórfico de costos).

&#x20;   - Uso del calificador `final` en el método `mostrarIdentificacion()` para prevenir sobreescrituras en las subclases.







&#x20;**Estructura del Repositorio**

\- `TP1\_51175/`: Proyecto desarrollado en IntelliJ IDEA con Maven (`pom.xml` y código fuente en `src/main/java`).

\- `captura\_consola.png`: Captura de pantalla de la salida del programa tras ejecutar el flujo completo en `App.java`.

\- `README.md`: Documentación del trabajo práctico.







&#x20;**Instrucciones de Ejecución**

1\. Abrir la carpeta `TP1\_51175` como proyecto en IntelliJ IDEA.

2\. Configurar el SDK con Java 21 o superior (por ejemplo, Amazon Corretto 23).

3\. Ejecutar la clase principal ubicada en `src/main/java/App.java`.

