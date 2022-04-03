public class Testtrouhts
{
    public static void main(String[] args) {
        String cadena = "abcde";
        int    posicion = -2;
        char letra = ' ';
        try {
            letra = getLetra(cadena,posicion);
            System.out.println(letra );
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Error  Index al extraer en "+cadena+" "+posicion);
        }
        catch (Exception e) {
            System.err.println("Error al extraer en "+cadena+" "+posicion);
        }
    }
    public static char getLetra(String cadena, int posicion)  throws Exception
    {
        char c =  cadena.charAt(posicion);
        return c;
    }
}
