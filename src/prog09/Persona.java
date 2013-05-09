package prog09;

public class Persona {
  private String nom;
  private String ape;
  private String f_nac;    //aquí seguramente tendrás que utilizar Calendar
  public Persona(String n, String p, String f){
    this.nom = n;
    this.ape = p;
    this.f_nac = f;
  }
  public void getter(){
    System.out.println("El nombre es: " + nom);
    System.out.println("El apellido es: " + ape);
    System.out.println("La fecha de nacimiento es: " + f_nac);
  }
  public String getNombre(){
    return nom;
  }
  public String getApellido(){
    return ape;
  }
  public String getFechaNacimiento(){
    return f_nac;
  }
}
