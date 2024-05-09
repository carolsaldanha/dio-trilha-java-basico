import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o numero da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
