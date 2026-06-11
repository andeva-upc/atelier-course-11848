# 📝 EJERCICIO — LECCIÓN 3: Estructuras de Control
## Curso Java Fundamentals
**Tiempo estimado:** 15 minutos
**Herramienta:** Replit o OnlineGDB

---

## 🎯 Objetivo del Reto

Crear un programa que use `if/else`, bucles `for` y `while` para simular el sistema de puntuaciones y niveles de un videojuego sencillo.

---

## 🛠️ Antes de Empezar

1. Abre Replit o OnlineGDB.
2. Crea un nuevo proyecto Java.
3. Revisa el archivo `starter-files/Leccion3_Control.java` como punto de partida.

---

## 📋 Instrucciones Paso a Paso

### Paso 1 — Estructura base

```java
public class Main {
    public static void main(String[] args) {

        // Aquí irá tu código

    }
}
```

---

### Paso 2 — Contador del 1 al 10 con clasificación

Escribe un bucle `for` que recorra los números del 1 al 10. Para cada número:
- Si el número es menor o igual a 3, imprime: `"[número] - Nivel Básico"`
- Si el número está entre 4 y 6, imprime: `"[número] - Nivel Intermedio"`
- Si el número está entre 7 y 9, imprime: `"[número] - Nivel Avanzado"`
- Si el número es 10, imprime: `"[número] - ¡NIVEL MÁXIMO! 🏆"`

```java
System.out.println("=== SISTEMA DE NIVELES ===");

for (int numero = 1; numero <= 10; numero++) {
    if (numero <= 3) {
        System.out.println(numero + " - Nivel Básico");
    } else if (numero <= 6) {
        System.out.println(numero + " - Nivel Intermedio");
    } else if (numero <= 9) {
        System.out.println(numero + " - Nivel Avanzado");
    } else {
        System.out.println(numero + " - ¡NIVEL MÁXIMO! 🏆");
    }
}
```

Ejecuta el programa y verifica que muestra los 10 números con su clasificación.

---

### Paso 3 — Detectar números pares e impares

Agrega un segundo bucle `for` que recorra los números del 1 al 20 e imprima si cada uno es **par** o **impar**. Usa el operador módulo `%`.

```java
System.out.println("\n=== PARES E IMPARES DEL 1 AL 20 ===");

for (int i = 1; i <= 20; i++) {
    if (i % 2 == 0) {
        System.out.println(i + " → PAR ✓");
    } else {
        System.out.println(i + " → Impar");
    }
}
```

---

### Paso 4 — Cuenta regresiva con `while`

Usa un bucle `while` para crear una cuenta regresiva desde 10 hasta 1, imprimiendo cada número. Al terminar, imprime el mensaje: `"¡INICIO DEL JUEGO! 🎮"`

```java
System.out.println("\n=== CUENTA REGRESIVA ===");

int cuenta = 10;
while (cuenta >= 1) {
    System.out.println("⏱ " + cuenta);
    cuenta--;
}
System.out.println("¡INICIO DEL JUEGO! 🎮");
```

---

### Paso 5 — Suma acumulada con `for`

Escribe un bucle `for` que sume todos los números del 1 al 50 y muestre el resultado final.

```java
System.out.println("\n=== SUMA DEL 1 AL 50 ===");

int sumaTotal = 0;

for (int i = 1; i <= 50; i++) {
    sumaTotal = sumaTotal + i;
}

System.out.println("La suma de todos los números del 1 al 50 es: " + sumaTotal);
```

> 💡 **Pista:** La fórmula matemática dice que la suma del 1 al n es `n*(n+1)/2`. Para n=50, debería darte 1275. ¿Tu programa da el mismo resultado?

---

### Paso 6 — Tabla de multiplicar

Crea un bucle `for` que imprima la tabla de multiplicar del número 7 (del 7x1 al 7x10):

```java
System.out.println("\n=== TABLA DEL 7 ===");

int numero = 7;
for (int i = 1; i <= 10; i++) {
    int resultado = numero * i;
    System.out.println(numero + " x " + i + " = " + resultado);
}
```

---

### Paso 7 — DESAFÍO: Número par más grande en un rango

Escribe un bucle `for` que recorra los números del 1 al 30 y al final indique cuántos números pares hay en ese rango, y cuál es el par más grande encontrado.

```java
System.out.println("\n=== ANÁLISIS DE NÚMEROS ===");

int cantidadPares = 0;
int parMasGrande = 0;

for (int i = 1; i <= 30; i++) {
    if (i % 2 == 0) {
        cantidadPares = cantidadPares + 1;
        parMasGrande = i;   // el último par encontrado es el más grande
    }
}

System.out.println("Cantidad de números pares del 1 al 30: " + cantidadPares);
System.out.println("El número par más grande en ese rango es: " + parMasGrande);
```

---

## ✅ Criterios de Éxito

| Criterio | ¿Lo cumpliste? |
|----------|----------------|
| Usaste al menos un bucle `for` correctamente | ☐ |
| Usaste al menos un bucle `while` correctamente | ☐ |
| Usaste `if/else if/else` con al menos 3 ramas | ☐ |
| Usaste el operador `%` para detectar pares/impares | ☐ |
| El programa compila y ejecuta sin errores | ☐ |
| El contador de la cuenta regresiva llega a 1 (no a 0 ni negativo) | ☐ |
| La suma del 1 al 50 da 1275 | ☐ |

---

## 💡 Preguntas para Reflexionar

1. ¿Qué diferencia hay entre `for` y `while`? ¿Cuándo usarías uno y cuándo el otro?
2. ¿Qué pasaría si en el bucle `while` del Paso 4 olvidaras escribir `cuenta--`?
3. Si quisieras imprimir solo los múltiplos de 3 entre 1 y 30, ¿cómo lo harías?

---

## 🌟 Desafío Extra (Opcional)

Crea un programa que imprima el siguiente patrón usando bucles anidados (un `for` dentro de otro `for`):

```
*
**
***
****
*****
```

Pista: el bucle exterior controla la fila, y el bucle interior controla cuántos asteriscos imprime en esa fila. Necesitarás `System.out.print("*")` (sin salto de línea) y `System.out.println()` (solo para saltar de línea al final de cada fila).

---

### Solución para la descripción del video:
```java
// Respuesta a la Tarea para la casa:
for (int fila = 1; fila <= 5; fila++) {
    for (int col = 1; col <= fila; col++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

*¡Excelente trabajo! En el siguiente ejercicio crearás tus propios métodos y leerás datos del teclado. 🚀*
