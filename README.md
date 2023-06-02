# CppSyntaxAnalyzer
CppSyntaxAnalyzer es un programa en Java que permite analizar la sintaxis de código en lenguaje C++ ingresado por el usuario y generar una tabla hash que asigna a cada token (palabra) una clave hash basada en su posición de fila y columna en el texto.

## Requisitos
Java Development Kit (JDK) 8 o superior instalado en el sistema.

## Cómo usar
Ejecuta el programa CppSyntaxAnalyzer.java.
Se te pedirá que ingreses la declaración de variables en C++ y el código en C++. Puedes usar varias líneas para ingresar el código.
Presiona Enter en una línea vacía para indicar el final de la entrada.
El programa generará una lista de palabras y tokens, mostrando cada palabra y su respectivo token basado en su posición de fila y columna.
Se te pedirá que ingreses un token para buscar en la lista.
El programa buscará el token ingresado en la lista y mostrará la palabra correspondiente si se encuentra, junto con su posición de fila y columna.
Si el token no se encuentra en la lista, se mostrará un mensaje indicando que el token no se encontró.

# Ejemplo
## Entrada

Ingresa la declaración de variable en C++ y el código en C++ (puedes usar varias líneas).
Presiona Enter en una línea vacía para finalizar:
int suma = 0;
suma = 54 + 20;

## Salida

Lista de Palabras y Tokens:
Palabra: int, Token: (1, 1)
Palabra: suma, Token: (1, 5)
Palabra: =, Token: (1, 10)
Palabra: 0, Token: (1, 12)
Palabra: suma, Token: (2, 1)
Palabra: =, Token: (2, 6)
Palabra: 54, Token: (2, 8)
Palabra: +, Token: (2, 11)
Palabra: 20, Token: (2, 13)

Ingresa el token a buscar: (1, 5)
El token '(1, 5)' corresponde a la palabra: suma

## Contribución
Si deseas contribuir a este proyecto, puedes realizar las siguientes mejoras:

Mejorar el manejo de errores y la validación de la entrada del usuario.
Implementar una interfaz de usuario gráfica para una mejor experiencia de usuario.
Agregar soporte para otros lenguajes de programación además de C++.
¡Gracias por tu interés en CppSyntaxAnalyzer! Si tienes alguna pregunta o sugerencia, no dudes en contactarnos.
