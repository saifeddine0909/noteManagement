package noteManagement.interfaces;

import java.util.List;

import noteManagement.classes.Etudiant;

public interface GestionEtudiants {
void ajouterEtudiant(Etudiant etudiant);
double calculerMoyenneGenerale();
List<Etudiant> getEtudiants();
}
