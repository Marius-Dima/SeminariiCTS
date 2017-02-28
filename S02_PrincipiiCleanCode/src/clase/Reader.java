package clase;

import java.util.List;
import java.util.Scanner;

public abstract class Reader {
	public abstract List<Aplicant> read(String fileName);
	
	public Aplicant readAplicant(Scanner scanner) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int numarProiecte = scanner.nextInt();
		String[] denumiriProiecte = new String[5];
		for (int i = 0; i < numarProiecte; i++) {
			denumiriProiecte[i] = scanner.next();
		}		
		return new Aplicant(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
	}	
}
