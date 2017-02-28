package clase;

import java.util.List;

public class Program {

	private static List<Aplicant> citesteAplicanti(String fileName, Reader reader) {
		List<Aplicant> listaAplicanti = reader.read(fileName);
		return listaAplicanti;
	}

	private static void afiseazaAplicanti(List<Aplicant> listaAplicanti) {
		for (Aplicant aplicant : listaAplicanti) {
			System.out.println(aplicant.toString());
		}
	}

	public static void main(String[] args) {

		List<Aplicant> listaAplicanti = citesteAplicanti("angajati.txt", new AngajatReader());
		afiseazaAplicanti(listaAplicanti);

		listaAplicanti = citesteAplicanti("studenti.txt", new StudentReader());
		afiseazaAplicanti(listaAplicanti);
	}
}
