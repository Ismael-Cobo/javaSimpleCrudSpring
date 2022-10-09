package com.cursoJava.cursoJava.dao;

import com.cursoJava.cursoJava.model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteUsuario(String Id) {
        Usuario usuario = entityManager.find(Usuario.class, Id);
        entityManager.remove(usuario);
    }

    @Override
    public void registerUsuario(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public List<Usuario> verificarEmailPassword(Usuario usuario) {

        String query = "FROM Usuario WHERE email = :email AND password = :password";

        List<Usuario> usuarioArray = entityManager.createQuery(query)
                .setParameter("email", usuario.getEmail())
                .setParameter("password", usuario.getPassword())
                .getResultList();

        return usuarioArray;
    }

}
