package io.serializar;

import java.io.Serializable;

public class Contacto implements Serializable {
  private String nombre;
  private String telefono;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  
  
}
