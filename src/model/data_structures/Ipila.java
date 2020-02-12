package model.data_structures;

public interface Ipila<K> {

	public void push(K pnuevo);
	
	public K sacar();

	public K darTop();

	public boolean estaVacio();

	public int darTamano();

	public K buscarElemento(K buscado);

}
