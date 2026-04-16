import java.util.Scanner;
public class Cliente {
    private String nome;

    public void lerNome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===========TECH_SOLUÇÕES===============");
        System.out.println("Olá, seja muito bem vindo.\nPara ter acesso ao nosso menu, informe: ");
        System.out.println("O seu nome: ");
        nome = sc.nextLine();
        System.out.println("==============MENU USUÁRIO=================: " + "\nUsuário conectado:  " + nome);
        System.out.println("Certo, " + nome + ", segue abaixo a lista de produtos disponíveis em nosso estoque.");

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
