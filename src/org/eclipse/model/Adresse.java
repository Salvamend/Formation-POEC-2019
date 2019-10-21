package org.eclipse.model;
//OBJET ADRESSE ET SES ATTRIBU
public class Adresse {
private String rue;
private String ville;
private String codePostale;


public Adresse(String rue, String ville, String codePostale) {
	super();
	this.rue = rue;
	this.ville = ville;
	this.codePostale = codePostale;
}


public String getRue() {
	return rue;
}

public void setRue(String rue) {
	this.rue = rue;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getCodePostale() {
	return codePostale;
}

public void setCodePostale(String codePostale) {
	this.codePostale = codePostale;
}

@Override
public String toString() {
	return "Adresse [rue=" + rue + ", ville=" + ville + ", codePostale=" + codePostale + "]";
}


}


