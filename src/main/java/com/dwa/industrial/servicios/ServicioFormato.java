package com.dwa.industrial.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.industrial.modelo.Dato;



@Service
public class ServicioFormato implements IformatoService{
	@Autowired
	private RepoFormato repoProyecto;
	
	private String Mensaje;

	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	public boolean agregar(Dato dato) {
		try {
			repoProyecto.save(dato);
			this.Mensaje = "Formato registrado con exito.";
			return true;
		}catch(Exception e) {
			this.Mensaje = "Error al registrar el Formato";
			return false;
		}
	}


	@Override
	public List<Dato> listar() {
		return (List<Dato>)repoProyecto.findAll();
	}

	@Override
	public Optional<Dato> listarId(int id) {
		return repoProyecto.findById(id);
	}

	@Override
	public int save(Dato p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
