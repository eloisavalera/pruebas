package io;

import java.io.*;
import java.util.Scanner;

public class temp {
  Scanner sc = new Scanner(System.in);
  public String fdatos = "registros.txt";
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    temp clase = new temp();
    String texto = "";
    
    File fich = new File("registros.txt");
    if (fich.exists()){
      try{
        BufferedReader lector = new BufferedReader(FileReader(fich));
      }catch(IOException ioe){
        System.err.println("Error de lectura del fichero");
      }
    }
    
    
    
    int opcion = 10;
    do{
      try{
        opcion = Integer.parseInt(clase.mostrarMenu());
      }catch (Exception e){
        System.err.println("Introduce una opción del menú");
      }
    
      switch(opcion){
        case 0:

          break;
        case 1:
          System.out.println("Introduce un nombre: ");
          texto = texto + sc.nextLine();
          System.out.println("Introduce un telefono: ");
          texto = texto + "|" + sc.nextLine() + "\n";
          System.out.println(texto);
          clase.guardarString(texto);
          break;
        case 2:
          break;
      }
    }while (opcion != 0);
    
  }
  
  public String mostrarMenu(){
    System.out.println("1- añadir registros");
    System.out.println("2- ver registros");
    System.out.println("0- Salir");
    System.out.println("Introduce una opción");
    return sc.nextLine();
  }
  public void guardarString(String texto){
    try {
      FileWriter escritor = new FileWriter(fdatos);
      escritor.write(texto);
      escritor.close();
    } catch (IOException ex) {
      System.err.println("Error al intentar escribir");
    }
  }
}
 