import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContaBancaria Conta = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        int opcao;
        Conta.imprimir();

        System.out.println("\n\n====================DADOS DA SUA CONTA=========================");
        System.out.println("Nome do titular: " + Conta.titular);
        System.out.println("Número da conta: " + Conta.numero);
        System.out.printf("Saldo da conta: R$ %.2f ", Conta.saldo);

        do {
            System.out.println("\n\n===============SEU MENU====================");
            System.out.println("Escolha uma das opções abaixo:");
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
                   Conta.bloquear();
            }
        } while (opcao != 0);
    }
}