package io.serializar;

import java.io.*;
import java.util.Scanner;

public class Agenda {
  public static void main (String[] args){
    
    Scanner sc = new Scanner(System.in);
    Solicitar pedir = new Solicitar();
    Contacto contacto = new Contacto();
    
    
    int opcion = 0;
    String path = "/home/theasker/DAW/programacion/pruebas/src/io/serializar/contactos.dat";
    File fich = new File(path);
    Serializadora serializar = new Serializadora();
    // Cargar el fichero serializado con el objeto Contacto
    // listaDeObjetosCliente = (ArrayList) serializar.leerObjeto(PATH);  
    
    
    
    
    // menu ///////////////////////////////////////////////////////
    do{
      try{
        opcion = Integer.parseInt(pedir.mostrarMenu());
      }catch (NumberFormatException nfe){ 
        System.err.println("Elige una opcion del menú");
        opcion = 10;
      }
      switch (opcion){
        case 0:
          break;
        case 1:
          break;
        case 2:
          System.out.print("Introduce un nombre: ");
          contacto.setNombre(sc.nextLine());
          System.out.print("Introduce un tfno: ");
          contacto.setTelefono(sc.nextLine());
          break;
        case 3:
          System.out.println("El nombre es:"+ contacto.getNombre());
          System.out.println("El tfno es:"+ contacto.getTelefono());
          break;
      }      
    }while(opcion != 0);
  }
}
