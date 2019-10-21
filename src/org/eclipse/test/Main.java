package org.eclipse.test;

import org.eclipse.model.Adresse;
import org.eclipse.model.Enseignant;
import org.eclipse.model.Etudiant;
import org.eclipse.model.Personne;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personne = new Personne();
		personne.setNum(1);
		personne.setNom("Mendes");
		personne.setPrenom("André");
		System.out.println(personne.getNbrePersonnes());
		
		Personne personne2 =new Personne(2,"Marc", "Sanchez");
		System.out.println(personne);
		System.out.println(personne2);
		System.out.println(personne2.getNbrePersonnes());
		Adresse ad1 = new Adresse("88 Allée de Tabletier", "Paris", "75016");
		Personne personne3 =new Personne(2, "Gabriel", "Jimenez", ad1);
		System.out.println(personne3);
		
		Enseignant enseignant = new Enseignant(1,"Mouna","Dubosque", ad1, 2000);
		Enseignant enseignant2 = new Enseignant(2,"François", "Mitterand", ad1, 3000);
		Etudiant etudiant = new Etudiant(1, "Mark", "Zukernberg", ad1, 1);
		Etudiant etudiant2 = new Etudiant(2, "Bill", "Gta", ad1, 3);
		//enseignant.setNum(1);
		//enseignant.setNom("Dubosque");
		//enseignant.setPrenom("Mouna");
		//enseignant.setSalaire(2000);
		System.out.println(enseignant);
		System.out.println(enseignant2);
		System.out.println(etudiant);
		System.out.println(etudiant2);
		
		

	}

}
