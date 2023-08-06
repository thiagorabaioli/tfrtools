package tfr.Tools;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tfr.Tools.entities.Categoria;
import tfr.Tools.entities.Produto;
import tfr.Tools.repositories.CategoriaRepository;
import tfr.Tools.repositories.ProdutoRepository;

@SpringBootApplication
public class TfrToolsApplication implements CommandLineRunner{
	
	
	@Autowired
	private CategoriaRepository categoriaRepo;

	@Autowired
	private ProdutoRepository produtoRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(TfrToolsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Casa");
		Categoria cat2 = new Categoria(null, "Escrit]orio");
		
		Produto p1 = new Produto(null, "sofa tipo 1");
		Produto p2 = new Produto(null, "Mesa secretária tipo 2");
		Produto p3 = new Produto(null, "Aparador casa tipo 4");
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		
		
		
		
		
		categoriaRepo.saveAll(Arrays.asList(cat1,cat2));
		produtoRepo.saveAll(Arrays.asList(p1,p2,p3));
		
	}

}
