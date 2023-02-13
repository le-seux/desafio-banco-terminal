import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Digite sua conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite sua agencia: ");
        agencia = sc.next();
        sc.nextLine();

        System.out.println("Digite seu nome: ");
        nome = sc.next();
        sc.nextLine();

        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
        System.out.println("Fim da operação");

    }
}
