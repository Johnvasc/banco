public class ContaPoupanca extends Conta{
  private static double taxa;
  public ContaPoupanca(String n){
    super(n);
  }
  public void tx(double taxaBanco){
    this.taxa = taxaBanco;
  }
  public void renderJuros(){
    this.saldo = this.saldo + this.saldo*taxa;
  }
}
