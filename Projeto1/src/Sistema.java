import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int numero;
        double saldo1;
        double saldo2;
        double saldo3 = 0;
        double saque1;
        double saque2;
        double saque3;
        double saque4;
        double deposito = 0;

        System.out.println("\n====================CAIXA ELETRÔNICO VIRTUAL==========================");
        System.out.println("\nPrimeiro, digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("\nOlá, " + nome + ", seja bem vindo!");
        System.out.println("\nVocê está no nosso menu inicial. Selecione uma das opções abaixo para iniciarmos:  ");

        do {
            System.out.println("\n===============CAIXA ELETRÔNICO VIRTUAL====================");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            numero = sc.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("===============SALDO==================");
                    System.out.println("O seu saldo atual é de: R$ " + deposito);
                    break;
                case 2:
                    System.out.println("=============DEPÓSITO====================");
                    System.out.println("Informe o valor do depósito desejado: ");
                    deposito = sc.nextDouble();
                    System.out.println("Depósito concluído com sucesso!\nO seu novo saldo é de: " + deposito);
                    break;
                case 3:
                    System.out.println("===============SAQUE======================");
                    System.out.println(nome + ", o seu saldo atual é de: " + deposito);
                    System.out.println("Para realizar um saque, informe o valor desejado: ");
                    saque1 = sc.nextDouble();
                    if (saque1 > 1000) {
                        System.out.println("=========Operação Bloqueada============");
                        System.out.println("\nO valor máximo por saque é de R$ 1.000,00, por questões de segurança.");
                        break;
                    }
                    saldo1 = deposito - saque1;
                    System.out.println("O seu novo saldo é de: " + saldo1);
                    System.out.println("Para realizar um novo saque informe o valor desejado: ");
                    saque2 = sc.nextDouble();
                    if (saque2> 1000) {
                        System.out.println("===============Operação Bloqueada================");
                        System.out.println("\nO valor máximo por saque é de R$ 1.000,00, por questões de segurança.");
                        break;
                    }
                    saldo2 = saldo1 - saque2;
                    System.out.println("O seu novo saldo é de: " + saldo2);
                    System.out.println("Para realizar um novo saque informe o valor desejado: ");
                    saque3 = sc.nextDouble();
                    if (saque3 > 1000) {
                        System.out.println("=========Operação Bloqueada============");
                        System.out.println("\nO valor máximo por saque é de R$ 1.000,00, por questões de segurança.");
                        break;
                    }
                    saldo3 = saldo2 - saque3;
                    System.out.println("O seu novo saldo é de: " + saldo3);
                    System.out.println("Para realizar um novo saque informe o valor desejado: ");
                    saque4 = sc.nextDouble();
                    System.out.println("\n===================Operação Bloqueada========================");
                    System.out.println("Limite de saques diários atingido.");
                    break;
                case 0:
                    System.out.println("=================PROGRAMA FINALIZADO=================");
                    System.out.println("Usuário desconectado.");
                    System.out.println("\n==================CAIXA ELETRÔNICO VIRTUAL======================");
                    break;
                default:
                    System.out.println("==============OPÇÃO INVÁLIDA==================");
                    System.out.println("Por favor, " + nome + ", tente novamente.");
            }
        } while (numero != 0);
    }
}
