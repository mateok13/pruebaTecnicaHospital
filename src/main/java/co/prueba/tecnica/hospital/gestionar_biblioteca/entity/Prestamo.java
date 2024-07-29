package co.prueba.tecnica.hospital.gestionar_biblioteca.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Libro> libros;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Usuario> usuarios;

    private Date fecha_prestamo;

    private Date fecha_devolucion;
}