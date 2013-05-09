package prog09;

public class CCEmpresa extends CuentaCorriente{
  private Double descubiertoMax;
  private Double interesDescubierto;
  private Double comisionDescubierto;
  public void CcEmpresa (Persona p, Double s, String c, Double desM, Double intDes, Double comDes){
    super(p,s,c);
    descubiertoMax = desM;
    interesDescubierto = intDes;
    comisionDescubierto = comDes;
  }
  @Override
  public String getter(){
    String s = null;
    s = "" + + titular.getNombre() + " " + titular.getApellido() + " " + titular.getFechaNacimiento() + " " + ccc + " " +descubiertoMax + ""
        + interesDescubierto + " " + comisionDescubierto;
    return s;
  }
}
