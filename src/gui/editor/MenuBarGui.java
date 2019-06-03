/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.gui.editor;

import javax.swing.JMenuBar;

/**
 *
 * @author NarF
 */
public class MenuBarGui extends JMenuBar {

    /**
     * Creates new form NewJFrame
     */
    public MenuBarGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuInicio = new javax.swing.JMenu();
        jMenuItemNueva = new javax.swing.JMenuItem();
        jMenuItemCargar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuVer = new javax.swing.JMenu();
        jMenuItemMesas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuEditar = new javax.swing.JMenu();
        jMenuItemEditMesas = new javax.swing.JMenuItem();
        jMenuItemEditProductos = new javax.swing.JMenuItem();
        jMenuItemEditCategorias = new javax.swing.JMenuItem();
        jMenuItemEditOrdenes = new javax.swing.JMenuItem();
        jMenuItemEditServidos = new javax.swing.JMenuItem();
        jMenuMas = new javax.swing.JMenu();
        jMenuItemInformacion = new javax.swing.JMenuItem();

        jMenuInicio.setText("Inicio");

        jMenuItemNueva.setText("Nueva");
        jMenuInicio.add(jMenuItemNueva);

        jMenuItemCargar.setText("Cargar");
        jMenuInicio.add(jMenuItemCargar);
        jMenuInicio.add(jSeparator1);

        jMenuItemSalir.setText("Salir");
        jMenuInicio.add(jMenuItemSalir);

        this.add(jMenuInicio);

        jMenuVer.setText("Ver");
        jMenuVer.setEnabled(false);

        jMenuItemMesas.setText("Mesas");
        jMenuVer.add(jMenuItemMesas);
        jMenuVer.add(jSeparator2);

        jMenuEditar.setText("Editar");

        jMenuItemEditMesas.setText("Mesas");
        jMenuEditar.add(jMenuItemEditMesas);

        jMenuItemEditProductos.setText("Productos");
        jMenuEditar.add(jMenuItemEditProductos);

        jMenuItemEditCategorias.setText("Categorias");
        jMenuEditar.add(jMenuItemEditCategorias);

        jMenuItemEditOrdenes.setText("Ordenes");
        jMenuEditar.add(jMenuItemEditOrdenes);

        jMenuItemEditServidos.setText("Servidos");
        jMenuEditar.add(jMenuItemEditServidos);

        jMenuVer.add(jMenuEditar);

        this.add(jMenuVer);

        jMenuMas.setText("Mas");

        jMenuItemInformacion.setText("Informacion");
        jMenuMas.add(jMenuItemInformacion);

        this.add(jMenuMas);

    }// </editor-fold>                        

    // Variables declaration - do not modify   
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuInicio;
    protected javax.swing.JMenuItem jMenuItemCargar;
    protected javax.swing.JMenuItem jMenuItemEditCategorias;
    protected javax.swing.JMenuItem jMenuItemEditMesas;
    protected javax.swing.JMenuItem jMenuItemEditOrdenes;
    protected javax.swing.JMenuItem jMenuItemEditProductos;
    protected javax.swing.JMenuItem jMenuItemEditServidos;
    protected javax.swing.JMenuItem jMenuItemInformacion;
    protected javax.swing.JMenuItem jMenuItemMesas;
    protected javax.swing.JMenuItem jMenuItemNueva;
    public javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuMas;
    public static javax.swing.JMenu jMenuVer;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration                   
}
