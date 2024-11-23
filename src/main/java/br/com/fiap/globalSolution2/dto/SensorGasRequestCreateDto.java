package br.com.fiap.globalSolution2.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class SensorGasRequestCreateDto {

    private String nome;
    private String tipoDeGas;
    private Double concentracaoGas;
    private String localizacao;
    private Date ultimaLeitura;

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

    public Date getUltimaLeitura() {
        return ultimaLeitura;
    }

    public void setUltimaLeitura(Date ultimaLeitura) {
        this.ultimaLeitura = ultimaLeitura;
    }
}