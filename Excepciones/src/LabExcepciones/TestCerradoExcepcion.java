package LabExcepciones;

public class TestCerradoExcepcion {
    public static void main(String[] args) {
        try {
            abrirLaPuerta();
        } catch (CerradoException e) {
            // printStackTrace muestra la traza de la excepcion.
            e.printStackTrace(System.err);
        }
        try {
            abrirLaVentana();
        } catch (CerradoException e) {
            // System.err es el stream de salida de errores
            // similar a System.out.
            e.printStackTrace(System.err);
        }
    }
    public static void abrirLaPuerta() throws CerradoException {
        System.out.println("abrirLaPuerta()? tiene candado!");
        throw new CerradoException ("Originado en abrirLaPuerta()");
    }

    public static void abrirLaVentana() throws CerradoException {
        System.out.println("abrirLaVentana()? Esta con cerrojo!");
        throw new CerradoException ("Originado en abrirLaVentana()");
    }
}