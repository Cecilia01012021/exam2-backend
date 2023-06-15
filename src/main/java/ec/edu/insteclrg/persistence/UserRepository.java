package ec.edu.insteclrg.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.insteclrg.domain.User;
import lombok.extern.java.Log;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByEmail (String email);
	
	static User findByNombreusuario(String nombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
