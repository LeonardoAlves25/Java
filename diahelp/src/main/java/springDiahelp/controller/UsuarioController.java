package springDiahelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springDiahelp.DAO.IUsuario;
import springDiahelp.model.cadastro;

@RestController
public class UsuarioController {
	
	@Autowired
	private IUsuario dao;
	
	@GetMapping("/usuarios")
	public List<cadastro> listaUsuarios () {
		return (List<cadastro>) dao.findAll();
	}
	
}
