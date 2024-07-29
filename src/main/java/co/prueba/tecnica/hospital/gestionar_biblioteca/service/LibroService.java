package co.prueba.tecnica.hospital.gestionar_biblioteca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.prueba.tecnica.hospital.gestionar_biblioteca.entity.Libro;
import co.prueba.tecnica.hospital.gestionar_biblioteca.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository repository;

    public boolean crearLibro(Libro libro){
        Libro libroAux = repository.save(libro);
        if (libroAux != null) {
            return true;
        }
        return false;
    }

    public boolean eliminarLibro(Long id){
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
