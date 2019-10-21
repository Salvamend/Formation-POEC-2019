package org.eclipse.model;

public class Personne {

	private int num;
	private String nom;
	private String prenom;
	private static int nbrePersonnes;
	private Adresse adr;
	

	
	public Personne(int num, String nom, String prenom, Adresse adr) {
		
		this.setNum (num);
		this.nom = nom;
		this.prenom = prenom;
		this.adr = adr;
	}

	public Adresse getAdr() {
		return adr;
	}

	public void setAdr(Adresse adr) {
		this.adr = adr;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		if(num>=1)
		this.num = num;
	}
	
	public String getNom(String nom) {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
		
	}

	public Personne(int num, String nom, String prenom) {
		nbrePersonnes++;
		this.setNum(num);
		this.nom = nom;
		this.prenom = prenom;
	}

	public static int getNbrePersonnes() {
		return nbrePersonnes;
	}

	public Personne() {
		
		nbrePersonnes++;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adr=" + adr + "]";
	}

			
	
}
