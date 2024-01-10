package restapi.demo.models;

import jakarta.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="auto")
public class Autos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_auto")
    private long id;
    private String marca;
    private String modelo;
    private String color;
    private long anio;
}
