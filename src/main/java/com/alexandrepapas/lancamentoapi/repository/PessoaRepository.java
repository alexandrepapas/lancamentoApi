package com.alexandrepapas.lancamentoapi.repository;

import com.alexandrepapas.lancamentoapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
