package co.prueba.tecnica.hospital.gestionar_biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.tecnica.hospital.gestionar_biblioteca.entity.Prestamo;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long>{
    public List<Prestamo> findAllByPrestamo_Usuario_documento_identidad(Long documento_identidad);
    public Prestamo findByPrestamo_Libro_id(Long id);
}