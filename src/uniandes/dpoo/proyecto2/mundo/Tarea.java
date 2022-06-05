
package uniandes.dpoo.proyecto2.mundo;

import java.io.BufferedReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una Marca.
 */
/**
 * @author Usuario
 *
 */
public class Tarea extends Nodo
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante que representa el tipo del nodo marca.
     */
    public final static String TIPO = "Tarea";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Referencia al producto ra�z del �rbol binario que contiene los productos de la marca.
     */
    private ArrayList<Actividad> actividades;
    
    private String tipoTarea;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye una nueva marca.<br>
     * <b>post: </b> Se inicializaron los atributos de la clase padre con los valores dados por par�metro y el tipo respectivo. El producto ra�z se inicializ� en null.
     * @param pIdentificador Identificador �nico de la marca. pIdentificador != null && pIdentificador != "".
     * @param pNombre Nombre de la marca. pNombre != null && pNombre != "".
     */
    public Tarea( String pNombre, String pDescripcion, String pTipoTarea)
    {
        super( TIPO, pNombre, pDescripcion, pTipoTarea);
        actividades = new ArrayList<>();
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Agrega un nuevo producto con la informaci�n dada al �rbol de productos de la marca.<br>
     * <b>post: </b>Se agreg� el producto al �rbol.
     * @param pCodigo C�digo del producto. pCodigo != null && pCodigo != "".
     * @param pNombre Nombre del producto. pNombre != null && pNombre != "".
     * @param pDescripcion Descripci�n del producto. pDescripcion != null && pDescripcion != "".
     * @param pPrecio Precio del producto. pPrecio > 0.
     * @throws AlmacenException Si ya exist�a un producto con el c�digo dado.
     */
    public void agregarActividad(String titulo, String descripcion, String tipo,
			LocalDateTime fechaInicio)
    {
        Actividad nuevo = new Actividad(titulo, descripcion, tipo, fechaInicio);
        actividades.add(nuevo);
    }

    /**
     * Busca un producto por c�digo en el �rbol de productos.
     * @param pCodigo C�digo del producto que se esta buscando. pCodigo != null && pCodigo != "".
     * @return Producto con el c�digo dado por par�metro o null si no existe.
     */
    public Actividad buscarActividad( String titulo )
    {
    	Actividad resp = null;
        for(Actividad a:actividades)
        {
        	if(nombre.equals(a.getTitulo()))
        	{
        		resp = a;        		
        	}
        }
        return resp;
    }

    /**
     * Busca el nodo con el identificador dado.
     * @param pIdentificador Identificador del nodo. pIdentificador != null && pIdentificador != "".
     * @return NodoAlmacen con el identificador dado o null si no se encontr� el nodo.
     */
    @Override
    public Nodo buscarNodo( String nombre )
    {
        return nombre.equals( nombre ) ? this : null;
    }

	@Override
	public void darActividades(List<Actividad> pActividades) 
	{
		pActividades.addAll(actividades);
	}
	
	public String darTipoTarea()
	{
		return tipoTarea;
	}

}
