package example.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArtistaDTO {

    private Integer idSerial;
    private String tipoIde;
    private String numeroIde;
    private String name;
    private String apellidos;

}
