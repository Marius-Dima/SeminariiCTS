package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends Reader {

	@Override
	public List<Aplicant> read(String fileName) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		scanner.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();
		while (scanner.hasNext()) {
			Aplicant aplicant = super.readAplicant(scanner);
			int salariu = scanner.nextInt();
			String ocupatie = scanner.next();
			angajati.add(new Angajat(aplicant, salariu, ocupatie));
		}
		scanner.close();
		return angajati;
	}

}
