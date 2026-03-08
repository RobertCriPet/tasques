/**
 * La clase Polidivisible permite verificar si un número cumple con la propiedad
 * de ser divisible por su longitud y si, al quitarle dígitos, sigue siendo polidivisible.
 * * @author Robert Cristian Petric Petric
 * @version 1.0
 */
public class Polidivisible {

    private long numero;

    /**
     * Constructor que inicializa la clase con un número.
     * @param numero El número (long) a evaluar.
     */
    public Polidivisible(long numero) {
        this.numero = numero;
    }

    /**
     * Comprueba si el número contiene exactamente todos los dígitos
     * desde 0 hasta (longitud - 1) sin repetir ninguno.
     * @return true si cumple la condición de dígitos, false en caso contrario.
     */
    private boolean tieneDigitosCorrectos() {
        String s = String.valueOf(this.numero);
        int n = s.length();
        boolean[] encontrado = new boolean[n];

        for (int i = 0; i < n; i++) {
            int digito = Character.getNumericValue(s.charAt(i));
            if (digito >= n) {
                return false;
            }
            if (encontrado[digito]) {
                return false;
            }

            encontrado[digito] = true;
        }
        return true;
    }

    /**
     * Determina si el número es polidivisible.
     * Un número es polidivisible si es divisible por su longitud y,
     * al quitarle el último dígito, el resto sigue siendo polidivisible.
     * @return true si es polidivisible, false en caso contrario.
     */
    public boolean esPolidivisible() {
        if (!tieneDigitosCorrectos()) {
            return false;
        }

        long temp = this.numero;
        String s = String.valueOf(temp);
        int longitudActual = s.length();

        while (temp > 0) {
            if (temp % longitudActual != 0) {
                return false;
            }
            temp /= 10;
            longitudActual--;
        }

        return true;
    }
}