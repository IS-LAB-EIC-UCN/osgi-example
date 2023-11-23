package cl.ucn.felix.biblioteca.api;

public class ExepcionLibroInvalido extends Exception {

	private static final long serialVersionUID = 8321472268063571076L;

	public ExepcionLibroInvalido(String mensaje) {
		super("Libro invalido: " + mensaje);
	}
}
