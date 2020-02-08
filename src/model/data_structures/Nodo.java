package model.data_structures;

	public class Nodo <K>  {

		private Nodo <K> siguiente;
		
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

	}

