# 📝 EJERCICIO — LECCIÓN 5: Introducción a la POO
## Curso Java Fundamentals
**Tiempo estimado:** 15-20 minutos
**Herramienta:** Replit o OnlineGDB

---

## 🎯 Objetivo del Reto

Crear una clase `Personaje` que represente a un héroe de videojuego, instanciar múltiples objetos de esa clase, y demostrar que cada objeto es independiente con sus propios atributos y comportamientos.

---

## 🛠️ Antes de Empezar

1. Abre Replit o OnlineGDB.
2. Crea un nuevo proyecto Java.
3. En **Replit**: Crea dos archivos:
   - `Personaje.java` → donde escribirás la clase.
   - `Main.java` → el programa principal.
4. En **OnlineGDB**: Puedes escribir ambas cosas en el mismo archivo, poniendo la clase `Personaje` antes de la clase `Main`.
5. Revisa el archivo `starter-files/Leccion5_POO.java` como referencia.

---

## 📋 Instrucciones Paso a Paso

### Paso 1 — Diseña tu clase `Personaje`

Antes de escribir código, piensa en tu personaje de videojuego. ¿Qué características tiene? ¿Qué puede hacer?

Completa esta tabla en papel o en tu mente:

| Característica (Atributo) | Tipo de Dato | Ejemplo |
|--------------------------|-------------|---------|
| nombre | `String` | "Zara" |
| tipo | `String` | "Mago" |
| nivel | `int` | 10 |
| vidaMaxima | `int` | 200 |
| vidaActual | `int` | 200 |
| ataqueBase | `int` | 45 |
| estaVivo | `boolean` | true |

---

### Paso 2 — Escribe la clase `Personaje`

```java
class Personaje {

    // Atributos del personaje
    String nombre;
    String tipo;          // "Guerrero", "Mago", "Arquero"
    int nivel;
    int vidaMaxima;
    int vidaActual;
    int ataqueBase;
    boolean estaVivo;

    // Método 1: mostrar el estado del personaje
    public void mostrarEstado() {
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ PERSONAJE: " + nombre);
        System.out.println("│ Tipo:   " + tipo);
        System.out.println("│ Nivel:  " + nivel);
        System.out.println("│ Vida:   " + vidaActual + "/" + vidaMaxima + " HP");
        System.out.println("│ Ataque: " + ataqueBase + " pts");
        System.out.println("│ ¿Vivo?: " + estaVivo);
        System.out.println("└─────────────────────────────┘");
    }

    // Método 2: atacar a otro personaje
    public void atacar(Personaje objetivo) {
        System.out.println("⚔️ " + nombre + " ataca a " + objetivo.nombre
                           + " con " + ataqueBase + " puntos de daño!");
        objetivo.recibirDano(ataqueBase);
    }

    // Método 3: recibir daño
    public void recibirDano(int dano) {
        vidaActual = vidaActual - dano;
        if (vidaActual <= 0) {
            vidaActual = 0;
            estaVivo = false;
            System.out.println("💀 " + nombre + " ha sido derrotado.");
        } else {
            System.out.println("   " + nombre + " ahora tiene " + vidaActual + " HP.");
        }
    }

    // Método 4: curar (recuperar vida)
    public void curar(int cantidad) {
        if (estaVivo) {
            vidaActual = vidaActual + cantidad;
            if (vidaActual > vidaMaxima) {
                vidaActual = vidaMaxima;   // no puede superar el máximo
            }
            System.out.println("💚 " + nombre + " se curó " + cantidad
                               + " HP. Vida actual: " + vidaActual);
        } else {
            System.out.println("❌ " + nombre + " está derrotado y no puede curarse.");
        }
    }

    // Método 5: subir de nivel
    public void subirNivel() {
        nivel = nivel + 1;
        ataqueBase = ataqueBase + 5;
        vidaMaxima = vidaMaxima + 20;
        vidaActual = vidaMaxima;   // se cura completamente al subir de nivel
        System.out.println("🌟 ¡" + nombre + " subió al nivel " + nivel + "!");
        System.out.println("   Nuevo ataque: " + ataqueBase
                           + " | Nueva vida máxima: " + vidaMaxima);
    }

}
```

---

### Paso 3 — Crea la clase `Main` y los objetos

```java
public class Main {
    public static void main(String[] args) {

        System.out.println("========= ARENA DE BATALLA =========\n");

        // Crear el PRIMER personaje
        Personaje heroe = new Personaje();
        heroe.nombre = "Zara";
        heroe.tipo = "Maga";
        heroe.nivel = 5;
        heroe.vidaMaxima = 150;
        heroe.vidaActual = 150;
        heroe.ataqueBase = 40;
        heroe.estaVivo = true;

        // Crear el SEGUNDO personaje
        Personaje villano = new Personaje();
        villano.nombre = "Malachar";
        villano.tipo = "Guerrero Oscuro";
        villano.nivel = 7;
        villano.vidaMaxima = 200;
        villano.vidaActual = 200;
        villano.ataqueBase = 35;
        villano.estaVivo = true;

        // Mostrar estado inicial
        System.out.println("--- ESTADO INICIAL ---");
        heroe.mostrarEstado();
        System.out.println();
        villano.mostrarEstado();

        // Simular una batalla
        System.out.println("\n--- ¡COMIENZA LA BATALLA! ---\n");

        heroe.atacar(villano);
        villano.atacar(heroe);
        heroe.atacar(villano);
        heroe.curar(30);
        villano.atacar(heroe);
        heroe.subirNivel();
        heroe.atacar(villano);
        heroe.atacar(villano);

        // Mostrar estado final
        System.out.println("\n--- ESTADO FINAL ---");
        heroe.mostrarEstado();
        System.out.println();
        villano.mostrarEstado();

        // Determinar el ganador
        System.out.println("\n=== RESULTADO ===");
        if (heroe.estaVivo && !villano.estaVivo) {
            System.out.println("🏆 ¡" + heroe.nombre + " ganó la batalla!");
        } else if (!heroe.estaVivo && villano.estaVivo) {
            System.out.println("💀 " + villano.nombre + " venció.");
        } else if (!heroe.estaVivo && !villano.estaVivo) {
            System.out.println("🤝 ¡Empate! Ambos fueron derrotados.");
        } else {
            System.out.println("⚔️ La batalla continúa... ambos siguen en pie.");
        }
        System.out.println("=================");

    }
}
```

---

### Paso 4 — Ejecuta y observa

Ejecuta el programa. Observa:
- ¿Cómo cambia la vida de cada personaje después de cada ataque?
- ¿Qué pasa con los atributos del héroe al subir de nivel?
- ¿Afecta el subir de nivel del héroe los atributos del villano? (Respuesta: no, porque son objetos independientes.)

---

### Paso 5 — Agrega tu propio personaje

Crea un tercer personaje con tus propias características:

```java
Personaje miPersonaje = new Personaje();
miPersonaje.nombre = "TuNombre";        // ← cambia esto
miPersonaje.tipo = "TuTipo";            // ← elige: Guerrero, Mago, Arquero, Ninja...
miPersonaje.nivel = 1;
miPersonaje.vidaMaxima = 100;
miPersonaje.vidaActual = 100;
miPersonaje.ataqueBase = 25;
miPersonaje.estaVivo = true;

miPersonaje.mostrarEstado();
miPersonaje.atacar(villano);
```

---

## ✅ Criterios de Éxito

| Criterio | ¿Lo cumpliste? |
|----------|----------------|
| Creaste la clase `Personaje` con al menos 5 atributos | ☐ |
| La clase tiene al menos 3 métodos funcionales | ☐ |
| Creaste al menos 2 objetos de tipo `Personaje` | ☐ |
| Cada objeto tiene valores diferentes en sus atributos | ☐ |
| Los métodos funcionan correctamente (atacar, curar, etc.) | ☐ |
| El programa compila y ejecuta sin errores | ☐ |
| El resultado de la batalla se muestra correctamente | ☐ |

---

## 💡 Preguntas para Reflexionar

1. ¿Qué pasa si cambiamos `heroe.ataqueBase = 999` justo antes del combate? ¿Y si cambiamos `villano.vidaActual = 1`?
2. ¿Cuál es la diferencia entre `vidaMaxima` y `vidaActual`? ¿Por qué necesitamos ambas?
3. Si quisieras agregar un método `escapar()` al personaje, ¿qué haría ese método?

---

## 🌟 Desafío Extra (Opcional)

Crea una segunda clase llamada `Hechizo` con los atributos:
- `String nombre` (ejemplo: "Bola de fuego")
- `int dano` (daño que hace)
- `int costoMana` (maná necesario para lanzarlo)

Luego agrega al personaje un atributo `int manaActual` y un método `lanzarHechizo(Hechizo hechizo, Personaje objetivo)` que:
1. Verifique si tiene suficiente maná.
2. Si tiene, descuente el maná y aplique el daño al objetivo.
3. Si no tiene, imprima "¡No hay suficiente maná!".

---

### Solución para la descripción del video:
```java
// Respuesta a la Tarea para la casa:
class Hechizo {
    String nombre;
    int dano;
    int costoMana;
}
// Dentro de la clase Personaje:
public void lanzarHechizo(Hechizo h, Personaje objetivo) {
    if (manaActual >= h.costoMana) {
        manaActual = manaActual - h.costoMana;
        objetivo.recibirDano(h.dano);
        System.out.println(nombre + " lanzó " + h.nombre);
    } else {
        System.out.println("¡No hay suficiente maná!");
    }
}
```

---

*¡Increíble trabajo! En el ejercicio final aprenderás a depurar código. ¡Ya casi eres un programador Java! 🚀*
