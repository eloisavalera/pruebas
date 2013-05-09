package Colecciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
  public static void main(String args[]){
    Pattern p=Pattern.compile("([XY]?)([0-9]{1,9})([A-Za-z])");
    Matcher m=p.matcher("X12345678Z");
    if (m.matches()) System.out.println("Si, contiene el patrón");
    else System.out.println("No, no contiene el patrón");
  }
}
