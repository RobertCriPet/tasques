
public class Cableado {

    private String[] conectores;

    public Cableado(String[] conectores) {
        this.conectores = conectores;
    }

    public boolean esPotConnectar() {
        int machos = 0;
        int hembras = 0;

        // Recorremos cada cable del vector
        for (String cable : conectores) {
            // Analizamos los dos extremos de cada cable
            for (char extremo : cable.toUpperCase().toCharArray()) {
                if (extremo == 'M') {
                    machos++;
                } else if (extremo == 'H') {
                    hembras++;
                }
            }
        }

        // Un círculo solo es posible si el número de M es igual al de H
        return machos == hembras;
    }
}