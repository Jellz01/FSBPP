package JF.co.uk.demo.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

@Entity
public class Contrato {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "espacio_id", nullable = false)
    private Espacio espacio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tarifa_id", nullable = false)
    private Tarifa tarifa;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDateTime fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    @Column(name = "total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }



    // Getters and Setters
}
