# 📝 EJERCICIO — LECCIÓN 4: Métodos y Entrada/Salida con Scanner
## Curso Java Fundamentals
**Tiempo estimado:** 15-20 minutos
**Herramienta:** Replit o OnlineGDB

---

## 🎯 Objetivo del Reto

Crear una **calculadora interactiva** con métodos reutilizables que lea los números del usuario y realice operaciones matemáticas básicas, mostrando los resultados con formato amigable.

---

## 🛠️ Antes de Empezar

1. Abre Replit o OnlineGDB.
2. Crea un nuevo proyecto Java.
3. Revisa el archivo `starter-files/Leccion4_Metodos.java` como punto de partida.
4. Recuerda: debes agregar `import java.util.Scanner;` en la primera línea del archivo.

---

## 📋 Instrucciones Paso a Paso

### Paso 1 — Importa Scanner y crea la estructura base

```java
import java.util.Scanner;

public class Main {

    // Aquí irán los métodos

    public static void main(String[] args) {
        // Aquí irá el programa principal
    }
}
```

---

### Paso 2 — Crea el método `saludar`

**Fuera** del método `main` pero **dentro** de la clase `Main`, crea este método:

```java
public static void saludar(String nombre) {
    System.out.println("============================================");
    System.out.println("  ¡Hola, " + nombre + "! 👋");
    System.out.println("  Bienvenido a tu Calculadora Java");
    System.out.println("============================================");
}
```

> ⚠️ **Importante:** Los métodos van en el mismo nivel que el método `main`, no dentro de él. Ambos son "hermanos" dentro de la clase.

---

### Paso 3 — Crea los métodos de operaciones matemáticas

Agrega estos cuatro métodos a tu clase:

```java
// Suma dos números y devuelve el resultado
public static double sumar(double a, double b) {
    return a + b;
}

// Resta dos números y devuelve el resultado
public static double restar(double a, double b) {
    return a - b;
}

// Multiplica dos números y devuelve el resultado
public static double multiplicar(double a, double b) {
    return a * b;
}

// Divide dos números (con verificación de división por cero)
public static double dividir(double a, double b) {
    if (b == 0) {
        System.out.println("⚠️ Error: No se puede dividir entre cero.");
        return 0;
    } else {
        return a / b;
    }
}
```

---

### Paso 4 — Crea el método `mostrarResultado`

Este método recibe el nombre de la operación y el resultado, y lo muestra con formato bonito:

```java
public static void mostrarResultado(String operacion, double resultado) {
    System.out.println("  → " + operacion + " = " + resultado);
}
```

---

### Paso 5 — Completa el método `main`

Ahora en el método `main`, usa `Scanner` para leer los datos del usuario y llama a todos los métodos:

```java
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    // Pedir nombre
    System.out.print("¿Cuál es tu nombre? ");
    String nombre = teclado.nextLine();

    // Saludar
    saludar(nombre);

    // Pedir los dos números
    System.out.print("Ingresa el primer número: ");
    double numero1 = teclado.nextDouble();

    System.out.print("Ingresa el segundo número: ");
    double numero2 = teclado.nextDouble();

    // Mostrar resultados de todas las operaciones
    System.out.println("\n=== RESULTADOS DE LAS OPERACIONES ===");
    System.out.println("  Números usados: " + numero1 + " y " + numero2);
    System.out.println("-------------------------------------");

    mostrarResultado(numero1 + " + " + numero2, sumar(numero1, numero2));
    mostrarResultado(numero1 + " - " + numero2, restar(numero1, numero2));
    mostrarResultado(numero1 + " × " + numero2, multiplicar(numero1, numero2));
    mostrarResultado(numero1 + " ÷ " + numero2, dividir(numero1, numero2));

    System.out.println("=====================================");
    System.out.println("¡Gracias, " + nombre + "! 🧮");

    // Cerrar el Scanner
    teclado.close();
}
```

---

### Paso 6 — Prueba tu programa

Ejecuta el programa e ingresa estos valores de prueba:

**Prueba 1:**
- Nombre: `Ana`
- Primer número: `10`
- Segundo número: `4`

Resultado esperado:
```
10.0 + 4.0 = 14.0
10.0 - 4.0 = 6.0
10.0 × 4.0 = 40.0
10.0 ÷ 4.0 = 2.5
```

**Prueba 2 (División por cero):**
- Nombre: `Luis`
- Primer número: `7`
- Segundo número: `0`

¿Qué pasa con la división? ¿El mensaje de error aparece?

---

### Paso 7 — Agrega un método propio

Ahora crea tu propio método que calcule el **cuadrado** de un número (el número multiplicado por sí mismo):

```java
public static double calcularCuadrado(double numero) {
    return numero * numero;
}
```

Y llámalo desde el `main`:

```java
mostrarResultado(numero1 + " al cuadrado", calcularCuadrado(numero1));
mostrarResultado(numero2 + " al cuadrado", calcularCuadrado(numero2));
```

---

## ✅ Criterios de Éxito

| Criterio | ¿Lo cumpliste? |
|----------|----------------|
| Importaste `java.util.Scanner` correctamente | ☐ |
| El programa lee el nombre del usuario con `teclado.nextLine()` | ☐ |
| El programa lee los dos números con `teclado.nextDouble()` | ☐ |
| Creaste y usaste al menos 3 métodos propios | ☐ |
| Los métodos de suma, resta, multiplicación y división funcionan correctamente | ☐ |
| El programa maneja la división por cero sin romperse | ☐ |
| Cerraste el Scanner con `teclado.close()` al final | ☐ |

---

## 💡 Preguntas para Reflexionar

1. ¿Qué ventaja tiene tener el código de suma en un método `sumar()` en lugar de escribirlo directamente en el `main`?
2. Si quisieras agregar la operación de "potencia" (elevar un número a una potencia), ¿dónde agregarías el código? ¿Crearías un nuevo método?
3. ¿Por qué es importante verificar que el divisor no sea cero antes de dividir?

---

## 🌟 Desafío Extra (Opcional)

Modifica tu calculadora para que sea un **menú interactivo** con un bucle `while`:

```
¿Qué operación deseas realizar?
1. Suma
2. Resta
3. Multiplicación
4. División
0. Salir

Elige una opción:
```

El programa debe repetirse hasta que el usuario elija la opción `0`. Necesitarás un `while`, un `if/else if` o un `switch`, y llamar al método correcto según la opción elegida.

---

### Solución para la descripción del video:
```java
// Respuesta a la Tarea para la casa:
int opcion = -1;
while (opcion != 0) {
    System.out.println("1. Suma | 2. Resta | 0. Salir");
    opcion = teclado.nextInt();
    if (opcion == 1) {
        System.out.println("Suma: " + sumar(10, 5));
    } else if (opcion == 2) {
        System.out.println("Resta: " + restar(10, 5));
    }
}
```

---

*¡Excelente trabajo! En el siguiente ejercicio crearás tus propias clases con atributos y métodos. 🚀*
