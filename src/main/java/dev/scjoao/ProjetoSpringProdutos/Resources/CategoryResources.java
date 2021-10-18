package dev.scjoao.ProjetoSpringProdutos.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.scjoao.ProjetoSpringProdutos.Entities.Category;
import dev.scjoao.ProjetoSpringProdutos.Repositories.CategoryRepository;

@RestController
@RequestMapping("/categories")
public class CategoryResources {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category cat = categoryRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}
