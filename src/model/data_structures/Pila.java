package model.data_structures;

public class Pila <K> implements Ipila<K>{

	private Nodo fondo;
	private Nodo top;
	private int tamano;


	public  Pila( ) {
		// TODO Auto-generated constructor stub
		fondo=null;
		top=null;
		tamano=0;
	}

	@Override
	public void push(K pnuevo) {
		// TODO Auto-generated method stub
		Nodo nuevoNodo=new Nodo(pnuevo);
		if(fondo==null & top==null)
		{
			fondo=nuevoNodo;
			top=nuevoNodo;
			tamano++;
		}else {
			nuevoNodo.setSiguiente(top);
			top=nuevoNodo;
			tamano++;

		}



	}

	@Override
	public K darTop() {
		// TODO Auto-generated method stub

		K dato=(K) top.darComparendo();
		return dato;



	}

	@Override
	public boolean estaVacio() {

		boolean pilaVacia=false;
		if(fondo==null & top==null)
		{
			pilaVacia=true;
			System.out.println("La pila esta vacia");
		}
		else
		{
			System.out.println("La pila no esta vacia");
			pilaVacia=false;
		}
		return pilaVacia;
	}

	@Override
	public int darTamano() {
		int contador=0;
		Nodo c=top;
		while(c!=null)
		{
			contador++;
			c=c.darSiguente();
		}
		System.out.println("Numero de datos en la cola: "+contador);

		return contador;
	}



	@Override
	public K buscarElemento(K buscado) {

		if (estaVacio()!=true) {

			Nodo act=top;
			boolean encontrado=false;
			while (act!=null && encontrado==false) 
			{
				if (act.darComparendo().equals(buscado)) 
				{
					encontrado=true;
				}else {
					act= act.darSiguente();

				}
			}


			if (encontrado!=false) 
			{
				return (K) act.darComparendo();

			}else {
				return null;
			}

		}
		else
		{
			return null;
		}
		

	}

	@Override
	public K sacar() {

		Nodo sacar= top;
		top.setSiguiente(null);
		K x = (K) sacar.darComparendo();
		tamano--;
		return x;


	}

	public K darFondo() {
		return (K) fondo.darComparendo();
	}
}