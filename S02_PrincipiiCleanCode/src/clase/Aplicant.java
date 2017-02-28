package clase;

import java.util.Arrays;

public class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumireProiect;
	private static double pragPunctaj = 0;

	public Aplicant() {
		this("Ionescu", "Gigel", 23, 8, 2, new String[] { "Erasmus", "ErasmusPlus" });
	}

	public Aplicant(Aplicant aplicant) {
		this(aplicant.nume, aplicant.prenume, aplicant.varsta, aplicant.punctaj, aplicant.numarProiecte,
				aplicant.denumireProiect);
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumireProiect = denumireProiect;
	}

	public static double getPragPunctaj() {
		return pragPunctaj;
	}

	public static void setPragPunctaj(double pragPunctaj) {
		if (pragPunctaj > 0) {
			Aplicant.pragPunctaj = pragPunctaj;
		}
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNumarProiecte() {
		return numarProiecte;
	}

	public void setNumarProiecte(int numarProiecte) {
		this.numarProiecte = numarProiecte;
	}

	public boolean verificareStatus() {
		if (punctaj > Aplicant.pragPunctaj) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", numarProiecte=" + numarProiecte + ", denumireProiect=" + Arrays.toString(denumireProiect);
	}
}
