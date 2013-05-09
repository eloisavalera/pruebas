package prog09;

public class Cuenta {
  protected Persona titular;
  protected Double saldo;
  protected String ccc;
  public Cuenta(Persona p, Double s, String c){
    titular = p;
    saldo = s;
    ccc = c;       
  }
  public String getter(){
    String s = null;
    s = "" + titular.getNombre() + " " + titular.getApellido() + " " + titular.getFechaNacimiento() + " " + saldo + " " + ccc;
    return s;
  }
  public void ingresar(Double cantidad){
    saldo = saldo + cantidad;
  }
  public void retirar(Double cantidad) throws Exception{
    saldo = saldo - cantidad; //la forma correcta de controlarlo sería lanzar una excepción (personalizada a poder ser) hacia el método que llame a este método.
  }
}
