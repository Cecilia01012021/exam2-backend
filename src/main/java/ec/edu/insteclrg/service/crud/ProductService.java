package ec.edu.insteclrg.service.crud;

import java.util.Optional;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Product;
import ec.edu.insteclrg.dto.CategoriaDTO;
import ec.edu.insteclrg.dto.ProductoDTO;
import ec.edu.insteclrg.persistence.ProductRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;
import org.modelmapper.ModelMapper;
@Service
public class ProductService extends GenericCrudServiceImpl<Product, ProductoDTO> {

	@Autowired
	ProductRepository repository;

	@Autowired
	ModelMapper mapper;

	@Override
	public ProductoDTO mapearDTO(Product domainObject) {
		ProductoDTO dto = mapper.map(domainObject, ProductoDTO.class);
		return dto;
	}

	@Override
	public Optional<Product> buscar(ProductoDTO dtoObject) {
		return repository.findById(dtoObject.getId());
	}

	@Override
	public Product mapearDominio(ProductoDTO dtoObject) {
		Product domian = mapper.map(dtoObject, Product.class);
		return domian;
	}
}

