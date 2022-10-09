package com.cursoJava.cursoJava.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "password")
    private String password;

//        public Usuario (
//            String nombre,
//            String apellidos,
//            String email,
//            String telefono,
//            String password
//    ) {
//        this.nombre = nombre;
//        this.apellidos = apellidos;
//        this.email = email;
//        this.telefono = telefono;
//        this.password = password;
//    }
}
