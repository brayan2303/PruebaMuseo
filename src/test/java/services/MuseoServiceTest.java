package services;

import example.dto.MuseoDTO;
import example.dto.ObraDTO;
import example.model.MuseoModel;
import example.repository.MuseoRepository;
import example.services.impl.MuseoServicesImpl;
import mocks.ObjetoDTOs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.mockito.Mockito.when;

public class MuseoServiceTest {

    @InjectMocks
    private MuseoServicesImpl services;

    @Mock
    private MuseoRepository repository;

    @Before
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void dadoListarMuseoWhenDatosCorrectosThenListas(){
        MuseoDTO dto = ObjetoDTOs.dtoMuseo();
        List<MuseoModel> model = ObjetoDTOs.listMuseo();
        when(repository.sp_MuseosPorCiudadYLetra(Mockito.anyString(), Mockito.anyString())).thenReturn(model);
        Mono<List<MuseoDTO>> listar = services.listarPorCiudadNombre(dto);
        Assert.assertNotNull(listar);
    }
}
