// ============================================================
// CURSO DE PROGRAMACION
// CAPÍTULO 2: Variables y Tipos de Datos
// CÓDIGO FINAL COMPLETO
// ============================================================

public class Leccion2_Variables_Final {

    public static void main(String[] args) {

        // ---- Tipo int: números enteros ----
        int edad = 15;
        int anioNacimiento = 2009;
        int puntajeJuego = 1200;

        // ---- Tipo String: texto ----
        String nombre = "Jugador1";
        String ciudadFavorita = "Lima";
        String saludo = "¡Hola a todos!";

        // ---- Tipo double: números decimales ----
        double estatura = 1.65;
        double promedio = 17.5;

        // ---- Tipo boolean: verdadero o falso ----
        boolean meGustaJava = true;
        boolean tengoMascota = false;

        // ---- Imprimiendo las variables ----
        System.out.println("====== MI PERFIL DE JUGADOR ======");
        System.out.println("Nombre:        " + nombre);
        System.out.println("Edad:          " + edad + " años");
        System.out.println("Año de nac.:   " + anioNacimiento);
        System.out.println("Ciudad fav.:   " + ciudadFavorita);
        System.out.println("Estatura:      " + estatura + " m");
        System.out.println("Promedio:      " + promedio);
        System.out.println("Puntaje:       " + puntajeJuego + " puntos");
        System.out.println("¿Le gusta Java?: " + meGustaJava);
        System.out.println("¿Tiene mascota?: " + tengoMascota);

        // ---- Operaciones con variables ----
        System.out.println("==================================");
        int edadDoble = edad * 2;
        System.out.println("El doble de tu edad sería: " + edadDoble);

        String mensajeCompleto = saludo + " Me llamo " + nombre + ".";
        System.out.println(mensajeCompleto);

        // ---- Cambiar el valor de una variable ----
        puntajeJuego = puntajeJuego + 500;
        System.out.println("Nuevo puntaje tras ganar 500 puntos: " + puntajeJuego);

    }

}
