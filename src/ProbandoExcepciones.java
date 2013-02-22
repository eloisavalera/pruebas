
import java.util.Scanner;

public class ProbandoExcepciones {

    public static void main(String[] args) {

        String dato;
        int numero;
        boolean error;
        Scanner teclado = new Scanner(System.in);
        ProbandoMetodo meterPasta = new ProbandoMetodo();
        
        do{
            try{
                System.out.println("introduce un valor numérico");
                error=false;
                dato=teclado.nextLine();           
                numero=Integer.parseInt(dato);
                meterPasta.ingresar(numero);
            }
            catch(NumberFormatException e){
                
                System.out.println(e.getMessage());
                System.out.println("introduce ún número entero");
                error=true;
            }
            catch(Exception e){
            
                System.out.println(e.getMessage());
                //System.out.println("Excepción desconocida");
                error=true;
            }
               
        }while(error);
         System.out.println("tu saldo es:"+meterPasta.getSaldo());
         
    }
}
