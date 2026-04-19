public abstract sealed class Veiculo implements Fretavel, Tributavel
        permits Caminhao, CarroPasseio {
    private final String placa;
    private final String marca;
    private final int anoFabricacao;
    private double valorLocacaoDiaria;
    private double precoFipe;


    public Veiculo(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe) {

        if (placa == null || placa.isBlank())
            throw new IllegalArgumentException("Placa inválida!");
        if (marca == null || marca.isBlank())
            throw new IllegalArgumentException("Marca inválida!");
        if (anoFabricacao < 1900 || anoFabricacao > 2026)
            throw new IllegalArgumentException("Ano de fabricação inválido!");
        if (valorLocacaoDiaria <= 0)
            throw new IllegalArgumentException("Valor da diária inválido!");
        if (precoFipe <= 0)
            throw new IllegalArgumentException("Preço Fipe inválido!");

        this.placa = placa;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.precoFipe = precoFipe;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }


    public double getValorLocacaoDiaria() {
        return valorLocacaoDiaria = 150;
    }

    public void setValorLocacaoDiaria(double valorLocacaoDiaria) {
        this.valorLocacaoDiaria = valorLocacaoDiaria;
    }

    public double getPrecoFipe() {
        return precoFipe;
    }

    public void setPrecoFipe(double precoFipe) {
        this.precoFipe = precoFipe;
    }
}
