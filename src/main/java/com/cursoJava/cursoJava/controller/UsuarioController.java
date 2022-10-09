package com.cursoJava.cursoJava.controller;

import com.cursoJava.cursoJava.dao.UsuarioDao;
import com.cursoJava.cursoJava.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController  {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuario/{id}")
    public Usuario getUsuario(@PathVariable String id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ismael");
        usuario.setApellidos("Cobo");
        usuario.setTelefono("673139206");
        usuario.setPassword("ismael");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuario", method = RequestMethod.POST)
    public void registerUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registerUsuario(usuario);
    }

    @RequestMapping(value = "usuarioaas/{id}")
    public Usuario editUsuario(@PathVariable String id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ismael");
        usuario.setApellidos("Cobo");
        usuario.setTelefono("673139206");
        usuario.setPassword("ismael");
        return usuario;
    }

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id) {
        usuarioDao.deleteUsuario(id);
    }

    @RequestMapping(value = "usuarioass/{id}")
    public Usuario buscar(@PathVariable String id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ismael");
        usuario.setApellidos("Cobo");
        usuario.setTelefono("673139206");
        usuario.setPassword("ismael");
        return usuario;
    }
}
