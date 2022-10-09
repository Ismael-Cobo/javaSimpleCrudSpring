package com.cursoJava.cursoJava.controller;

import com.cursoJava.cursoJava.dao.UsuarioDao;
import com.cursoJava.cursoJava.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthController {
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public List<Usuario> loginUsuario(@RequestBody Usuario usuario) {
        return usuarioDao.verificarEmailPassword(usuario);
    }
}
