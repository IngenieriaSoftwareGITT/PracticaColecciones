/**
 *  Fichero:Figura.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  Marzo-2016
 *  
 */

package fp2.poo.practica10.utilidades;

/**
 *  Descripción: interfaz para la gestión de figuras geométricas
 *
 *  @author Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  @since Marzo-2016
 *  @version 1.0
 *  
 */
public interface Figura {  

    /**
     * Devuelve el área de la figura como un float
     * @return area, tipo float
     */
	float getArea();   
    /**
     * Devuelve el perímetro de la figura como un float
     * @return perimetro, tipo float
     */
	float getPerimetro();
    /**
     * Devuelve el color de la figura como un String
     * @return area, tipo String
     */
	String getColor();
} //Cierre de la interface
