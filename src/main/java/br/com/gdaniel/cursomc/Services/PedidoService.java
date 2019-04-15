package br.com.gdaniel.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gdaniel.cursomc.Dao.PedidoDao;
import br.com.gdaniel.cursomc.Model.Pedido;
import br.com.gdaniel.cursomc.Services.Exceptions.ExceptionsObjectNotFound;

@Service
public class PedidoService {

	@Autowired
	private PedidoDao em;
	
	
	public Pedido buscar(Integer id) {  
		Optional<Pedido> obj = em.findById(id);  
		
		return obj.orElseThrow(()-> new ExceptionsObjectNotFound("Objeto não encontrado! Id: " + id + ", Tipo: " + 
		Pedido.class.getName()));
	}
	
}
