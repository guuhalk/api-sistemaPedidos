package br.com.gdaniel.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gdaniel.cursomc.Dao.CategoriaDao;
import br.com.gdaniel.cursomc.Dao.CidadeDao;
import br.com.gdaniel.cursomc.Dao.EstadoDao;
import br.com.gdaniel.cursomc.Dao.ProdutoDao;
import br.com.gdaniel.cursomc.Model.Categoria;
import br.com.gdaniel.cursomc.Model.Cidade;
import br.com.gdaniel.cursomc.Model.Estado;
import br.com.gdaniel.cursomc.Model.Produto;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaDao categoriaDao;
	@Autowired
	private ProdutoDao produtoDao;
	@Autowired
	private EstadoDao estadoDao;
	@Autowired
	private CidadeDao cidadeDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null,"Computador",2000.00);
		Produto p2 = new Produto(null,"Impressora",800.00);
		Produto p3 = new Produto(null,"Mouse",80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaDao.saveAll((Arrays.asList(cat1,cat2)));
		produtoDao.saveAll(Arrays.asList(p1,p2,p3));
	
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "Sao Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlandia",est1);
		Cidade c2 = new Cidade(null, "Sao Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));
	
		estadoDao.saveAll(Arrays.asList(est1,est2));
		cidadeDao.saveAll(Arrays.asList(c1,c2,c3));
	
		
	}

}

