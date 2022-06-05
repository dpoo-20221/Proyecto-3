

package uniandes.dpoo.proyecto2.mundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * Clase abstracta que representa un nodo del �rbol del mercado.
 */
public abstract class Nodo
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Tipo del nodo.
     */
    protected String tipo;

    /**
     * Identificador del nodo.
     */
    protected String descripcion;
    
    /**
     * El nombre del nodo.
     */
    protected String nombre;
    
    protected String tipoTarea;
    
    protected LocalDateTime fechaInicio;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un nuevo nodo.<br>
     * <b>post: </b> Los atributos identificador y tipo se inicializaron con los valores dados por par�metro.
     * @param pTipo Tipo del nodo. pTipo != null && pTipo != "".
     * @param pIdentificador Identificador del nodo. pIdentificador != null && pIdentificador != "".
     * @param pNombre Nombre del nodo. pNombre != null && pNombre != "".
     */
    public Nodo( String pTipo, String pNombre, String pDescripcion, String pTipoTarea)
    {
        tipo = pTipo;
        descripcion = pDescripcion;
        nombre = pNombre;
        tipoTarea = pTipoTarea;
        fechaInicio = LocalDateTime.now();
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el identificador del nodo.
     * @return Identificador del nodo.
     */
    public String darDescripcion( )
    {
        return descripcion;
    }

    /**
     * Retorna el tipo del nodo.
     * @return Tipo del nodo.
     */
    public String darTipo( )
    {
        return tipo;
    }

    /**
     * Retorna el nombre del nodo.
     * @return Nombre del nodo.
     */
    public String darNombre(){
        return nombre;
    }
    
    public LocalDateTime darFechaInicio()
    {
    	return fechaInicio;
    }
    
    /**
     * Busca el nodo con el identificador dado.
     * @param pIdentificador Identificador del nodo. pIdentificador != null && pIdentificador != "".
     * @return NodoAlmacen con el identificador dado o null si no se encontr� el nodo.
     */
    public abstract Nodo buscarNodo( String pNombre );

    /**
     * Agrega a la lista acumulada todos los productos del nodo.<br>
     * <b>pre:</b> La lista de nodos est� inicializada.
     * @param pProductos Lista acumulada con los productos. pProductos != null.
     */
    public abstract void darActividades( List<Actividad> pActividades );
    
    public List<Actividad> darActividades() 
    {
    	List<Actividad> actividades = new ArrayList<>( );
        darActividades( actividades );
        return actividades;
	}
    
    public Actividad buscarActividad(String nombreActividad)
    {
    	Actividad resp = null;
    	for(Actividad a: darActividades())
    	{
    		if(a.getTitulo().equals(nombreActividad))
    		{
    			resp = a;	
    		}
    	}
    	return resp;
    }
    
    /**
     * Retorna la representaci�n en string de este objeto.<br>
     * @return Nombre del nodo.
     */
    @Override
    public String toString( )
    {
        return nombre;
    }

}
