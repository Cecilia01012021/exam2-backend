package ec.edu.insteclrg.controller.v1;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.insteclrg.domain.User;
import ec.edu.insteclrg.dto.ApiResponseDTO;
import ec.edu.insteclrg.dto.UserDTO;
import ec.edu.insteclrg.service.crud.UserService;

@RestController
@RequestMapping("/api/v1.0/login")
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/login")
	public ResponseEntity<Object> User(@RequestBody UserDTO loginDTO) {
		User user = service.findByUsername(loginDTO.getName());

		if (user != null && user.getPassword().equals(loginDTO.getPassword())) {
			return new ResponseEntity<>(new ApiResponseDTO<>(true, "Inicio de sesión exitoso"), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new ApiResponseDTO<>(false, "Credenciales inválidas"), HttpStatus.UNAUTHORIZED);
		}
	}
}