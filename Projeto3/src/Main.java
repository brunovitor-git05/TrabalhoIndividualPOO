import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.lerNome();
        Pedido pedido1 = new Pedido(cliente1);

    }
}
