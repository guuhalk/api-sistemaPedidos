package br.com.gdaniel.cursomc.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gdaniel.cursomc.Model.ItemPedido;

@Repository
public interface ItemPedidoDao extends JpaRepository<ItemPedido, Integer> {

	
}
