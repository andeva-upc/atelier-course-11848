// ============================================================
// CURSO DE PROGRAMACION
// CAPÍTULO 4: Métodos y Entrada/Salida con Scanner
// CÓDIGO FINAL COMPLETO
// ============================================================

import java.util.Scanner;

public class Leccion4_Metodos_Final {

    // ---- Método 1: saludar (no retorna nada) ----
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso de Java.");
        System.out.println("¡Es un gusto tenerte aquí hoy!");
    }

    // ---- Método 2: sumar (retorna un entero) ----
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    // ---- Método 3: esMayorDeEdad (retorna verdadero o falso) ----
    public static boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // ---- Método 4: mostrarBarra (crea una línea decorativa) ----
    public static void mostrarBarra() {
        System.out.println("==============================");
    }

    // ---- Programa principal ----
    public static void main(String[] args) {

        // Crear el objeto Scanner para leer del teclado
        Scanner teclado = new Scanner(System.in);

        mostrarBarra();
        System.out.println("  BIENVENIDO AL CURSO DE JAVA");
        mostrarBarra();

        // Pedir el nombre al usuario
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = teclado.nextLine();

        // Pedir la edad al usuario
        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();

        mostrarBarra();

        // Llamar al método saludar
        saludar(nombre);

        // Usar el método esMayorDeEdad
        boolean mayor = esMayorDeEdad(edad);
        if (mayor) {
            System.out.println("Tienes " + edad + " años. Eres mayor de edad.");
        } else {
            System.out.println("Tienes " + edad + " años. Aún eres menor de edad, ¡pero ya programas!");
        }

        // Usar el método sumar
        int resultadoSuma = sumar(edad, 10);
        System.out.println("En 10 años tendrás " + resultadoSuma + " años.");

        mostrarBarra();
        System.out.println("¡Gracias, " + nombre + "! ¡Hasta la próxima lección! 🚀");
        mostrarBarra();

        // Cerrar el Scanner
        teclado.close();

    }

}
