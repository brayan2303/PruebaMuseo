package example.model;

import lombok.*;


import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "artistas")
@Table(name = "Artistas")
public class ArtistaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERIAL")
    private Integer idSerial;
    @Column(name = "TIPO_IDE")
    private String tipoIde;
    @Column(name = "NUMERO_IDE")
    private String numeroIde;
    @Column(name = "NOMBRES")
    private String name;
    @Column(name = "APELLIDOS")
    private String apellidos;
}
