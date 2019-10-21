package org.eclipse.model;

//HERITAGE DE LA CLASS PERSONNE
public class Etudiant extends Personne {
	private int niveau;

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	

	public Etudiant(int num, String nom, String prenom, Adresse adr, int niveau) {
		super(num, nom, prenom, adr);
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return super.toString() +   "est un Etudiant  avec le niveau=" + niveau;
	}

	
	

}
