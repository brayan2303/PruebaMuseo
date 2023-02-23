package example.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Museos")
@Table(name = "Museos")
public class MuseoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERIAL")
    private Integer idSerial;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "PAIS")
    private String pais;
    @Column(name = "CIUDAD")
    private String ciudad;
    @Column(name = "DIRECCION")
    private String direccion;
}
