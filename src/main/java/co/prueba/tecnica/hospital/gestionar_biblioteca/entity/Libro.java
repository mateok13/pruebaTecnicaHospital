package co.prueba.tecnica.hospital.gestionar_biblioteca.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String autor;

    private Date fecha_publicacion;
}
