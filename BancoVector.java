import java.util.Vector;

public class BancoVector{
  //private int indice = 0; por enquanto nn é necessário
  private double taxa;
  private Vector<Conta> contas = new Vector<Conta>();
  public BancoVector(){
    this.taxa = -1;
  }
  public void Vcadastrar (Conta c){
    contas.add(c);
  }
  public Conta Vprocurar (String numero){
    for(int i = 0; i<contas.size(); i++){
      if(contas.get(i).getNumero().equals(numero)) return contas.get(i);
    }
    return null;
  }
  public void Vcreditar(String numero, double valor){
    Conta conta = Vprocurar(numero);
    if (conta != null) { 
      conta.creditar(valor);
      System.out.println("Valor creditado com sucesso!");
    } else { 
      System.out.println("Conta Inexistente!");
    }
  }
  public void Vdebitar(String numero, double valor){
    Conta conta = Vprocurar(numero);
    if (conta != null) { 
      conta.debitar(valor);
      System.out.println("Valor debitado com sucesso!");
    }
    else{ 
      System.out.println("Conta Inexistente!");
    }    
  } 
  public double Vsaldo(String numero) {
    Conta conta = Vprocurar(numero);
    if (conta != null) {
      return conta.getSaldo();
    } else { 
      System.out.println("Conta Inexistente!");
    }
    return 0;
  }
  public void Vtransferir(String origem, String destino, double valor){
    Conta contaOrigem = Vprocurar(origem);
    if(contaOrigem != null) {
      Conta contaDestino = Vprocurar(destino);
      if(contaDestino != null) {
        if(contaOrigem.getSaldo() > valor) {
          contaOrigem.debitar(valor);
          contaDestino.creditar(valor);
        }
        else{
          System.out.println("Saldo Insuficiente!");
        }
      }
      else{
        System.out.println("Conta Destino nº " + destino + " Inexistente!"); 
      }
    } else {
      System.out.println("Conta Origem nº " + origem + " Inexistente!");
    }
  }
  void VsetTaxa(double newtaxa){
    this.taxa = newtaxa;
    Conta c = new ContaPoupanca("-1");
    ((ContaPoupanca) c).tx(newtaxa);
  }
  public double VgetTaxa() {
    return this.taxa;
  }
}
