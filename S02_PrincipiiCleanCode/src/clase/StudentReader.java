package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends Reader {

	@Override
	public List<Aplicant> read(String fileName) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Aplicant aplicant = super.readAplicant(scanner);
			int anStudii = scanner.nextInt();
			String facultate = (scanner.next()).toString();
			studenti.add(new Student(aplicant, facultate, anStudii));
		}

		scanner.close();
		return studenti;
	}
}
