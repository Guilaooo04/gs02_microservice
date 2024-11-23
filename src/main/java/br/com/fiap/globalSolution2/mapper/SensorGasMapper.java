package br.com.fiap.globalSolution2.mapper;

import br.com.fiap.globalSolution2.dto.SensorGasRequestCreateDto;
import br.com.fiap.globalSolution2.dto.SensorGasRequestUpdateDto;
import br.com.fiap.globalSolution2.dto.SensorGasResponseDto;
import br.com.fiap.globalSolution2.model.SensorGas;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SensorGasMapper {

    @Autowired
    private ModelMapper modelMapper;

    // Converte o modelo SensorGas para o DTO de resposta
    public SensorGasResponseDto toDto(SensorGas sensorGas) {
        return modelMapper.map(sensorGas, SensorGasResponseDto.class);
    }

    // Converte o DTO de criação para o modelo SensorGas
    public SensorGas toModel(SensorGasRequestCreateDto dto) {
        return modelMapper.map(dto, SensorGas.class);
    }

    // Converte o DTO de atualização para o modelo SensorGas, incluindo o ID
    public SensorGas toModel(Long id, SensorGasRequestUpdateDto dto) {
        SensorGas result = modelMapper.map(dto, SensorGas.class);
        result.setId(id);  // Atualiza o ID do modelo
        return result;
    }
}