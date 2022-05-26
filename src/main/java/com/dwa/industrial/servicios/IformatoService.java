package com.dwa.industrial.servicios;

import java.util.List;
import java.util.Optional;

import com.dwa.industrial.modelo.Dato;

public interface IformatoService {
	public List<Dato>listar();
	public Optional<Dato>listarId(int id);
	public int save(Dato p);

}
