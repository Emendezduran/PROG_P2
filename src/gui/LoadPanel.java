/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.gui;

import java.awt.CardLayout;
import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import src.model.SessionDB;

/**
 *
 * @author NarF
 */
public class LoadPanel extends javax.swing.JPanel {

    public JPanel cards;
    public CardLayout layout;

    private final String title;
    private final boolean newdb;

    /**
     * Creates new form Start
     *
     * @param newdb
     */
    public LoadPanel(boolean newdb) {
        this.newdb = newdb;
        this.cards = MainFrame.getCards();
        layout = (CardLayout) cards.getLayout();
        initComponents();

        if (newdb) {
            title = "Nueva";
        } else {
            title = "Cargar";
        }
        jLabelTitle.setText(title);
        jBtnCargar.setText(title);

        jTextFieldBrowse.setText(System.getProperty("user.dir") + "\\src\\src\\resources");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBtnBrowse = new javax.swing.JButton();
        jTextFieldBrowse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabStatus = new javax.swing.JLabel();
        jLabNumProductos = new javax.swing.JLabel();
        jLabNumMesas = new javax.swing.JLabel();
        jLabFileSize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBtnCargar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 240));

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Cargar BD");

        jBtnBrowse.setText("Buscar");
        jBtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBrowseActionPerformed(evt);
            }
        });

        jTextFieldBrowse.setEditable(false);

        jLabel2.setText("Elige una ruta");

        jLabel3.setText("Status:");
        jLabel3.setMaximumSize(null);

        jLabel6.setText("Tamaño:");
        jLabel6.setMaximumSize(null);

        jBtnCargar.setText("Cargar");
        jBtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCargarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnCargar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldBrowse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnBrowse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabNumProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabNumMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabFileSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(198, 198, 198))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabNumProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabNumMesas)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabFileSize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabNumMesas, jLabNumProductos, jLabStatus, jLabel3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCargarActionPerformed
        if (newdb) {
            newDb();
        } else {
            loadDb();
        }
    }//GEN-LAST:event_jBtnCargarActionPerformed

    private void newDb() {
        // TODO add your handling code here:
        //layout.show(cards, MainFrame.NEWDBPANEL);

        if (jTextFieldBrowse.getText().trim().length() > 0) {
            File newfile = null;
            do {
                String nombre = JOptionPane.showInputDialog(this, "Introduce el nombre de la base de datos", "Nueva DB", 3);
                if (nombre == null || nombre.length() < 1) {
                    break;
                }
                File file = new File(jTextFieldBrowse.getText());

                String dir = file.getAbsolutePath();
                if (file.isFile()) {
                    String full = file.getAbsolutePath();
                    dir = full.substring(0, full.lastIndexOf("/"));
                }
                newfile = new File(dir + "/" + nombre + ".db");

                if (!newfile.exists()) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "File already exists", "Alert", JOptionPane.ERROR_MESSAGE);
                    newfile = null;
                }
            } while (true);

            if (newfile != null) {
                SessionDB.setDbFile(newfile);
                System.out.println("Initializing DB...");
                SessionDB.crearTablas();
                int i = JOptionPane.showConfirmDialog(this, "Insertar demo data?", "Nueva DB", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    System.out.println("Inserting Demo Data...");
                    SessionDB.insertarDemoData();
                }
                jTextFieldBrowse.setText(newfile.getAbsolutePath());
                setStatusLabels();
                JOptionPane.showMessageDialog(this, "DB creada correctamente", "Nueva DB", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Creacion cancelada", "Cargando DB", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elige una ruta", "Cargando DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadDb() {
        // TODO add your handling code here:
        if (jTextFieldBrowse.getText().trim().length() > 0) {
            File loadfile = new File(jTextFieldBrowse.getText());
            if (loadfile.exists()) {
                SessionDB.setDbFile(loadfile);

                if (SessionDB.isValid()) {
                    MainFrame.setCard("Start");
                } else {
                    JOptionPane.showMessageDialog(this, "DB Invalida", "Cargando DB", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Archivo inexistente", "Cargando DB", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elige una DB", "Cargando DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jBtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setCurrentDirectory(new File(jTextFieldBrowse.getText()));

        if (chooser.showOpenDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {
            jTextFieldBrowse.setText(chooser.getSelectedFile().getAbsolutePath());
            if (chooser.getSelectedFile().isFile()) {
                setStatusLabels();
            }
        }
    }//GEN-LAST:event_jBtnBrowseActionPerformed

    private void setStatusLabels() {
        File file = new File(jTextFieldBrowse.getText());
        SessionDB.setDbFile(file);

        String ok = "<html><b style=\"color:green;\">OK</b></hrml>";
        String err = "<html><b style=\"color:red;\">Invalid</b></hrml>";

        if (SessionDB.isValid()) {
            jLabStatus.setText(ok);
        } else {
            jLabStatus.setText(err);
            jLabNumMesas.setText("");
            jLabNumProductos.setText("");
            jLabFileSize.setText(byteSizeFormatter(file.length()) + " bytes");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBrowse;
    private javax.swing.JButton jBtnCargar;
    private javax.swing.JLabel jLabFileSize;
    private javax.swing.JLabel jLabNumMesas;
    private javax.swing.JLabel jLabNumProductos;
    private javax.swing.JLabel jLabStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldBrowse;
    // End of variables declaration//GEN-END:variables

    /**
     * Recursive Byte string formatter ex: 10000 = 10.000
     *
     * @param bytes string containing digits to be formated
     * @return x.xxx.xxx.xxx style string
     */
    private static String byteSizeFormatter(String bytes) {
        StringBuilder sb = new StringBuilder();
        if (bytes.length() < 4) {
            sb.insert(0, bytes);
        } else {
            sb.insert(0, "." + bytes.substring(bytes.length() - 3));
            sb.insert(0, byteSizeFormatter(bytes.substring(0, bytes.length() - 3)));
        }
        return sb.toString();
    }

    public static String byteSizeFormatter(long bytes) {
        return byteSizeFormatter(bytes + "");
    }
}
