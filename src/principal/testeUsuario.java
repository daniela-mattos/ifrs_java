package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testeUsuario {

	public static void main(String[] args) {
		//testando a classe livro
		System.out.println("Testando as classes livro/pais/autor/idioma.");
		
		//declaração de variáveis
		Livro lvr1, lvr2, lvr3;
		Autor atr1, atr2;
		Editora edtr1, edtr2;
		Genero gnr1, gnr2;
		Pais ps1, pais2;
		Idioma idm1, idiom2, idmI;
		Amigue amg1, amg2;
		Emprestimo emp1;
		Colecao col1;
		LivroDesejado lvrD1;
		
		idmI = new Idioma("Inglês");
		
		//instanciando objetos obrigatórios para construir o objeto Livro
		atr1 = new Autor("Clarice Lispector");
		idm1 = new Idioma("Portugues");
		ps1 = new Pais("Brasil", idm1);
		atr1.setPaisAutor(ps1);
		
		edtr1 = new Editora("Rocco");
		gnr1 = new Genero("Romance");
		
		atr2 = new Autor("Gustave Flaubert");
		idiom2 = new Idioma("Francês");
		pais2 = new Pais("França", idiom2);
		atr2.setPaisAutor(pais2);
		
		
		edtr2 = new Editora("Martin Claret");
		gnr2 = new Genero("Romance");
		
		//instanciando Livro
		lvr1 = new Livro(123456, "A hora da estrela", atr1, edtr1, gnr1);
		System.out.println(lvr1);
		
		System.out.println("-----------------------");
		lvr2 = new Livro(565625, "Madame Bovary", atr2, edtr2, gnr2);
		System.out.println(lvr2);
		System.out.println("-----------------------");
		System.out.println(" ");
		
		lvr3 = new Livro(505050, "A morte segundo GH", atr1, edtr1, gnr1);
		System.out.println(lvr3);
		
		
		
		System.out.println("Testando as classes Estante/LivroAdquirido.");
		// adicionando uma estante
		Estante est1, est2;
		est1 = new Estante("Estante 1", "Sala");
		System.out.println(est1);
		
		est2 = new Estante("Estante 2", "Sala");
		System.out.println(est2);
		
		//testando LivroAdquirido
		
		LivroAdquirido livro1, livro2, livro3;
		
		livro1 = new LivroAdquirido(lvr1, est1, "Físico", "Comprado", idm1);
		
		est1.adicionaLivroEstante(livro1, est1);
		System.out.println(livro1);
		
		System.out.println(" ");
		System.out.println("-------Mudando a estante--------");
		livro1.setEstante(est2);
		est1.adicionaLivroEstante(livro1, est2);
		
		System.out.println(livro1);
				
		System.out.println(" ");
		System.out.println("------------------------");
		livro2 = new LivroAdquirido(lvr2, est1, "ebook", "Alugado", idmI);
		System.out.println(livro2);
		
		System.out.println(" ");
		System.out.println("------------------------");
		
		livro3 = new LivroAdquirido(lvr3, est1, "fisico", "Comprado", idmI);
		est1.adicionaLivroEstante(livro1, est1);
		System.out.println(livro3);
		
		System.out.println(" ");
		System.out.println("------------------------");
		
		//instanciando um objeto da classe Amigue
		amg1 = new Amigue("Andreza Maria");
		
		//adicionando telefone
		amg1.setTelefone(99999999);
		amg1.setEmail("and@maria.com");
		
		System.out.println(amg1);
		
		amg1.setEmail("maria@adn.com");
		System.out.println(amg1);
		
		//segundo objeto Amigue
		amg2 = new Amigue("Mitsy Mattos", "mitsy@matos.com");
		System.out.println(amg2);
		
		System.out.println(" ");
		System.out.println("------------------------");
		
		//instanciando um objeto da classe Emprestimo
		
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		try {
			Date data1;
			data1 = formato.parse("23/11/2015");
			emp1 = new Emprestimo(amg1, livro3, data1);
			System.out.println(emp1);
		} catch (ParseException e) {
			System.out.println("Something went wrong.");
		}
		

		
		
		
		System.out.println(" ");
		System.out.println("------------------------");
		
		
		// instanciando coleção
		col1 = new Colecao("Scifi");
		System.out.println(col1);
		 
		
		//Adicionando descrição à coleção
		
		col1.setTema("Livros de ficção científica clássica.");
		System.out.println(col1);
		
		
		//Adicionando livros à coleção
		
		System.out.println(" ");
		System.out.println("--------Coleção----------------");
		
		col1.adicionaLivroColecao(livro1);
		col1.adicionaLivroColecao(livro2);
		col1.adicionaLivroColecao(livro3);
		
		System.out.println(col1.getLivrosColecao());
		
		//mostrando todos os itens da lista coleção
		System.out.println(" ");
		System.out.println("--------FOR Coleção----------------");
		
		for(LivroAdquirido l: col1.getLivrosColecao()) {
			System.out.println(l.getLivroAdq().getTitulo());
			System.out.println(l.getLivroAdq().getAutorLivro().getNomeAutor());
			System.out.println(l.getLivroAdq().getEditoraLivro().getNomeEditora());
			
			System.out.println(" ");
			System.out.println("------------------------");
		}
		
		System.out.println(" ");
		System.out.println("------------------------");
		
		// instancia livro desejado
		
		lvrD1 = new LivroDesejado(lvr1, "Site da editora", "Uma mulher reflete sobre a sua vida ao encontrar uma barata.", "Abordagem psicanalítica");
		System.out.println(lvrD1);
		
		
	}

}
