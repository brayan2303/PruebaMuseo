package services;

import example.dto.ObraDTO;
import example.model.ObraModel;
import example.repository.ObraRepository;
import example.services.impl.ObraServicesImpl;
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

public class ObraServiceTest {

    @InjectMocks
    private ObraServicesImpl services;

    @Mock
    private ObraRepository repository;

    @Before
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void dadoListarObrasWhenDatosCorrectosThenListas(){
        ObraDTO dto = ObjetoDTOs.dtoObra();
        List<ObraModel> model = ObjetoDTOs.listObra();
        when(repository.findByIdArtistaAndPais(Mockito.anyInt(), Mockito.anyString())).thenReturn(model);
        Mono<List<ObraDTO>> listar = services.listarObras(dto);
        Assert.assertNotNull(listar);
    }
}
