package controle;
import java.util.ArrayList;

import model.Acessorio;
import model.Endereco;
import model.Roupa;
import model.SacolaDeCompra;
import model.Usuario;

public class Dados {
	//Usuario responsavel pelas acoes no sistema
	public static Usuario usuarioPrincipal = new Usuario(); 
	
	//Lista com todos os usuarios cadastrados no sistema
	public static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	private SacolaDeCompra sacola = new SacolaDeCompra(usuarioPrincipal);

	public static ArrayList<Acessorio> acessoriosComprados = new ArrayList<>();
	public static ArrayList<Roupa> roupasCompradas = new ArrayList<>();
	
	public static ArrayList<Acessorio> acessoriosAVenda = new ArrayList<>();
	public static ArrayList<Roupa> roupasAVenda = new ArrayList<>();
	
	//Pre cadastro de dados
	public static void precadastros() {
		  Usuario bruno = new Usuario();
			  bruno.setNome("Bruno Silva");
			  bruno.setTelefone("998808198");
			  bruno.setCpf("805743618");
			  bruno.setEmail("brunosilva.q@gmail.com");
			  	
		  Endereco enderecobruno = new Endereco(bruno);
		  		enderecobruno.setPais("Brasil");
				enderecobruno.setEstado("DF");
				enderecobruno.setCidade("Gama");
				enderecobruno.setNumeroResidencia("211");
				enderecobruno.setCep("7711811");
				enderecobruno.setReferencia("Shopping");
				bruno.setEndereco(enderecobruno);
				
		  Roupa blusapreta = new Roupa(bruno);
		  		blusapreta.setNome("Blusa Preta");
			 	blusapreta.setDepartamento("Masculino");
			 	blusapreta.setDescricao("Blusa preta com estampa de listras na frente");
			 	blusapreta.setMarca("Adidas");
			 	blusapreta.setPreco(35.00);
			 	blusapreta.setCondicao("Boa");
			 	blusapreta.setCor("Preta");
			 	blusapreta.setTamanho("M");
			 	blusapreta.setTecido("Algodao");
			 	blusapreta.setEstampa("Listras");
			 	roupasAVenda.add(blusapreta);
		  
		  Acessorio bonejeans = new Acessorio(bruno);
			  	bonejeans.setNome("Bone Jeans");
			  	bonejeans.setDepartamento("Unissex");
			  	bonejeans.setDescricao("Bone com tecido jeans azul");
			  	bonejeans.setMarca("Ciclone");
			  	bonejeans.setPreco(25.00);
			  	bonejeans.setCondicao("Boa");
			  	bonejeans.setCor("Azul");
			  	bonejeans.setMaterial("Jeans");
			  	bonejeans.setPeso("300");
			  	bonejeans.setMedidaLargura("20");
			  	bonejeans.setMedidaAltura("20");
			  	acessoriosAVenda.add(bonejeans);
			  	Dados.usuarios.add(bruno);
			  
		  Usuario lucas = new Usuario();
		  		lucas.setNome("Lucas Costa");
			  	lucas.setTelefone("992508198");
			  	lucas.setCpf("805743699");
			  	lucas.setEmail("lucascosta@gmail.com");
			  	
		  Endereco enderecolucas = new Endereco(lucas);
				  enderecolucas.setPais("Brasil");
				  enderecolucas.setEstado("TO");
				  enderecolucas.setCidade("Palmas");
				  enderecolucas.setNumeroResidencia("2111");
				  enderecolucas.setCep("7669911");
				  enderecolucas.setReferencia("Centro");
				  lucas.setEndereco(enderecolucas);
		  		  
		  Roupa blusaverde = new Roupa(lucas);
			  	blusaverde.setNome("Blusa Verde Nike");
			  	blusaverde.setDepartamento("Infatil");
			  	blusaverde.setDescricao("Blusa infantil verde da marca Nike");
			  	blusaverde.setMarca("Nike");
			  	blusaverde.setPreco(30.00);
			  	blusaverde.setCondicao("Ruim");
			  	blusaverde.setCor("Verde");
			  	blusaverde.setTamanho("PP");
			  	blusaverde.setTecido("Poliester");
			  	blusaverde.setEstampa("Sem estampa");
			 	roupasAVenda.add(blusaverde);
		  
		  Acessorio oculospreto = new Acessorio(lucas);
			  	oculospreto.setNome("Oculos preto chique");
			  	oculospreto.setDepartamento("Feminino");
			  	oculospreto.setDescricao("Oculos preto da marca Chilli Beans");
			  	oculospreto.setMarca("Chilli Beans");
			  	oculospreto.setPreco(50.00);
			  	oculospreto.setCondicao("Otima");
			  	oculospreto.setCor("Preto");
			  	oculospreto.setMaterial("Metal");
			  	oculospreto.setPeso("100.00");
			  	oculospreto.setMedidaLargura("10");
			  	oculospreto.setMedidaAltura("10");
			  	acessoriosAVenda.add(oculospreto);
			  	Dados.usuarios.add(lucas);

		Usuario sofia = new Usuario();
				sofia.setNome("Sofia Alice");
				sofia.setTelefone("944408198");
				sofia.setCpf("775743699");
				sofia.setEmail("sofiaalice@gmail.com");
				
		Endereco enderecosofia = new Endereco(sofia);
			enderecosofia.setPais("Brasil");
			enderecosofia.setEstado("BA");
			enderecosofia.setCidade("Salvador");
			enderecosofia.setNumeroResidencia("201");
			enderecosofia.setCep("7719441");
			enderecosofia.setReferencia("Praca");
			sofia.setEndereco(enderecosofia);
		  		  
		  Roupa vestidorosa = new Roupa(sofia);
			  	vestidorosa.setNome("Vestido florido rosa");
			  	vestidorosa.setDepartamento("Infantil");
			  	vestidorosa.setDescricao("Vestido rosa florido e infantil");
			  	vestidorosa.setMarca("Melissa");
			  	vestidorosa.setPreco(40.00);
			  	vestidorosa.setCondicao("Boa");
			  	vestidorosa.setCor("Rosa");
			  	vestidorosa.setTamanho("P");
			  	vestidorosa.setTecido("Algodao");
			  	vestidorosa.setEstampa("Flores");
			  	roupasAVenda.add(vestidorosa);
		  
		  Acessorio sapatilha = new Acessorio(sofia);
			  	sapatilha.setNome("Sapatilha de bal�");
			  	sapatilha.setDepartamento("Feminino");
			  	sapatilha.setDescricao("Sapatilha de bal� rosa claro");
			  	sapatilha.setMarca("Bale Cal�ados");
			  	sapatilha.setPreco(45.00);
			  	sapatilha.setCondicao("Boa");
			  	sapatilha.setCor("Rosa");
			  	sapatilha.setMaterial("Algodao");
			  	sapatilha.setPeso("200.00");
			  	sapatilha.setMedidaLargura("30");
			  	sapatilha.setMedidaAltura("20");
			  	acessoriosAVenda.add(sapatilha);
			  	Dados.usuarios.add(sofia);

		  Usuario helena = new Usuario();
		  		helena.setNome("Helena Carvalho");
		  		helena.setTelefone("957708198");
		  		helena.setCpf("665743699");
		  		helena.setEmail("helenacarvo@gmail.com");
		  		
		  Endereco enderecohelena = new Endereco(helena);
			  enderecohelena.setPais("Brasil");
			  enderecohelena.setEstado("RJ");
			  enderecohelena.setCidade("Rio de Janeiro");
			  enderecohelena.setNumeroResidencia("22");
			  enderecohelena.setCep("788441");
			  enderecohelena.setReferencia("Cristo");
			  helena.setEndereco(enderecohelena);
		  		  
		  Roupa calcajeanspreta = new Roupa(helena);
			  	calcajeanspreta.setNome("Calca Jeans preta");
			  	calcajeanspreta.setDepartamento("Unissex");
			  	calcajeanspreta.setDescricao("Calca jeans preta rasgada");
			  	calcajeanspreta.setMarca("Levi");
			  	calcajeanspreta.setPreco(140.00);
			  	calcajeanspreta.setCondicao("Otima");
			  	calcajeanspreta.setCor("Preta");
			  	calcajeanspreta.setTamanho("M");
			  	calcajeanspreta.setTecido("Jeans");
			  	calcajeanspreta.setEstampa("Sem estampa");
			  	roupasAVenda.add(calcajeanspreta);
		  
		  Acessorio cintocouro = new Acessorio(helena);
			  	cintocouro.setNome("Cinto de couro");
			  	cintocouro.setDepartamento("Unissex");
			  	cintocouro.setDescricao("Cinto de couro marrom");
			  	cintocouro.setMarca("Cintos Silveira");
			  	cintocouro.setPreco(30.00);
			  	cintocouro.setCondicao("Ruim");
			  	cintocouro.setCor("Marrom");
			  	cintocouro.setMaterial("Couro");
			  	cintocouro.setPeso("300.00");
			  	cintocouro.setMedidaLargura("5");
			  	cintocouro.setMedidaAltura("10");
			  	acessoriosAVenda.add(cintocouro);
			  	Dados.usuarios.add(helena);
	  }

	
	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(ArrayList<Usuario> usuarios) {
		Dados.usuarios = usuarios;
	}
}