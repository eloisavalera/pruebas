package io;

import java.io.*;
import java.net.URL;

public class Streams {
  public static void main(String[] args) throws IOException{
    
    // lectura y escrutura de streams
    File f;      
    //escribir bytes
    try {
      f = new File("bytes.txt");
      FileOutputStream fos = new FileOutputStream(f);
      fos.write(104);
      fos.write(111);
      fos.write(115);
      fos.write(116);
      fos.close();
    } catch (Exception e) {
    }
    //leer
    try {
      f = new File("bytes.txt");
      FileInputStream fis = new FileInputStream(f);            
      int tamano = fis.available();
      byte[] array = new byte[tamano];
      fis.read(array);
      for(int aux : array)
        System.out.print(aux + " ");
      fis.close();
    } catch (Exception e) {
    }
    
    try {
      //escribir
      f = new File("caracteres.txt");
      FileWriter fw = new FileWriter(f);
      fw.write("hola me llamo carlos");
      fw.close();

      //leer
      f = new File("caracteres.txt");
      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);
      String s = br.readLine();
      System.out.println(s);
      br.close();
      fr.close();
    } catch (Exception e) {
    }
  }
}
