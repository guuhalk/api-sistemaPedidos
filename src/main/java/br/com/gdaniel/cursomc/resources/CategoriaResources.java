package br.com.gdaniel.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.gdaniel.cursomc.model.Categoria;

@RestController 
@RequestMapping (value="/categorias")
public class CategoriaResources {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1,"Informatica");
		Categoria cat2 = new Categoria(2,"Contabil");
		Categoria cat3 = new Categoria(3,"Financeiro");
		Categoria cat4 = new Categoria(4,"Fiscal");
		Categoria cat5 = new Categoria(5,"Juridico");
		Categoria cat6 = new Categoria(6,"Departamento Pessoal");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);
		lista.add(cat5);
		lista.add(cat6);
		
		return lista;
	}
}
