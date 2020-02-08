package model.data_structures;

	public class Nodo<X,K> {

		private Nodo<X,K> siguiente;
		private Nodo<X,K> anterior;
		private K datos;
		private X ID;
		public Nodo(K pDatos) {
			datos = pDatos;
		}

		public Nodo(K pDatos, Nodo<X,K> pSiguiente) {
			datos = pDatos;
			siguiente = pSiguiente;
		}

		public Nodo(K pDatos, Nodo<X,K> pSiguiente, Nodo<X,K> pAnterior) {
			datos = pDatos;
			siguiente = pSiguiente;
			anterior = pAnterior;
		}

		public Nodo<X,K> getSiguiente() {
			return siguiente;
		}

		public void setSiguiente(Nodo<X,K> siguiente) {
			this.siguiente = siguiente;
		}

		public Nodo<X,K> getAnterior() {
			return anterior;
		}

		public void setAnterior(Nodo<X,K> anterior) {
			this.anterior = anterior;
		}

		public K getDatos() {
			return datos;
		}

		public void setDatos(K datos) {
			this.datos = datos;
		}
		
		public X darID() {
		return ID;
		}

	}

