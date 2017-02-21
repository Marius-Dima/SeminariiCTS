package clase;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

	public static List<Student> readStudents(String file) throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(file));
		input.useDelimiter(",|\n");
		List<Student> studenti = new ArrayList<Student>();

		while (input.hasNext()) {
			String nume = input.next();
			String prenume = (input.next()).toString();
			int varsta = Integer.valueOf(input.nextInt());
			int punctaj = Integer.valueOf(input.nextInt());
			int nr = Integer.valueOf(input.nextInt());
			String[] vect = new String[5];
			for (int i = 0; i < nr; i++)
				vect[i] = input.next();
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
			studenti.add(s);
		}
		input.close();
		return studenti;
	}

	public static List<Angajat> readAngajati(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",");
		List<Angajat> angajati = new ArrayList<Angajat>();

		while (input2.hasNext()) {
			String nume = input2.next();
			String prenume = input2.next();
			int varsta = input2.nextInt();
			int punctaj = input2.nextInt();
			int nr = input2.nextInt();
			String[] vect = new String[5];
			for (int i = 0; i < nr; i++)
				vect[i] = input2.next();
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
			angajati.add(a);
		}
		input2.close();
		return angajati;
	}

	public static List<Elev> readPupil(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",|\n");
		List<Elev> elevi = new ArrayList<Elev>();

		while (input2.hasNext()) {
			String nume = input2.next();
			String prenume = input2.next();
			int varsta = input2.nextInt();
			int punctaj = input2.nextInt();
			int nr = input2.nextInt();
			String[] vect = new String[5];
			for (int i = 0; i < nr; i++)
				vect[i] = input2.next();
			int clasa = input2.nextInt();
			String tutore = input2.next();
			Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
			elevi.add(e);
		}

		input2.close();
		return elevi;
	}

	

}
