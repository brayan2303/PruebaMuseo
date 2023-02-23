package example.services.impl;

import example.dto.ObraDTO;
import example.model.ObraModel;
import example.repository.ObraRepository;
import example.services.ObraServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ObraServicesImpl implements ObraServices {

    @Autowired
    private ObraRepository repository;

    @Override
    public Mono<List<ObraDTO>> listarObras(ObraDTO obra) {
        List<ObraModel> model = repository.findByIdArtistaAndPais(obra.getIdArtista(), obra.getPais());
        return Mono.just(model.stream().map(dto -> ObraDTO.builder().idSerial(dto.getIdSerial()).nombre(dto.getNombre()).pais(dto.getPais()).idArtista(dto.getIdArtista()).build()).collect(Collectors.toList()));
    }
}


