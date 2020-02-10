package model.data_structures;

public class Pila <K> implements Ipila<K>{

	private Nodo fondo;
	private Nodo top;
	private int tamano;
	
	
	public  Pila() {
		// TODO Auto-generated constructor stub
		fondo=null;
		top=null;
		tamano=0;
	}
	
	@Override
	public void push(K pnuevo) {
		// TODO Auto-generated method stub
		Nodo nuevoNodo=new Nodo(pnuevo);
		nuevoNodo.setSiguiente(null);
		if(fondo==null & top==null)
		{
			fondo=nuevoNodo;
			top=nuevoNodo;
		}
		nuevoNodo.setSiguiente(top);
		top=nuevoNodo;
		
		
	}

	@Override
	public K darTop() {
		// TODO Auto-generated method stub
		if (top!=null) {
			K dato=(K) top.darComparendo();
			return dato;
		}else {
			return null;
		}
		
		
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
	public int contarElementos() {
		// TODO Auto-generated method stub
		
		Nodo act=top;
		while (act!=null) {
			tamano++;
			act=act.darSiguente();
			
		}
		return tamano;
	}

	

	@Override
	public K buscarElemento(K buscado) {
		// TODO Auto-generated method stub
		if (estaVacio()!=true) {

			Nodo act=top;
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
	public void sacar(K eliminar) {
		// TODO Auto-generated method stub
		
	}

}
