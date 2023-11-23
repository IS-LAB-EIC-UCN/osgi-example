package cl.ucn.felix.biblioteca.api;

public class ExepcionLibroNoEncontrado extends Exception {

	private static final long serialVersionUID = -5155088717583622072L;

	public ExepcionLibroNoEncontrado(String isbn) {
        super("Libro no encontrado: " + isbn);
	}
}
