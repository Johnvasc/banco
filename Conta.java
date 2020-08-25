  public class Conta {
    protected String numero;
    protected double saldo;
    
    public Conta (String n){
      this.numero = n;
      saldo = 0.0;
    } 
    
    public void creditar(double valor){
      this.saldo = this.saldo + valor;
    }
    
    public void debitar(double valor){
      this.saldo = this.saldo - valor;
    }
    
    public String getNumero(){
      return numero;
    }
    
    public double getSaldo(){
      return saldo;
    }
  }
