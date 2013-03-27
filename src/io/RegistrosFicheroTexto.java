import java.io.*;
import java.util.Scanner;

public class RegistrosFicheroTexto {
    //convirtiendo estas dos cosas en static no tienes que volver a crearlas ni dentro del main ni dentro de los             //métodos
    static Scanner sc = new Scanner(System.in);
    static File fich = new File("registros.txt");

    //lo mismo con los métodos, si los haces estáticos no tienes que crear un objeto de la clase RegistrosFicheroTexto.
    public static String mostrarMenu() {
        System.out.println("1- añadir registros");
        System.out.println("2- ver registros");
        System.out.println("0- Salir");
        System.out.println("Introduce una opción");
        return sc.nextLine();
    }

    public static void mostrarFichero() {

        String temp;
        String[] campos;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(fich));
            while ((temp = lector.readLine()) != null) {
                if (temp.length() != 0) {
                    campos = temp.split("-");
                    for (String s : campos) {
                        System.out.println(s);
                    }
                }
            }
            lector.close();
        } catch (IOException ioe) {
            System.err.println("Error al intentar leer");
        }
    }

    public static void guardarString(String texto) {
        try {
            //OJO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            //abrimos el fichero con un segundo parámetro para añadirle información al final
            //si no lo abrimos así, cada vez que escribe, borra lo de atrás
            FileWriter escritor = new FileWriter(fich, true);
            escritor.write(texto);
            escritor.close();
        } catch (IOException ex) {
            System.err.println("Error al intentar escribir");
        }
    }

    public static void main(String[] args) {

        String texto = "";
        if (fich.exists()) {
            mostrarFichero();
        }
        int opcion = 10;
        do {
            try {
                opcion = Integer.parseInt(mostrarMenu());
            } catch (Exception e) {
                System.out.println("Introduce una opción del menú");
            }

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un nombre: ");
                    texto = texto + sc.nextLine();
                    System.out.println("Introduce un telefono: ");
                   //OJO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    //he cambiado el | por un - por que daba problemas al romper el String
                    texto = texto + "-" + sc.nextLine() + "\n";
                    System.out.println("Los datos introducidos han sido: ");
                    System.out.println(texto);
                    guardarString(texto);
                    break;
                case 2:
                    mostrarFichero();
                    break;
            }
        } while (opcion != 0);
    }
}