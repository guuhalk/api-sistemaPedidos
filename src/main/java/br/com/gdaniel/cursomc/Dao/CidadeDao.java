package br.com.gdaniel.cursomc.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gdaniel.cursomc.Model.Cidade;

@Repository
public interface CidadeDao extends JpaRepository<Cidade, Integer>{

}
