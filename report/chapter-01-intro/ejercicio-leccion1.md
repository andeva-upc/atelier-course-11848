# 📝 EJERCICIO — LECCIÓN 1: ¿Qué es Java y la Programación?
## Curso Java Fundamentals
**Tiempo estimado:** 10-15 minutos
**Herramienta:** Replit o OnlineGDB

---

## 🎯 Objetivo del Reto

Al finalizar este ejercicio, habrás escrito y ejecutado tu primer programa en Java personalizado, y entenderás qué hace cada línea de código básica.

---

## 🛠️ Antes de Empezar

1. Abre tu navegador de internet.
2. Ve a [https://replit.com](https://replit.com) (recomendado) o [https://www.onlinegdb.com/online_java_compiler](https://www.onlinegdb.com/online_java_compiler).
3. Si usas Replit: crea una cuenta gratuita y crea un nuevo proyecto Java llamado `Leccion1`.
4. Si usas OnlineGDB: ya puedes escribir código directamente, sin registro.
5. Abre el archivo `starter-files/Leccion1_HolaMundo.java` de este repositorio para usar como referencia.

---

## 📋 Instrucciones Paso a Paso

### Paso 1 — Escribe la estructura base del programa

En el editor, escribe (o copia) el siguiente código exactamente como está. **Escríbelo tú mismo, no solo lo copies:** la práctica de escribir el código a mano te ayuda a memorizarlo.

```java
public class Main {
    public static void main(String[] args) {

    }
}
```

> 💡 **¿Por qué `public class Main`?** En Replit, el archivo se llama `Main.java`, así que la clase debe llamarse `Main`. Si estás en OnlineGDB, también debería decir `Main` por defecto.

---

### Paso 2 — Tu primer "Hola Mundo"

Dentro de las llaves del método `main`, escribe esta línea:

```java
System.out.println("¡Hola Mundo!");
```

Tu código completo debe verse así:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
}
```

Ahora presiona el botón **"Run"** (verde). Deberías ver en la consola:
```
¡Hola Mundo!
```

✅ **¿Lo ves? ¡Felicitaciones! Acabas de ejecutar tu primer programa Java.**

---

### Paso 3 — Personaliza el mensaje con tu nombre

Cambia el texto dentro de las comillas para que diga tu nombre. Por ejemplo:

```java
System.out.println("¡Hola, me llamo Ana García!");
```

Reemplaza `Ana García` con tu nombre real. Ejecuta el programa de nuevo.

---

### Paso 4 — Agrega más líneas de texto

Añade dos líneas más debajo de la primera. El resultado final debe tener al menos 4 líneas impresas. Escribe algo que te describa. Por ejemplo:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, me llamo Ana García!");
        System.out.println("Tengo 15 años y vivo en Lima.");
        System.out.println("Estoy aprendiendo Java.");
        System.out.println("¡Me emociona aprender a programar!");
    }
}
```

Ejecuta el programa y verifica que las 4 líneas aparecen en la consola, una debajo de la otra.

---

### Paso 5 — Experimenta con errores (a propósito)

Este paso es importante: **¡vamos a romper el código a propósito!** Esto te enseñará a reconocer errores.

**Prueba 1:** Quita el punto y coma `;` del final de una línea y ejecuta. ¿Qué mensaje aparece?

```java
System.out.println("¡Hola, me llamo Ana García!")  // <-- sin punto y coma
```

**Prueba 2:** Quita una comilla `"` del texto y ejecuta. ¿Qué pasa?

**Prueba 3:** Cambia `println` por `PRINTLN` (mayúsculas) y ejecuta. ¿Java distingue mayúsculas de minúsculas?

> 📌 **Toma nota mental:** Java es sensible a mayúsculas y minúsculas. `println` y `PRINTLN` son cosas completamente diferentes para Java.

Cuando termines de experimentar, vuelve a corregir el código para que funcione correctamente.

---

### Paso 6 — Agrega un separador visual

En Java puedes imprimir cualquier texto, incluyendo líneas de guiones para separar bloques. Añade esta línea al inicio y al final de tu mensaje:

```java
System.out.println("================================");
System.out.println("  MI PRESENTACIÓN EN JAVA");
System.out.println("================================");
System.out.println("¡Hola, me llamo Ana García!");
System.out.println("Tengo 15 años y vivo en Lima.");
System.out.println("Estoy aprendiendo Java.");
System.out.println("================================");
```

---

## ✅ Criterios de Éxito

Tu ejercicio está completo cuando:

| Criterio | ¿Lo cumpliste? |
|----------|----------------|
| El programa compila y ejecuta sin errores | ☐ |
| Aparece al menos tu nombre en pantalla | ☐ |
| Hay al menos 4 líneas de texto impresas | ☐ |
| Probaste qué pasa cuando quitas un `;` | ☐ |
| El código tiene la estructura: `public class Main { ... }` | ☐ |

---

## 💡 Preguntas para Reflexionar

Responde estas preguntas en tu mente o en un cuaderno:

1. ¿Qué crees que pasaría si pusieras `System.out.println` sin el texto entre comillas?
2. ¿Por qué crees que Java necesita que cada instrucción termine con `;`?
3. ¿Puedes pensar en algún programa del mundo real que use el concepto de "imprimir texto en pantalla"?

---

## 🌟 Desafío Extra (Opcional)

Si terminaste rápido y quieres ir más allá:

Escribe un programa que imprima un dibujo hecho con texto. Por ejemplo, un árbol de navidad:

```
    *
   ***
  *****
 *******
    |
```

Cada fila es un `System.out.println` diferente. ¡Sé creativo!

---

### Solución para la descripción del video:
```java
// Respuesta a la Tarea para la casa:
public class Arbolito {
    public static void main(String[] args) {
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("    |    ");
    }
}
```

---

*¡Excelente trabajo! En el siguiente ejercicio, aprenderás a guardar datos en variables. 🚀*
