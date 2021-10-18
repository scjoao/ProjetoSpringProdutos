package dev.scjoao.ProjetoSpringProdutos.Repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import dev.scjoao.ProjetoSpringProdutos.Entities.Category;

@Component
public class CategoryRepository {
	
	private Map<Long, Category> map = new HashMap<>();
	
	public void save(Category category) {
		map.put(category.getId(), category);
	}
	
	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll(){
		return new ArrayList<Category>(map.values());
	}

}
