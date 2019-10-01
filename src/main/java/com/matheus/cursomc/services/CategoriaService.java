package com.matheus.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.cursomc.domain.Categoria;
import com.matheus.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Optional<Categoria> buscar (Integer id) {
		Optional<Categoria> categorias = repo.findById(id);
		return categorias;
	}

}
