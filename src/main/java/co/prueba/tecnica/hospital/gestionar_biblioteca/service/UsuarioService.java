package co.prueba.tecnica.hospital.gestionar_biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.prueba.tecnica.hospital.gestionar_biblioteca.entity.Usuario;
import co.prueba.tecnica.hospital.gestionar_biblioteca.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public boolean crearUsuario(Usuario usuario){
        Usuario usuarioAux = repository.save(usuario);
        if (usuarioAux != null) {
            return true;
        }
        return false;
    }

    public List<Usuario> obtenerUsuarios(){
        return repository.findAll();
    }

    public Usuario obtenerUsuario(Long documento_identidad){
        Usuario usuario = repository.findByUsuario_documento_identidad(documento_identidad);
        if (usuario != null) {
            return usuario;
        }
        return null;
    }

    public boolean actualizarUsuario(Usuario usuario){
        Usuario usuarioAux = repository.findByUsuario_documento_identidad(usuario.getDocumento_identidad());
        if (usuarioAux != null) {
            repository.save(usuarioAux);
            return true;
        }
        return false;
    }

    public boolean eliminarUsuario(Long documento_identidad){
        Usuario usuario = repository.findByUsuario_documento_identidad(documento_identidad);
        if (usuario != null) {
            repository.delete(usuario);
            return true;
        }
        return false;

    }
}