package model.logic;

import model.data_structures.ArregloDinamico;
import model.data_structures.Cola;
import model.data_structures.IArregloDinamico;
import model.data_structures.Icola;
import model.data_structures.Ipila;
import model.data_structures.Pila;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import model.logic.Comparendo;
import model.data_structures.Geo;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	
	public static String PATH = "./data/comparendos_dei_2018_small.geojson";
//	public static String PATH = "./data/comparendos_dei_2018.geojson";
	/**
	 * Atributos del modelo del mundo
	 */
	private IArregloDinamico datos;
	
	private Icola datosConCola;
	
	private Ipila datosConPila;
	
	
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ArregloDinamico(7);
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		datos = new ArregloDinamico(capacidad);
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(String dato)
	{	
		datos.agregar(dato);
	}
	
	/**Requerimiento para ver el cluster con elementos m�s seguidos
	 * 
	 */
	public String agrupar() {
		String agrupados = "";
		datosConCola.
		return agrupados;
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public String buscar(String dato)
	{
		return datos.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public String eliminar(String dato)
	{
		return datos.eliminar(dato);
	}

public Pila<Comparendo> cargarDatosPila() {
		
		//TODO Cambiar la clase del contenedor de datos por la Estructura de Datos propia adecuada para resolver el requerimiento 
Pila<Comparendo> datosPila = new Pila<Comparendo>();


		JsonReader reader;
		try {
			reader = new JsonReader(new FileReader(PATH));
			JsonElement elem = JsonParser.parseReader(reader);
			JsonArray e2 = elem.getAsJsonObject().get("features").getAsJsonArray();
			
			
			SimpleDateFormat parser=new SimpleDateFormat("yyyy/MM/dd");

			for(JsonElement e: e2) {
				int OBJECTID = e.getAsJsonObject().get("properties").getAsJsonObject().get("OBJECTID").getAsInt();
				
				String s = e.getAsJsonObject().get("properties").getAsJsonObject().get("FECHA_HORA").getAsString();	
				Date FECHA_HORA = parser.parse(s); 
				
				String MEDIO_DETE = e.getAsJsonObject().get("properties").getAsJsonObject().get("MEDIO_DETE").getAsString();
				String CLASE_VEHI = e.getAsJsonObject().get("properties").getAsJsonObject().get("CLASE_VEHI").getAsString();
				String TIPO_SERVI = e.getAsJsonObject().get("properties").getAsJsonObject().get("TIPO_SERVI").getAsString();
				String INFRACCION = e.getAsJsonObject().get("properties").getAsJsonObject().get("INFRACCION").getAsString();
				String DES_INFRAC = e.getAsJsonObject().get("properties").getAsJsonObject().get("DES_INFRAC").getAsString();	
				String LOCALIDAD = e.getAsJsonObject().get("properties").getAsJsonObject().get("LOCALIDAD").getAsString();

				double longitud = e.getAsJsonObject().get("geometry").getAsJsonObject().get("coordinates").getAsJsonArray()
						.get(0).getAsDouble();
				
				double latitud = e.getAsJsonObject().get("geometry").getAsJsonObject().get("coordinates").getAsJsonArray()
						.get(1).getAsDouble();

				Comparendo c = new Comparendo(OBJECTID, FECHA_HORA, DES_INFRAC, MEDIO_DETE, CLASE_VEHI, TIPO_SERVI, INFRACCION, LOCALIDAD, longitud, latitud);
				datosPila.push(c);
				
			}

		} catch (FileNotFoundException | ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return datosPila;	
		
	}

public Cola<Comparendo> cargarDatosCola() {
	

Cola<Comparendo> datosCola = new Cola<Comparendo>();

	JsonReader reader;
	try {
		reader = new JsonReader(new FileReader(PATH));
		JsonElement elem = JsonParser.parseReader(reader);
		JsonArray e2 = elem.getAsJsonObject().get("features").getAsJsonArray();
		
		
		SimpleDateFormat parser=new SimpleDateFormat("yyyy/MM/dd");

		for(JsonElement e: e2) {
			int OBJECTID = e.getAsJsonObject().get("properties").getAsJsonObject().get("OBJECTID").getAsInt();
			
			String s = e.getAsJsonObject().get("properties").getAsJsonObject().get("FECHA_HORA").getAsString();	
			Date FECHA_HORA = parser.parse(s); 
			
			String MEDIO_DETE = e.getAsJsonObject().get("properties").getAsJsonObject().get("MEDIO_DETE").getAsString();
			String CLASE_VEHI = e.getAsJsonObject().get("properties").getAsJsonObject().get("CLASE_VEHI").getAsString();
			String TIPO_SERVI = e.getAsJsonObject().get("properties").getAsJsonObject().get("TIPO_SERVI").getAsString();
			String INFRACCION = e.getAsJsonObject().get("properties").getAsJsonObject().get("INFRACCION").getAsString();
			String DES_INFRAC = e.getAsJsonObject().get("properties").getAsJsonObject().get("DES_INFRAC").getAsString();	
			String LOCALIDAD = e.getAsJsonObject().get("properties").getAsJsonObject().get("LOCALIDAD").getAsString();

			double longitud = e.getAsJsonObject().get("geometry").getAsJsonObject().get("coordinates").getAsJsonArray()
					.get(0).getAsDouble();
			
			double latitud = e.getAsJsonObject().get("geometry").getAsJsonObject().get("coordinates").getAsJsonArray()
					.get(1).getAsDouble();

			Comparendo c = new Comparendo(OBJECTID, FECHA_HORA, DES_INFRAC, MEDIO_DETE, CLASE_VEHI, TIPO_SERVI, INFRACCION, LOCALIDAD, longitud, latitud);
		
			datosCola.instertar(c);
		}

	} catch (FileNotFoundException | ParseException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return datosCola;	
	
}
}
