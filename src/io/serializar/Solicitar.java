package io.serializar;

import java.io.*;
import java.util.*;

public class Solicitar {
  
  Scanner sc = new Scanner(System.in);
  File fich;

  public String mostrarMenu(){
    System.out.println("1- Leer datos del fichero");
    System.out.println("2- Pedir datos");
    System.out.println("3- Mostrar datos");
    System.out.println("0- Salir");
    System.out.println("Introduce una opción:");
    String opcion = sc.nextLine();
    return opcion;
  }
  
}
