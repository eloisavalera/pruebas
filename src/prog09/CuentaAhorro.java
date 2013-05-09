package prog09;

public class CuentaAhorro extends Cuenta{
  private Double interesRemuneracion;
  public CuentaAhorro (Persona p, Double s, String c, Double in){
    super(p,s,c);       
    interesRemuneracion = in;
  }

  @Override
  public String getter(){
    String s = null;
    s = titular.getNombre()+" "+titular.getApellido()+" "+titular.getFechaNacimiento()+" "+super.ccc+this.interesRemuneracion;
    return s;   
  }
}
