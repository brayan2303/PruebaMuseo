package mocks;

import example.dto.MuseoDTO;
import example.dto.ObraDTO;
import example.model.MuseoModel;
import example.model.ObraModel;

import java.util.ArrayList;
import java.util.List;


public class ObjetoDTOs {

    public static MuseoDTO dtoMuseo(){
        return MuseoDTO.builder()
                .idSerial(1)
                .nombre("BELLAS ARTES")
                .pais("COLOMBIA")
                .ciudad("BOGOTA")
                .direccion("CALLE 48")
                .build();
    }

    public static MuseoModel modelMuseo(){
        return MuseoModel.builder()
                .idSerial(1)
                .nombre("BELLAS ARTES")
                .pais("COLOMBIA")
                .ciudad("BOGOTA")
                .direccion("CALLE 48")
                .build();
    }

    public static List<MuseoModel> listMuseo(){
        List<MuseoModel> list = new ArrayList<>();
        list.add(modelMuseo());
        return list;
    }

    public static List<MuseoModel> museoNull(){
        List<MuseoModel> list = new ArrayList<>();
        MuseoModel museo = null;
        list.add(museo);
        return list;
    }

    public static MuseoDTO dtoMuseoNull(){
        MuseoDTO museoDTO = null;
        return museoDTO;
    }

    public static ObraDTO dtoObra(){
        return ObraDTO.builder()
                .idSerial(1)
                .nombre("OBRA")
                .pais("COLOMBIA")
                .idArtista(1)
                .build();
    }
    public static ObraModel modelObra(){
        return ObraModel.builder()
                .idSerial(1)
                .nombre("OBRA")
                .pais("COLOMBIA")
                .idArtista(1)
                .build();

    }

    public static List<ObraModel> listObra(){
        List<ObraModel> list = new ArrayList<>();
        list.add(modelObra());
        return list;
    }

    public static List<ObraModel> obraNull(){
        List<ObraModel> list = new ArrayList<>();
        ObraModel museo = null;
        list.add(museo);
        return list;
    }
}
