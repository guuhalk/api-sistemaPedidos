package br.com.gdaniel.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gdaniel.cursomc.Dao.CategoriaDao;
import br.com.gdaniel.cursomc.Model.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaDao em;
	
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = em.findById(id);
		return obj.orElse(null);	
	}
	
}
