package noteManagement;

import noteManagement.classes.Etudiant;
import noteManagement.classes.ListeEtudiants;
import noteManagement.classes.Note;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeEtudiants classe=new ListeEtudiants();
		classe.ajouterEtudiant(new Etudiant("e1", "en1", new Note(10, 12)));
		classe.ajouterEtudiant(new Etudiant("e2", "en2", new Note(-5, 3)));
		classe.ajouterEtudiant(new Etudiant("e1", "en1", new Note(19, 20)));
		System.out.println("moyenne générale de la classe "+classe.calculerMoyenneGenerale());
		//ListeEtudiants.etudiants.forEach(null);

	}

}
