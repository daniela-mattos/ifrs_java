package principal;

public class Pais {

	private String pais;
	private Idioma idioma;


public Pais(String pais, Idioma idioma) {
	setNomePais(pais);
	this.setIdiomaPais(idioma);
}


public String getPais() {
	return pais;
}


public void setNomePais(String pais) {
	this.pais = pais;
}


public Idioma getIdiomaPais() {
	return idioma;
}


public void setIdiomaPais(Idioma idioma) {
	this.idioma = idioma;
}

public String toString() {
    return "País [País: " + pais + ", Idioma: " + idioma + "] ";
}

}