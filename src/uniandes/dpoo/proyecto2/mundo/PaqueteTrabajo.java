

package uniandes.dpoo.proyecto2.mundo;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Representa una categor�a del almac�n.
 */
public class PaqueteTrabajo extends Nodo
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Representa el tipo del nodo categor�a.
     */
    public final static String TIPO = "PaqueteTrabajo";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Lista con los nodos hijos de la categor�a.
     */
    private List<Nodo> nodosHijos;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye una nueva categor�a sin nodosHijos.<br>
     * <b>post: </b> Se inicializaron los atributos de la clase padre con los valores dados por par�metro y el tipo respectivo. Se inicializ� la lista de nodosHijos como una lista
     * vac�a.
     * @param pIdentificador Identificador �nico de la marca. pIdentificador != null && pIdentificador != "".
     * @param pNombre Nombre de la categor�a. pNombre != null && pNombre != "".
     */
    public PaqueteTrabajo( String pNombre, String pDescripcion, String pTipoTarea )
    {
        super( TIPO, pNombre, pDescripcion, pTipoTarea);
    	nodosHijos = new ArrayList<>( );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna la lista de los nodosHijos hijos.
     * @return Lista de nodosHijos.
     */
    public List<Nodo> darNodos( )
    {
        return nodosHijos;
    }
    
    public List<Nodo> darPreorden( )
    {
        List<Nodo> respuesta = new ArrayList<>( );
        respuesta.add( this );
        for( Nodo nodo : nodosHijos )
        {
            if( nodo instanceof PaqueteTrabajo )
            {
                respuesta.addAll( ( ( PaqueteTrabajo )nodo ).darPreorden( ) );
            }
            else
            {
                respuesta.add( nodo );
            }
        }
        return respuesta;
    }

    /**
     * Indica si esta categor�a tiene como hijo el nodo con el identificador dado.<br>
     * <b>pre: </b> La lista de nodosHijos est� inicializada.<br>
     * @param pIdNodo Identificador del nodo. pIdNodo != null && pIdNodo != "".
     * @return True si esta categor�a tiene un hijo con el identificador dado, False en caso contrario.
     */
    private boolean tieneHijo( String pNombreNodo )
    {
        boolean respuesta = false;
        for( int i = 0; i < nodosHijos.size( ) && !respuesta; i++ )
        {
            Nodo nodo = nodosHijos.get( i );
            respuesta = nodo.darNombre( ).equals( pNombreNodo );
        }
        return respuesta;
    }

    /**
     * Retorna la categor�a padre del nodo con identificador dado.<br>
     * <b>pre: </b> La lista de nodosHijos est� inicializada y existe un nodo con el identificador dado.<br>
     * @param pIdNodo Identificador del nodo. pIdNodo != null && pIdNodo != "".
     * @return Padre del nodo dado.
     */
    public PaqueteTrabajo buscarPadre( String pIdNodo )
    {
    	PaqueteTrabajo respuesta = tieneHijo( pIdNodo ) ? this : null;
        for( int i = 0; i < nodosHijos.size( ) && respuesta == null; i++ )
        {
            Nodo actual = nodosHijos.get( i );
            if( actual.darTipo( ).equals( PaqueteTrabajo.TIPO ) )
            {
                respuesta = ( ( PaqueteTrabajo )actual ).buscarPadre( pIdNodo );
            }

        }
        return respuesta;
    }

    /**
     * Busca el nodo con el identificador dado.
     * @param pIdentificador Identificador del nodo. pIdentificador != null && pIdentificador != "".
     * @return NodoAlmacen con el identificador dado o null si no se encontr� el nodo.
     */
    @Override
    public Nodo buscarNodo( String pNombre )
    {
    	Nodo respuesta = null;
        if( pNombre.equals( nombre ) )
        {
            respuesta = this;
        }
        else
        {
            for( int i = 0; i < nodosHijos.size( ) && respuesta == null; i++ )
            {
                respuesta = nodosHijos.get( i ).buscarNodo( pNombre );
            }
        }
        return respuesta;
    }

    /**
     * Agrega un nuevo nodo del tipo dado a la lista.<br>
     * <b>pre: </b> La lista de nodosHijos est� inicializada.<br>
     * <b>post: </b> Se agreg� un nuevo nodo a la lista con los valores dados.
     * @param pIdPadre Identificador �nico del padre del nodo. pIdPadre != null && pIdPadre != "".
     * @param pTipo Tipo del nodo. pTipo != null && pTipo != "".
     * @param pIdentificador Identificador del nodo. pIdentificador != null && pIdentificador != "".
     * @param pNombre Nombre del nodo. pNombre != null && pNombre != "".
     * @throws AlmacenException Si ya existe un nodo en el sub�rbol con ese identificador.
     */
    public void agregarNodo( String pNombrePadre, String pTipo, String pNombre, String pDescripcion, String pTipoTarea )
    {
        Nodo nuevo = pTipo.equals( PaqueteTrabajo.TIPO ) ? new PaqueteTrabajo( pNombre, pDescripcion, pTipoTarea ) : new Tarea( pNombre, pDescripcion, pTipoTarea );
        agregarNodo( pNombrePadre, nuevo );
    }

    /**
     * Agrega un nuevo nodo a la lista.<br>
     * <b>pre: </b> La lista de nodosHijos est� inicializada.<br>
     * <b>post: </b> Se agreg� el nuevo nodo a la lista.
     * @param pIdPadre Identificador �nico del padre del nodo. pIdPadre != null && pIdPadre != "".
     * @param pNodo NodoAlmacen que se va a agregar. pNodo != null.
     * @return True si agreg� el nodo, False en caso contrario.
     * @throws AlmacenException Si ya existe un nodo en el sub�rbol con ese identificador.
     */
    public boolean agregarNodo( String pNombrePadre, Nodo pNodo )
    {
        boolean respuesta = false;
        if( nombre.equals( pNombrePadre ) )
        {
            respuesta = nodosHijos.add( pNodo );
        }
        else
        {
            for( int i = 0; i < nodosHijos.size( ) && !respuesta; i++ )
            {
                Nodo actual = nodosHijos.get( i );
                if( actual instanceof PaqueteTrabajo )
                {
                    respuesta = ( ( PaqueteTrabajo )actual ).agregarNodo( pNombrePadre, pNodo );
                }
            }
        }
        return respuesta;
    }

    /**
     * Busca el producto con el c�digo dado.
     * @param pCodigo C�digo del producto. pCodigo != null && pCodigo != "".
     * @return El producto buscado o null si no existe.
     */
    public Actividad buscarActividad( String pCodigo )
    {
    	Actividad respuesta = null;
        for( int i = 0; i < nodosHijos.size( ) && respuesta == null; i++ )
        {
            Nodo actual = nodosHijos.get( i );
            if( actual instanceof Tarea )
            {
                respuesta = ( ( Tarea )actual ).buscarActividad( pCodigo );
            }
            else
            {
                respuesta = ( ( PaqueteTrabajo )actual ).buscarActividad( pCodigo );
            }
        }

        return respuesta;

    }

    /**
     * Agrega a la lista acumulada todos los productos del nodo.<br>
     * <b>pre:</b> La lista de nodosHijos est� inicializada.
     * @param pProductos Lista acumulada con los productos. pProductos != null.
     */
    @Override
    public void darActividades( List<Actividad> pActividad )
    {
        for( Nodo nodo : nodosHijos )
        {
            nodo.darActividades( pActividad );
        }
    }

    /**
     * Retorna una lista con todas las marcas que tiene la categor�a y su sub�rbol.<br>
     * <b>pre:</b> La lista de nodosHijos est� inicializada.<br>
     * @return Lista con todas las marcas de la categor�a y su sub�rbol.
     * 
     */
    public List<Tarea> darTareas( )
    {
        List<Tarea> respuesta = new ArrayList<>( );
        for( Nodo nodo : nodosHijos )
        {
            if( nodo instanceof PaqueteTrabajo )
            {
                respuesta.addAll( ( ( PaqueteTrabajo )nodo ).darTareas( ) );
            }
            else
            {
                respuesta.add( ( Tarea )nodo );
            }
        }
        return respuesta;

    }





}
