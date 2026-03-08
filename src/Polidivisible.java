
public class Polidivisible {

    private long numero;

    public Polidivisible(long numero) {
        this.numero = numero;
    }

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