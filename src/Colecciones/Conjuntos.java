package Colecciones;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Conjuntos {
  public static void main(String[] args) {
    TreeSet<Integer> A= new TreeSet<Integer>();
    A.add(9); 
    A.add(19); 
    A.add(5); 
    A.add(7); 
    LinkedHashSet<Integer> B= new LinkedHashSet<Integer>();
    B.add(10); 
    B.add(20); 
    B.add(5); 
    B.add(7); 
    
    A.addAll(B);
    for(Integer i: A){
      System.out.println(i);
    }
  }
}
