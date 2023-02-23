package example.controller;

import example.dto.MuseoDTO;
import example.services.MuseoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("${application.api.path}")
@CrossOrigin(origins = "*")
public class MuseoController {
    @Autowired
    private MuseoServices museoServices;

    @GetMapping(value = "/listMuseo")
    public Mono<List<MuseoDTO>> listMuseo (@RequestBody MuseoDTO dto){ return  museoServices.listarPorCiudadNombre(dto);}
}
