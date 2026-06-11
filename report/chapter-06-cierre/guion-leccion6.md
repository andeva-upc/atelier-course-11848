# 🎬 GUION — LECCIÓN 6: Depuración, Buenas Prácticas y Cierre del Curso
## Curso Java Fundamentals
**Duración estimada:** 10 minutos de lectura pausada
**Herramienta:** Replit o OnlineGDB (sin instalación)

---

> ### 📋 NOTAS PARA EL PONENTE
> - Esta es la lección más emotiva del curso. Ciérrala con energía y motivación.
> - Cuando muestres los errores, LEER EN VOZ ALTA el mensaje de error de Java. Esto normaliza el proceso.
> - Usa el archivo `starter-files/Leccion6_Cierre.java` que tiene errores intencionales. Encuéntralos uno por uno en vivo.
> - La sección de "Tipos comunes de errores" es muy práctica — los estudiantes se van a identificar con cada uno.
> - Al final, cuando hagas el recorrido de lo aprendido, hazlo con genuino entusiasmo. Estos estudiantes aprendieron mucho.
> - Deja tiempo para preguntas si es una sesión en vivo.

---

## 🟢 PARTE 1 — BIENVENIDA Y EMOCIÓN DEL CIERRE (aprox. 1 minuto)

---

¡Hola! ¡Bienvenidos a la Lección 6! La última lección del curso Java Fundamentals.

Quiero que hagan una pausa por un momento y piensen en todo lo que han aprendido desde la Lección 1. Llegaron aquí sin saber absolutamente nada de Java. Y hoy, cinco lecciones después, saben qué es un programa, cómo guardar datos en variables, cómo tomar decisiones con `if`, cómo repetir acciones con bucles, cómo crear métodos reutilizables, cómo leer datos del usuario y cómo modelar el mundo real con clases y objetos.

Eso no es poca cosa. Eso es un fundamento sólido de programación Java. Muchas personas adultas no saben hacer lo que ustedes ahora saben.

Pero antes de cerrar, hay dos cosas muy importantes que debo enseñarles. La primera: **cómo leer y corregir errores.** Y la segunda: **cómo seguir aprendiendo después de este curso.**

¡Empecemos la última lección!

---

## 🟡 PARTE 2 — TEORÍA: Los Errores no son el Enemigo (aprox. 2 minutos)

---

Quiero que graben esto en su mente para siempre:

> **"Los errores no son señal de que eres mal programador. Son señal de que estás programando."**

Todo programador del mundo, desde el más principiante hasta el más experto que lleva 30 años programando, comete errores. La diferencia entre un principiante y un experto no es que el experto no comete errores. La diferencia es que el experto **sabe leerlos y corregirlos más rápido.**

En Java, cuando ejecutas un programa con errores, el compilador te da un **mensaje de error** en la consola. Ese mensaje parece intimidante al principio —en inglés, con códigos raros— pero en realidad te está dando exactamente la información que necesitas para arreglar el problema.

Aprender a leer mensajes de error es una de las habilidades más valiosas que puedes desarrollar como programador. Así que hoy vamos a practicarlo directamente.

Existen principalmente tres tipos de errores en Java:

---

### 🔴 Tipo 1: Errores de sintaxis (los más comunes)

Son errores en la forma en que escribiste el código. Java no puede compilar el programa porque algo no está bien escrito.

Ejemplos típicos:
- **Falta el punto y coma `;`** al final de una instrucción.
- **Llaves sin cerrar** `{` sin su `}` correspondiente.
- **Comillas sin cerrar** `"Hola` sin la segunda comilla.
- **Palabras reservadas mal escritas**: `publc` en lugar de `public`, `Strng` en lugar de `String`.

El mensaje de error normalmente dice la **línea exacta** donde está el problema. Por ejemplo:
```
Main.java:5: error: ';' expected
    System.out.println("Hola")
                               ^
```

Ese `^` señala exactamente dónde espera que esté el punto y coma.

---

### 🟡 Tipo 2: Errores en tiempo de ejecución

El código compila bien (sin errores de sintaxis), pero **falla cuando se ejecuta**. Por ejemplo, dividir entre cero.

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Main.main(Main.java:8)
```

Este mensaje dice: "Hubo una excepción (error inesperado) de tipo ArithmeticException (error matemático), y ocurrió en la línea 8."

---

### 🟢 Tipo 3: Errores lógicos

El más difícil de detectar. El programa compila y ejecuta **sin dar ningún mensaje de error**, pero el resultado es incorrecto.

Por ejemplo, si escribes `i--` en lugar de `i++` en un bucle `for`, el programa correrá... hacia el infinito. O si usas `>` cuando debías usar `>=`, la condición no funciona como esperabas.

Para encontrar errores lógicos, debes revisar tu código paso a paso y verificar que la lógica sea correcta.

---

## 🟠 PARTE 3 — ESTRATEGIAS PARA DEPURAR (aprox. 1 minuto 30 segundos)

---

"Depurar" es el término que usamos para encontrar y corregir errores en un programa. Aquí están mis mejores estrategias:

### Estrategia 1: Lee el mensaje de error completo

No te asustes por el mensaje de error. Léelo despacio. Busca el número de línea que menciona. Ve a esa línea en tu código.

### Estrategia 2: Añade impresiones temporales

Si no entiendes qué está pasando en tu código, agrega `System.out.println("Llegué aquí: " + variable)` en puntos clave. Eso te ayuda a rastrear qué valores tienen tus variables en cada momento.

### Estrategia 3: Divide y vencerás

Si el programa es largo y tiene errores, comenta la mitad del código *(usando `//` al inicio de cada línea)* y ejecuta la otra mitad. Esto te ayuda a identificar en qué sección está el error.

### Estrategia 4: Busca en internet

Si ves un mensaje de error que no entiendes, cópialo en Google. Hay millones de programadores que tuvieron exactamente el mismo error antes que tú. Plataformas como **Stack Overflow** tienen respuestas para casi todo.

---

## 🔵 PARTE 4 — DEMO PRÁCTICA: ¡Depuremos código en vivo! (aprox. 2 minutos 30 segundos)

---

¡Ahora es tu turno de ser detective! Vamos a abrir el archivo `starter-files/Leccion6_Cierre.java` que tiene **5 errores intencionales** y los vamos a encontrar y corregir juntos.

*[NOTA PONENTE: Copia el código del archivo starter en el editor de Replit/OnlineGDB. Antes de ejecutarlo, pregunta a los estudiantes si pueden ver algún error con solo leer el código.]*

Aquí está el código con errores. Léanlo con cuidado:

```java
public class Main {

    public static void mostrarMensaje(String texto) {
        System.out.println("Mensaje: " + texto)   // ERROR 1: ¿qué falta?
    }

    publc static int multiplicar(int a, int b) {  // ERROR 2: ¿ves algo raro?
        return a * b;
    }

    public static void main(String[] args) {

        int resultado = multiplicar(4, 5);
        System.out.println("4 x 5 = " + resultado);

        String despedida = "¡Felicidades, completaste el curso!;  // ERROR 3
        mostrarMensaje(despedida);

        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i--) {            // ERROR 4
            System.out.println(i);
        }

        System.out.println("¡Sigue aprendiendo Java!");
    }
}
```

*[NOTA PONENTE: Toma 30 segundos de pausa. Pregunta: "¿Alguien ve algún error antes de ejecutarlo?"]*

Vamos a ejecutarlo y a leer los errores que da Java:

**Error 1:** Falta el punto y coma `;` al final de `System.out.println` dentro del método `mostrarMensaje`. Java no puede terminar la instrucción sin él.

*Corrección:* `System.out.println("Mensaje: " + texto);`

**Error 2:** La palabra `publc` está mal escrita. Falta la `i`. Java no reconoce `publc` como una palabra válida.

*Corrección:* `public static int multiplicar(int a, int b)`

**Error 3:** La comilla doble del String no está cerrada. `"¡Felicidades, completaste el curso!;` — la segunda comilla `"` nunca se escribió.

*Corrección:* `String despedida = "¡Felicidades, completaste el curso!";`

**Error 4:** El bucle `for` usa `i--` (decrementa, cuenta hacia abajo) en lugar de `i++` (incrementa, cuenta hacia arriba). Esto crearía un bucle infinito porque `i` nunca llegaría a ser mayor que 5.

*Corrección:* `for (int i = 1; i <= 5; i++)`

*[NOTA PONENTE: Corrige cada error uno por uno, ejecuta después de cada corrección para que los estudiantes vean el proceso real.]*

¿Lo ven? Después de corregir todos los errores, el programa funciona perfectamente. Y el proceso fue: **leer el mensaje de error → ir a la línea indicada → entender qué falta → corregir → ejecutar.** Ese proceso es la esencia de depurar código.

---

## 🟣 PARTE 5 — BUENAS PRÁCTICAS RÁPIDAS (aprox. 1 minuto)

---

Antes del cierre, déjenme compartirles 5 reglas de oro que los buenos programadores siguen siempre:

**Regla 1: Nombra bien tus variables y métodos.**
`int e = 15;` es malo. `int edadEstudiante = 15;` es bueno. Un nombre descriptivo hace que el código se explique solo.

**Regla 2: Agrega comentarios cuando el código no sea obvio.**
Usa `//` para comentarios de una línea. No comentes lo obvio, comenta el porqué.

**Regla 3: Indenta correctamente tu código.**
El código correctamente indentado (con sangría) es mucho más fácil de leer y depurar. En Replit puedes presionar `Ctrl+Shift+F` para formatear automáticamente.

**Regla 4: Guarda y prueba frecuentemente.**
No escribas 100 líneas y luego ejecutes. Escribe 5-10 líneas, ejecuta, verifica que funciona, y sigue.

**Regla 5: No tengas miedo de buscar ayuda.**
La documentación oficial de Java, Stack Overflow, y tutoriales en línea son tus mejores amigos. Todos los programadores los usan constantemente.

---

## ⭐ PARTE 6 — RECORRIDO FINAL: TODO LO QUE APRENDISTE (aprox. 1 minuto 30 segundos)

---

Hagamos un último recorrido por todo lo que aprendieron en estas 6 lecciones:

### ✅ Lección 1 — El Comienzo
Aprendieron qué es programar, qué es Java, y escribieron su primer programa: el famoso "Hola Mundo". Usaron `System.out.println` para imprimir texto en pantalla.

### ✅ Lección 2 — Variables y Tipos de Datos
Aprendieron a guardar información en variables con los tipos `int`, `double`, `String` y `boolean`. Aprendieron que el `+` concatena texto con valores.

### ✅ Lección 3 — Estructuras de Control
Sus programas empezaron a tomar decisiones con `if/else` y a repetir acciones con `for` y `while`. Conocieron el operador módulo `%`.

### ✅ Lección 4 — Métodos y Scanner
Crearon sus propios métodos reutilizables y aprendieron a recibir información del usuario con la clase `Scanner`. Sus programas se volvieron interactivos.

### ✅ Lección 5 — Programación Orientada a Objetos
Dieron el salto más importante: crear clases (moldes) y objetos (instancias) para modelar cosas del mundo real con atributos y comportamientos propios.

### ✅ Lección 6 — Depuración y Cierre
Aprendieron a leer mensajes de error, corregir bugs, y las buenas prácticas que siguen los programadores profesionales.

---

## 🚀 PARTE 7 — ¿Y AHORA QUÉ? PRÓXIMOS PASOS (aprox. 1 minuto)

---

Este curso es solo el comienzo. Si quieren seguir aprendiendo Java —y los animo a hacerlo— aquí tienen su hoja de ruta:

**1. Sigan practicando con los ejercicios del repositorio.**
Revisen los archivos `completed-examples`. Intenten recrearlos sin mirar la solución.

**2. Exploren los próximos temas de Java:**
- **Herencia y polimorfismo** (la POO se pone más interesante)
- **Arreglos y listas** (guardar muchos datos a la vez)
- **Manejo de archivos** (leer y guardar datos en ficheros)
- **Interfaces gráficas** (crear aplicaciones con ventanas y botones)

**3. Recursos gratuitos que recomendamos:**
- **Oracle Java Documentation** → docs.oracle.com/javase (la fuente oficial)
- **W3Schools Java** → w3schools.com/java (tutoriales en inglés muy claros)
- **Programiz Java** → programiz.com/java-programming (perfecto para principiantes)

**4. Crea tus propios proyectos.**
La mejor forma de aprender a programar es... programar. Piensa en algo que quieras crear: un juego simple, una calculadora, un simulador... y empieza a construirlo. Equivócate, busca soluciones, pregunta, aprende.

---

## 💚 PARTE 8 — PALABRAS FINALES DE CIERRE (aprox. 30 segundos)

---

Ha sido un honor acompañarlos en este viaje. Han demostrado que con curiosidad, práctica y un poco de paciencia, cualquiera puede aprender a programar.

Recuerden: cada aplicación que usan en su teléfono, cada videojuego que juegan, cada sistema bancario, cada red social... fue construida por personas que empezaron exactamente donde están ustedes hoy: escribiendo su primer "Hola Mundo."

El mundo necesita más programadores. Y ustedes ya están en ese camino.

**¡Felicitaciones por completar el curso Java Fundamentals!** ☕🚀

*¡Hasta pronto, y que el código siempre compile a la primera!*
