// ============================================================
// CURSO DE PROGRAMACION
// CAPÍTULO 6: Depuración y Cierre
// CÓDIGO FINAL CORREGIDO (sin errores)
// ============================================================

public class Leccion6_Cierre_Final {

    // Corrección 1: Se añadió el punto y coma faltante al final de println
    public static void mostrarMensaje(String texto) {
        System.out.println("Mensaje: " + texto);
    }

    // Corrección 2: Se cambió "publc" por "public"
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int resultado = multiplicar(4, 5);
        System.out.println("4 x 5 = " + resultado);

        // Corrección 3: Se cerró correctamente la comilla de la cadena de texto
        String despedida = "¡Felicidades, completaste el curso!";
        mostrarMensaje(despedida);

        // Corrección 4: Se cambió i-- por i++ para contar hacia arriba
        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("¡Sigue aprendiendo Java! 🚀");

        // Resumen de lo que aprendiste en el curso
        System.out.println("\n========================================");
        System.out.println("       RESUMEN DEL CURSO JAVA           ");
        System.out.println("========================================");
        System.out.println("✅ Lección 1: Hola Mundo y primer programa");
        System.out.println("✅ Lección 2: Variables y tipos de datos");
        System.out.println("✅ Lección 3: if/else, for y while");
        System.out.println("✅ Lección 4: Métodos y Scanner");
        System.out.println("✅ Lección 5: Clases y objetos (POO)");
        System.out.println("✅ Lección 6: Depuración y buenas prácticas");
        System.out.println("========================================");
        System.out.println("  ¡Lo lograste! Eres un programador Java. ");
        System.out.println("========================================");

    }

}
