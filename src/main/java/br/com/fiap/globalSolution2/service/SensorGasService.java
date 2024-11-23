package br.com.fiap.globalSolution2.service;

import br.com.fiap.globalSolution2.repository.SensorGasRepository;
import br.com.fiap.globalSolution2.model.SensorGas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorGasService {

    @Autowired
    private SensorGasRepository sensorGasRepository;

    // Método para listar todos os sensores de gás
    public List<SensorGas> list() {
        return sensorGasRepository.findAll();
    }

    // Método para salvar um novo sensor de gás
    public SensorGas save(SensorGas sensorGas) {
        return sensorGasRepository.save(sensorGas);
    }

    // Método para verificar se um sensor de gás existe pelo ID
    public boolean existsById(Long id) {
        return sensorGasRepository.existsById(id);
    }

    // Método para excluir um sensor de gás pelo ID
    public void delete(Long id) {
        sensorGasRepository.deleteById(id);
    }

    // Método para encontrar um sensor de gás pelo ID
    public Optional<SensorGas> findById(Long id) {
        return sensorGasRepository.findById(id);
    }
}
