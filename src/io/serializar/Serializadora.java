package io.serializar;

import java.io.*;

public class Serializadora {
  ObjectInputStream lectorObjeto;
  ObjectOutputStream escritorObjeto;
  String path = "/home/theasker/DAW/programacion/pruebas/src/io/serializar/contactos.dat";
  
  public Object leerObjeto(String path) throws Exception{
    lectorObjeto = new ObjectInputStream(new FileInputStream(path));
    return lectorObjeto.readObject();
  }
  
  public void escribirObjeto() throws Exception{
    escritorObjeto = new ObjectOutputStream(new FileOutputStream(path));
    
  }
}
