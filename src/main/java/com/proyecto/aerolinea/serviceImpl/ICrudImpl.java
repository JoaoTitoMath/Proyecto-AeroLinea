package com.proyecto.aerolinea.serviceImpl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ICrudImpl<T, ID> implements ICrud<T, ID> {

	public abstract JpaRepository<T, ID> getJpaRepository();

	@Override
	public T registrar(T med) throws Exception {

		return getJpaRepository().save(med);
	}

	@Override
	public T actualizar(T med) throws Exception {

		return getJpaRepository().save(med);
	}

	@Override
	public void eliminar(ID cod) throws Exception {

		getJpaRepository().deleteById(cod);

	}

	@Override
	public T buscar(ID cod) throws Exception {

		return getJpaRepository().findById(cod).orElse(null);
	}

	@Override
	public List<T> listAll() throws Exception {

		return getJpaRepository().findAll();
	}

}
