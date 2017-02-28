package clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	
	public Student(String nume, String prenume, int varsta, 
			int punctaj, int numarProiecte, String[] denumireProiect,
			String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, numarProiecte,
				denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	
	public Student(Aplicant aplicant, String facultate, int anStudii) {
		super(aplicant);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	public String getFacultate() {
		return facultate;
	}
	
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	
	public int getAnStudii() {
		return anStudii;
	}
	
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString() + "Facultate=" + facultate + ", An_studii=" + anStudii ;
	}	
}
