package dev.scjoao.ProjetoSpringProdutos.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.scjoao.ProjetoSpringProdutos.Entities.Product;
import dev.scjoao.ProjetoSpringProdutos.Repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductResources {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = productRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product cat = productRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}
