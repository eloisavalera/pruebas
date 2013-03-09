package io;

import java.io.*;
import java.util.Scanner;

public class SerializarArray {
  
  private ObjectInputStream lectorObjetos;
  private ObjectOutputStream escritorObjetos;
  static final String fichero = "serializarArray.dat";
  
  public static void main(String[] args){
    SerializarArray clase = new SerializarArray();
    Scanner leer = new Scanner(System.in);
    String[] palabras = new String[5];
    File fich = new File(fichero);
    
    for(int i = 0;i<5;i++){
      palabras[i] = leer.nextLine();
    }
    String[] copiaPalabras = new String[5];
    if(fich.exists()){ // si existe el fichero lo leemos de allí.
      try {
        fich.delete();
        copiaPalabras = (String[]) clase.leerObjeto();
      } catch (Exception ex) {
      }
    }else{ // si no existe guardamos el array en el fichero y lo leemos
      try {
        clase.escribirObjeto(palabras);
        copiaPalabras = (String[]) clase.leerObjeto();
      } catch (Exception ex) {
      }
    }
    clase.visualizar(palabras); // visaulizamos el objeto leido del fichero
  }
  
  public void visualizar(String[] array){
    for(String elem_palabras: array){
      System.out.println(elem_palabras);
    }
  }
  
  public Object leerObjeto() throws Exception {
    lectorObjetos = new ObjectInputStream(new FileInputStream(fichero));
    return lectorObjetos.readObject();
  }
  public void escribirObjeto(Object objeto) throws Exception{
    escritorObjetos = new ObjectOutputStream(new FileOutputStream(fichero));
    escritorObjetos.writeObject(objeto);
    escritorObjetos.close();
  }
  
}
