public class Operaciones {
    public static void main(String[] args) {
        int a = 7, b=5;
        String cadena ="5x";
        int cantidad;
        try {
            //double division =a/b;
            //System.out.println("DIvision " + division);
            cantidad = Integer.parseInt(cadena);
            b= a + cantidad;
            System.out.println(b);
            ///jjbjkb
        }
        catch (NumberFormatException e)
        {
            System.err.println(cadena + "no es posible convertir a entero");

        }
//        catch (ArithmeticException e){
//            System.out.println("Error Division entre cero");
//        }

    }
}
