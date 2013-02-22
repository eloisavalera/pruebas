    public class ProbandoMetodo {
    
    String nombre;
    int saldo;
    public ProbandoMetodo(){
      saldo=1000;
    }
    
    public void ingresar(int numero) throws Exception{
        if (numero<0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + numero;
    }
    
    public int getSaldo(){      
    return saldo;
    }
    
}
