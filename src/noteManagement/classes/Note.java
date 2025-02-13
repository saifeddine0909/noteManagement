package noteManagement.classes;

public class Note {
	private double noteDs;
	private double noteFinale;
	public double getNoteDs() {
		return noteDs;
	}
	public void setNoteDs(double noteDs) {
		this.noteDs = noteDs;
	}
	public double getNoteFinale() {
		return noteFinale;
	}
	public void setNoteFinale(double noteFinale) {
		this.noteFinale = noteFinale;
	}
	private double clean(double note)
	{
		if(note<0) return Math.abs(note);
		return Math.min(note, 20);
	}
	public Note(double noteDs, double noteFinale) {
		super();
		this.noteDs = clean(noteDs);
		this.noteFinale = clean(noteFinale);
	}
	

}
