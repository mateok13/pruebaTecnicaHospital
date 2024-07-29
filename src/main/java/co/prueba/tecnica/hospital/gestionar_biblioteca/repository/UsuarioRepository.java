package co.prueba.tecnica.hospital.gestionar_biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.tecnica.hospital.gestionar_biblioteca.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    public Usuario findByUsuario_documento_identidad(Long documento_identidad);
}
