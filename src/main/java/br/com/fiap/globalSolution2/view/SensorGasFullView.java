package br.com.fiap.globalSolution2.view;

public interface SensorGasFullView {
    Long getId();
    String getNome();
    String getLocalizacao();   // Adicionando localização do sensor
    Double getNivelGas();      // Adicionando nível de gás detectado
    Boolean getStatus();       // Adicionando status do sensor (ativo ou não)
}
