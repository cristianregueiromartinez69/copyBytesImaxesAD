package copybytesimaxes;

import javax.swing.*;
import java.io.*;

/**
 * clase con los metodos de copia y añadir texto a ficheros
 *
 * @author cristian
 * @version 1.0
 */
public class copybytesMethods {

    /**
     * metodo que copia texto de uno a otro
     *
     * @param pathFileSource el archivo origen
     * @param pathFileDest el archivo destino
     */
    public void copyFile(File pathFileSource, File pathFileDest) {

        byte[] buffer = new byte[1024];
        int longitudLeida;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(pathFileSource));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(pathFileDest))) {

            // Escribimos un salto de línea antes de añadir el nuevo contenido
            bos.write(System.lineSeparator().getBytes()); // Escribir salto de línea

            // Leer y escribir el contenido
            while ((longitudLeida = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, longitudLeida);
            }

            bos.close();

            System.out.println("Archivo añadido con éxito.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error a la hora de añadir texto al fichero");
            e.printStackTrace();
        }

    }

    /**
     * metodo que añade texto de uno a otro
     *
     * @param pathFileSource el archivo origen
     * @param pathFileDest el archivo destino
     */
    public void appendFile(File pathFileSource, File pathFileDest) {

        byte[] buffer = new byte[1024];
        int longitudLeida;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(pathFileSource));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(pathFileDest, true))) {

            // Escribimos un salto de línea antes de añadir el nuevo contenido
            bos.write(System.lineSeparator().getBytes()); // Escribir salto de línea

            // Leer y escribir el contenido
            while ((longitudLeida = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, longitudLeida);
            }

            bos.close();

            System.out.println("Archivo añadido con éxito.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error a la hora de añadir texto al fichero");
            e.printStackTrace();
        }
    }

}
