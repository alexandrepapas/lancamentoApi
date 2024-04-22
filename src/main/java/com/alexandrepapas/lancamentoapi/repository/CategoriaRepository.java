package com.alexandrepapas.lancamentoapi.repository;

import com.alexandrepapas.lancamentoapi.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
}
