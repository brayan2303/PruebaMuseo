package example.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MuseoDTO {
    private Integer idSerial;
    private String nombre;
    private String pais;
    private String ciudad;
    private String direccion;
}

