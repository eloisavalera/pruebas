package Colecciones;

import java.util.Vector;


class Coche {
    private int numCoche;
    Coche( int i ) {
        numCoche = i;
    }
    void print() {
        System.out.println( "Coche #"+numCoche );
    }
}
  
class Barco {
    private int numBarco;
    Barco( int i ) {
        numBarco = i;
    }
    void print() {
        System.out.println( "Barco #"+numBarco );
    }
}

public class java411 {
    public static void main( String args[] ) {
        Vector coches = new Vector();
        for( int i=0; i < 7; i++ )
            coches.addElement( new Coche( i ) );
        // No hay ningun problema en añadir un barco a los coches
        coches.addElement( new Barco( 7 ) );
        for( int i=0; i < coches.size(); i++ )
            (( Coche )coches.elementAt( i ) ).print();
        // El barco solamente es detectado en tiempo de ejecución
    }
}
