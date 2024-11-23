package br.com.fiap.globalSolution2.dto;

public class SensorGasRequestUpdateDto {

    private String nome;
    private String tipoDeGas;
    private Double concentracaoGas;
    private String localizacao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeGas() {
        return tipoDeGas;
    }

    public void setTipoDeGas(String tipoDeGas) {
        this.tipoDeGas = tipoDeGas;
    }

    public Double getConcentracaoGas() {
        return concentracaoGas;
    }

    public void setConcentracaoGas(Double concentracaoGas) {
        this.concentracaoGas = concentracaoGas;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
