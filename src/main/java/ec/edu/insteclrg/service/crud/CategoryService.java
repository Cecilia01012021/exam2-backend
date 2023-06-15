package ec.edu.insteclrg.service.crud;

import java.util.Optional;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Category;
import ec.edu.insteclrg.domain.Product;
import ec.edu.insteclrg.dto.CategoriaDTO;
import ec.edu.insteclrg.persistence.CategoryRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class CategoryService extends GenericCrudServiceImpl<Category, CategoriaDTO> {

	@Autowired
	private CategoryRepository repository;
	
	@Override
	public Category mapearDominio(CategoriaDTO dtoObject) {
		Category domain= new Category();
		domain.setNombre(dtoObject.getName());
		domain.setId(dtoObject.getId());		
		domain.setDescripcion(dtoObject.getDescripcion());
		return domain;
	}

	@Override
	public CategoriaDTO mapearDTO(Category domainObject) {
		CategoriaDTO dto=new CategoriaDTO();
		dto.setId(domainObject.getId());
		dto.setName(domainObject.getNombre());
		dto.setDescripcion(domainObject.getDescripcion());
		return dto;
	}

	@Override
	public Optional<Category> buscar(CategoriaDTO dtoObject) {
		return repository.findById(dtoObject.getId());
	}
}
