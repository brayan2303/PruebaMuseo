package model;

import example.dto.ArtistaDTO;
import example.model.ArtistaModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArtistaModelTest {
    private ArtistaModel artistaModel = new ArtistaModel();
    @Before
    public void starting(){
        artistaModel.setIdSerial(1);
        artistaModel.setName("BRAYAN");
        artistaModel.setNumeroIde("123");
        artistaModel.setApellidos("ALGECIRA");
        artistaModel.setTipoIde("TYPE");
    }

    @Test
    public void testToString() {
        Assert.assertEquals("ArtistaModel(idSerial=1, tipoIde=TYPE, numeroIde=123, name=BRAYAN, apellidos=ALGECIRA)",artistaModel.toString());
    }
    @Test
    public void testEquals(){
        ArtistaModel artistaModel1 = new ArtistaModel();
        Assert.assertEquals(false, artistaModel.getIdSerial().equals(artistaModel1.getIdSerial()));
        Assert.assertEquals(false, artistaModel.getApellidos().equals(artistaModel1.getApellidos()));
        Assert.assertEquals(false, artistaModel.getName().equals(artistaModel1.getName()));
        Assert.assertEquals(false, artistaModel.getTipoIde().equals(artistaModel1.getTipoIde()));
        Assert.assertEquals(false, artistaModel.getNumeroIde().equals(artistaModel1.getNumeroIde()));
    }
}
