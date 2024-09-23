
package copybytesimaxes;

import javax.swing.*;
import java.io.File;

/**
 * clase menu donde eligiremos lo que queramos
 * @author cristian
 * @version 1.0
 */
public class Menu {

	/**
	 * objetos que usamos mas adelante
	 */
    copybytesMethods copy = new copybytesMethods();
    File myFile;
    File myFile2;
    /**
     * metodo del menu
     */
    public void mainMenu() {

    	String pregunta = "si";
    	String afirmar = "si";
    	String negar = "no";

    	/**
    	 * mientras la respuesta sea sí, se mete en el codigo
    	 */
    	while(pregunta.equalsIgnoreCase(afirmar)) {
    		/**
    		 * preguntamos que opcion quiere
    		 */
    		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a copyBytes, introduce una opcion: " +
                    "\nOpcion 1: Copiar imagen foto.jpg a foto2.jpg" +
                    "\nOpcion 2: Añadir la imagen foto.jpg a foto2.jpg(la añade a mayores)" +
                    "\nOpcion 3: Salir de la aplicacion"));
                
                while(opcion > 3 || opcion < 1){
                    /**
    		 * preguntamos que opcion quiere otra vez por si se equivoca
    		 */
    		 opcion = Integer.parseInt(JOptionPane.showInputDialog("Opcion incorrecta, por favor, introduce una opcion: " +
                   "\nOpcion 1: Copiar imagen foto.jpg a foto2.jpg" +
                    "\nOpcion 2: Añadir la imagen foto.jpg a foto2.jpg(la añade a mayores)" +
                    "\nOpcion 3: Salir de la aplicacion"));
                }
    		  switch (opcion) {
    		  /**
    		   * llamamos a los metodos
    		   */
              case 1:
                  copy.copyFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/copyBytesImaxe/foto.jpg"),
                          myFile2 = new File("/home/dam/Desktop/DAM2/Acceso a Datos/copyBytesImaxe/foto2.jpeg"));
                  break;
              case 2:
            	  copy.appendFile(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/copyBytesImaxe/foto.jpg"),
                  myFile2 = new File("/home/dam/Desktop/DAM2/Acceso a Datos/copyBytesImaxe/foto2.jpeg"));

                  break;
              case 3:
                  System.exit(0);
          }

                  
    		pregunta = JOptionPane.showInputDialog("Quieres volver a usar una opcion?" +
    		"\nresponde (si) si quieres, responde (no) si no quieres");
    	}




    }
}

