package ies_alcores.api_productos.repository;

import ies_alcores.api_productos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
