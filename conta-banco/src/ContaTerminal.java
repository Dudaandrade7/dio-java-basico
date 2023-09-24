import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

       //Todo:Conhecer e importar a classe e scanner

       int numero;
       String agencia;
       String nomeCliente;
       double saldo;

       //Exibir as mensagens para o nosso usuario
       Scanner scanner = new Scanner(System.in);

       System.out.println("Por favor, digite o número da conta:");
       numero = scanner.nextInt();

       System.out.println("Por favor, digite o número da agência:");
       agencia = scanner.next();

      System.out.println("Por favor, digite o nome do cliente:");
      nomeCliente = scanner.next();

      System.out.println("Por favor, digite o saldo da conta:");
      saldo = scanner.nextDouble();


     //Obter pela scanner os valores digitados no terminal  

     System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


       



    }
}
