public class testMultiplesExcepciones {
    public static void main(String[] args) {
        int cantidad= 0;
        int divisor = 2;
        String cadena = "5xxx";

        try {
            cantidad = Integer.parseInt(cadena);
            System.out.println(cantidad);
            double resultado = (double) cantidad / divisor;
            System.out.println(resultado);
        }
        catch ( NumberFormatException e) {
            System.err.println(cadena + " no es un entero");
        }
        catch ( ArithmeticException e) {
            System.err.println("Error en "+cantidad+"/"+divisor);
        }
        finally {
        System.err.println("Se trabajo con "+cadena+" y  "+divisor);
    }
    }
}
