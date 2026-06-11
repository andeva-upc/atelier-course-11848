// ============================================================
// CURSO DE PROGRAMACION
// CAPÍTULO 6: Depuración y Cierre
// ARCHIVO DE INICIO — Este código tiene ERRORES intencionales
// ¡Tu misión es encontrarlos y corregirlos!
// ============================================================

// INSTRUCCIONES:
// Este programa tiene exactamente 5 errores intencionales.
// Busca cada error, corrígelo y luego ejecuta el programa.
// Cuando funcione correctamente, verás el mensaje de cierre.

public class Leccion6_Cierre {

    // Error 1: Falta algo en la firma del método
    public static void mostrarMensaje(String texto) {
        System.out.println("Mensaje: " + texto)   // <-- ¿Qué falta aquí?
    }

    // Error 2: Este método tiene un error de escritura en la palabra reservada
    publc static int multiplicar(int a, int b) {   // <-- ¿Ves el error?
        return a * b;
    }

    public static void main(String[] args) {

        // Error 3: Esta variable no está bien declarada
        int resultado = multiplicar(4, 5);
        System.out.println("4 x 5 = " + resultado);

        // Error 4: Falta cerrar el paréntesis
        String despedida = "¡Felicidades, completaste el curso!";
        mostrarMensaje(despedida;

        // Error 5: Este bucle for tiene un error lógico (imprime en orden incorrecto)
        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i--) {   // <-- ¿Qué está mal aquí?
            System.out.println(i);
        }

        System.out.println("¡Sigue aprendiendo Java! 🚀");

    }

}
