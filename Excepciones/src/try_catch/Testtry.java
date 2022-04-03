package try_catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Testtry {
    public static void main(String[] args) {
        String rutaArchi = "E:\\dataJava\\lisa.txt";
        InputStream in=null;

        try {
            System.out.println("About to open a file");
            in = new FileInputStream(rutaArchi);
            System.out.println("File open");
            //leyendo el archivo
            int data = in.read();
            //cerrando el archivo
            in.close();

            System.out.println("File open" + String.valueOf(data));
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass().getName());
            System.out.println("file not found > " + rutaArchi);
        } catch (IOException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Error in reading file");
        } catch (Exception e) {
            System.out.println("Something went wrong! file not found");
            e.printStackTrace();
        } finally {
            try {
//                if (in != null) {in.close();
                if (in != null) {
                    in.close();
                    System.out.println("archivo cerrado por finally");
                }
            } catch (IOException e) {
                System.out.println("Failed to close file");
            }
        }
    }
}
