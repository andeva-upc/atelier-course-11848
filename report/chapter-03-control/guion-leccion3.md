# 🎬 GUION — LECCIÓN 3: Estructuras de Control
## Curso Java Fundamentals
**Duración estimada:** 10 minutos de lectura pausada
**Herramienta:** Replit o OnlineGDB (sin instalación)

---

> ### 📋 NOTAS PARA EL PONENTE
> - La analogía del semáforo funciona muy bien para `if/else`. Úsala desde el principio.
> - Para los bucles, usa la analogía de repetir una tarea (lavar platos, escribir la tabla del 2).
> - Cuando escribas el bucle `for`, lee en voz alta: "Para i igual a uno, mientras i sea menor o igual a diez, incrementa i en uno."
> - Haz énfasis en el operador módulo `%` — es nuevo para la mayoría y muy útil.
> - Ten cuidado con el bucle infinito: muéstralo brevemente pero termínalo rápido con Ctrl+C o "Stop".

---

## 🟢 PARTE 1 — BIENVENIDA Y REPASO (aprox. 45 segundos)

---

¡Bienvenidos de vuelta! Aquí estamos, Lección 3 de Java Fundamentals.

En la lección pasada aprendimos a guardar información en variables: texto con `String`, números enteros con `int`, decimales con `double` y verdadero/falso con `boolean`. ¡Eso fue fundamental!

Hoy vamos a aprender algo que lleva nuestros programas a un nivel completamente nuevo: **las estructuras de control.** Con estas herramientas, nuestros programas van a poder **tomar decisiones** y **repetir acciones.** ¡Vamos!

---

## 🟡 PARTE 2 — TEORÍA: ¿Qué son las Estructuras de Control? (aprox. 1 minuto 30 segundos)

---

Imaginen que están manejando un automóvil. Llegan a un cruce con semáforo.

Si el semáforo está en **verde**, siguen adelante.
Si está en **rojo**, se detienen.
Si está en **amarillo**, reducen la velocidad.

Eso es exactamente lo que hace una **estructura de control** en programación: le da a nuestro programa la capacidad de **evaluar una situación y decidir qué hacer.**

Sin estructuras de control, un programa siempre haría lo mismo, de la misma manera, sin importar las circunstancias. Imaginen una aplicación bancaria que no puede verificar si tienes saldo suficiente antes de hacer una transferencia. ¡Sería un desastre!

Las estructuras de control se dividen en dos grandes grupos:

1. **Condicionales:** Toman una decisión. Hacen A o hacen B dependiendo de si algo es verdadero o falso.
2. **Bucles (o ciclos):** Repiten una acción múltiples veces, mientras se cumpla una condición.

Hoy veremos los tres más importantes de Java: `if/else`, `for` y `while`.

---

## 🟠 PARTE 3 — CONDICIONALES: `if` y `else` (aprox. 2 minutos)

---

El condicional `if` en español significa "si". Su estructura es así:

```
si (condición es verdadera) {
    haz esto
} si no {
    haz esto otro
}
```

En Java, eso se escribe así:

```java
if (condicion) {
    // código que se ejecuta si la condición es verdadera
} else {
    // código que se ejecuta si la condición es falsa
}
```

¿Qué puede ir como condición? Cualquier cosa que pueda ser verdadera o falsa. Para eso usamos los **operadores de comparación**:

| Operador | Significado | Ejemplo |
|----------|-------------|---------|
| `==` | igual a | `edad == 15` |
| `!=` | diferente de | `nombre != "Pedro"` |
| `>` | mayor que | `puntaje > 100` |
| `<` | menor que | `temperatura < 0` |
| `>=` | mayor o igual que | `edad >= 18` |
| `<=` | menor o igual que | `nivel <= 5` |

*[NOTA PONENTE: Señala el doble igual `==`. Es un error muy común usar solo `=`.]*

¡Atención! Para comparar en Java se usa **doble igual `==`**, no simple. El `=` sencillo es para asignar un valor a una variable. Si escribes `if (edad = 15)`, Java te dará un error. Siempre: `if (edad == 15)`.

Ejemplo práctico:

```java
int edad = 15;

if (edad >= 18) {
    System.out.println("Eres mayor de edad. Puedes votar.");
} else {
    System.out.println("Eres menor de edad. ¡Pero ya programas en Java!");
}
```

También podemos agregar más de dos opciones con `else if`:

```java
int nota = 14;

if (nota >= 18) {
    System.out.println("¡Excelente! Obtuviste A.");
} else if (nota >= 14) {
    System.out.println("¡Muy bien! Obtuviste B.");
} else if (nota >= 11) {
    System.out.println("Aprobado. Obtuviste C.");
} else {
    System.out.println("Desaprobado. ¡A estudiar más!");
}
```

---

## 🔵 PARTE 4 — BUCLES: `for` y `while` (aprox. 2 minutos 30 segundos)

---

Los bucles son la herramienta para **repetir** algo. Piensen en esto: si quieren imprimir los números del 1 al 100, ¿escribirían 100 líneas de `System.out.println`? Claro que no. Para eso existen los bucles.

### El bucle `for`

El bucle `for` es perfecto cuando **sabes de antemano cuántas veces** quieres repetir algo. Su estructura es:

```java
for (inicio; condición; actualización) {
    // código a repetir
}
```

Tiene tres partes separadas por punto y coma:
- **Inicio:** dónde empieza el contador. Ejemplo: `int i = 1` (empezamos en 1).
- **Condición:** hasta dónde repetimos. Ejemplo: `i <= 10` (mientras i sea menor o igual a 10).
- **Actualización:** cómo avanzamos. Ejemplo: `i++` (incrementamos i en 1 cada vuelta).

Ejemplo:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Vuelta número: " + i);
}
```

Esto imprime:
```
Vuelta número: 1
Vuelta número: 2
Vuelta número: 3
Vuelta número: 4
Vuelta número: 5
```

### El operador módulo `%`

Antes del siguiente ejemplo, necesitan conocer este operador. El símbolo `%` calcula el **residuo** de una división. Por ejemplo:

- `10 % 3 = 1` (10 dividido entre 3 da 3, con residuo 1)
- `8 % 2 = 0` (8 dividido entre 2 da 4, sin residuo)
- `7 % 2 = 1` (7 dividido entre 2 da 3, con residuo 1)

Si el residuo de dividir un número entre 2 es **cero**, el número es **par**. Si es **uno**, es **impar**. Genial, ¿verdad?

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        System.out.println(i + " es PAR");
    } else {
        System.out.println(i + " es IMPAR");
    }
}
```

### El bucle `while`

El bucle `while` es perfecto cuando **no sabes de antemano** cuántas veces repetirás algo. Solo sabes que debes continuar mientras una condición sea verdadera.

```java
int contador = 5;

while (contador >= 1) {
    System.out.println(contador + "...");
    contador--;    // ¡esto es esencial! Si no decrementamos, el bucle nunca termina
}

System.out.println("¡DESPEGUE! 🚀");
```

*[NOTA PONENTE: Explica qué pasaría sin el `contador--`: bucle infinito. Puedes mostrarlo brevemente y luego detenerlo.]*

**¡Advertencia importante!** Siempre asegúrate de que la condición del `while` eventualmente se vuelva falsa. Si no, el programa correrá para siempre, lo que llamamos un **bucle infinito**. Si te pasa, en Replit presionas el botón "Stop" para detenerlo.

---

## 🔵 PARTE 5 — DEMO PRÁCTICA INTEGRADA (aprox. 2 minutos)

---

*[NOTA PONENTE: Escribe el siguiente código completo en el editor y ejecútalo.]*

Vamos a unir todo en un programa divertido: un clasificador de puntuaciones de videojuego.

```java
public class Main {
    public static void main(String[] args) {

        System.out.println("=== TABLA DE PUNTUACIONES ===");

        for (int ronda = 1; ronda <= 5; ronda++) {
            int puntos = ronda * 150;   // puntuación de cada ronda

            System.out.print("Ronda " + ronda + " - Puntos: " + puntos + " → ");

            if (puntos >= 600) {
                System.out.println("¡MAESTRO! 🏆");
            } else if (puntos >= 400) {
                System.out.println("¡Experto! ⭐");
            } else if (puntos >= 200) {
                System.out.println("Intermedio 👍");
            } else {
                System.out.println("Principiante 📚");
            }
        }

        System.out.println("=== FIN DEL JUEGO ===");

    }
}
```

*[NOTA PONENTE: Ejecuta el programa y muestra la salida. Señala cómo el `for` repite el `if` dentro de él.]*

¿Notaron que el `if` está **dentro** del `for`? Eso se llama **anidar** una estructura dentro de otra. En Java puedes anidar lo que necesites: `for` dentro de `if`, `if` dentro de `while`, `for` dentro de `for`... el poder es enorme.

---

## 🟣 PARTE 6 — RESUMEN Y CONCEPTOS CLAVE (aprox. 45 segundos)

---

Repasemos lo de hoy:

✅ Las **estructuras de control** le dan a un programa la capacidad de tomar decisiones y repetir acciones.

✅ `if / else if / else` → Condicional. Evalúa si algo es verdadero o falso y actúa en consecuencia.

✅ Los **operadores de comparación** son: `==`, `!=`, `>`, `<`, `>=`, `<=`.

✅ El operador `%` calcula el **residuo** de una división. Útil para saber si un número es par o impar.

✅ `for` → Bucle ideal cuando sabes cuántas veces repetir algo.

✅ `while` → Bucle ideal cuando repites mientras una condición sea verdadera.

✅ ¡Siempre asegúrate de que un bucle `while` tenga una forma de terminar!

---

## ⭐ PARTE 7 — DESPEDIDA Y PRÓXIMA LECCIÓN (aprox. 30 segundos)

---

¡Fantástico! Con lo de hoy, sus programas ya pueden tomar decisiones y repetirse. Eso los hace mucho más inteligentes y útiles.

En la próxima lección, aprenderemos sobre **métodos**: cómo crear bloques de código reutilizables para que no tengamos que escribir lo mismo una y otra vez. También aprenderemos a leer datos que el usuario escribe en el teclado.

Su tarea para la casa es: crear un programa que imprima una escalera de asteriscos usando dos bucles for, uno dentro de otro. ¡La solución estará en la descripción del video!

¡Los espero en la Lección 4! ☕🚀
