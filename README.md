# Gabel Cypher

## Descripción
El **Cifrado Gabel** es un sistema de cifrado y descifrado de frases en Java que retrocede 3 posiciones en las letras en las posiciones impares. Este proyecto incluye funcionalidades para normalizar el texto (eliminar tildes) y mantiene el formato de espacios y caracteres no alfabéticos.

## Características
- **Cifrado** y **descifrado** de frases con desplazamiento de letras.
- **Normalización** de texto para suprimir las tildes en los caracteres.
- Control de espacios múltiples y caracteres especiales en las frases.

## Estructura del Proyecto
- `Gabel.java`: Clase principal que implementa el cifrado y descifrado.
- `Console.java`: Clase singleton para lectura y escritura de texto por consola.
- `Main.java`: Clase que inicia la aplicación.
- `GabelTest`: Clase de pruebas para validar el funcionamiento de las funciones de cifrado y descifrado.

## Instalación
1. Clona el repositorio:\n
   (bash)\n
    git clone https://github.com/usuario/Gabel-Cypher.git
2. Importa el proyecto en tu IDE de preferencia (IntelliJ, Eclipse...). 
3. Asegúrate de tener JUnit 4 agregado al classpath para ejecutar las pruebas.

## Uso 
Ejecuta Main.java para iniciar el programa. Sigue las instrucciones en pantalla para introducir frases para cifrar o descifrar.

## Ejecución de Pruebas
Para ejecutar las pruebas:

1. Abre el paquete tests.
2. Ejecuta las pruebas desde tu IDE o desde la línea de comandos usando Maven o Gradle, si está configurado.

## Contribuciones
Toda contribución es bienvenida. Si deseas colaborar, haz un fork del repositorio, crea una rama con tus cambios y envía un pull request.

## Licencia
Este proyecto se distribuye bajo la licencia MIT.

---
**Autor:** Jose Belchí Hernández
**Licencia:** [MIT](./LICENSE)
