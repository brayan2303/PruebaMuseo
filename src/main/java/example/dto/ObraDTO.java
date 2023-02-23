package example.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObraDTO {

    private Integer idSerial;
    private String nombre;
    private String pais;
    private Integer idArtista;
}
