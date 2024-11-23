package br.com.fiap.globalSolution2.dto;

public class SensorGasResponseDto {

    private Long id;
    private String nome;
    private String tipoDeGas;
    private Double concentracaoGas;
    private String localizacao;
    private String ultimaLeitura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getUltimaLeitura() {
        return ultimaLeitura;
    }

    public void setUltimaLeitura(String ultimaLeitura) {
        this.ultimaLeitura = ultimaLeitura;
    }
}
