package ec.edu.insteclrg.controller.v1;

import java.util.List;

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

import ec.edu.insteclrg.domain.Service;
import ec.edu.insteclrg.dto.ApiResponseDTO;
import ec.edu.insteclrg.dto.ProductoDTO;
import ec.edu.insteclrg.dto.ServicioDTO;
import ec.edu.insteclrg.service.crud.ServicioService;

@RestController
@RequestMapping("/v1.0/servicio")
public class ServiceController {
	
	@Autowired
	ServicioService  Service;


	@PostMapping(path = "/guardar")
	public ResponseEntity<Object> guardar(@RequestBody ServicioDTO dto) {
		Service.guardar(dto);
		return new ResponseEntity<>(new ApiResponseDTO<>(true, null), HttpStatus.CREATED);
	}

	@PutMapping(path = "/actualizar")
	public ResponseEntity<Object> actualizar(@RequestBody ServicioDTO dto) {
		Service.actualizar(dto);
		return new ResponseEntity<>(new ApiResponseDTO<>(true, null), HttpStatus.CREATED);
	}

	@GetMapping(path = "/listar")
	public ResponseEntity<Object> listar() {
		List<ServicioDTO> list = Service.buscarTodo(new ServicioDTO());
		if (!list.isEmpty()) {
			ApiResponseDTO<List<ServicioDTO>> response = new ApiResponseDTO<>(true, list);
			return (new ResponseEntity<Object>(response, HttpStatus.OK));
		} else {
			return new ResponseEntity<>(new ApiResponseDTO<>(false, null), HttpStatus.NOT_FOUND);
		}
	}

	

	@DeleteMapping(path = "/{id}/eliminar")
	public ResponseEntity<Object> eliminar(@PathVariable Long id) {
		ServicioDTO dto = new ServicioDTO();
		dto.setId(id);
		Service.eliminar(dto);
		return new ResponseEntity<>(new ApiResponseDTO<>(true, null), HttpStatus.CREATED);
	}



}
