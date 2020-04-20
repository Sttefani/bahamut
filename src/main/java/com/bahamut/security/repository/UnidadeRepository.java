package com.bahamut.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bahamut.models.Unidade;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {
	
	@Override
	public List<Unidade> findAll();
}
