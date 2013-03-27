package Genericos;

public class Util<T> {
    T t1;
    public void invertir(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            t1 = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t1;
        }
    }
    
    public static void main(String args[]){
      Integer[] numeros={0,1,2,3,4,5,6,7,8,9};
      Util<Integer> u = new Util<Integer>();
      u.invertir(numeros);
      for (int i=0;i<numeros.length;i++) 
        System.out.println(numeros[i]);
    }
}
  

