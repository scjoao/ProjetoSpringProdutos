package dev.scjoao.ProjetoSpringProdutos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.scjoao.ProjetoSpringProdutos.Entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
