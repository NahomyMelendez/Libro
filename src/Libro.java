import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Libro {
    public static void main(String[] args) {
        String nombreArchivo = "indice.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Contenido del archivo
            String contenido = "Capítulo 1: Introducción a Git\n" +
                               "Capítulo 2: Flujo de trabajo básico\n" +
                               "Capítulo 3: Repositorios remotos";

            // Escribir el contenido en el archivo
            bw.write(contenido);
            
            System.out.println("El archivo '" + contenido + "' se ha creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
