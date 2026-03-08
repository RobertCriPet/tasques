
public class Main {
    public static void main(String[] args) {

        // --- Prueba de la Clase SumaDescendente ---
        System.out.println("=== PRUEBA SUMA DESCENDENTE ===");
        long numeroPrueba = 4578;
        SumaDescendent sd = new SumaDescendent(numeroPrueba);

        System.out.println("Número original: " + numeroPrueba);
        System.out.println("Resultado (4578 + 578 + 78 + 8): " + sd.suma());
        System.out.println();


        // --- Prueba de la Clase Cableado ---
        System.out.println("=== PRUEBA CABLEADO USB ===");

        // Escenario 1: Es posible (Mismos Machos que Hembras)
        // Cables: MM (2 Machos), HH (2 Hembras) -> Total: 2M, 2H
        String[] cablesValidos = {"MM", "HH"};
        Cableado caja1 = new Cableado(cablesValidos);

        System.out.print("Caja 1 {MM, HH}: ");
        if (caja1.esPotConnectar()) {
            System.out.println("¡Se puede formar el círculo!");
        } else {
            System.out.println("No se puede conectar.");
        }

        // Escenario 2: Imposible (Diferente cantidad)
        // Cables: MM, MH, HM -> Total: 4 Machos, 2 Hembras
        String[] cablesInvalidos = {"MM", "MH", "HM"};
        Cableado caja2 = new Cableado(cablesInvalidos);

        System.out.print("Caja 2 {MM, MH, HM}: ");
        if (caja2.esPotConnectar()) {
            System.out.println("¡Se puede formar el círculo!");
        } else {
            System.out.println("No se puede conectar (sobran machos).");
        }

        // Escenario 3: Caso mixto
        // Cables: MH, HM -> Total: 2 Machos, 2 Hembras
        String[] cablesMixtos = {"MH", "HM"};
        Cableado caja3 = new Cableado(cablesMixtos);
        System.out.println("Caja 3 {MH, HM}: " + (caja3.esPotConnectar() ? "Posible" : "Imposible"));

        //Prueba polidivisible
        Polidivisible p1 = new Polidivisible(102);
        System.out.println("¿Es 102 polidivisible? " + (p1.esPolidivisible() ? "Sí" : "No"));

        // Prueba con un número que no cumple los dígitos (ej: 381654729 usa el 9 y la longitud es 9)
        Polidivisible p2 = new Polidivisible(381654729);
        System.out.println("¿Es 381654729 polidivisible según las reglas de dígitos? " + p2.esPolidivisible());
    }
}
