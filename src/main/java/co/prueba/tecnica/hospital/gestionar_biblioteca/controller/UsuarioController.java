package co.prueba.tecnica.hospital.gestionar_biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.prueba.tecnica.hospital.gestionar_biblioteca.service.UsuarioService;

@RestController
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

}
