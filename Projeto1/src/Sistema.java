import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int numero;
        double saldo = 0;
        double saque;
        double deposito = 0;
        int quantidadeSaques = 3;

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
                    System.out.println("O seu saldo atual é de: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("=============DEPÓSITO====================");
                    System.out.println("Informe o valor do depósito desejado: ");
                    deposito = sc.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Depósito concluído com sucesso!\nO seu novo saldo é de: " + saldo);
                    break;
                case 3:
                    if (quantidadeSaques <= 0){
                        System.out.println("\n===================Operação Bloqueada========================");
                        System.out.println("Limite de saques diários atingido.");
                        break;
                    } else {
                        System.out.println("===============SAQUE======================");
                        System.out.println(nome + ", o seu saldo atual é de: " + saldo);
                        System.out.println("Para realizar um saque, informe o valor desejado: ");
                        saque = sc.nextDouble();
                        if (saque > 1000) {
                            System.out.println("=========Operação Bloqueada============");
                            System.out.println("\nO valor máximo por saque é de R$ 1.000,00, por questões de segurança.");
                            break;
                        }
                        saldo = saldo - saque;
                        System.out.println("O seu novo saldo é de: " + saldo);
                        System.out.println("Saque realizado com sucesso!");
                        quantidadeSaques --;
                      }
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
