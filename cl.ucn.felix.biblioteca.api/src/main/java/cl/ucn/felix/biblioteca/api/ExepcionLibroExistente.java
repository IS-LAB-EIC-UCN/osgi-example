package cl.ucn.felix.biblioteca.api;

public class ExepcionLibroExistente extends Exception {

	private static final long serialVersionUID = 5120358203999152018L;

	public ExepcionLibroExistente(String isbn) {
		super("El libro ya existe en el catalogo: " + isbn);
	}
	
}
