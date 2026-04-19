import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        CarroPasseio carro1 = new CarroPasseio("TTK-9061", "Honda", 2010, 300.0, 55000.0);
        CarroPasseio carro2 = new CarroPasseio("AFG-4893", "Toyota", 2001, 150.0, 28000.0);

        Caminhao caminhao1 = new Caminhao("KGL-2782", "Mercedes", 2005, 500.0, 100000.0, 50.0);
        Caminhao caminhao2 = new Caminhao("ZXY-8026", "Ford", 2017, 600.0, 130000.0, 70.0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=======SISTEMA DE VEÍCULOS INICIALIZADO==========");
        System.out.println("Olá, seja muito bem vindo.\nPara realizar a locação de um veículo, siga as instruções abaixo: ");
        System.out.println("Obs.: Possuímos uma taxa de locação fixa em R$ " + carro1.getValorLocacaoDiaria() );
        System.out.println("O valor final da locação será feito baseado no produto desse valor pelos dias de aluguel.");

       do {
            System.out.println("\n==========MENU USUÁRIO=============");
           System.out.println("1 - Carro 1    | Placa: " + carro1.getPlaca() + "   | Modelo: " + carro1.getMarca());
           System.out.println("2 - Carro 2    | Placa: " + carro2.getPlaca() + "   | Modelo: " + carro2.getMarca());
           System.out.println("3 - Caminhão 1 | Placa: " + caminhao1.getPlaca() + "   | Modelo: " + caminhao1.getMarca());
           System.out.println("4 - Caminhão 2 | Placa: " + caminhao2.getPlaca() + "   | Modelo: " + caminhao2.getMarca());
           System.out.println("0 - Sair");
           System.out.println("Escolha: ");
           opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                       alugarCarroPasseio(carro1, sc);
                       break;
                case 2:
                    alugarCarroPasseio(carro2, sc);
                    break;

                case 3:
                    alugarCaminhao(caminhao1, sc);
                    break;

                case 4:
                    alugarCaminhao(caminhao2, sc);
                    break;
                case 0:
                    System.out.println("==========SISTEMAS DE VEÍCULOS FINALIZADO===========");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            break;
        } while(opcao != 0 );
        scanner.close();
    }


    private static void alugarCarroPasseio(CarroPasseio carro, Scanner sc) {
        try {
            System.out.print("Informe a quantidade de dias: ");
            int dias = sc.nextInt();
            double valorLocacao;
            double ipva;

            valorLocacao = carro.alugarVeiculo(0, dias);
            ipva = carro.calcularIpva();

            System.out.println("Locação realizada com sucesso!");
            System.out.println("\n-----------RECIBO-------------");
            System.out.println("Dados do veículo: " + carro.getPlaca() + "," + carro.getMarca() + "," + carro.getAnoFabricacao());
            System.out.println("Valor da locação: R$ " + valorLocacao);

            if (carro.getAnoFabricacao() < 2006) {
                System.out.println("IPVA: Isento (mais de 20 anos de fabricação)");
                System.out.println("Total a pagar: R$ " + valorLocacao);
            }else {
                System.out.println("IPVA: R$ " + ipva);
                System.out.println("Total a pagar: R$ " + (valorLocacao + ipva));
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void alugarCaminhao(Caminhao caminhao, Scanner sc) {
        try {
            System.out.print("Informe o peso da carga (toneladas): ");
            double peso = sc.nextDouble();

            System.out.print("Informe a quantidade de dias: ");
            int dias = sc.nextInt();
            double valorLocacao;
            double ipva;

            valorLocacao = caminhao.alugarVeiculo(peso, dias);
            ipva = caminhao.calcularIpva();

            System.out.println("Locação realizada com sucesso!");
            System.out.println("\n-----------RECIBO-------------");
            System.out.println("Dados do veículo: " + caminhao.getPlaca() + "," + caminhao.getMarca() + "," + caminhao.getAnoFabricacao());
            System.out.println("Valor da locação: R$ " + valorLocacao);

            if (peso > caminhao.getCapacidadeCargaToneladas())
                System.out.println("Taxa de sobrecarga de 10% aplicada!");

            if (caminhao.getAnoFabricacao()<2006) {
                System.out.println("IPVA: Isento (mais de 20 anos de fabricação)");
                System.out.println("Total a pagar: R$ " + valorLocacao);
            } else {
                System.out.println("IPVA: R$ " + ipva);
                System.out.println("Total a pagar: R$ " + (valorLocacao + ipva));
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

