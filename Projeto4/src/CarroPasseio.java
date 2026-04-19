public final class CarroPasseio extends Veiculo {

    public CarroPasseio(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe) {
        super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);


    }


    @Override
    public double alugarVeiculo(double pesoCarga, Integer dias) {
        if (dias <= 0)
            throw new IllegalArgumentException("Número de dias inválido!");

        return getValorLocacaoDiaria() * dias;
    }


    @Override
    public double calcularIpva() {
        double valorFinal;

        if (getAnoFabricacao()<2006) {
            valorFinal = 0.0;
        }

        return valorFinal = (getPrecoFipe() * 0.04);
    }

}


