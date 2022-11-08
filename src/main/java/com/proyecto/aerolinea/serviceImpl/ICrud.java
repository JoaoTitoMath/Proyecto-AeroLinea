package com.proyecto.aerolinea.serviceImpl;

import java.util.List;

public interface ICrud<T, ID> {

	T registrar(T med) throws Exception;

	T actualizar(T med) throws Exception;

	void eliminar(ID cod) throws Exception;

	T buscar(ID cod) throws Exception;

	List<T> listAll() throws Exception;
}
