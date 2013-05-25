package pruebaInstanceof;

public class Main {
     public Main() {
     }

     
     public static boolean is3D(Punto p) {
         return (p instanceof Punto3D);
     }

     public static void main(String[] args) {
         Punto p2 = new Punto(0,0);
         Punto p3 = new Punto3D(0,0,10);

         System.out.println(is3D(p2));
         System.out.println(is3D(p3));
     }
}
