# 🎬 GUION — LECCIÓN 1: ¿Qué es Java y la Programación?
## Curso Java Fundamentals
**Duración estimada:** 10 minutos de lectura pausada
**Herramienta:** Replit o OnlineGDB (sin instalación)

---

> ### 📋 NOTAS PARA EL PONENTE
> - Abre Replit antes de comenzar. Ten listo el archivo `Main.java` en pantalla.
> - Habla despacio. Esta es la primera vez que muchos estudiantes ven código.
> - Cuando escribas código en vivo, **deletrea cada símbolo**: "punto y coma", "llaves", "paréntesis".
> - Si alguien pregunta algo muy técnico, di: "¡Excelente pregunta! Lo veremos en las próximas lecciones."
> - Usa pausas de 3-5 segundos después de cada pregunta retórica para generar reflexión.

---

## 🟢 PARTE 1 — BIENVENIDA (aprox. 1 minuto 30 segundos)

---

¡Hola a todos! ¡Muy buenas! Bienvenidos, bienvenidas, a la primera lección del curso **Java Fundamentals**.

Antes de comenzar, quiero que sepan algo: **no importa si nunca han tocado código en su vida.** Este curso está diseñado exactamente para ustedes. Si pueden enviar un mensaje de texto o jugar un videojuego, ya tienen la mente perfecta para aprender a programar.

Mi nombre... bueno, me conocerán a través de este guion, y juntos vamos a recorrer un viaje de seis lecciones. Al final de este viaje, van a poder crear sus propios programas en Java. Y eso... eso es algo que muy poca gente en el mundo sabe hacer. Así que felicitaciones por dar este primer paso.

Hoy, en esta primera lección, vamos a responder tres preguntas fundamentales:

1. ¿Qué es programar?
2. ¿Qué es Java y por qué lo usamos?
3. ¿Cómo escribimos y ejecutamos nuestro primer programa?

¿Listos? Vamos a empezar.

---

## 🟡 PARTE 2 — TEORÍA: ¿Qué es programar? (aprox. 2 minutos 30 segundos)

---

Imaginen esto: están en una cocina, y quieren preparar un pastel de chocolate.

¿Qué necesitan? Una **receta**. La receta les dice exactamente qué ingredientes usar, en qué orden mezclarlos, cuánto tiempo hornear... paso a paso.

Pues bien, **programar es exactamente eso: escribir una receta para la computadora.**

La computadora es increíblemente poderosa. Puede hacer millones de operaciones en un segundo. Pero —y esto es muy importante— **la computadora sola no sabe nada.** Es un chef que nunca ha cocinado. Espera que alguien le diga exactamente qué hacer, paso a paso, sin saltarse ningún detalle.

Nosotros somos los que escribimos esa receta. Y el lenguaje con el que escribimos esa receta se llama... **lenguaje de programación.**

Existen muchos lenguajes de programación. Python, JavaScript, C++, Kotlin... pero en este curso vamos a aprender **Java.**

Ahora, ¿por qué Java? Muy buena pregunta.

Java es uno de los lenguajes de programación más usados en el mundo. Existe desde 1995 —sí, tiene más de 30 años— y sigue siendo extremadamente relevante hoy en día. Se usa para:

- Crear aplicaciones de Android que están en millones de teléfonos.
- Construir sistemas bancarios que manejan millones de dólares.
- Desarrollar videojuegos como el famoso Minecraft, que originalmente fue escrito en Java.
- Diseñar sistemas de inteligencia artificial y análisis de datos.

¿Qué significa todo esto para ustedes? Que aprender Java no es solo para una tarea escolar. Es una **habilidad del mundo real** que abre puertas enormes en el futuro.

Otra cosa genial de Java es su lema histórico: **"Write Once, Run Anywhere"**, que en español significa "Escríbelo una vez, ejecútalo en cualquier lugar." Un programa en Java puede correr en Windows, Mac, Linux, teléfonos... todo con el mismo código.

---

## 🟠 PARTE 3 — PRESENTACIÓN DEL ENTORNO (aprox. 1 minuto 30 segundos)

---

Ahora, antes de escribir nuestro primer programa, déjenme mostrarles dónde lo vamos a hacer.

*[NOTA PONENTE: Navega a replit.com o a onlinegdb.com/online_java_compiler en pantalla.]*

Estamos usando **Replit** —o como alternativa, **OnlineGDB**— porque son editores de código que funcionan **directamente en el navegador de internet.** No necesitan descargar nada. No necesitan instalar ningún programa. Solo necesitan una computadora con internet.

*[NOTA PONENTE: Muestra el editor en pantalla. Señala las tres áreas principales.]*

Miren la pantalla. Tienen tres áreas principales:

**Área 1 — El Editor de Código:** Es la parte grande del centro, donde van a escribir su código. Piénsenlo como el cuaderno donde escriben la receta.

**Área 2 — El Explorador de Archivos:** A la izquierda, pueden ver los archivos de su proyecto. Vamos a trabajar principalmente con el archivo llamado `Main.java`.

**Área 3 — La Consola o Terminal:** Es la parte de abajo —o a la derecha, dependiendo del editor. Aquí es donde van a ver el **resultado** de su programa cuando lo ejecuten. Es como la pantalla donde el chef te muestra el pastel terminado.

¿Ven el botón verde que dice **"Run"** o **"Ejecutar"**? Ese es el botón más importante hoy. Ese botón le dice a la computadora: "Lee mi receta y hazla ahora."

---

## 🔵 PARTE 4 — DEMO PRÁCTICA: Hola Mundo (aprox. 3 minutos)

---

¡Muy bien! Ha llegado el momento. Vamos a escribir nuestro **primer programa en Java.**

Existe una tradición en el mundo de la programación: el primer programa que cualquier programador escribe siempre imprime las palabras "Hola Mundo". Es como el bautizo de todo programador. Y hoy, ustedes van a ser bautizados como programadores de Java.

*[NOTA PONENTE: Escribe el código lentamente en el editor mientras lo explicas en voz alta.]*

Miren lo que voy a escribir:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
}
```

Vamos línea por línea, porque cada parte tiene un significado:

**Línea 1: `public class Main`**

Todo en Java vive dentro de una **clase**. Por ahora, piensen en una clase como una carpeta o un contenedor que guarda nuestro código. La clase se llama `Main` porque es nuestra clase principal. La palabra `public` significa que cualquiera puede verla y usarla. Las llaves `{` y `}` son los límites de esa carpeta —todo lo que está entre ellas pertenece a la clase.

**Línea 2: `public static void main(String[] args)`**

Esta línea es **el punto de partida de todo programa Java.** Es donde Java empieza a leer. Cuando presionen el botón "Run", Java busca exactamente esta línea y comienza desde aquí. Por ahora, solo memorícenla tal como es —la entenderán mejor en las siguientes lecciones.

**Línea 3: `System.out.println("¡Hola Mundo!");`**

¡Esta es la línea más importante! Esta es la instrucción que le dice a la computadora: **"Imprime esto en pantalla."**

Vamos a leerla en partes:
- `System` → le habla al sistema operativo de la computadora.
- `out` → le dice que quiere mostrar algo en la salida estándar, que es la consola.
- `println` → viene de "print line", que significa "imprime una línea".
- Entre comillas dobles va el **texto que queremos mostrar.**
- El punto y coma `;` al final es obligatorio. En Java, cada instrucción termina con punto y coma, igual que en español una oración termina con punto.

*[NOTA PONENTE: Señala físicamente el punto y coma. Repítelo varias veces. Es el error más común.]*

¿Están listos para ver la magia? ¡Vamos a ejecutar esto!

*[NOTA PONENTE: Presiona el botón "Run" y espera que aparezca "¡Hola Mundo!" en la consola.]*

¡Lo ven! Dice **"¡Hola Mundo!"** ¡Ese texto lo pusieron ustedes! La computadora hizo exactamente lo que le dijeron. ¡Eso es programar!

Ahora, hagamos algo más personal. Cambiemos el texto:

```java
System.out.println("¡Hola, me llamo Estudiante!");
System.out.println("Estoy aprendiendo Java.");
System.out.println("¡Esto es increíble!");
```

*[NOTA PONENTE: Modifica el código y ejecuta de nuevo. Invita a los estudiantes a cambiar el nombre.]*

¿Ven? Cada `println` imprime una línea diferente. Pueden agregar tantas como quieran.

---

## 🟣 PARTE 5 — RESUMEN Y CONCEPTOS CLAVE (aprox. 1 minuto)

---

Muy bien, hagamos un repaso rápido de lo que aprendimos hoy:

✅ **Programar** es escribir instrucciones paso a paso para que una computadora las ejecute.

✅ **Java** es un lenguaje de programación poderoso, muy usado en el mundo real, que funciona en múltiples plataformas.

✅ Todo programa Java necesita una **clase** y un método llamado **`main`** que es donde comienza la ejecución.

✅ `System.out.println("...")` es la instrucción para **mostrar texto en pantalla**.

✅ Cada instrucción en Java termina con un **punto y coma** `;`.

✅ Usamos **Replit u OnlineGDB** para escribir y ejecutar código Java directamente en el navegador, sin instalar nada.

---

## ⭐ PARTE 6 — DESPEDIDA Y PRÓXIMA LECCIÓN (aprox. 30 segundos)

---

¡Eso es todo por la Lección 1! Han escrito su **primer programa en Java.** Sé que puede parecer pequeño —solo unas líneas de texto— pero acaban de dar el paso más importante: empezar.

En la próxima lección, vamos a aprender sobre **variables**: cómo guardar información como números, nombres y otros datos en nuestros programas.

Mientras tanto, los invito a explorar: ¿qué más pueden imprimir con `System.out.println`? Prueben cosas diferentes. Rompan el código. Equivóquense. ¡Eso es exactamente cómo se aprende!

Antes de despedirnos, les dejo una pequeña tarea para la casa: intenten usar `System.out.println` para imprimir un dibujo hecho con texto en la pantalla, por ejemplo, un arbolito de navidad o una cara feliz. ¡Pónganse creativos! La solución estará en la descripción de este video.

¡Hasta la próxima lección, y recuerden: **todo gran programador empezó exactamente donde están ustedes hoy!** ☕🚀
