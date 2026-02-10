/*
 *  Fichero: OrdenacionArea.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.practica10.utilidades;

import fp2.poo.practica10.utilidades.*;
import java.awt.Color;
import java.util.*; 
import java.lang.*;
import java.io.IOException;

/**
 * Descripcion: ordenación por area, de mayor a menor
 *
 * @version 1.0 Marzo 2016
 * @author  Fundamentos de Programacion II
 * @see java.util.Comparator
 */

public class OrdenacionArea implements Comparator<Figura>{    
    /**
     * Implementación del metodo compare de la interfaz Comparator
     * @param f1 Figura, primera figura de la comparación
     * @param f2 Figura, segunda figura de la comparación
     * @return valor entero, 0 si area f1=area f2; negativo si f2 es menor que f1, positivo si f2 es mayor que f1
     * @see java.lang.Float#compareTo
     */
            public int compare(Figura f1, Figura f2) {
                float a1=f1.getArea();
	        float a2=f2.getArea();
                Float area1=new Float(a1);
                Float area2=new Float(a2);
                return area2.compareTo(area1);
            };
}
