/*
 *  Fichero: Cuadrado.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.practica10.utilidades;
import java.awt.Color;

/**
 * Descripcion: Implementación de la interfaz Figura para un cuadrado, heredando de MiFigura
 *
 * @version 1.0 Marzo 2016
 * @author  Fundamentos de Programacion II
 */
public class Cuadrado extends MiFigura {

	private float lado;
	private Color color;
     

	
    /**
     * El constructor recibe la longitud de lado y el color de la figura, como un parámetro de tipo Color (consultar la api de la librería awt de java)
     * @param lado  tipo float, lado del cuadrado
     * @param color tipo Color de java.awt
     * @see java.awt.Color
     */
	public Cuadrado (float lado, Color color) { 
		this.lado = lado; 
		this.color = color;               
	}
    /**
     * Implementación del método getArea de la interfaz Figura
     * @return area, float
     */

	public float getArea() { 
		return lado*lado;
	}
    /**
     * Implementación del método getPerimetro de la interfaz Figura
     * @return perimetro, float
     */

	public float getPerimetro(){
		return 4*lado;
	}
    /**
     * Implementación del método getColor de la interfaz Figura
     * @return color, String
     */
	public String getColor() { 
		return color.toString();
	}
  
} 

	
