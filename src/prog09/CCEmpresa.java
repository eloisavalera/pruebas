package prog09;

public class CCEmpresa extends CuentaCorriente{
  private Double descubiertoMax;
  private Double interesDescubierto;
  private Double comisionDescubierto;

  public CCEmpresa(Double descubiertoMax, Double interesDescubierto, Double comisionDescubierto, Persona p, Double s, String c) {
    super(p, s, c);
    this.descubiertoMax = descubiertoMax;
    this.interesDescubierto = interesDescubierto;
    this.comisionDescubierto = comisionDescubierto;
  }
  
  @Override
  public String getter(){
    String s = null;
    s = titular.getNombre() + " " + titular.getApellido() + " " + titular.getFechaNacimiento() + " " + ccc + " " +descubiertoMax + ""
        + interesDescubierto + " " + comisionDescubierto;
    return s;
  }
}
