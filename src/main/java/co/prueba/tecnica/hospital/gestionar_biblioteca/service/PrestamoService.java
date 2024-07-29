package co.prueba.tecnica.hospital.gestionar_biblioteca.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.prueba.tecnica.hospital.gestionar_biblioteca.entity.Prestamo;
import co.prueba.tecnica.hospital.gestionar_biblioteca.repository.PrestamoRepository;

@Service
public class PrestamoService {
    @Autowired
    private PrestamoRepository repository;

    public boolean crearPrestamo(Prestamo prestamo) {
        Prestamo prestamoAux = repository.save(prestamo);
        if (prestamoAux != null) {
            return true;
        }
        return false;
    }

    public List<Prestamo> obtenerPrestamos() {
        return repository.findAll();
    }

    public List<Prestamo> obtenerPrestamosUsuario(Long documento_identida) {
        return repository.findAllByPrestamo_Usuario_documento_identidad(documento_identida);
    }

    public boolean devolucionLibro(Long libro_id, Date fecha_devolucion) {
        Prestamo prestamo = repository.findByPrestamo_Libro_id(libro_id);
        if (prestamo != null) {
            prestamo.setFecha_devolucion(fecha_devolucion);
            prestamo = repository.save(prestamo);
            return true;
        }
        return false;
    }
}
