package model.data_structures;

public class Nodo <K>  {

	private Nodo <K> siguiente;
	
	private Nodo <K> anterior;

	private K datos;

	public Nodo(K pDatos) {
		datos = pDatos;
	}
	public K darComparendo() {
		return datos;
	}

	public Nodo darSiguente() {
		return siguiente;
	}
	
	public Nodo darAnterior() {
		return siguiente;
	}
	public void setSiguiente(Nodo psiguiente) {
		
		siguiente=psiguiente;
		
	}
public void setAnterior(Nodo panterior) {
		
		anterior=panterior;
		
	}
	
	
	public void setDato(K dato) 
	{
		datos = dato;
	}
}

