package testArchivoWithResources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestAcrchi {
    public static <InputStreamin> void main(String[] args) {
        System.out.println("a punto de abrir un archivo");
        String rutaArchi = "E:\\dataJava\\lista.txt";
//        en este caso el try se encarga de abrir y cerrar
        /////////////
        try (InputStream in = new FileInputStream(rutaArchi))
        {
//            in = new FileInputStream(rutaArchi);
            System.out.println("File open");
            int data = in.read();
        } catch (FileNotFoundException e)
         {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            for(Throwable t : e.getSuppressed())
                System.out.println(t.getMessage());
            }
    }

}
