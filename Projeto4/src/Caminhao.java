public final class Caminhao extends Veiculo{
    private final double capacidadeCargaToneladas;

    public Caminhao(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe,
                    double capacidadeCargaToneladas){
            super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);
        if (capacidadeCargaToneladas <= 0)
            throw new IllegalArgumentException("Capacidade de carga inválida!");

        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }


    @Override
    public double alugarVeiculo(double pesoCarga, Integer dias) {
        if (pesoCarga <= 0)
            throw new IllegalArgumentException("Peso da carga inválido!");

        if (dias <= 0)
            throw new IllegalArgumentException("Número de dias inválido!");

        double valorTotal;
        valorTotal =  getValorLocacaoDiaria() * dias;

        if(pesoCarga > capacidadeCargaToneladas) {
            valorTotal = (0.1 * valorTotal) + valorTotal;
        }

         return valorTotal;
    }


    @Override
    public double calcularIpva() {
        double valorFinal;

        if(getAnoFabricacao()<2006) {
             valorFinal = 0.0;
        }

           return valorFinal = (getPrecoFipe() * 0.015);
    }



    public double getCapacidadeCargaToneladas() {
        return capacidadeCargaToneladas;
    }
}
