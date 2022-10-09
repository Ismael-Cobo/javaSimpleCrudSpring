package com.cursoJava.cursoJava.dao;

import com.cursoJava.cursoJava.model.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();
    void deleteUsuario(String Id);
    void registerUsuario(Usuario usuario);
    List<Usuario> verificarEmailPassword(Usuario usuario);
}
