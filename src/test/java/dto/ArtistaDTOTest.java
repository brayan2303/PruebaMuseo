package dto;

import example.dto.ArtistaDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArtistaDTOTest {
    private ArtistaDTO artistaDTO = new ArtistaDTO();
    @Before
    public void starting(){
        artistaDTO.setIdSerial(1);
        artistaDTO.setName("BRAYAN");
        artistaDTO.setNumeroIde("123");
        artistaDTO.setApellidos("ALGECIRA");
        artistaDTO.setTipoIde("TYPE");
    }

    @Test
    public void testToString() {
        Assert.assertEquals("ArtistaDTO(idSerial=1, tipoIde=TYPE, numeroIde=123, name=BRAYAN, apellidos=ALGECIRA)", artistaDTO.toString());
    }
    @Test
    public void testEquals(){
        ArtistaDTO artistaDTO1 = new ArtistaDTO();
        Assert.assertEquals(false, artistaDTO.getIdSerial().equals(artistaDTO1.getIdSerial()));
        Assert.assertEquals(false, artistaDTO.getApellidos().equals(artistaDTO1.getApellidos()));
        Assert.assertEquals(false, artistaDTO.getName().equals(artistaDTO1.getName()));
        Assert.assertEquals(false, artistaDTO.getTipoIde().equals(artistaDTO1.getTipoIde()));
        Assert.assertEquals(false, artistaDTO.getNumeroIde().equals(artistaDTO1.getNumeroIde()));
    }

}
