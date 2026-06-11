// ============================================================
// CURSO DE PROGRAMACION
// CAPÍTULO 3: Estructuras de Control
// CÓDIGO FINAL COMPLETO
// ============================================================

public class Leccion3_Control_Final {

    public static void main(String[] args) {

        // ============================================
        // PARTE 1: Bucle FOR — contar del 1 al 10
        // ============================================
        System.out.println("=== CONTANDO DEL 1 AL 10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
        }

        // ============================================
        // PARTE 2: IF/ELSE — par o impar
        // ============================================
        System.out.println("\n=== ¿PAR O IMPAR? ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " → es PAR");
            } else {
                System.out.println(i + " → es IMPAR");
            }
        }

        // ============================================
        // PARTE 3: Condición IF con múltiples ramas
        // ============================================
        System.out.println("\n=== CLASIFICAR NOTA ===");
        int nota = 14;

        if (nota >= 18) {
            System.out.println("Nota " + nota + ": ¡Excelente! A+");
        } else if (nota >= 14) {
            System.out.println("Nota " + nota + ": ¡Muy bien! B");
        } else if (nota >= 11) {
            System.out.println("Nota " + nota + ": Aprobado. C");
        } else {
            System.out.println("Nota " + nota + ": Desaprobado. A estudiar más.");
        }

        // ============================================
        // PARTE 4: WHILE — cuenta regresiva
        // ============================================
        System.out.println("\n=== CUENTA REGRESIVA ===");
        int contador = 5;
        while (contador >= 1) {
            System.out.println(contador + "...");
            contador--;
        }
        System.out.println("¡DESPEGUE! 🚀");

        // ============================================
        // PARTE 5: Bucle FOR con acumulador
        // ============================================
        System.out.println("\n=== SUMA DEL 1 AL 100 ===");
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println("La suma de 1 al 100 es: " + suma);

    }

}
