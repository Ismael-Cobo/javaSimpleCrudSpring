package com.cursoJava.cursoJava;

import com.cursoJava.cursoJava.controller.UsuarioController;
import com.cursoJava.cursoJava.dao.UsuarioDao;
import com.cursoJava.cursoJava.model.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CursoJavaApplicationTests {
	private UsuarioDao usuarioDao;

	@Test
	void contextLoads() {

		System.out.println(usuarioDao.getUsuarios());
	}

}
