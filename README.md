# 🎮 Proyecto GameLluvia (LibGDX)

Este es un sencillo juego 2D desarrollado en Java con el framework LibGDX. El proyecto es una versión modificada y ampliada del tutorial "Drop" de LibGDX, creado como parte de un avance de proyecto académico.

## 🕹️ Descripción del Juego

El jugador controla un tarro en la parte inferior de la pantalla. El objetivo es recolectar la mayor cantidad de **gotas buenas** (transparentes) para sumar puntos, mientras se esquivan las **gotas malas** (rojas) que restan vidas.

El juego termina cuando el jugador pierde sus 3 vidas.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java
* **Framework:** LibGDX
* **Build Tool:** Gradle

## 📋 Prerrequisitos

Para poder compilar y ejecutar este proyecto, necesitarás:

* Java Development Kit (JDK), versión 11 o superior.
* Git (para clonar el repositorio).

Instrucciones rápidas para ejecutar el juego desde la línea de comandos.

-Clona el repositorio: git clone https://github.com/Sebadrizzy/GameLluvia

## 🚀 Cómo Ejecutar (Para Windows)

1.  Abre una terminal (CMD o PowerShell).

2.  Navega hasta la carpeta donde tienes el proyecto.
    ```bash
    cd [ruta-donde-esta-el-juego]
    ```
    *(Por ejemplo: `cd C:\Users\TuNombre\Desktop\GameLluvia2024`)*

3.  Una vez dentro de la carpeta, ejecuta el siguiente comando para iniciar el juego:
    ```bash
    gradlew.bat lwjgl3:run
    ```

El juego compilará (la primera vez puede tardar un poco) y se ejecutará en una nueva ventana.

---

## 🍏 (Opcional) Para macOS / Linux

Si usas macOS o Linux, los comandos son los mismos, pero cambia el archivo `.bat` por `./gradlew`:

bash
cd [ruta-donde-esta-el-juego]
./gradlew lwjgl3:run

## ⌨️ Controles

* **Flecha Izquierda:** Mover el tarro a la izquierda.
* **Flecha Derecha:** Mover el tarro a la derecha.
