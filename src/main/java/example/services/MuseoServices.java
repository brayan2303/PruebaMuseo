package example.services;

import example.dto.MuseoDTO;
import reactor.core.publisher.Mono;

import java.util.List;

public interface MuseoServices {

    Mono<List<MuseoDTO>> listarPorCiudadNombre(MuseoDTO dto);
}
