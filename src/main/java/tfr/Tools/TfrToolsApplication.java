package tfr.Tools;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tfr.Tools.entities.Categoria;
import tfr.Tools.entities.Cidade;
import tfr.Tools.entities.Cliente;
import tfr.Tools.entities.Endereco;
import tfr.Tools.entities.Estado;
import tfr.Tools.entities.Produto;
import tfr.Tools.entities.enums.TipoCliente;
import tfr.Tools.repositories.CategoriaRepository;
import tfr.Tools.repositories.CidadeRepository;
import tfr.Tools.repositories.ClienteRepository;
import tfr.Tools.repositories.EnderecoRepository;
import tfr.Tools.repositories.EstadoRepository;
import tfr.Tools.repositories.ProdutoRepository;

@SpringBootApplication
public class TfrToolsApplication implements CommandLineRunner{
	
	
	@Autowired
	private CategoriaRepository categoriaRepo;

	@Autowired
	private ProdutoRepository produtoRepo;
	
	
	@Autowired
	private EstadoRepository estadoRepo;
	
	@Autowired
	private CidadeRepository cidadeRepo;
	
	
	
	@Autowired
	private ClienteRepository clienteRepo;
	@Autowired
	private EnderecoRepository enderecoRepo;
	
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
		
		Estado est1 = new Estado(null, "Lisboa");
		Estado est2 = new Estado(null, "Setúbal");

		Cidade c1 = new Cidade(null, "Benfica", est1);
		Cidade c2 = new Cidade(null, "Palmela", est2);
		Cidade c3 = new Cidade(null, "Camarate", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));

		estadoRepo.saveAll(Arrays.asList(est1, est2));
		cidadeRepo.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);

		
		
		Endereco e1 = new Endereco(null, "Rua Flores em Benfica", "N300", "3DT", "Benfica", "1900-569", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "N105", "2DT", "Setúbal", "2910-692", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		
		clienteRepo.saveAll(Arrays.asList(cli1));
		enderecoRepo.saveAll(Arrays.asList(e1, e2));
	}

}
