

package uniandes.dpoo.proyecto2.mundo;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Representa el almac�n.
 */
public class ConsolaAplicacion
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * La categor�a ra�z del almac�n.
     */
    private PaqueteTrabajo paqueteTrabajoRaiz;
    
    private ArrayList<Participante> participantes;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo almac�n a partir de los datos del archivo.<br>
     * <b>post:</b> Se cargo la informaci�n del almac�n contenida en el archivo.
     * @param pArchivo Archivo con la informaci�n del almac�n. pArchivo != null.
     * @throws AlmacenException Si ocurre alg�n error al cargar la informaci�n.
     */
    public ConsolaAplicacion() 
    {
    	participantes = new ArrayList<>();
    	paqueteTrabajoRaiz = new PaqueteTrabajo("WBS", "Descripcion inicial", "");
    	paqueteTrabajoRaiz.agregarNodo("WBS", "PaqueteTrabajo", "Paquete prueba 1", "Descripcion1", "");
    	paqueteTrabajoRaiz.agregarNodo("WBS", "PaqueteTrabajo", "Paquete prueba 2", "Descripcion2", "");
    	paqueteTrabajoRaiz.agregarNodo("WBS", "PaqueteTrabajo", "Paquete prueba 3", "Descripcion3", "");
    	
    	paqueteTrabajoRaiz.agregarNodo("Paquete prueba 1", "Tarea", "Tarea de prueba 1", "Descripcion4", "Tipo4");
    	paqueteTrabajoRaiz.agregarNodo("Paquete prueba 2", "Tarea", "Tarea de prueba 2", "Descripcion5", "Tipo5");
    	
    	agregarActividad("Tarea de prueba 1", "Actividad de prueba 1", "Descripcion de prueba1", "Tipo de prueba1", LocalDateTime.now());
    	agregarActividad("Tarea de prueba 1", "Actividad de prueba 2", "Descripcion de prueba2", "Tipo de prueba2", LocalDateTime.now());
    	agregarActividad("Tarea de prueba 2", "Actividad de prueba 3", "Descripcion de prueba3", "Tipo de prueba3", LocalDateTime.now());
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna la categor�a ra�z del almac�n.
     * @return Categor�a ra�z del almac�n.
     */
    public PaqueteTrabajo darPaqueteTrabajoRaiz( )
    {
        return paqueteTrabajoRaiz;
    }

    /**
     * Agrega un nuevo nodo a la categor�a con la ruta dada..<br>
     * <b>pre:</b> La ra�z del �rbol existe y est� inicializada. Existe una categor�a para la ruta.<br>
     * <b>post: </b> Se agreg� el nodo a la categor�a dada.
     * @param pIdPadre Identificador de la categor�a padre. pIdPadre != null && pIdPadre != "".
     * @param pTipo Tipo del nodo. pTipo != null && pTipo = {Categoria.TIPO, Marca.TIPO}
     * @param pIdentificador Identificador �nico del nodo. pIdentificador != null && pIdentificador != "".
     * @param pNombre Nombre del nodo. pNombre != null && pNombre != "".
     * @throws AlmacenException Si ya existe en el �rbol un nodo con el identificador dado.
     */
    public void agregarNodo( String pNombrePadre, String pTipo, String pNombre, String pDescripcion, String pTipoTarea )
    {
        paqueteTrabajoRaiz.agregarNodo(  pNombrePadre, pTipo, pNombre, pDescripcion, pTipoTarea);
    }

    /**
     * Retorna el nodo con el identificador dado.<br>
     * <b>pre: </b> La categor�a ra�z est� inicializada.
     * @param pIdNodo Identificador �nico del nodo. pIdNodo != null.
     * @return El nodo encontrado o null si no existe.
     */
    public Nodo buscarNodo( String pNombreNodo )
    {
        return paqueteTrabajoRaiz.buscarNodo( pNombreNodo );
    }

    /**
     * Agrega un nuevo producto de la marca dada con la informaci�n dada por par�metro.<br>
     * <b>pre:</b> La categor�a ra�z est� inicializada. Existe la marca con el identificador dado.<br>
     * <b>post:</b> Se agreg� un nuevo producto a la marca.<br>
     * @param pIdMarca Identificador de la marca del producto. pIdMarca != null && pIdMarca != "".
     * @param pCodigo C�digo del producto. pCodigo != null && pCodigo != "".
     * @param pNombre Nombre del producto. pNombre != null && pNombre != "".
     * @param pDescripcion Descripci�n del producto. pDescripcion != null && pDescripcion != "".
     * @param pPrecio Precio del producto. pPrecio > 0.
     * @throws AlmacenException Si ya existe un producto con el c�digo dado.
     */
    public void agregarActividad(String pNombreTarea, String titulo, String descripcion, String tipo, LocalDateTime fechaInicio)
    {
        ((Tarea)buscarNodo( pNombreTarea )).agregarActividad(titulo, descripcion, tipo, fechaInicio);
    }
    
    public void agregarParticipante(String pNombre, String pCorreo)
    {
    	Participante p = new Participante(pNombre, pCorreo);
    	participantes.add(p);
    }

	public void ingreso(String pNombre, String pCorreo) 
	{
		agregarParticipante(pNombre, pCorreo);
	}
}
