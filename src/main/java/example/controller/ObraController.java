package example.controller;

import example.dto.ObraDTO;
import example.services.ObraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("${application.api.path}")
@CrossOrigin(origins = "*")
public class ObraController {
    @Autowired
    private ObraServices obraServices;

    @GetMapping(value = "/listarObra")
    public Mono<List<ObraDTO>> listarObra (@RequestBody ObraDTO dto){return  obraServices.listarObras(dto);}
}
