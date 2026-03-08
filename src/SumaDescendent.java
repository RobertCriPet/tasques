
public class SumaDescendent {
    private long numero;

    public SumaDescendent(long numero) {
        this.numero = numero;
    }

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