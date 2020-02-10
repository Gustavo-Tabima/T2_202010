package model.data_structures;

public interface Icola <K> {

	public void instertar(K pnuevo);
	
	public K darPrimero();
	
	public boolean estaVacio();
	
	public int contarElementos();
	
	public K buscarElemento(K buscado);
		
	public K sacar(K eliminar);
	
}
