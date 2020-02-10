package model.data_structures;

public class Cola <K> implements Icola{


	private Nodo inicio;
	private Nodo termino;
	private int tamano;

	public Cola()
	{
		inicio=null;
		termino=null;
		tamano=0;
	}




	@Override
	public void instertar(Object pnuevo) {
		// TODO Auto-generated method stub
		Nodo nuevoNodo=new Nodo(pnuevo);
		nuevoNodo.setSiguiente(null);
		if(inicio==null & termino==null)
		{
			inicio=nuevoNodo;
			termino=nuevoNodo;
		}
		termino.setSiguiente(nuevoNodo);
		termino=termino.darSiguente();
	}

	@Override
	public K darPrimero() {
		// TODO Auto-generated method stub
		K dato=(K) inicio.darComparendo();

		return dato;
	}

	@Override
	public boolean estaVacio() {
		boolean cola=false;
		if(inicio==null & termino==null)
		{
			cola=true;
			System.out.println("La cola esta vacia");
		}
		else
		{
			System.out.println("La cola no esta vacia");
			cola=false;
		}
		return cola;
	}

	@Override
	public int contarElementos() {
		int contador=0;
		Nodo c=inicio;
		while(c!=null)
		{
			contador++;
			c=c.darSiguente();
		}
		System.out.println("Numero de datos en la cola: "+contador);

		return contador;
	}




	@Override
	public K buscarElemento(Object buscado) {
		// TODO Auto-generated method stub
		if (estaVacio()!=true) {

			Nodo act=inicio;
			boolean encontrado=false;
			while (act!=null && encontrado==false) {
				if (act.darComparendo().equals(buscado)) {
					encontrado=true;
				}
				act= act.darSiguente();
			}
			if (encontrado!=false) {
				return (K) act.darComparendo();
			}
			else {
				return null;
			}

		}else {
			return null;
		}


	}




	@Override
	public K sacar(Object eliminar) {

		if (estaVacio()==false) {
			Nodo out = inicio;

			Nodo queue=inicio.darSiguente();
			inicio=queue;
			out.setSiguiente(null);

			return (K) out.darComparendo();

		}


		return null;

	}






}
