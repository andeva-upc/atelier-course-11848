# 🎬 GUION — LECCIÓN 4: Métodos y Entrada/Salida con Scanner
## Curso Java Fundamentals
**Duración estimada:** 10 minutos de lectura pausada
**Herramienta:** Replit o OnlineGDB (sin instalación)

---

> ### 📋 NOTAS PARA EL PONENTE
> - La analogía de las "recetas reutilizables" o los "electrodomésticos" funciona muy bien para los métodos.
> - Cuando presentes `Scanner`, sé muy claro en los pasos: importar, crear, usar, cerrar.
> - Haz énfasis en que el programa "se pausa" esperando que el usuario escriba algo. Muéstralo en vivo.
> - Si usas Replit, asegúrate de hacer clic en la consola antes de escribir la entrada del usuario.
> - En OnlineGDB, muestra cómo aparece el campo de "stdin" para ingresar datos.
> - Cuando expliques retorno de valores, usa la analogía de una máquina expendedora.

---

## 🟢 PARTE 1 — BIENVENIDA Y REPASO (aprox. 45 segundos)

---

¡Hola de nuevo! Bienvenidos a la Lección 4 de Java Fundamentals.

En la lección anterior aprendimos a controlar el flujo de nuestros programas: `if/else` para decidir, y `for` y `while` para repetir. ¡Sus programas ya piensan!

Hoy vamos a dar un paso enorme: aprenderemos a **organizar nuestro código** con métodos y a hacer que nuestros programas **escuchen al usuario** para recibir información desde el teclado.

Esto es clave, porque hasta ahora todo lo que hemos hecho es con datos que nosotros escribimos en el código. A partir de hoy, el programa puede preguntarle cosas al usuario y usar sus respuestas. ¡Eso lo hace mucho más dinámico! ¡Empecemos!

---

## 🟡 PARTE 2 — TEORÍA: ¿Qué es un Método? (aprox. 2 minutos 30 segundos)

---

Piensen en una cafetera. Tienen una cafetera en casa, y cada vez que quieren café, no necesitan entender el proceso interno: cuánta agua calienta, a qué temperatura, cuánto tiempo demora. Solo presionan el botón y la cafetera hace su trabajo.

Un **método** en Java funciona exactamente igual. Es un **bloque de código que tiene un nombre, hace una tarea específica y puede ser llamado (invocado) cuando lo necesites**, sin tener que reescribir todo el código de esa tarea.

¿Por qué son importantes los métodos? Por cuatro razones fundamentales:

1. **Reutilización:** Escribes el código una sola vez y lo usas cuantas veces necesites.
2. **Organización:** Divides un problema grande en partes pequeñas y manejables.
3. **Legibilidad:** El código es más fácil de leer cuando cada tarea tiene su nombre.
4. **Mantenimiento:** Si hay un error, solo lo arreglas en un lugar, no en cada lugar donde lo copiaste.

De hecho, ya conocen un método: el método `main`. Ese es el método especial que Java busca para iniciar el programa. Pero nosotros podemos crear nuestros propios métodos.

La estructura de un método en Java es:

```
modificador  tipo_retorno  nombre_método(parámetros) {
    // código del método
    return valor;   // solo si el tipo_retorno no es void
}
```

Vamos a diseccionar eso:

- **Modificador:** Por ahora siempre usaremos `public static`. `public` significa que puede ser llamado desde cualquier parte, y `static` significa que pertenece a la clase, no a un objeto. (Los objetos los veremos en la próxima lección.)
- **Tipo de retorno:** ¿Qué devuelve el método cuando termina? Si no devuelve nada, escribimos `void` (vacío). Si devuelve un número entero, escribimos `int`. Si devuelve texto, `String`, etc.
- **Nombre del método:** El nombre que le daremos para llamarlo. Por convención, empieza con minúscula y usa camelCase (primeraPalabraMinuscula, SiguientesMayuscula).
- **Parámetros:** La información que le enviamos al método para que trabaje. Pueden ser cero o más parámetros.

---

## 🟠 PARTE 3 — TIPOS DE MÉTODOS (aprox. 1 minuto 30 segundos)

---

Hay dos grandes tipos de métodos:

### Métodos `void` — no devuelven nada

Como la cafetera que solo hace café. No te da nada de vuelta; solo ejecuta su tarea.

```java
public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "!");
    System.out.println("Bienvenido al curso.");
}
```

Para llamar a este método desde el `main`, escribimos:

```java
saludar("Carlos");
saludar("María");
```

### Métodos con retorno — devuelven un valor

Como una máquina expendedora: le metes monedas (parámetros), presionas el botón (llamas al método), y te devuelve una bebida (el valor de retorno).

```java
public static int sumar(int a, int b) {
    int resultado = a + b;
    return resultado;
}
```

Para llamar a este método y usar su resultado:

```java
int total = sumar(10, 25);
System.out.println("La suma es: " + total);
```

La palabra clave `return` le dice al método: "Tu trabajo aquí terminó. Devuelve este valor a quien te llamó."

---

## 🔵 PARTE 4 — ENTRADA DE DATOS: La clase Scanner (aprox. 2 minutos)

---

Hasta ahora, todos los datos en nuestros programas los escribíamos nosotros directamente en el código. Pero los programas reales reciben información del usuario en tiempo real.

Para eso en Java usamos la clase **`Scanner`**. Es una herramienta que ya viene incluida en Java y que nos permite leer lo que el usuario escribe en el teclado.

Para usarla, hay cuatro pasos:

**Paso 1 — Importar la herramienta:**
Al inicio del archivo, antes de la clase, escribe:
```java
import java.util.Scanner;
```

Esto le dice a Java: "Necesito usar la herramienta Scanner que está guardada en el paquete `java.util`." Piensen en `import` como cuando van al almacén a buscar un ingrediente antes de cocinar.

**Paso 2 — Crear el objeto Scanner:**
Dentro del método `main`, crea una instancia de Scanner así:
```java
Scanner teclado = new Scanner(System.in);
```

Aquí: `teclado` es el nombre que le damos a nuestra herramienta, y `System.in` le dice que lea del teclado (la entrada estándar).

**Paso 3 — Leer los datos:**
Usa el Scanner para leer diferentes tipos de datos:
```java
String texto = teclado.nextLine();    // lee una línea de texto completa
int numero = teclado.nextInt();       // lee un número entero
double decimal = teclado.nextDouble(); // lee un número decimal
```

**Paso 4 — Cerrar el Scanner:**
Cuando termines de usarlo:
```java
teclado.close();
```

---

## 🟢 PARTE 5 — DEMO PRÁCTICA COMPLETA (aprox. 2 minutos 30 segundos)

---

*[NOTA PONENTE: Escribe este código completo desde cero en el editor, línea por línea.]*

Vamos a crear un programa que le haga preguntas al usuario y le dé una respuesta personalizada. Este es el programa más interactivo que hemos hecho hasta ahora.

```java
import java.util.Scanner;

public class Main {

    // Método 1: saludar al usuario
    public static void saludar(String nombre) {
        System.out.println("-----------------------------");
        System.out.println("¡Hola, " + nombre + "! 👋");
        System.out.println("Bienvenido al Quiz de Java.");
        System.out.println("-----------------------------");
    }

    // Método 2: evaluar el puntaje
    public static String evaluarNivel(int puntaje) {
        if (puntaje >= 90) {
            return "¡MAESTRO JAVA! 🏆";
        } else if (puntaje >= 70) {
            return "¡Muy bien! Nivel Avanzado ⭐";
        } else if (puntaje >= 50) {
            return "Bien. Nivel Intermedio 👍";
        } else {
            return "Principiante. ¡Sigue practicando! 📚";
        }
    }

    // Método 3: calcular nota sobre 20
    public static double convertirNota(int puntaje) {
        return (puntaje * 20.0) / 100;
    }

    // Método principal
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = teclado.nextLine();

        saludar(nombre);

        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();

        System.out.print("¿Cuál fue tu puntaje en el quiz? (0-100): ");
        int puntaje = teclado.nextInt();

        String nivel = evaluarNivel(puntaje);
        double nota = convertirNota(puntaje);

        System.out.println("\n=== TUS RESULTADOS ===");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Edad:       " + edad + " años");
        System.out.println("Puntaje:    " + puntaje + "/100");
        System.out.println("Nota:       " + nota + "/20");
        System.out.println("Nivel:      " + nivel);
        System.out.println("======================");

        teclado.close();

    }
}
```

*[NOTA PONENTE: Ejecuta el programa. En Replit, haz clic en la consola y escribe los datos cuando el programa los pida. Muestra cómo el programa "espera" que el usuario escriba algo antes de continuar.]*

¿Ven cómo el programa se detiene y espera que escriban el nombre, la edad y el puntaje? Eso lo hace `teclado.nextLine()` y `teclado.nextInt()`. Y luego usa esos datos en los métodos `evaluarNivel` y `convertirNota` para darte un resultado personalizado.

¡Eso es interactividad! El programa ya no es solo una pantalla que muestra cosas fijas: ahora **responde** a lo que el usuario ingresa.

---

## 🟣 PARTE 6 — RESUMEN Y CONCEPTOS CLAVE (aprox. 45 segundos)

---

Repasemos lo que aprendimos hoy:

✅ Un **método** es un bloque de código con nombre que realiza una tarea específica y puede ser reutilizado.

✅ Los métodos `void` ejecutan una tarea **sin devolver** ningún valor.

✅ Los métodos con retorno devuelven un valor usando la palabra clave `return`.

✅ Los parámetros son los **datos que le pasas** al método para que trabaje.

✅ Para leer datos del teclado usamos la clase **`Scanner`** en cuatro pasos: importar, crear, leer, cerrar.

✅ `teclado.nextLine()` lee texto, `teclado.nextInt()` lee enteros, `teclado.nextDouble()` lee decimales.

---

## ⭐ PARTE 7 — DESPEDIDA Y PRÓXIMA LECCIÓN (aprox. 30 segundos)

---

¡Increíble trabajo! Sus programas ahora pueden **conversar** con el usuario y organizar el código de forma elegante usando métodos.

En la próxima lección —la quinta— daremos un salto conceptual muy emocionante: aprenderemos **Programación Orientada a Objetos.** Crearemos nuestras propias clases para modelar cosas del mundo real, como mascotas, personajes de juegos o productos de una tienda.

Como tarea para la casa, intenten modificar la calculadora de nuestro ejercicio para que funcione con un menú interactivo usando un bucle `while`. Que pregunte qué operación hacer hasta que el usuario decida salir. ¡La solución estará en la descripción del video!

¡Los espero en la Lección 5! ☕🚀
