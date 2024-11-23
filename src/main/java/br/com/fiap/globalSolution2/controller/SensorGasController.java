package br.com.fiap.globalSolution2.controller;

import br.com.fiap.globalSolution2.dto.SensorGasRequestCreateDto;
import br.com.fiap.globalSolution2.dto.SensorGasRequestUpdateDto;
import br.com.fiap.globalSolution2.dto.SensorGasResponseDto;
import br.com.fiap.globalSolution2.mapper.SensorGasMapper;
import br.com.fiap.globalSolution2.repository.SensorGasRepository;
import br.com.fiap.globalSolution2.service.SensorGasService;
import br.com.fiap.globalSolution2.view.SensorGasFullView;
import br.com.fiap.globalSolution2.view.SensorGasSimpleView;
import br.com.fiap.globalSolution2.view.SensorGasViewType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores-gas")
@RequiredArgsConstructor
public class SensorGasController {

    private final SensorGasService sensorGasService;
    private final SensorGasMapper sensorGasMapper;
    private final SensorGasRepository sensorGasRepository;

    // Endpoint para listar todos os sensores de gás
    @GetMapping
    public ResponseEntity<List<SensorGasResponseDto>> list() {
        List<SensorGasResponseDto> dtos = sensorGasService.list()
                .stream()
                .map(sensorGasMapper::toDto)
                .toList();

        return ResponseEntity.ok().body(dtos);
    }

    // Endpoint para criar um novo sensor de gás
    @PostMapping
    public ResponseEntity<SensorGasResponseDto> create(@RequestBody SensorGasRequestCreateDto dto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        sensorGasMapper.toDto(
                                sensorGasService.save(sensorGasMapper.toModel(dto)))
                );
    }

    // Endpoint para atualizar um sensor de gás existente
    @PutMapping("{id}")
    public ResponseEntity<SensorGasResponseDto> update(
            @PathVariable Long id,
            @RequestBody SensorGasRequestUpdateDto dto) {
        if (!sensorGasService.existsById(id)){
            throw new RuntimeException("Id inexistente");
        }
        return ResponseEntity.ok()
                .body(
                        sensorGasMapper.toDto(
                                sensorGasService.save(sensorGasMapper.toModel(id, dto)))
                );
    }

    // Endpoint para excluir um sensor de gás pelo ID
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        if (!sensorGasService.existsById(id)){
            throw new RuntimeException("Id inexistente");
        }

        sensorGasService.delete(id);
    }

    // Endpoint para buscar um sensor de gás pelo ID
    @GetMapping("{id}")
    public ResponseEntity<SensorGasResponseDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok()
                .body(
                        sensorGasService
                                .findById(id)
                                .map(sensorGasMapper::toDto)
                                .orElseThrow(() -> new RuntimeException("Id inexistente"))
                );
    }

    // Endpoint para buscar sensores de gás pelo nome
    @GetMapping("/find")
    public  ResponseEntity<?> findByNome(
            @RequestParam String nome,
            SensorGasViewType type) {

        return switch (type) {
            case FULL -> ResponseEntity.ok().body(sensorGasRepository.findAllByNomeContains(nome, SensorGasFullView.class));
            case SIMPLE ->
                    ResponseEntity.ok().body(sensorGasRepository.findAllByNomeContains(nome, SensorGasSimpleView.class));
        };
    }
}