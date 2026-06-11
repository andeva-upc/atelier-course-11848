# 📝 EJERCICIO — LECCIÓN 6: Depuración y Cierre del Curso
## Curso Java Fundamentals
**Tiempo estimado:** 15-20 minutos
**Herramienta:** Replit o OnlineGDB

---

## 🎯 Objetivo del Reto

Este ejercicio tiene **dos partes**:

1. **Parte A (Depuración):** Encontrar y corregir 5 errores intencionales en un código Java que no compila.
2. **Parte B (Integración):** Crear un mini-proyecto que integre todo lo que aprendiste en el curso.

---

## 🛠️ Antes de Empezar

1. Abre Replit o OnlineGDB.
2. Crea un nuevo proyecto Java.
3. Para la Parte A, copia el código de `starter-files/Leccion6_Cierre.java`.
4. Para la Parte B, crea un nuevo archivo o limpia el editor.

---

## 📋 PARTE A — Depuración (10 minutos)

### Instrucciones

El siguiente código tiene **5 errores intencionales** (marcados con comentarios `// ERROR`). Tu misión es:

1. Leer el código completo con cuidado antes de ejecutar.
2. Intentar identificar visualmente los errores.
3. Luego ejecutar el código y leer los mensajes de error que da Java.
4. Corregir cada error uno por uno.
5. Ejecutar después de cada corrección para ver el progreso.

**Código con errores:**

```java
public class Main {

    // Este método tiene un ERROR
    public static void mostrarMensaje(String texto) {
        System.out.println("Mensaje: " + texto)   // ERROR 1
    }

    // Este método tiene un ERROR
    publc static int multiplicar(int a, int b) {  // ERROR 2
        return a * b;
    }

    public static void main(String[] args) {

        int resultado = multiplicar(4, 5);
        System.out.println("4 x 5 = " + resultado);

        // Esta línea tiene un ERROR
        String despedida = "¡Felicidades, completaste el curso!;  // ERROR 3
        mostrarMensaje(despedida);

        // Este bucle tiene un ERROR LÓGICO
        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i--) {   // ERROR 4
            System.out.println(i);
        }

        // Esta línea tiene un ERROR
        System.out.println("¡Sigue aprendiendo Java!) // ERROR 5

    }
}
```

---

### Registro de Errores (completa esta tabla)

| # | Línea aprox. | Descripción del error | Corrección aplicada |
|---|-------------|----------------------|---------------------|
| 1 | | | |
| 2 | | | |
| 3 | | | |
| 4 | | | |
| 5 | | | |

---

### Código Correcto Final (Referencia)

Una vez que hayas corregido todos los errores, el código debería verse así:

```java
public class Main {

    public static void mostrarMensaje(String texto) {
        System.out.println("Mensaje: " + texto);   // ✅ punto y coma añadido
    }

    public static int multiplicar(int a, int b) {  // ✅ "publc" corregido a "public"
        return a * b;
    }

    public static void main(String[] args) {

        int resultado = multiplicar(4, 5);
        System.out.println("4 x 5 = " + resultado);

        String despedida = "¡Felicidades, completaste el curso!";  // ✅ comilla cerrada
        mostrarMensaje(despedida);

        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i++) {   // ✅ i-- cambiado a i++
            System.out.println(i);
        }

        System.out.println("¡Sigue aprendiendo Java!");  // ✅ paréntesis y comilla cerrados

    }
}
```

La salida correcta debe ser:
```
4 x 5 = 20
Mensaje: ¡Felicidades, completaste el curso!
Contando del 1 al 5:
1
2
3
4
5
¡Sigue aprendiendo Java!
```

---

## 📋 PARTE B — Proyecto Integrador (10 minutos)

### El reto final: Sistema de Registro Escolar

Crea un programa que combine **todo lo que aprendiste** en el curso. El programa debe:

1. **Usar una clase** llamada `Estudiante` con atributos y métodos.
2. **Leer datos del usuario** con `Scanner`.
3. **Usar condicionales y bucles** para procesar información.
4. **Usar métodos** para organizar el código.

### Requisitos mínimos del programa:

```java
import java.util.Scanner;

class Estudiante {
    String nombre;
    int edad;
    double nota1;
    double nota2;
    double nota3;

    // Método que calcula el promedio
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método que determina si aprobó
    public boolean aprobo() {
        return calcularPromedio() >= 11;
    }

    // Método que muestra el reporte del estudiante
    public void mostrarReporte() {
        double promedio = calcularPromedio();
        System.out.println("┌─────────────────────────────────┐");
        System.out.println("│ REPORTE DEL ESTUDIANTE          │");
        System.out.println("├─────────────────────────────────┤");
        System.out.println("│ Nombre:   " + nombre);
        System.out.println("│ Edad:     " + edad + " años");
        System.out.println("│ Nota 1:   " + nota1);
        System.out.println("│ Nota 2:   " + nota2);
        System.out.println("│ Nota 3:   " + nota3);
        System.out.println("│ Promedio: " + promedio);

        if (aprobo()) {
            System.out.println("│ Estado:   ✅ APROBADO");
        } else {
            System.out.println("│ Estado:   ❌ DESAPROBADO");
        }
        System.out.println("└─────────────────────────────────┘");
    }
}

public class Main {

    // Método para leer las notas y validarlas (entre 0 y 20)
    public static double leerNota(Scanner teclado, String mensaje) {
        System.out.print(mensaje);
        double nota = teclado.nextDouble();
        while (nota < 0 || nota > 20) {
            System.out.println("⚠️ Nota inválida. Debe estar entre 0 y 20.");
            System.out.print(mensaje);
            nota = teclado.nextDouble();
        }
        return nota;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   SISTEMA DE REGISTRO ESCOLAR     ");
        System.out.println("====================================");

        System.out.print("¿Cuántos estudiantes quieres registrar? ");
        int cantidad = teclado.nextInt();
        teclado.nextLine(); // limpiar el buffer

        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\n--- Registrando Estudiante " + i + " ---");

            Estudiante est = new Estudiante();

            System.out.print("Nombre del estudiante: ");
            est.nombre = teclado.nextLine();

            System.out.print("Edad: ");
            est.edad = teclado.nextInt();

            est.nota1 = leerNota(teclado, "Nota 1 (0-20): ");
            est.nota2 = leerNota(teclado, "Nota 2 (0-20): ");
            est.nota3 = leerNota(teclado, "Nota 3 (0-20): ");
            teclado.nextLine(); // limpiar el buffer

            est.mostrarReporte();

            if (est.aprobo()) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("\n====================================");
        System.out.println("   RESUMEN FINAL DEL AULA          ");
        System.out.println("====================================");
        System.out.println("Total de estudiantes: " + cantidad);
        System.out.println("Aprobados:            " + aprobados);
        System.out.println("Desaprobados:         " + desaprobados);
        System.out.println("====================================");

        teclado.close();
    }
}
```

---

### Prueba tu programa

Ejecuta el programa con al menos 3 estudiantes. Usa estos datos de prueba:

| Estudiante | Nota 1 | Nota 2 | Nota 3 | ¿Aprueba? |
|-----------|--------|--------|--------|-----------|
| Ana | 16 | 14 | 18 | Sí (promedio 16) |
| Pedro | 8 | 10 | 9 | No (promedio 9) |
| María | 12 | 11 | 13 | Sí (promedio 12) |

---

## ✅ Criterios de Éxito

**Parte A:**
| Criterio | ¿Lo cumpliste? |
|----------|----------------|
| Encontraste y corregiste los 5 errores | ☐ |
| El programa de la Parte A ejecuta sin errores | ☐ |
| Completaste la tabla de registro de errores | ☐ |

**Parte B:**
| Criterio | ¿Lo cumpliste? |
|----------|----------------|
| Creaste la clase `Estudiante` con atributos | ☐ |
| La clase tiene al menos 3 métodos | ☐ |
| Usaste `Scanner` para leer datos del usuario | ☐ |
| Usaste un bucle `for` para registrar múltiples estudiantes | ☐ |
| El conteo de aprobados y desaprobados es correcto | ☐ |
| El programa compila y ejecuta sin errores | ☐ |

---

## 🎓 Reflexión Final del Curso

Responde estas preguntas. No hay respuestas incorrectas:

1. ¿Qué fue lo más difícil del curso para ti?
2. ¿Qué fue lo más interesante o divertido que aprendiste?
3. ¿Qué programa te gustaría crear con lo que sabes ahora?
4. ¿Qué tema te gustaría seguir explorando después del curso?

---

## 🌟 ¡Felicitaciones!

Si completaste este ejercicio, significa que:

- ✅ Puedes **leer y depurar** código Java.
- ✅ Puedes **crear clases y objetos** propios.
- ✅ Puedes **usar Scanner** para interactuar con el usuario.
- ✅ Puedes **usar bucles y condicionales** para procesar información.
- ✅ Puedes **organizar tu código** con métodos reutilizables.

**¡Eres un programador Java!** 🚀☕

---

*Sigue explorando, sigue practicando, y recuerda: el mejor código del mundo fue escrito por alguien que no sabía programar hace un tiempo atrás. ¡Tú puedes llegar tan lejos como te lo propongas!*
