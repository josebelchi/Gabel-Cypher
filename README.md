# Gabel Cypher

## Descripción
**Gabel-Cypher** es un sistema de cifrado y descifrado de frases en Java que retrocede 3 posiciones en las letras en posiciones impares para cifrar. Este proyecto incluye funcionalidades para normalizar el texto (eliminar acentos) y mantiene el formato de espacios y caracteres no alfabéticos.

## Características
- **Cifrado** y **descifrado** de frases con desplazamiento de letras.
- **Normalización** de texto para omitir acentos en los caracteres.
- Control de espacios múltiples y caracteres especiales en las frases.

## Estructura del Proyecto
- `Gabel.java`: Clase principal que implementa el cifrado y descifrado.
- `Console.java`: Clase singleton para lectura y escritura de texto en consola.
- `Main.java`: Clase que inicia la aplicación.
- `tests`: Paquete de pruebas para validar el funcionamiento de las funciones de cifrado y descifrado.

## Instalación
1. Clona el repositorio:
   (bash)
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
Las contribuciones son bienvenidas. Si deseas colaborar, haz un fork del repositorio, crea una rama con tus cambios y envía un pull request.

## Licencia
Este proyecto se distribuye bajo la licencia MIT.