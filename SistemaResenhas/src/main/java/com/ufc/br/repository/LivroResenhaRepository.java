package com.ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufc.br.model.LivroResenha;

@Repository
public interface LivroResenhaRepository extends JpaRepository<LivroResenha, Long>{

	
}
