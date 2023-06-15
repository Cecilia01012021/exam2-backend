package ec.edu.insteclrg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.insteclrg.dto.ServicioDTO;

public interface GenericCrudService<DOMAIN, DTO> {

	void guardar(DTO dtoObject);

	void actualizar(DTO dtoObject);
	
	void eliminar(DTO dtoObject);

	List<DTO> buscarTodo(DTO dtoObject);

	DOMAIN mapearDominio(DTO dtoObject);

	DTO mapearDTO(DOMAIN domainObject);

	abstract Optional<DOMAIN> buscar(DTO dtoObject);

	

	
}