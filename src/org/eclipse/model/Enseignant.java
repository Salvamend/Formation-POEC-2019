package org.eclipse.model;

//HERITAGE DE LA CLASS PERSONNE
public class Enseignant extends Personne {
	
	private float salaire;

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	

	public Enseignant(int num, String nom, String prenom, Adresse adr, float salaire) {
		super(num, nom, prenom, adr);
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return super.toString() +   "est un Enseignant  avec le salaire=" + salaire;
	}

	
	
	

}
