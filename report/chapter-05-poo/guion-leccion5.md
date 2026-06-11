# 🎬 GUION — LECCIÓN 5: Introducción a la Programación Orientada a Objetos
## Curso Java Fundamentals
**Duración estimada:** 10 minutos de lectura pausada
**Herramienta:** Replit o OnlineGDB (sin instalación)

---

> ### 📋 NOTAS PARA EL PONENTE
> - La analogía del molde/galleta es fundamental. Repítela varias veces durante la lección.
> - Cuando crees la clase `Mascota`, hazlo en un archivo separado en Replit (nuevo archivo `Mascota.java`), o en la misma clase en OnlineGDB. Explica ambas opciones.
> - Al instanciar objetos, subraya verbalmente: "Este es el MOLDE" (señala la clase) y "Este es el OBJETO REAL" (señala la instancia).
> - Habla despacio al explicar la diferencia entre clase y objeto — es el concepto más abstracto hasta ahora.
> - Ten el código de `Leccion5_POO_Final.java` listo para mostrarlo al final como ejemplo completo.

---

## 🟢 PARTE 1 — BIENVENIDA Y REPASO (aprox. 45 segundos)

---

¡Hola de nuevo! Bienvenidos a la Lección 5 de Java Fundamentals. ¡Ya casi llegamos al final del curso, y cada vez que aprenden algo nuevo, son más poderosos como programadores!

En la lección pasada aprendimos a crear métodos —bloques de código reutilizables— y a leer datos del usuario con Scanner. ¡Sus programas ya son interactivos!

Hoy vamos a dar el salto más grande de todo el curso. Vamos a aprender el concepto más importante de Java: la **Programación Orientada a Objetos**, que abreviamos como **POO**. Este paradigma es la razón por la que Java se volvió tan popular en el mundo. ¡Vamos!

---

## 🟡 PARTE 2 — TEORÍA: ¿Qué es la POO? El mundo real como código (aprox. 2 minutos 30 segundos)

---

Déjenme hacerles una pregunta. Miren a su alrededor. ¿Qué ven?

Probablemente ven una silla, una mesa, un teléfono, quizás una botella de agua... El mundo real está lleno de **cosas**. Y cada cosa tiene características y comportamientos.

Por ejemplo, piensen en un **perro**:
- Tiene un nombre (característica)
- Tiene una raza (característica)
- Tiene una edad (característica)
- Puede ladrar (comportamiento)
- Puede correr (comportamiento)
- Puede comer (comportamiento)

Ahora piensen en **otro perro**, diferente. También tiene nombre, raza, edad... También puede ladrar, correr, comer. Pero son dos perros distintos, con sus propias características.

La **Programación Orientada a Objetos** es una forma de escribir código que modela el mundo real de esta manera. En lugar de tener montones de variables sueltas y métodos desorganizados, agrupamos todo en "objetos" que representan cosas del mundo real.

En POO hay dos conceptos fundamentales que deben grabar en su mente para siempre:

---

### 🔷 Concepto 1: La Clase

Una **clase** es un **molde** o **plantilla**. Es la definición de cómo será algo. La clase dice: "Todo lo que sea creado usando este molde tendrá estas características y estos comportamientos."

Imaginen las galletas de navidad. Para hacerlas, usan un **cortador de galletas** con forma de estrella. Ese cortador es el molde. Las galletas que salen son los objetos.

Otro ejemplo: los planos de una casa. Los planos definen cuántos cuartos tiene, cómo está distribuida, dónde van las ventanas... pero los planos en sí no son la casa. Son el molde.

Una clase en Java define:
- **Atributos:** Las características (el nombre, la edad, el color... como variables dentro de la clase).
- **Métodos:** Los comportamientos (lo que puede hacer: ladrar, correr, saludar...).

---

### 🔶 Concepto 2: El Objeto (o Instancia)

Un **objeto** es el resultado de usar el molde. Si la clase es el cortador de galletas, el objeto es la galleta real.

Puedes crear **múltiples objetos** del mismo molde (clase). Todos tienen la misma estructura —los mismos atributos y métodos— pero cada uno tiene sus propios valores.

Ejemplo: si la clase es `Perro`, puedes crear el objeto `perro1` que se llama Firulais, tiene 3 años y es un Labrador. Y también crear `perro2` que se llama Max, tiene 1 año y es un Bulldog. Mismo molde, objetos diferentes.

---

## 🟠 PARTE 3 — SINTAXIS: Crear una Clase en Java (aprox. 1 minuto 30 segundos)

---

Ahora veamos cómo se escribe esto en Java. La estructura de una clase es:

```java
class NombreDeLaClase {

    // Atributos (las características)
    tipo nombreAtributo;

    // Métodos (los comportamientos)
    public void nombreMetodo() {
        // código del comportamiento
    }
}
```

Y para crear un objeto a partir de esa clase, en el `main` escribimos:

```java
NombreDeLaClase miObjeto = new NombreDeLaClase();
miObjeto.nombreAtributo = valorDeseado;
miObjeto.nombreMetodo();
```

La palabra clave `new` le dice a Java: "Crea un nuevo objeto usando ese molde." Y el punto `.` es la forma de acceder a los atributos y métodos de un objeto.

---

## 🔵 PARTE 4 — DEMO PRÁCTICA: La clase Mascota (aprox. 4 minutos)

---

¡Vamos al editor! Vamos a crear juntos la clase `Mascota` y luego crear objetos a partir de ella.

*[NOTA PONENTE: En Replit, crea un nuevo archivo llamado `Mascota.java`. En OnlineGDB, escribe la clase directamente antes de la clase Main en el mismo archivo.]*

**Primero, creamos el molde — la clase Mascota:**

```java
class Mascota {

    // Atributos: las características de cualquier mascota
    String nombre;
    String tipoAnimal;   // "perro", "gato", "pájaro"...
    int edad;
    String colorPelo;

    // Método 1: presentarse
    public void presentarse() {
        System.out.println("🐾 ¡Hola! Me llamo " + nombre + ".");
        System.out.println("   Soy un " + tipoAnimal + " de color " + colorPelo + ".");
        System.out.println("   Tengo " + edad + " años.");
    }

    // Método 2: hacer su sonido característico
    public void hacerSonido() {
        if (tipoAnimal.equals("perro")) {
            System.out.println("   " + nombre + ": ¡Guau Guau! 🐶");
        } else if (tipoAnimal.equals("gato")) {
            System.out.println("   " + nombre + ": ¡Miau! 🐱");
        } else if (tipoAnimal.equals("pájaro")) {
            System.out.println("   " + nombre + ": ¡Pío Pío! 🐦");
        } else {
            System.out.println("   " + nombre + " hace un sonido misterioso... 🐾");
        }
    }

    // Método 3: cumplir un año más
    public void cumplirAnios() {
        edad = edad + 1;
        System.out.println("   🎂 ¡" + nombre + " cumplió años! Ahora tiene " + edad + " años.");
    }

}
```

*[NOTA PONENTE: Señala los atributos, luego los métodos. Explica que `this.nombre` hace referencia al nombre del objeto específico que llama al método.]*

¿Observan algo fascinante? Dentro de los métodos de la clase, usamos `nombre`, `tipoAnimal`, `edad` directamente —sin declararlos de nuevo. Eso es porque los atributos de la clase están disponibles para todos sus métodos.

**Ahora usamos el molde — creamos objetos en el `main`:**

```java
public class Main {
    public static void main(String[] args) {

        System.out.println("=== REFUGIO DE MASCOTAS ===\n");

        // Creamos el PRIMER objeto (la primera galleta del molde)
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Firulais";
        mascota1.tipoAnimal = "perro";
        mascota1.edad = 3;
        mascota1.colorPelo = "marrón";

        mascota1.presentarse();
        mascota1.hacerSonido();
        mascota1.cumplirAnios();

        System.out.println();

        // Creamos el SEGUNDO objeto (otra galleta del mismo molde, diferente sabor)
        Mascota mascota2 = new Mascota();
        mascota2.nombre = "Mishi";
        mascota2.tipoAnimal = "gato";
        mascota2.edad = 2;
        mascota2.colorPelo = "blanco y negro";

        mascota2.presentarse();
        mascota2.hacerSonido();

        System.out.println("\n=== FIN DEL REFUGIO ===");
    }
}
```

*[NOTA PONENTE: Ejecuta el programa. Señala claramente cómo `mascota1` y `mascota2` son dos objetos diferentes del mismo molde `Mascota`. Ambos tienen los mismos métodos, pero con sus propios valores de atributos.]*

¿Lo vieron? `mascota1` y `mascota2` son dos objetos completamente independientes. Cuando `mascota1.cumplirAnios()` cambia la edad a 4, eso no afecta para nada a `mascota2`. Cada objeto tiene su propio espacio en la memoria con sus propios valores.

Eso es exactamente cómo funciona el mundo real: hay muchos perros en el mundo, todos comparten la "clase Perro" (tienen nombre, raza, pueden ladrar), pero cada perro es su propio individuo.

*[NOTA PONENTE: Si el tiempo lo permite, muestra cómo se vería agregar una tercera mascota de tipo "pájaro".]*

---

## 🟣 PARTE 5 — RESUMEN Y CONCEPTOS CLAVE (aprox. 45 segundos)

---

Resumen de la lección:

✅ La **Programación Orientada a Objetos (POO)** es un paradigma que modela el mundo real en código mediante objetos.

✅ Una **clase** es el molde o plantilla que define los atributos (características) y métodos (comportamientos) de algo.

✅ Un **objeto** es una instancia concreta creada a partir de una clase. Puedes crear muchos objetos del mismo molde.

✅ Los **atributos** son las variables que viven dentro de una clase.

✅ Los **métodos** de una clase definen qué puede hacer el objeto.

✅ Para crear un objeto: `NombreClase objeto = new NombreClase();`

✅ Para acceder a atributos o métodos de un objeto: `objeto.atributo` u `objeto.metodo()`.

---

## ⭐ PARTE 6 — DESPEDIDA Y PRÓXIMA LECCIÓN (aprox. 30 segundos)

---

¡Felicitaciones! Han aprendido el concepto más importante de Java. La POO es lo que hace que Java sea tan poderoso: en aplicaciones grandes del mundo real, todo se modela con clases y objetos.

En la última lección —la número 6— veremos algo muy práctico: cómo **leer y entender los errores** que nos da Java, y les daré mis mejores consejos para que sigan aprendiendo después del curso.

La tarea para la casa es la siguiente: creen una nueva clase llamada `Hechizo` con daño y costo de maná, y agreguen al personaje la capacidad de lanzar ese hechizo si tiene suficiente maná. ¡La solución estará en la descripción del video!

¡Hasta la última lección! ☕🚀
