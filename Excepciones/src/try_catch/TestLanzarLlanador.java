package try_catch;
import java.io.*;
public class TestLanzarLlanador {
    public static void main(String[] args) {
        try {
            int data = leerByteDesdeArchivo();
        } catch (IOException e) {
            System.out.println("muetra la excepcion > " + e.getMessage());
        }
    }

    public static int leerByteDesdeArchivo() throws IOException {
        try (InputStream in = new FileInputStream("E:\\dataJava\\list.txt")) {
            System.out.println("File open");
            return in.read();
        }
        catch (IOException e){
            //e.printStackTrace();
            System.out.println("Error del throw");
            throw  e; //lanza la excepcion al padre - llamador
        }
    }
}
