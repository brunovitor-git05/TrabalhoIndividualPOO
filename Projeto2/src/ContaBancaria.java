import java.util.Scanner;
import java.util.UUID;

public class ContaBancaria {
    String titular;
    Double saldo = 50.0;
    Scanner sc = new Scanner(System.in);
    Double deposito;
    Integer quantidadeSaques = 3;
    Double saque;
    String numero = UUID.randomUUID().toString();

    void imprimir(){
        System.out.println("\n====================SUA CONTA BANCÁRIA==========================");
        System.out.println("Olá, seja bem vindo!");
        System.out.println("Para criar uma conta bancária em nosso sistema, digite o seu nome abaixo: ");
        titular = sc.nextLine();
        System.out.println("\nMuito bem, " + titular + ". Sua conta foi criada com sucesso!");
        System.out.println("Você ganhou um saldo de R$ 50,00 como bônus de boas-vindas.");
        System.out.println("\n\n====================DADOS DA SUA CONTA=========================");
        System.out.println("Nome do titular: " + titular);
        System.out.println("Número da conta: " + numero);
        System.out.printf("Saldo da conta: R$ %.2f ", saldo);
    }

    void depositar(){
        System.out.println("\n\n=============DEPÓSITO====================");
        System.out.println("Informe o valor do depósito desejado: ");
        deposito = sc.nextDouble();
        saldo = saldo + deposito;
        System.out.println("Depósito concluído com sucesso!\nO seu novo saldo é de: " + saldo);
    }

    void sacar() {
        if (quantidadeSaques <= 0) {
            System.out.println("\n===================Operação Bloqueada========================");
            System.out.println("Limite de saques diários atingido.");
        } else {
            System.out.println("===============SAQUE======================");
            System.out.println(titular + ", o seu saldo atual é de: " + saldo);
            System.out.println("Para realizar um saque, informe o valor desejado: ");
            saque = sc.nextDouble();
            if (saque > 1000) {
                System.out.println("=========Operação Bloqueada============");
                System.out.println("\nO valor máximo por saque é de R$ 1.000,00, por questões de segurança.");
            }
            saldo = saldo - saque;
            System.out.println("O seu novo saldo é de: " + saldo);
            System.out.println("Saque realizado com sucesso!");
            quantidadeSaques--;

        }
    }
    void verSaldo() {
        System.out.println("===============SALDO==================");
        System.out.println("O seu saldo atual é de: R$ " + saldo);
    }
    void sair() {
        System.out.println("Usuário desconectado.");
        System.out.println("=================PROGRAMA FINALIZADO=================");
    }
}

