package com.dwa.industrial.controladores;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dwa.industrial.modelo.Dato;
import com.dwa.industrial.modelo.Usuario;
import com.dwa.industrial.servicios.IformatoService;
import com.dwa.industrial.servicios.ServicioFormato;
import com.dwa.industrial.servicios.ServicioUsuario;



@Controller
public class FormatoController {
	
	@Autowired
	ServicioUsuario servicioUsuario;
	@Autowired
	ServicioFormato servicioFormato;
	
	
	
	@GetMapping("/datos/inicio")
	public String inicio() {
		return "datos/inicio";
	}
	
	@GetMapping("/datos/ubicacion")
	public String Ubicacion() {
		return "datos/ubicacion";
	}
	
	@GetMapping("/datos/agregar")
	public String agregar(Model modelo) {
		modelo.addAttribute("dato", new Dato());
		return "datos/agregar";
	}
	
	
	
	@PostMapping("/datos/agregar")
	public String agregar(Model modelo, @ModelAttribute Dato dato, HttpSession sesion) {
		int iduser = Integer.parseInt(sesion.getAttribute("iduser").toString());
		Usuario autor = servicioUsuario.buscar(iduser);
		if(autor == null || autor.getId() == 0) 
			modelo.addAttribute("error", servicioUsuario.getMensaje());
		else {
			dato.setUsuario(autor);
			if(!servicioFormato.agregar(dato));
				modelo.addAttribute("error", servicioFormato.getMensaje());
		}
		return "datos/agregar";
	}
	
	@Autowired
	private IformatoService service;
	
	@GetMapping("/datos/listar")
	public String listar(Model model) {
		List<Dato>datos=service.listar();
		model.addAttribute("dato", datos);
		return "datos/listar";
	}

}
