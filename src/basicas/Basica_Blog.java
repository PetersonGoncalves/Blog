package basicas;

import java.util.List;

public class Basica_Blog {
	
	public String Data;
	
	public String Titulo;
	
	public List<Basica_Conteudo> ListaConteudo;
	
	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public List<Basica_Conteudo> getListaConteudo() {
		return ListaConteudo;
	}

	public void setListaConteudo(List<Basica_Conteudo> listaConteudo) {
		ListaConteudo = listaConteudo;
	}

	public void AdicionarConteudo(Basica_Conteudo conteudo)
	{
		this.ListaConteudo.add(conteudo);
	}

}
