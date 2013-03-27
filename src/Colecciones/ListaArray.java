package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaArray {
  public static void main(String args[]){
    ArrayList <Integer> lista=new ArrayList<Integer>();
    for (int i=0;i<10;i++) lista.add(i);
    Iterator<Integer> it=lista.iterator();
    while (it.hasNext()) {
      Integer t=it.next();
      if (t%2==0) it.remove();
    }
    Iterator<Integer> ite=lista.iterator();
    while (ite.hasNext()){
      System.out.println(ite.next());
    }
  }
}
