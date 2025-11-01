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

## 🖥️ Cómo Ejecutar (Desde Eclipse IDE)

Si deseas ejecutar el proyecto desde el IDE de Eclipse:

1.  Clona el repositorio en tu máquina.
2.  Abre Eclipse.
3.  Ve a `File` > `Import...`.
4.  Selecciona `Gradle` > `Existing Gradle Project` y haz clic en `Next`.
5.  En `Project root directory`, selecciona la carpeta del proyecto que clonaste.
6.  Haz clic en `Finish` y espera a que Eclipse (y Gradle) configuren el proyecto.
7.  En el explorador de paquetes (Package Explorer), navega hasta el módulo `desktop`.
8.  Encuentra la clase `DesktopLauncher.java` (debería estar en `desktop/src/main/java/puppy/code/`).
9.  Haz clic derecho en `DesktopLauncher.java` y selecciona `Run As` > `Java Application`.

---

## ⌨️ Controles

* **Flecha Izquierda:** Mover el tarro a la izquierda.
* **Flecha Derecha:** Mover el tarro a la derecha.
