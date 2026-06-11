# 📝 EJERCICIO — LECCIÓN 2: Variables y Tipos de Datos
## Curso Java Fundamentals
**Tiempo estimado:** 10-15 minutos
**Herramienta:** Replit o OnlineGDB

---

## 🎯 Objetivo del Reto

Crear un programa en Java que represente el **perfil de un personaje de videojuego** usando los cuatro tipos de datos básicos: `int`, `double`, `String` y `boolean`.

---

## 🛠️ Antes de Empezar

1. Abre Replit o OnlineGDB.
2. Crea un nuevo proyecto Java (o usa el mismo de la lección anterior, limpiando el contenido).
3. Ten a mano el archivo `starter-files/Leccion2_Variables.java` como referencia.

---

## 📋 Instrucciones Paso a Paso

### Paso 1 — Estructura base

Escribe la estructura básica del programa:

```java
public class Main {
    public static void main(String[] args) {

        // Aquí irá tu código

    }
}
```

---

### Paso 2 — Declara las variables de tu personaje

Dentro del método `main`, declara las siguientes variables. Reemplaza los valores de ejemplo con datos de tu personaje imaginario:

```java
// Tipo String: para guardar texto
String nombre = "NombreDePersonaje";    // ← pon el nombre que quieras
String clase = "Mago";                  // puede ser: Guerrero, Arquero, Mago, etc.
String arma = "Varita mágica";

// Tipo int: para guardar números enteros
int nivel = 10;                         // nivel del personaje (1 al 100)
int vidaMaxima = 200;
int ataqueBase = 45;

// Tipo double: para guardar decimales
double velocidad = 7.5;                 // velocidad de movimiento
double puntajePartida = 4520.75;        // puntaje de la última partida

// Tipo boolean: verdadero o falso
boolean tieneEscudo = true;
boolean estaEnLinea = false;
```

---

### Paso 3 — Muestra el perfil en pantalla

Ahora imprime toda la información de tu personaje usando `System.out.println`. Usa el operador `+` para combinar texto con las variables:

```java
System.out.println("=========================================");
System.out.println("     PERFIL DEL PERSONAJE               ");
System.out.println("=========================================");
System.out.println("Nombre:       " + nombre);
System.out.println("Clase:        " + clase);
System.out.println("Arma:         " + arma);
System.out.println("-----------------------------------------");
System.out.println("Nivel:        " + nivel);
System.out.println("Vida máxima:  " + vidaMaxima + " HP");
System.out.println("Ataque base:  " + ataqueBase + " pts");
System.out.println("Velocidad:    " + velocidad);
System.out.println("Puntaje:      " + puntajePartida);
System.out.println("-----------------------------------------");
System.out.println("¿Tiene escudo?: " + tieneEscudo);
System.out.println("¿En línea?:     " + estaEnLinea);
System.out.println("=========================================");
```

Ejecuta el programa. ¿Ves el perfil completo?

---

### Paso 4 — Simula una batalla (modificar variables)

Después de imprimir el perfil, agrega código que simule que tu personaje recibe daño y luego sube de nivel:

```java
System.out.println("\n--- SIMULANDO BATALLA... ---");

// El personaje recibe 30 puntos de daño
int vidaActual = vidaMaxima;
vidaActual = vidaActual - 30;
System.out.println("Vida después de recibir daño: " + vidaActual + " HP");

// El personaje sube de nivel
nivel = nivel + 1;
System.out.println("¡El personaje subió al nivel " + nivel + "!");

// El ataque base aumenta un 20%
ataqueBase = ataqueBase + 9;  // aprox 20% de 45
System.out.println("Nuevo ataque base: " + ataqueBase + " pts");

// Calcula el porcentaje de vida que le queda
double porcentajeVida = (vidaActual * 100.0) / vidaMaxima;
System.out.println("Porcentaje de vida restante: " + porcentajeVida + "%");
```

---

### Paso 5 — Prueba cambiar los valores

Ahora experimenta:

- Cambia el tipo del personaje a uno diferente (`"Guerrero"`, `"Arquero"`, `"Ninja"`).
- Cambia el nivel inicial a 99 y el nivel máximo de vida a 9999.
- Cambia `tieneEscudo` a `false`. ¿Cambia algo en la salida?
- Intenta declarar dos variables con el mismo nombre. ¿Qué error te da Java?

---

### Paso 6 — Declara una variable con tu información real

Al final del programa, agrega una sección con tus propios datos reales:

```java
System.out.println("\n--- DATOS DEL JUGADOR REAL ---");
String miNombre = "Tu Nombre Aquí";
int miEdad = 15;         // ← tu edad real
String miCiudad = "Lima";
boolean meGustaJava = true;

System.out.println("Jugador: " + miNombre);
System.out.println("Edad:    " + miEdad + " años");
System.out.println("Ciudad:  " + miCiudad);
System.out.println("¿Me gusta Java?: " + meGustaJava);
```

---

## ✅ Criterios de Éxito

| Criterio | ¿Lo cumpliste? |
|----------|----------------|
| Usaste al menos una variable de tipo `int` | ☐ |
| Usaste al menos una variable de tipo `double` | ☐ |
| Usaste al menos una variable de tipo `String` | ☐ |
| Usaste al menos una variable de tipo `boolean` | ☐ |
| Modificaste el valor de al menos una variable durante el programa | ☐ |
| El programa compila y ejecuta sin errores | ☐ |
| La salida está organizada y es fácil de leer | ☐ |

---

## 💡 Preguntas para Reflexionar

1. ¿Por qué Java necesita que especifiques el tipo de la variable al declararla? ¿Qué ventaja tiene eso?
2. ¿Qué pasa si intentas guardar un número con decimales (`3.14`) en una variable de tipo `int`?
3. ¿Puedes pensar en 3 ejemplos de la vida real donde usarías un `boolean`?

---

## 🌟 Desafío Extra (Opcional)

Crea un segundo personaje (con todas sus variables) y calcula cuántos puntos de diferencia hay entre sus puntajes:

```java
double puntajePersonaje1 = 4520.75;
double puntajePersonaje2 = 3980.25;

double diferencia = puntajePersonaje1 - puntajePersonaje2;
System.out.println("Diferencia de puntajes: " + diferencia + " puntos");

if (puntajePersonaje1 > puntajePersonaje2) {
    System.out.println(nombre + " gana la partida.");
} else {
    System.out.println("El segundo personaje gana.");
}
```

*(El `if` lo veremos con detalle en la siguiente lección. Pero puedes adelantar aquí.)*

---

### Solución para la descripción del video:
```java
// Respuesta a la Tarea para la casa:
double puntajePersonaje1 = 4520.75;
double puntajePersonaje2 = 3980.25;
double diferencia = puntajePersonaje1 - puntajePersonaje2;
System.out.println("Diferencia de puntajes: " + diferencia + " puntos");
```

---

*¡Excelente trabajo! En el siguiente ejercicio, aprenderás a tomar decisiones y crear bucles. 🚀*
