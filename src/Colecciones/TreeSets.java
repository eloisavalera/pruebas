package Colecciones;

import java.util.TreeSet;

public class TreeSets {
  public static void main(String args[]){
    TreeSet <Integer> t;
    t=new TreeSet<Integer>();     
    t.add(new Integer(4));
    t.add(new Integer(3));
    t.add(new Integer(1));
    t.add(new Integer(99));
    t.add(new Integer(99));
    for (Integer i:t) System.out.println(i);
  }
}
