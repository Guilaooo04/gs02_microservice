package br.com.fiap.globalSolution2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class SensorGas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 60)
    private String nome;

    @Column(nullable = false, length = 50)
    private String tipoDeGas; // Exemplo: CO2, Metano, etc.

    @Column(nullable = false)
    private Double concentracaoGas; // Concentração do gás em partes por milhão (ppm) ou outra unidade

    @Column(nullable = false)
    private String localizacao; // Local onde o dispositivo está instalado

    @Column(nullable = false)
    private Date ultimaLeitura; // Data e hora da última leitura do dispositivo

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

    public Date getUltimaLeitura() {
        return ultimaLeitura;
    }

    public void setUltimaLeitura(Date ultimaLeitura) {
        this.ultimaLeitura = ultimaLeitura;
    }

    // Método para exibir informações do dispositivo de forma legível
    @Override
    public String toString() {
        return "SensorGas [id=" + id + ", nome=" + nome + ", tipoDeGás=" + tipoDeGas +
                ", concentracaoGás=" + concentracaoGas + ", localizacao=" + localizacao +
                ", ultimaLeitura=" + ultimaLeitura + "]";
    }
}

