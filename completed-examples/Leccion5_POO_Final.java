// ============================================================
// CURSO DE PROGRAMACION
// CAPÍTULO 5: Introducción a la POO
// CÓDIGO FINAL COMPLETO
// ============================================================

// ---- Definición de la clase Mascota ----
class Mascota {

    // Atributos (características de la mascota)
    String nombre;
    String tipoAnimal;
    int edad;
    String colorPelo;

    // Método: presentarse
    public void presentarse() {
        System.out.println("🐾 Hola, soy " + nombre + ".");
        System.out.println("   Soy un " + tipoAnimal + " y tengo " + edad + " años.");
        System.out.println("   Mi color de pelo es: " + colorPelo + ".");
    }

    // Método: hacerSonido
    public void hacerSonido() {
        if (tipoAnimal.equals("perro")) {
            System.out.println("   " + nombre + " dice: ¡Guau Guau! 🐶");
        } else if (tipoAnimal.equals("gato")) {
            System.out.println("   " + nombre + " dice: ¡Miau! 🐱");
        } else if (tipoAnimal.equals("pájaro")) {
            System.out.println("   " + nombre + " dice: ¡Pío Pío! 🐦");
        } else {
            System.out.println("   " + nombre + " hace un sonido misterioso...");
        }
    }

    // Método: cumplirAnios
    public void cumplirAnios() {
        edad = edad + 1;
        System.out.println("   🎂 ¡" + nombre + " cumple un año más! Ahora tiene " + edad + " años.");
    }

}

// ---- Clase principal ----
public class Leccion5_POO_Final {

    public static void main(String[] args) {

        System.out.println("=== REFUGIO DE MASCOTAS ===\n");

        // ---- Crear el primer objeto ----
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Firulais";
        mascota1.tipoAnimal = "perro";
        mascota1.edad = 3;
        mascota1.colorPelo = "marrón";

        mascota1.presentarse();
        mascota1.hacerSonido();
        mascota1.cumplirAnios();

        System.out.println();

        // ---- Crear el segundo objeto ----
        Mascota mascota2 = new Mascota();
        mascota2.nombre = "Mishi";
        mascota2.tipoAnimal = "gato";
        mascota2.edad = 2;
        mascota2.colorPelo = "blanco y negro";

        mascota2.presentarse();
        mascota2.hacerSonido();

        System.out.println();

        // ---- Crear el tercer objeto ----
        Mascota mascota3 = new Mascota();
        mascota3.nombre = "Pichito";
        mascota3.tipoAnimal = "pájaro";
        mascota3.edad = 1;
        mascota3.colorPelo = "verde";

        mascota3.presentarse();
        mascota3.hacerSonido();

        System.out.println("\n=== FIN DEL REFUGIO ===");

    }

}
