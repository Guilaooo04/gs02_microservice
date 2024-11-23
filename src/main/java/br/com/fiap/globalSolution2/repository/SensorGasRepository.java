package br.com.fiap.globalSolution2.repository;

import br.com.fiap.globalSolution2.model.SensorGas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorGasRepository extends JpaRepository<SensorGas, Long> {
    <T> T findByNome(String nome, Class<T> type);
    <T> List<T> findAllByNome(String nome, Class<T> type);
    <T> List<T> findAllByNomeContains(String nome, Class<T> type);
}
