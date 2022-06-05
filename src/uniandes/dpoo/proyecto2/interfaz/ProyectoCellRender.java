

package uniandes.dpoo.proyecto2.interfaz;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import uniandes.dpoo.proyecto2.mundo.Nodo;

/**
 * Clase para manejar el icono del �rbol del almac�n.
 */
@SuppressWarnings("serial")
public class ProyectoCellRender extends DefaultTreeCellRenderer
{

    /**
     * @see javax.swing.tree.DefaultTreeCellRenderer#getTreeCellRendererComponent(javax.swing.JTree, java.lang.Object, boolean, boolean, boolean, int, boolean)
     */
    @Override
    public Component getTreeCellRendererComponent( JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus )
    {
        JLabel label = ( JLabel )super.getTreeCellRendererComponent( tree, value, selected, expanded, leaf, row, hasFocus );
        Object o = ( ( DefaultMutableTreeNode )value ).getUserObject( );
        label.setText( ( ( Nodo )o ).darNombre( ) );

        return label;
    }
}
