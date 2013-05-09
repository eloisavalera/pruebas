package prog09;

import java.util.Enumeration;
import java.util.Hashtable;

public class CuentaCorriente extends Cuenta{
  protected Hashtable <String,Double> listaEntidesAutorizadas;
  public CuentaCorriente (Persona p, Double s, String c){
    super(p,s,c);
    listaEntidesAutorizadas = new Hashtable<String,Double>();
  }
  /*public void getter (){
    super.getter();
    Enumeration<String> it = listaEntidesAutorizadas.keys();
    System.out.println("La lista de entidades autorizadas es:");
    String clave =  null;
    while((clave = it.nextElement()) != null){
      System.out.println(clave);
    }
    //aquí no hace falta sobreescribirlo
  }*/
}