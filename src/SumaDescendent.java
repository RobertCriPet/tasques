/**
 * La clase SumaDescendente permite calcular la suma de un número y los 
 * números resultantes de eliminar sucesivamente su dígito más significativo.
 * * @author Robert Cristian Petric Petric
 * @version 1.0
 */
public class SumaDescendent {

    /** El número base para calcular la suma */
    private long numero;

    /**
     * Constructor que inicializa la clase con un número concreto.
     * * @param numero El número (long) sobre el cual se realizará la operación.
     */
    public SumaDescendent(long numero) {
        this.numero = numero;
    }

    /**
     * Calcula la suma descendente del número proporcionado al constructor.
     * <p>
     * Ejemplo: para el número 4578, calcula: 4578 + 578 + 78 + 8.
     * </p>
     * * @return El resultado de la suma descendente como un valor long.
     */
    public long suma() {
        long sumaTotal = 0;
        // Convertimos el número a String para manipular los dígitos fácilmente
        String numeroStr = String.valueOf(this.numero);

        // Recorremos la cadena para ir quitando el dígito más significativo
        for (int i = 0; i < numeroStr.length(); i++) {
            // Obtenemos la subcadena desde la posición i hasta el final
            String subNumero = numeroStr.substring(i);
            // Convertimos la subcadena de nuevo a long y la acumulamos
            sumaTotal += Long.parseLong(subNumero);
        }

        return sumaTotal;
    }
}