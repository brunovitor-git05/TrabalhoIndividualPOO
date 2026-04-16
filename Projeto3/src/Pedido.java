
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;
public class Pedido {
    private Integer opcao;
    Scanner sc = new Scanner(System.in);

    ItemPedido item1 = new ItemPedido("Teclado Gamer", 49.90);
    ItemPedido item2 = new ItemPedido("Cadeira Gamer", 139.90);
    ItemPedido item3 = new ItemPedido("Fone Headset", 89.90);
    ItemPedido item4 = new ItemPedido("Mouse sem fio", 39.90);
    ItemPedido item5 = new ItemPedido("Câmera Webcam", 69.90);


    public Pedido(Cliente cliente1) {
        int qtd1, qtd2, qtd3, qtd4, qtd5;
        Double total;

        System.out.println("\n==============MENU TECH================");
        System.out.println("Item 1 - " + item1.getNomeItem() + " | R$ " + item1.getValorItem());
        System.out.println("Item 2 - " + item2.getNomeItem() + " | R$ " + item2.getValorItem());
        System.out.println("Item 3 - " + item3.getNomeItem() + " | R$ " + item3.getValorItem());
        System.out.println("Item 4 - " + item4.getNomeItem() + " | R$ " + item4.getValorItem());
        System.out.println("Item 5 - " + item5.getNomeItem() + " | R$ " + item5.getValorItem());


        System.out.println("\nInforme abaixo a quantidade de itens que você deseja adquirir: ");
        System.out.println("Item 1 - ");
        qtd1 = getOpcao();
        System.out.printf("Valor: R$ %.2f", item1.getValorItem() * qtd1);
        System.out.println("\nItem 2 - ");
        qtd2 = getOpcao();
        System.out.printf("Valor: R$ %.2f", item2.getValorItem() * qtd2);
        System.out.println("\nItem 3 - ");
        qtd3 = getOpcao();
        System.out.printf("Valor: R$ %.2f ", item3.getValorItem() * qtd3);
        System.out.println("\nItem 4 - ");
        qtd4 = getOpcao();
        System.out.printf("Valor: R$ %.2f", item4.getValorItem() * qtd4);
        System.out.println("\nItem 5 - ");
        qtd5 = getOpcao();
        System.out.printf("Valor: R$ %.2f", item5.getValorItem() * qtd5);

        total = (item1.getValorItem() * qtd1)
                + (item2.getValorItem() * qtd2)
                + (item3.getValorItem() * qtd3)
                + (item4.getValorItem() * qtd4)
                + (item5.getValorItem() * qtd5);
        System.out.printf("\nTotal do pedido = R$ %.2f", total);

            fecharPedido(total,cliente1);
    }


    public void fecharPedido(Double valorTotal, Cliente cliente1) {
        double frete = 25.0;
        String numeroPedido = UUID.randomUUID().toString();
        System.out.println("\nAcompanhe o status de seu pedido abaixo: ");
        System.out.println("\n===========RECIBO DO PEDIDO=============");

        if (valorTotal > 250) {
            System.out.println("Parabéns, você ganhou frete grátis nessa compra!");
            System.out.println("Nome do cliente: " + cliente1.getNome());
            System.out.println("Número do pedido: " + numeroPedido);
            System.out.printf("Valor do pedido: R$ %.2f",  valorTotal);
            System.out.println("\nPedido realizado com sucesso!");
            System.out.println("\n======PROGRAMA FINALIZADO===========");
        } else if (valorTotal <= 0) {
            System.out.println("Não foi possível realizar o seu pedido!");
            System.out.println("Valor do pedido nulo ou inconsistente.");
            System.out.println("Usuário desconectado.");
        } else {
                System.out.println("Você possui um frete de R$ 25,00.");
                System.out.println("Nome do cliente: " + cliente1.getNome());
                System.out.println("Número do pedido: " + numeroPedido);
                System.out.printf("Valor do pedido: %.2fR$ ", (valorTotal + frete));
                System.out.println("\nPedido realizado com sucesso!");
                System.out.println("\n======PROGRAMA FINALIZADO===========");
        }
    }

    public Integer getOpcao() {
        return opcao = sc.nextInt();
    }

    public void setOpcao(Integer opcao) {
        this.opcao = opcao;
    }






}