package dev.scjoao.ProjetoSpringProdutos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.scjoao.ProjetoSpringProdutos.Entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
