# Laboratorio IV - Programación II

**Universidad Mariano Gálvez de Guatemala**
**Facultad de Ingeniería**
**Carrera: Ingeniería en Sistemas de Información y Ciencias de la Computación**

**Estudiante:** Angel Alexander Zelada Donado
**Curso:** Programación II — Sección B
**Catedrático:** Ingeniero Cristopher Muñoz

## Descripción

Repositorio con la resolución de los 16 ejercicios tipo examen del Laboratorio IV, preparación para el primer parcial. Cubre POO (herencia, encapsulamiento, polimorfismo, clases abstractas), manejo de excepciones, arreglos, estructuras condicionales, y diagramas UML (clases y secuencia) en notación PlantUML.

## Estructura del repositorio

```
LaboratorioIV/
├── Ejercicio01/
│   └── Ejercicio01.java     — Sistema de Animales (clase abstracta, polimorfismo)
├── Ejercicio02/
│   └── Ejercicio02.java     — Sistema de Vehículos (herencia, encapsulamiento)
├── Ejercicio03/
│   └── Ejercicio03.java     — Sistema de Pagos (herencia, polimorfismo)
├── Ejercicio04/
│   └── Ejercicio04.java     — Sistema de Biblioteca (herencia, polimorfismo)
├── Ejercicio05/
│   └── Ejercicio05.java     — Validación de Edad (try-catch, excepciones)
├── Ejercicio06/
│   └── Ejercicio06.java     — División Segura (try-catch, ArithmeticException)
├── Ejercicio07/
│   └── Ejercicio07.java     — Entrada Numérica (InputMismatchException)
├── Ejercicio08/
│   └── Ejercicio08.java     — Promedio de Notas (arreglos)
├── Ejercicio09/
│   └── Ejercicio09.java     — Número Mayor (comparación)
├── Ejercicio10/
│   └── Ejercicio10.java     — Estadísticas Básicas (arreglos, suma/promedio/mayor/menor)
├── Ejercicio11/
│   └── Ejercicio11.java     — Clasificación de Edad (condicionales)
├── Ejercicio12/
│   └── Ejercicio12.java     — Menú Básico (switch)
├── Ejercicio13/
│   └── Ejercicio13.md       — Diagrama de Clases: Sistema de Estudiantes (PlantUML)
├── Ejercicio14/
│   └── Ejercicio14.md       — Diagrama de Secuencia: Consulta de Estudiante (PlantUML)
├── Ejercicio15/
│   └── Ejercicio15.java     — Sistema de Empleados (clase abstracta, validación)
└── Ejercicio16/
    └── Ejercicio16.java     — Sistema de Productos (herencia, polimorfismo)
```

Cada ejercicio se encuentra en su propia carpeta con su respectivo archivo `.java` (excepto los Ejercicios 13 y 14, que son diagramas UML en formato `.md`).

## Cómo ejecutar un ejercicio

```bash
cd Ejercicio01
javac Ejercicio01.java
java Ejercicio01
```

## Cómo ver los diagramas (Ejercicios 13 y 14)

Los diagramas están escritos en pseudo-código **PlantUML**, dentro de bloques de código en sus respectivos archivos `.md`. Se pueden visualizar de dos formas:

- **En VS Code:** con la extensión [PlantUML (jebbs)](https://marketplace.visualstudio.com/items?itemName=jebbs.plantuml) — abrir el `.md`, ubicar el cursor dentro del bloque de código y presionar `Alt + D`.
- **En el navegador:** copiando el código entre `@startuml` y `@enduml` y pegándolo en [plantuml.com](https://www.plantuml.com/plantuml/uml/).

## Temas aplicados

- Programación Orientada a Objetos: clases, herencia, encapsulamiento, polimorfismo, clases abstractas
- Manejo de excepciones: try-catch, finally, throw, excepciones estándar y validación de datos
- Arreglos y estructuras de control: for, if-else, switch
- Diagramas UML (clases y secuencia) en notación PlantUML
