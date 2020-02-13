package test.data_structures;
import static org.junit.Assert.*;


import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import model.data_structures.Nodo;
import model.data_structures.Pila;
import model.logic.Comparendo;


public class testPila<K> {
	
private Pila<K> pilaPrueba;
private K X=(K) "hola";
private K y=(K) "cpu";
	@Before 
	public void SetUp()
	{
		pilaPrueba = new Pila<K>();
		
		pilaPrueba.push(X);
		pilaPrueba.push(y);
		
	}

	@Test
	public void testBuscar()
	{
		SetUp();


		pilaPrueba.buscarElemento(pilaPrueba.darFondo());
		System.out.println(pilaPrueba.buscarElemento(pilaPrueba.darFondo()));
		assertEquals("No dio el esperado", "hola", pilaPrueba.buscarElemento(pilaPrueba.darFondo()));


		;
	}
	@Test
	public void testdarTop()
	{
		SetUp();


		pilaPrueba.darTop();

		assertEquals("NO  correcto","cpu",pilaPrueba.darTop());



	} 
	
	@Test
	public void  testPush() {


		SetUp();

		K prueba =(K) "adios";
		pilaPrueba.push(prueba);

		assertEquals("NO agrega correctamente",3,pilaPrueba.darTamano());
	}
	
	
	
	
	
	@Test
	public void testEliminar()
	{
		SetUp();


		pilaPrueba.sacar();

		assertEquals("NO elimina correctamente",pilaPrueba.darTamano(),1);

	}
	
	
	

	@Test
	public void testSacar(){
		SetUp();
		K deberia = pilaPrueba.sacar();
		pilaPrueba.sacar();
		assertEquals("NO elimino",pilaPrueba.darTamano(),1);
		assertEquals("NO devuelve lo que deveria","cpu",pilaPrueba.sacar());

	}
	
	
}
