package prog09;

public class CCPersonal extends CuentaCorriente {
  private Double comision;
  public CCPersonal (Persona p, Double s, String c, Double com){
    super(p,s,c);
    comision = com;
  }
  
  @Override
  public String getter(){
    String s =  null;
    s = " " + titular.getNombre() + " " + titular.getApellido() + " " + titular.getFechaNacimiento() + " " + ccc + " " + comision;   
    return s;
  }
}
