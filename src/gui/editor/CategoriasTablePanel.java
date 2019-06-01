/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.gui.editor;

import java.util.HashMap;
import javax.swing.JOptionPane;
import src.dao.CategoriaDao;
import src.dao.MesaDao;
import src.gui.MainFrame;
import src.gui.tablemodels.CategoriasTableModel;
import src.model.Mesa;

/**
 *
 * @author NarF
 */
public class CategoriasTablePanel extends GenericTablePanel {

    public CategoriasTablePanel() {
        super("Categorias");

        CategoriasTableModel tm = new CategoriasTableModel();
        setModel(tm);
        setMainColsSize();
    }

    @Override
    public void refreshTable() {
        model.clearTableModelData();
        CategoriaDao.getInstance().queryAll().forEach((id, categoria) -> model.addRow(categoria));
    }

    @Override
    public void editAction() {
        int selectedRow = jTable.getSelectedRow();
        if (selectedRow > -1) {
            java.awt.EventQueue.invokeLater(() -> {
                int id = (int) jTable.getValueAt(selectedRow, 0);
                new MesaFrame(id).setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(this, "Elige una " + nombre + " a editar", nombre + "s", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void backAction() {
        MainFrame.setCard("Start");
    }

    @Override
    public void addAction() {
        java.awt.EventQueue.invokeLater(() -> {
            new MesaFrame().setVisible(true);
        });
    }

    @Override
    public void deleteAction() {
        int selectedRow = jTable.getSelectedRow();
        if (selectedRow > -1) {
            int idSelected = (int) jTable.getValueAt(selectedRow, 0);
            String nameSelected = (String) jTable.getValueAt(selectedRow, 1);
            int i = JOptionPane.showConfirmDialog(this, "Deseas eliminar la " + nombre + ": " + nameSelected, "Eliminando " + nombre + "", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                if (CategoriaDao.getInstance().delete(idSelected) > 0) {
                    JOptionPane.showMessageDialog(this, nombre + " eliminado: " + nameSelected, nombre + " Eliminado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, nombre + " NO eliminado: " + nameSelected, nombre + " Eliminado", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elige una " + nombre + " a eliminar", nombre, JOptionPane.ERROR_MESSAGE);
        }
        refreshTable();
    }

}
