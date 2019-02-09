package br.com.gdaniel.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gdaniel.cursomc.Dao.ClienteDao;
import br.com.gdaniel.cursomc.Model.Cliente;
import br.com.gdaniel.cursomc.Services.Exceptions.ExceptionsObjectNotFound;

@Service
public class ClienteService {

	@Autowired
	private ClienteDao em;
	
	
	public Cliente buscar(Integer id) {  
		Optional<Cliente> obj = em.findById(id);  
		
		return obj.orElseThrow(()-> new ExceptionsObjectNotFound("Objeto não encontrado! Id: " + id + ", Tipo: " + 
				Cliente.class.getName()));
	}
	
}
