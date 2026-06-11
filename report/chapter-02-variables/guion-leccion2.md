# 🎬 GUION — LECCIÓN 2: Variables y Tipos de Datos
## Curso Java Fundamentals
**Duración estimada:** 10 minutos de lectura pausada
**Herramienta:** Replit o OnlineGDB (sin instalación)

---

> ### 📋 NOTAS PARA EL PONENTE
> - Recapitula brevemente la lección anterior al inicio (30 segundos máximo).
> - Usa la analogía de las "cajas etiquetadas" durante toda la lección. Es muy visual e intuitiva.
> - Cuando declares variables, **pronuncia** en voz alta el tipo de dato, el nombre y el valor. "int... espacio... edad... igual... quince... punto y coma."
> - Haz pausas cuando pidas que el estudiante piense en ejemplos propios.
> - Ten el código del archivo `Leccion2_Variables_Final.java` listo para mostrarlo como referencia al final.

---

## 🟢 PARTE 1 — BIENVENIDA Y REPASO (aprox. 1 minuto)

---

¡Hola de nuevo! Bienvenidos de vuelta a Java Fundamentals.

En la lección anterior, escribimos nuestro primer programa. ¿Lo recuerdan? Usamos `System.out.println` para imprimir texto en la pantalla. Eso fue el comienzo.

Pero si solo pudiéramos imprimir texto fijo, nuestros programas serían muy limitados. Imaginen una aplicación que siempre dice lo mismo, sin importar quién la usa. Aburrido, ¿verdad?

Hoy vamos a aprender algo que cambia todo: **las variables.** Con variables, nuestros programas podrán guardar información, cambiarla y usarla de formas dinámicas.

Esta es la lección más importante de las bases de Java, porque **todo lo que hagamos de aquí en adelante usa variables.** Así que pongan mucha atención. ¡Empecemos!

---

## 🟡 PARTE 2 — TEORÍA: ¿Qué es una Variable? (aprox. 2 minutos)

---

Piensen en esto: están en su cuarto, y tienen que guardar sus cosas. ¿Qué usan?

Cajones. Cajas. Estantes. Cada cajón tiene una etiqueta: "ropa", "zapatos", "libros"... Y dentro de cada cajón, solo va el tipo de cosa que indica la etiqueta.

Una **variable** funciona exactamente igual. Es un **cajón en la memoria de la computadora** donde guardamos información. Ese cajón tiene:

1. **Un tipo:** ¿qué clase de información cabe aquí? ¿Un número? ¿Un texto? ¿Verdadero o falso?
2. **Un nombre:** la etiqueta del cajón, para que podamos encontrarlo después.
3. **Un valor:** lo que está guardado dentro del cajón en este momento.

Y aquí viene algo fascinante: la palabra "variable" viene de "variar". Es decir, el contenido del cajón **puede cambiar** a lo largo del programa. Puedes guardar el número 5, y luego cambiarlo a 10.

Ahora, en Java, los cajones son estrictos. Si dices que un cajón es "para números enteros", no puedes meter texto ahí. Si dices que es "para texto", no puedes meter un número decimal. Esta característica se llama **tipado fuerte**, y Java la usa para evitar errores y hacer los programas más seguros.

---

## 🟠 PARTE 3 — LOS TIPOS DE DATOS BÁSICOS (aprox. 2 minutos 30 segundos)

---

En Java, hay varios tipos de cajones. Hoy vamos a conocer los cuatro más importantes:

### Tipo 1: `int` — Números enteros

`int` viene de "integer", que en inglés significa "entero". Este cajón guarda números **sin decimales**: positivos, negativos o el cero.

```
int edad = 15;
int puntaje = 1500;
int temperatura = -3;
```

Úsalo cuando necesitas contar cosas: edades, puntuaciones, años, cantidad de vidas en un videojuego.

---

### Tipo 2: `double` — Números con decimales

Cuando necesitas mayor precisión —como precios, estaturas o promedios— usamos `double`. El nombre viene de "double precision floating point", que básicamente significa que puede guardar números muy grandes o muy pequeños con decimales.

```
double estatura = 1.72;
double precio = 29.99;
double promedio = 16.5;
```

> **Truco:** En Java, los decimales se escriben con **punto**, no con coma. No `16,5` sino `16.5`.

---

### Tipo 3: `String` — Texto

Un `String` (se pronuncia "string") guarda texto: palabras, frases, oraciones completas. El texto siempre va entre **comillas dobles**.

```
String nombre = "Alejandro";
String saludo = "¡Hola Mundo!";
String ciudad = "Lima";
```

¿Por qué se llama "String"? Porque en inglés, "string" significa "cadena", y un texto es como una cadena de letras enlazadas una tras otra.

---

### Tipo 4: `boolean` — Verdadero o Falso

Este es el más sencillo de todos: solo puede tener **dos valores posibles**: `true` (verdadero) o `false` (falso). Sin comillas, en minúsculas.

```
boolean meGustaJava = true;
boolean tengoMascota = false;
boolean esMayorDeEdad = true;
```

Los booleanos son increíblemente útiles para tomar decisiones en el programa. Los usaremos mucho cuando aprendamos condicionales.

---

## 🔵 PARTE 4 — DEMO PRÁCTICA (aprox. 3 minutos)

---

¡Ahora sí, manos al teclado! Vamos a escribir un programa completo usando los cuatro tipos de datos.

*[NOTA PONENTE: Escribe el código lentamente en el editor, línea por línea, explicando cada una.]*

Vamos a crear el **perfil de un jugador de videojuego**. Escribamos esto en el editor:

```java
public class Main {
    public static void main(String[] args) {

        // Datos del jugador
        String nombre = "Jugador1";
        int edad = 15;
        double puntaje = 9875.50;
        boolean esCampeon = true;

        // Mostrar el perfil
        System.out.println("====== PERFIL DEL JUGADOR ======");
        System.out.println("Nombre:    " + nombre);
        System.out.println("Edad:      " + edad + " años");
        System.out.println("Puntaje:   " + puntaje);
        System.out.println("¿Campeón?: " + esCampeon);
        System.out.println("================================");

    }
}
```

*[NOTA PONENTE: Ejecuta el código y muestra el resultado. Señala cómo el signo `+` une texto con variables.]*

¿Ven el signo `+`? Aquí no significa suma matemática. Cuando lo usamos entre comillas y variables, significa **concatenar**, que quiere decir "pegar juntos" el texto con el valor de la variable.

Entonces `"Nombre: " + nombre` produce: `Nombre: Jugador1`.

Ahora hagamos algo más interesante. Vamos a **modificar el valor de una variable** en medio del programa:

```java
int puntaje = 100;
System.out.println("Puntaje inicial: " + puntaje);

puntaje = puntaje + 500;   // ganamos 500 puntos
System.out.println("Después de ganar 500 puntos: " + puntaje);

puntaje = puntaje - 200;   // perdemos 200 puntos
System.out.println("Después de perder 200 puntos: " + puntaje);
```

*[NOTA PONENTE: Ejecuta y muestra cómo cambia el valor.]*

¿Lo ven? La variable `puntaje` empezó con 100, luego subió a 600, luego bajó a 400. ¡El cajón cambió de contenido! Eso es exactamente lo que hace a las variables poderosas.

También podemos hacer operaciones matemáticas con variables de tipo `int` y `double`:

```java
int a = 10;
int b = 3;

System.out.println("Suma:  " + (a + b));    // 13
System.out.println("Resta: " + (a - b));    // 7
System.out.println("Multi: " + (a * b));    // 30
System.out.println("Div:   " + (a / b));    // 3 (¡ojo! división entera)
```

*[NOTA PONENTE: Resalta el resultado de la división: 10/3 da 3, no 3.33. Explica la división entera brevemente.]*

Noten algo curioso: `10 / 3` da `3`, no `3.33`. Esto es porque estamos dividiendo dos `int`, y Java hace **división entera**: descarta el decimal. Si quieren el decimal, deben usar `double`:

```java
double x = 10.0;
double y = 3.0;
System.out.println("División exacta: " + (x / y));   // 3.3333...
```

---

## 🟣 PARTE 5 — RESUMEN Y CONCEPTOS CLAVE (aprox. 45 segundos)

---

Perfecto, hagamos el resumen de la lección:

✅ Una **variable** es un espacio en la memoria de la computadora con un nombre, un tipo y un valor.

✅ Los cuatro tipos básicos son:
- `int` → números enteros
- `double` → números con decimales
- `String` → texto (siempre entre comillas dobles)
- `boolean` → solo `true` o `false`

✅ Para **declarar** una variable: escribes el tipo, el nombre, el signo `=` y el valor, terminando con `;`.

✅ Puedes **cambiar** el valor de una variable asignándole uno nuevo.

✅ El signo `+` entre texto y variables **une** (concatena) el texto con el valor de la variable.

---

## ⭐ PARTE 6 — DESPEDIDA Y PRÓXIMA LECCIÓN (aprox. 15 segundos)

---

¡Excelente trabajo hoy! Han aprendido a guardar información en variables, que es la base de absolutamente todo lo que viene después.

En la próxima lección, aprenderemos a **tomar decisiones** en nuestros programas con `if` y a repetir acciones con bucles `for` y `while`.

Antes de irnos, les dejo una tarea para la casa: creen un segundo personaje completo con sus variables de vida, ataque y puntaje, y calculen la diferencia de puntajes entre los dos personajes. ¡La solución estará en la descripción del video!

¡Hasta la próxima lección! ☕🚀
