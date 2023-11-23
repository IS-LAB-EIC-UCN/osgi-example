package cl.ucn.felix.biblioteca.api;

import java.util.Map;
import java.util.Set;

public interface Inventario {

	enum CriterioBusqueda
	{
		ISBN_LIKE,
		TITULO_LIKE,
		AUTOR_LIKE,
		CATEGORIA_LIKE
	}
	
	Set<String> getCategorias();
	
	LibroMutable crearLibro(String isbn) throws ExepcionLibroExistente;
	
	LibroMutable cargarLibroParaEdicion(String isbn) throws ExepcionLibroNoEncontrado;
	
	String guardarLibro(LibroMutable isbn) throws ExepcionLibroInvalido;
	
	Libro cargarLibro(String isbn) throws ExepcionLibroNoEncontrado;
	
	void removerLibro(String isbn) throws ExepcionLibroNoEncontrado;
	
	Set<String> buscarLibros( Map<CriterioBusqueda, String> criterio);
}
