package co.prueba.tecnica.hospital.gestionar_biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.tecnica.hospital.gestionar_biblioteca.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{}
