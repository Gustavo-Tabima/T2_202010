package model.data_structures;

public interface Ipila<K> {

	public void push(K pnuevo);
	
	public void sacar(K eliminar);

	public K darTop();

	public boolean estaVacio();

	public int contarElementos();

	public K buscarElemento(K buscado);

}
