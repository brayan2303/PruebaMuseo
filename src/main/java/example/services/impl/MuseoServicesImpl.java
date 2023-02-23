package example.services.impl;

import example.dto.MuseoDTO;
import example.model.MuseoModel;
import example.repository.MuseoRepository;
import example.services.MuseoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MuseoServicesImpl implements MuseoServices {

    @Autowired
    private MuseoRepository repository;

    @Override
    public Mono<List<MuseoDTO>> listarPorCiudadNombre(MuseoDTO dtoIn){
        List<MuseoModel> model = repository.sp_MuseosPorCiudadYLetra(dtoIn.getCiudad(), dtoIn.getNombre());
        return Mono.just(model.stream().map(dto -> MuseoDTO.builder().idSerial(dto.getIdSerial()).nombre(dto.getNombre()).pais(dto.getPais()).ciudad(dto.getCiudad()).direccion(dto.getDireccion()).build()).collect(Collectors.toList()));
    }
}
