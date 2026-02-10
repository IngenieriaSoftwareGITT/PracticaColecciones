/*
 *  Fichero: Circulo.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.practica10.utilidades;
import java.awt.Color;
import java.util.*;

/**
 * Descripcion: Implementación de la interfaz Figura para un circulo, heredando de MiFigura
 *
 * @version 1.0 Marzo 2016
 * @author  Fundamentos de Programacion II
 */

public class Circulo extends MiFigura{

	private float diametro;
	private float PI = 3.1416f;
	private Color color;
      
    /**
     * El constructor recibe el diametro y el color de la figura, como un parametro de tipo Color (consultar la api de la librería awt de java)
     * @param diametro - tipo float, diametro del circulo
     * @param color - tipo Color de java.awt
     * @see java.awt.Color
     */

   
	public Circulo (float diametro, Color color) { 
	   this.diametro = diametro; 
	   this.color = color;
         
	}
    /**
     * Implementación del método getArea de la interfaz Figura
     * @return area, float
     */

	public float getArea() { 
	    return (PI*diametro*diametro/4f);
	} //Cierre de la clase ejemplo aprenderaprogramar.com
    /**
     * Implementación del método getPerimetro de la interfaz Figura
     * @return perimetro, float
     */
	public float getPerimetro(){
		return PI*diametro;
	}
    /**
     * Implementación del método getColor de la interfaz Figura
     * @return color, String
     */
	public String getColor() { 
		return color.toString();
	}
   

} 

	
