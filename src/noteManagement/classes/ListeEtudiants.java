package noteManagement.classes;

import java.util.ArrayList;
import java.util.List;

import noteManagement.interfaces.GestionEtudiants;

public class ListeEtudiants implements GestionEtudiants {
public static List<Etudiant> etudiants=new ArrayList<Etudiant>();

	@Override
	public void ajouterEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		etudiants.add(etudiant);

	}

	@Override
	public double calculerMoyenneGenerale() {
		// TODO Auto-generated method stub
		if(etudiants.isEmpty()) return 0;
		return etudiants.stream().mapToDouble(Etudiant::calculerMoyenne).average().orElse(0);
	}

	@Override
	public List<Etudiant> getEtudiants() {
		// TODO Auto-generated method stub
		return etudiants;
	}

}
