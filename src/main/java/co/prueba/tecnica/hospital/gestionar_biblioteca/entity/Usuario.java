package co.prueba.tecnica.hospital.gestionar_biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private Long documento_identidad;

    private String nombre;

    private String email;
}
