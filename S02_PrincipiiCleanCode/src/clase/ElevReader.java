package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends Reader {

	@Override
	public List<Aplicant> read(String fileName) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scanner.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Aplicant aplicant = super.readAplicant(scanner);
			int clasa = scanner.nextInt();
			String tutore = scanner.next();
			elevi.add(new Elev(aplicant, clasa, tutore));
		}

		scanner.close();
		return elevi;
	}
}
