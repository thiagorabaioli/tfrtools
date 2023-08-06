package tfr.Tools;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tfr.Tools.entities.Categoria;
import tfr.Tools.repositories.CategoriaRepository;

@SpringBootApplication
public class TfrToolsApplication implements CommandLineRunner{
	
	
	@Autowired
	private CategoriaRepository categoriaRepo;

	public static void main(String[] args) {
		SpringApplication.run(TfrToolsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Casa");
		Categoria cat2 = new Categoria(null, "Escrit]orio");
		
		categoriaRepo.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
