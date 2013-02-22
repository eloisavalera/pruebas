package serializador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializadora{
  private ObjectInputStream lectorDeObjetos;
  private ObjectOutputStream escritorDeObjetos;
  private String path;

  public void setPath(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }
  
  public void escribirObjeto(Object objeto) throws FileNotFoundException, IOException{
    escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(path));
    escritorDeObjetos.writeObject(objeto);
  }

  public Object leerObjeto(String nombreDelArchivo) throws FileNotFoundException, IOException, ClassNotFoundException{
    lectorDeObjetos = new ObjectInputStream(new FileInputStream(nombreDelArchivo));
    return lectorDeObjetos.readObject();
  }
}
