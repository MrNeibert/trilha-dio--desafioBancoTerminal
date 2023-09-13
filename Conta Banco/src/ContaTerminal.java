import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, Insira os dados para criar sua conta(Numero de Conta, Agencia, seu Nome e Saldo). ");
        System.out.print("Numero da Conta:");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Agencia:");
        agencia = sc.nextLine();
        System.out.print("Nome Cliente:");
        nomeCliente = sc.nextLine();
        System.out.print("Saldo:");
        saldo = sc.nextDouble();

        String textoConcatenado ="Olá " + nomeCliente +
         ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
         ", conta " + numeroConta +
          " e seu saldo é de" + (saldo) +
           " e já está disponível para saque!";
        	
        sc.close();

        System.out.println(textoConcatenado);
    }
}
