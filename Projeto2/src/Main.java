import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContaBancaria Conta = new ContaBancaria();
        int opcao;
        Scanner sc = new Scanner(System.in);

        Conta.imprimir();

        do {
            System.out.println("\n\n===============SEU MENU====================");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Conta.verSaldo();
                    break;
                case 2:
                    Conta.depositar();
                    break;
                case 3:
                    Conta.sacar();
                    break;
                case 0:
                    Conta.sair();
                    break;
                default:
                    System.out.println("==============OPÇÃO INVÁLIDA==================");
                    System.out.println("Por favor, tente novamente.");
            }
        } while (opcao != 0);
    }
}