package uniandes.dpoo.proyecto2.mundo;

import java.util.ArrayList;

/**
 * @author Usuario
 *
 */
public class Participante 
{
	/**
	 * El nombre del participante.
	 */
	private String nombre;
	
	/**
	 * El correo del participante.
	 */
	private String correo;
	
	/**
	 * Crea un participante nuevo que no esta en ningun proyecto.
	 * @param pNombre Nombre del participante.
	 * @param pCorreo Correo del participante.
	 */
	public Participante(String pNombre, String pCorreo) 
	{
		this.nombre = pNombre;
		this.correo = pCorreo;
	}

	/**
	 * @return Devuelve el nombre del participante.
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * @return Devuelve el correo del participante.
	 */
	public String getCorreo()
	{
		return correo;
	}
        
        public String generarReporte()
        {
            String mensaje = "Correo: "+correo;
            
            return mensaje;
        }
}
