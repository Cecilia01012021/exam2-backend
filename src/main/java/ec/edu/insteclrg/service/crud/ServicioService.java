package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;


import ec.edu.insteclrg.domain.Service;
import ec.edu.insteclrg.dto.ServicioDTO;
import ec.edu.insteclrg.persistence.ServiceRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@org.springframework.stereotype.Service
public class ServicioService extends GenericCrudServiceImpl<Service, ServicioDTO>{

	@Override
	public ServicioDTO mapearDTO(Service domainObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Service> buscar(ServicioDTO dtoObject) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Service mapearDominio(ServicioDTO dtoObject) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}




