package example.services;

import example.dto.ObraDTO;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ObraServices {

    Mono<List<ObraDTO>> listarObras(ObraDTO obra);
}
