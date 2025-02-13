package noteManagement.classes;

public class Etudiant {
	public static int compteurId=1;
	private int id;
	private String nom;
	private String prenom;
	private Note note;
	public Etudiant( String nom, String prenom, Note note) {
		super();
		this.id = compteurId++;
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
	}
	public String getNom() {
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
	public double calculerMoyenne()
	{
		return (note.getNoteDs()*0.2+(note.getNoteFinale()*0.8 ));
	}
	

}
