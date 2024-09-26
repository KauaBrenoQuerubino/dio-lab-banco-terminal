
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int numero = sc.nextInt();
        System.out.print("Digite a Agencia: ");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite o Saldo: ");
        double Saldo = sc.nextDouble();

        System.out.printf("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é, "+ agencia + " ,conta "+ numero +" e seu saldo " + Saldo +" já está disponível para saque");



    }
}
