package example.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Obras")
@Table(name = "Obras")
public class ObraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERIAL")
    private Integer idSerial;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "PAIS")
    private String pais;
    @Column(name = "ID_ARTISTA")
    private Integer idArtista;
}
