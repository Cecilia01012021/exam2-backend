package ec.edu.insteclrg.service.crud;

import java.util.List;


import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import ec.edu.insteclrg.common.ApiException;
import ec.edu.insteclrg.domain.User;
import ec.edu.insteclrg.dto.UserDTO;
import ec.edu.insteclrg.persistence.UserRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;
@Service
public class UserService extends GenericCrudServiceImpl<User, UserDTO> {

	
	@Override
	public UserDTO mapearDTO(User domainObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> buscar(UserDTO dtoObject) {
		// TODO Auto-generated method stub
		return Optional.empty();
		
		
	}

	@Override
	public User mapearDominio(UserDTO dtoObject) {
		// TODO Auto-generated method stub
		return null;
	}

	public void registrar(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}
	
	public User findByUsername(String nombreUsuario) {
        return UserRepository.findByNombreusuario(nombreUsuario);
	}
	
	}






