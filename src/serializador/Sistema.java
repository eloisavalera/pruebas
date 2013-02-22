package serializador;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Sistema {
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
    String path = "/home/theasker/Escritorio/DAW/programacion/pruebas/src/serializador/objeto.dat";
    //grabar objeto
    Contacto grabarContacto = new Contacto("Mauri","Segura");
    Serializadora serializadora = new Serializadora();
    serializadora.setPath(path);
    serializadora.escribirObjeto(grabarContacto);
    //leer objeto
    Contacto leerContacto = null;
    serializadora.setPath(path);
    leerContacto = (Contacto) serializadora.leerObjeto(serializadora.getPath());
    System.out.println(leerContacto.getNombre());
    System.out.println(leerContacto.getApellido());
  }  
}
