package pruebaInstanceof;

public class Punto3D extends Punto {
     private int z;

     public Punto3D ( int x, int y, int z ) {
         super(x,y);
         this.z = z;
     }

     // Devuelve la distancia al eje de coordenadas
     public float distancia() {
         return (float) Math.sqrt(Math.pow(x,2.0)+Math.pow(y,2.0)+Math.pow(z,2.0));
     }
}