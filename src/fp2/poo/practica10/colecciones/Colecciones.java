/*
 *  Fichero: Colecciones.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.practica10.colecciones;

import fp2.poo.practica10.utilidades.*;
import fp2.poo.practica10.utilidades.OrdenacionArea;
import java.awt.Color;
import java.util.*; 
import java.lang.*;
import java.io.IOException;

/**
 * Descripcion: La clase Colecciones implementa el ejemplo de manejo de colecciones, concretamente con un ArrayList
 *
 * @version 1.0 Marzo 2016
 * @author  Fundamentos de Programacion II
 */

public class Colecciones {

    

    public static void main (String [ ] Args) {
		
		     
		//Vamos a utilizar una colección de tipo ArrayList, una implementación concreta de la interfaz List

		
        List<Figura> serieDeFiguras = new ArrayList<Figura>();
        
        /*******************************VERIFICAR QUE ESTÁ VACÍA: ISEMPTY***************************************************************/
	System.out.println("****************EJEMPLO: acabo de crear la coleccion, verifico que esta vacia********\n\n");
        if(serieDeFiguras.isEmpty())
	    System.out.println("NO hay elementos en la coleccion");
        else
	    System.out.println("SI hay elementos en la coleccion");
        try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}
        /*******************************************************************************************************************************/
	/*************************AÑADIR ELEMENTOS A LA COLECCIÓN: ADD******************************************************************/
	/*******************************************************************************************************************************/

	
	//A continuación creamos dos cuadrados del tipo Cuadrado y los añadimos a la lista
	Figura cuad1 = new Cuadrado (3.5f,Color.ORANGE);
	Figura cuad2 = new Cuadrado (2.2f,Color.YELLOW);
	serieDeFiguras.add (cuad1);
	serieDeFiguras.add (cuad2);
	  /*******************************************************************************************************************************/
	  /*******************************VERIFICAR QUE NO ESTÁ VACÍA: ISEMPTY************************************************************/
	  /*******************************MOSTRAR EL NÚMERO DE ELEMENTOS: SIZE************************************************************/
	  /*******************************************************************************************************************************/
        System.out.println("****************EJEMPLO: acabo de meter dos elementos, verifico que la coleccion no esta vacia********\n\n");
        if(serieDeFiguras.isEmpty())
	    System.out.println("NO hay elementos en la coleccion");
        else
	    System.out.println("SI hay elementos en la coleccion, concretamente "+serieDeFiguras.size()+"\n");    
        try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}   	
       //Creamos un nuevo cuadro del tipo OtroCuadrado y también lo añadimos a la lista, apartir de ahora directamente 
	Figura cuad3 = 	new OtroCuadrado (8.9f,"SERENITY");
	serieDeFiguras.add (cuad3);
		
        //Creamos un círculo, del tipo Circulo, y lo añadimos a la lista
	serieDeFiguras.add (new Circulo (3f,Color.BLACK));
		
		//Y otro más pero del tipo OtroCirculo
	serieDeFiguras.add (new OtroCirculo (4f,"PEACH ECHO")); 
		
		//Y terminamos con un par de rectángulos
	serieDeFiguras.add (new Rectangulo (2f, 3f, "ROSE QUARTZ"));
	serieDeFiguras.add (new Rectangulo (12f, 3f,"LYLAC GRAY"));
 


	/*******************************************************************************************************************************/
	/****EJERCICIO 1: AÑADA 3 FIGURAS MÁS, UN RECTÁNGULO NEGRO, UN OTRO CÍRCULO NEGRO Y UN OTROCUADRADO BLANCO*********************/
	/************************** MUÉSTRELO POR PANTALLA******************************************************************************/
	/************************************TO DO**************************************************************************************/






	 
	  /*******************************************************************************************************************************/
	  /*******************************MOSTRAR TODA LA COLECCIÓN: toString*************************************************************/
	  /*******************************************************************************************************************************/
        System.out.println("****************EJEMPLO: acabo de llenar toda la coleccion, la muestro por pantalla********\n\n");
        System.out.println(serieDeFiguras+"\n tiene "+serieDeFiguras.size()+" elementos\n");
        try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}
       	/*************************SACAR UN OBJETO DE LA COLECCIÓN: REMOVE***************************************************************/
      	/*************************MOSTRAR LA POSICIÓN DE LA PRIMERA OCURRENCIA DE  UN OBJETO: INDEXOF***********************************/
	/*************************MOSTRAR EL OBJETO EN UNA POSICIÓN: GET****************************************************************/
	/*******************************************************************************************************************************/
	//EJEMPLO: COMPROBEMOS SI CUAD3 ESTÁ EN LA COLECCIÓN, BORRAMOS Y VOLVEMOS A COMPROBAR
        System.out.println("****************EJEMPLO: Busco un objeto concreto usando su referencia y muestro su posicion********\n\n");
        if(serieDeFiguras.contains(cuad3))
	    System.out.println(cuad3+" SI pertenece a la coleccion y esta en la posicion "+serieDeFiguras.indexOf(cuad3)+"\n\n");
        else
	    System.out.println(cuad3+" NO pertenece a la coleccion\n\n");
        try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}
        System.out.println("****************EJEMPLO: Borro el elemento usando su referencia y lo vuelvo a buscar********\n\n");
        serieDeFiguras.remove(cuad3);
        if(serieDeFiguras.contains(cuad3))
	    System.out.println(cuad3+" SI pertenece a la coleccion y esta en la posicion "+serieDeFiguras.indexOf(cuad3)+"\n\n");
        else
	    System.out.println(cuad3+" NO pertenece a la coleccion\n\n");
       try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}
       
	/*******************************************************************************************************************************/
	/****EJERCICIO 2: VUELVA A AÑADIR CUAD3 Y REPITA LA OPERACIÓN DE BÚSQUEDA Y LOS MISMOS MENSAJES ANTERIORES**********************/
	/*****************OBSERVE LA POSICIÓN DE LA FIGURA ANTES Y DESPUÉS ¿QUÉ HA OCURRIDO?¿Quién ocupa ahora la posición 2************/
	/************************************TO DO**************************************************************************************/
	




       
       /*******************************************************************************************************************************/
       /*************************OBJETOS DUPLICADOS************************************************************************************/
       /*************************MOSTRAR LA POSICIÓN DE LA ULTIMA OCURRENCIA DE  UN OBJETO: LASTINDEXOF********************************/
       /*******************************************************************************************************************************/
        System.out.println("****************EJEMPLO: elementos duplicados, vuelvo a introducir el elemento cuad3, ahora esta dos veces********\n\n");
	serieDeFiguras.add (cuad3);
        if(serieDeFiguras.contains(cuad3))
	    System.out.println(cuad3+" esta en la posicion "+serieDeFiguras.indexOf(cuad3)+" y tambien esta en la posicion "+serieDeFiguras.lastIndexOf(cuad3)+"\n\n");
        else
	    System.out.println(cuad3+" NO pertenece a la coleccion\n\n");
	try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}
       /*******************************************************************************************************************************/
       /*************************RECORRER LA COLECCIÓN CON BUCLE  FOR_EACH*************************************************************/
       /*******************************************************************************************************************************/
	//ejemplo: Imprimimos por pantalla los miembros de la colección, usando un bucle for
	System.out.println("****************EJEMPLO: Uso bucle for-each para imprimir la figuras por pantalla********\n\n");
        System.out.println("Listado de la coleccion:\n\n");
        for (Figura fig : serieDeFiguras) {
                 System.out.println(fig);
        }
	try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}
        /*******************************************************************************************************************************/
	/****EJERCICIO 3: MUESTRE POR PANTALLA UNICAMENTE LOS COLORES DE LA COLECCIÓN, UTILIZANDO EL BUCLE FOR-EACH*********************/
	/************************** MUÉSTRELO POR PANTALLA******************************************************************************/
	/************************************TO DO**************************************************************************************/
     



	//ejemplo 2: Calculamos el area total de la colección, del mismo modo
	System.out.println("****************EJEMPLO 2: Uso bucle for, calcular el area total********\n\n");
        float areaTotal = 0;

        for (Figura tmp: serieDeFiguras) {      
		     areaTotal = areaTotal + tmp.getArea();     
		}

        System.out.println ("Tenemos un total de " + serieDeFiguras.size() + " figuras y su area total es de "  +
        areaTotal + " uds cuadradas");
        try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}
		
		/************************************************************************************************/
		/**********EJERCICIO 4: CACULE EL PERIMETRO TOTAL DE LA COLECCION UTILIZANDO UN BUCLE FOR********/
		/************************** MUÉSTRELO POR PANTALLA***********************************************/
		/************************************TO DO*******************************************************/
	
	
	
       /*******************************************************************************************************************************/
       /*************************RECORRER LA COLECCIÓN CON UN ITERADOR: ITERATOR*******************************************************/
       /*******************************************************************************************************************************/

       System.out.println("****************EJEMPLO: recupero un iterador y muestro todos los elementos usandolo********\n\n");
       Iterator<Figura> iterador=serieDeFiguras.iterator();
       while(iterador.hasNext()){
	    System.out.println(iterador.next());
       }
       try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}
		
       /*************************************************************************************************************************************************************/
       /******EJERCICIO 5: MUESTRE POR PANTALLA EL ÁREA CADA FIGURA NEGRA DE LA COLECCIÓN USANDO UN ITERADOR Y CUÉNTELAS, MOSTRANDO POR PANTALLA LA CANTIDAD*********/
       /************************************TO DO********************************************************************************************************************/
      



       /**************************************************************************************************************************/
       /*********************************USO DE ALGORITMOS GENERICOS, FUNCIONES ESTATICAS DE COLLECTIONS**************************/
       /*********************************CAMBIANDO EL ORDEN DE UNA COLECCIÓN: REVERSE*********************************************/
       /**************************************************************************************************************************/
       System.out.println("****************EJEMPLO: uso el algoritmo sort para dar la vuelta a la colección********\n\n");
      
       System.out.println("Orden original \n"+serieDeFiguras);
       Collections.reverse(serieDeFiguras);
       System.out.println("\nNuevo Orden \n"+serieDeFiguras);
     
	try{
               System.out.println("Pulse intro para continuar");
               System.in.read();
	}catch(IOException exc){
	    System.out.println(exc+"Error al leer\n\n");
	}
       /**************************************************************************************************************************/
       /*********************************CAMBIANDO EL ORDEN DE UNA COLECCIÓN: USO DE COMPARATOR***********************************/
       /**********************LA CLASE ORDENACIOAREA ESTA EN UTILIDADES, IMPLEMENTA UN COMPARADOR DE FIGURAS POR AREA*************/
       /**************************************************************************************************************************/
       System.out.println("****************EJEMPLO: uso de un comparador personalizado, para ordenar por area, de mayor a menor********\n\n");
      
       OrdenacionArea ordenador=new OrdenacionArea();
       Collections.sort(serieDeFiguras,ordenador);
       System.out.println("\nAhora ordenadas por Area, de mayor a menor \n");
       for (Figura tmp: serieDeFiguras) {      
	   System.out.println(tmp+": Area= "+tmp.getArea());     
       }
       /****************************************************************************************************************/
       /******EJERCICIO 6: CREE UN COMPARADOR PARA ORDENAR POR PERIMETRO DE MENOR A MAYOR*******************************/
       /*****UTILICELO PAR ORDENAR LA COLECCION Y MUESTRELA POR PANTALLA, MOSTRANDO EL PERIMETRO DE CADA FIGURA*********/
       /************************************TO DO***********************************************************************/
     
 }
}
		
		
