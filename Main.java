import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha a opção desejada:\n1 - Abrir BancoVector\n2 - Abrir BancoArray\n3 - Testa BancoVector\n4 - testaBancoArray");
    int opcao = scanner.nextInt();
    switch(opcao) {
      case 1:
              BancoVector b = new BancoVector();
              int control = 0;
              do{
                System.out.println("Escolha uma opcao:\n1 - Criar conta\n2 - Saldo\n3 - Creditar\n4 - debitar\n5 - transferir\n6 - Taxa e Adiantar juros\n0 - sair");
                control = scanner.nextInt();
                if(control==1){
                  System.out.println("1 - Conta normal\n2 - Conta poupanca");
                  control = scanner.nextInt();
                  System.out.println("Insira o numero da conta");
                  String nConta = scanner.nextLine();
                  nConta = scanner.nextLine(); //coloquei 2x pq a de cima pega o "enter"
                  if(control==1){
                    Conta cc = new Conta(nConta);
                    b.Vcadastrar(cc);
                  }
                  else if(control==2){
                    Conta cc = new ContaPoupanca(nConta);
                    b.Vcadastrar(cc);
                  }
                  if(control==1 || control==2){
                    System.out.println("Conta cadastrada");
                  } else{ System.out.println("Opcao invalida");}
                  control = 1;
                }
                else if(control==2){
                  System.out.println("Insira o numero da conta");
                  String nConta = scanner.nextLine();
                  nConta = scanner.nextLine();
                  System.out.println(b.Vsaldo(nConta));
                }
                else if(control==3){
                  System.out.println("Insira o numero da conta");
                  String nConta = scanner.nextLine();
                  nConta = scanner.nextLine();
                  System.out.println("Insira o valor a creditar");
                  double valor = scanner.nextDouble();
                  b.Vcreditar(nConta, valor);
                }
                else if(control==4){
                  System.out.println("Insira o numero da conta");
                  String nConta = scanner.nextLine();
                  nConta = scanner.nextLine();
                  System.out.println("Insira o valor a debitar");
                  double valor = scanner.nextDouble();
                  b.Vdebitar(nConta, valor);
                }
                else if(control==5){
                  System.out.println("Insira o numero da conta a transferir");
                  String nContaTransf = scanner.nextLine();
                  nContaTransf = scanner.nextLine();
                  System.out.println("Insira o numero da conta receber");
                  String nContaReceber = scanner.nextLine();
                  System.out.println("Insira o valor da transferencia");
                  double valor = scanner.nextDouble();
                  b.Vtransferir(nContaTransf, nContaReceber, valor);
                }
                else if(control==6){
                  System.out.println("1 - Mudar taxa de juros\n2 - Adiantar juros");
                  control = scanner.nextInt();
                  if(control==1){
                    System.out.println("Insira a nova taxa de juros");
                    double taxa = scanner.nextDouble();
                    b.VsetTaxa(taxa);
                    System.out.println("Taxa inserida");
                  }
                  else if(control==2){
                    System.out.println("Insira o numero da conta");
                    String nConta = scanner.nextLine();
                    nConta = scanner.nextLine();
                    Conta c = b.Vprocurar(nConta);
                    if(c instanceof ContaPoupanca){
                      ((ContaPoupanca)c).renderJuros();
                    }
                    else System.out.println("nenhuma conta poupanca foi encontrada");
                  }
                  control = 6;
                }
              }while(control != 0);
              break;
              
      case 2:
              BancoArray ba = new BancoArray();
              control = 0;
              do{
                System.out.println("Escolha uma opcao:\n1 - Criar conta\n2 - Saldo\n3 - Creditar\n4 - debitar\n5 - transferir\n6 - Taxa e Adiantar juros\n0 - sair");
                control = scanner.nextInt();
                if(control==1){
                  System.out.println("1 - Conta normal\n2 - Conta poupanca");
                  control = scanner.nextInt();
                  System.out.println("Insira o numero da conta");
                  String nConta = scanner.nextLine();
                  nConta = scanner.nextLine(); //coloquei 2x pq a de cima pega o "enter"
                  if(control==1){
                    Conta cc = new Conta(nConta);
                    ba.cadastrar(cc);
                  }
                  else if(control==2){
                    Conta cc = new ContaPoupanca(nConta);
                    ba.cadastrar(cc);
                  }
                  if(control==1 || control==2){
                    System.out.println("Conta cadastrada");
                  } else{ System.out.println("Opcao invalida");}
                  control = 1;
                }
                else if(control==2){
                  System.out.println("Insira o numero da conta");
                  String nConta = scanner.nextLine();
                  nConta = scanner.nextLine();
                  System.out.println(ba.saldo(nConta));
                }
                else if(control==3){
                  System.out.println("Insira o numero da conta");
                  String nConta = scanner.nextLine();
                  nConta = scanner.nextLine();
                  System.out.println("Insira o valor a creditar");
                  double valor = scanner.nextDouble();
                  ba.creditar(nConta, valor);
                }
                else if(control==4){
                  System.out.println("Insira o numero da conta");
                  String nConta = scanner.nextLine();
                  nConta = scanner.nextLine();
                  System.out.println("Insira o valor a debitar");
                  double valor = scanner.nextDouble();
                  ba.debitar(nConta, valor);
                }
                else if(control==5){
                  System.out.println("Insira o numero da conta a transferir");
                  String nContaTransf = scanner.nextLine();
                  nContaTransf = scanner.nextLine();
                  System.out.println("Insira o numero da conta receber");
                  String nContaReceber = scanner.nextLine();
                  System.out.println("Insira o valor da transferencia");
                  double valor = scanner.nextDouble();
                  ba.transferir(nContaTransf, nContaReceber, valor);
                }
                else if(control==6){
                  System.out.println("1 - Mudar taxa de juros\n2 - Adiantar juros");
                  control = scanner.nextInt();
                  if(control==1){
                    System.out.println("Insira a nova taxa de juros");
                    double taxa = scanner.nextDouble();
                    ba.setTaxa(taxa);
                    System.out.println("Taxa inserida");
                  }
                  else if(control==2){
                    System.out.println("Insira o numero da conta");
                    String nConta = scanner.nextLine();
                    nConta = scanner.nextLine();
                    Conta c = ba.procurar(nConta);
                    if(c instanceof ContaPoupanca){
                      ((ContaPoupanca)c).renderJuros();
                    }
                    else System.out.println("nenhuma conta polpanca foi encontrada");
                  }
                  control = 6;
                }
              }while(control != 0);
              break;
      case 3:
        testaBancoVector();
        break;
      case 4:
        testaBancoArray();
        break;
    }
  }


  public static void testaBancoVector() {
    BancoVector bancoV = new BancoVector();
    System.out.println("Cria uma conta:");
    Conta cv = new Conta("123");
    bancoV.Vcadastrar(cv);
    System.out.println("Mostra o saldo desta conta:");
    System.out.println(bancoV.Vsaldo("123"));
    System.out.println("Adiciona 1000R$ de fundos");
    bancoV.Vcreditar("123", 1000);
    System.out.println("Mostra o saldo desta conta:");
    System.out.println(bancoV.Vsaldo("123"));
    System.out.println("Remove 100R$ dos fundos");
    bancoV.Vdebitar("123", 100);
    System.out.println(bancoV.Vsaldo("123"));
    System.out.println("Cria uma taxa de 10%");
    bancoV.VsetTaxa(0.1);
    System.out.println("Faz uma conta de poupanca");
    Conta cvv = new ContaPoupanca("234");
    bancoV.Vcadastrar(cvv);
    System.out.println("transfere 400R$ da conta um para poupanca");
    bancoV.Vtransferir("123", "234", 400);
    System.out.println("Novo saldo da conta:");
    System.out.println(bancoV.Vsaldo("123"));
    System.out.println("Novo saldo da conta poupanca:");
    System.out.println(bancoV.Vsaldo("234"));
    System.out.println("Novo valor da conta poupanca com taxas:");
    ((ContaPoupanca)cvv).renderJuros();
    System.out.println(bancoV.Vsaldo("234"));
    System.out.println("Teste concluido");
  }

  public static void testaBancoArray() {
    BancoArray bancoA = new BancoArray();
    System.out.println("Cria uma conta:");
    Conta ca = new Conta("123");
    bancoA.cadastrar(ca);
    System.out.println("Mostra o saldo desta conta:");
    System.out.println(bancoA.saldo("123"));
    System.out.println("Adiciona 1000R$ de fundos");
    bancoA.creditar("123", 1000);
    System.out.println("Mostra o saldo desta conta:");
    System.out.println(bancoA.saldo("123"));
    System.out.println("Remove 100R$ dos fundos");
    bancoA.debitar("123", 100);
    System.out.println(bancoA.saldo("123"));
    System.out.println("Cria uma taxa de 10%");
    bancoA.setTaxa(0.1);
    System.out.println("Faz uma conta de poupanca");
    Conta caa = new ContaPoupanca("234");
    bancoA.cadastrar(caa);
    System.out.println("transfere 400R$ da conta um para poupanca");
    bancoA.transferir("123", "234", 400);
    System.out.println("Novo saldo da conta:");
    System.out.println(bancoA.saldo("123"));
    System.out.println("Novo saldo da conta poupanca:");
    System.out.println(bancoA.saldo("234"));
    System.out.println("Novo valor da conta poupanca com taxas:");
    ((ContaPoupanca)caa).renderJuros();
    System.out.println(bancoA.saldo("234"));
    System.out.println("Teste concluido");
  }
  
}
