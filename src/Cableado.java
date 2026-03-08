/**
 * La clase Cableado permite determinar si un conjunto de cables USB 
 * puede formar un círculo cerrado perfecto.
 * * @author Robert Cristian Petric Petric
 * @version 1.0
 */
public class Cableado {

    /** Vector que contiene las descripciones de los cables (ej: "MH", "MM") */
    private String[] conectores;

    /**
     * Constructor que inicializa la clase con un array de cables.
     * * @param conectores Array de Strings donde cada elemento tiene dos letras (M o H).
     */
    public Cableado(String[] conectores) {
        this.conectores = conectores;
    }

    /**
     * Determina si es posible conectar todos los cables en un círculo.
     * Para que esto ocurra, el número total de conectores Macho (M) 
     * debe ser igual al número total de conectores Hembra (H).
     * * @return true si se puede formar un círculo, false en caso contrario.
     */
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