/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.gui;

/**
 *
 * @author Emili
 */
public abstract class PanelMesaGui extends javax.swing.JPanel {

    /**
     * Creates new form PanelMesa
     */
    public PanelMesaGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelIdOrdenTag = new javax.swing.JLabel();
        jLabelIdOrden = new javax.swing.JLabel();
        jLabelEstadoTag = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jPanelButtons = new javax.swing.JPanel();
        jButtonCerrarMesa = new javax.swing.JButton();
        jButtonCobrar = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanelCenter = new javax.swing.JPanel();
        jButtonLimpiarCuenta = new javax.swing.JButton();
        jPanelCenterLeft = new javax.swing.JPanel();
        jPanelCategoriasBtns = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonCat0 = new javax.swing.JButton();
        jButtonCat2 = new javax.swing.JButton();
        jButtonCat4 = new javax.swing.JButton();
        jButtonCat6 = new javax.swing.JButton();
        jButtonCat7 = new javax.swing.JButton();
        jButtonCat5 = new javax.swing.JButton();
        jButtonCat3 = new javax.swing.JButton();
        jButtonCat1 = new javax.swing.JButton();
        jPanelTablaProductos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jPanelCenterRight = new javax.swing.JPanel();
        jPanelTablaServidos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServidos = new javax.swing.JTable();
        jButtonInicio = new javax.swing.JButton();
        jButtonQuitar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanelTop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitle.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("<Nombre Mesa>");

        jLabelIdOrdenTag.setText("idOrden: ");

        jLabelIdOrden.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelIdOrden.setText("<0000>");

        jLabelEstadoTag.setText("Estado:");

        jLabelEstado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelEstado.setText("<estado>");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEstadoTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelIdOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIdOrdenTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelTopLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelEstado, jLabelIdOrden});

        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addComponent(jLabelIdOrdenTag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIdOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addComponent(jLabelEstadoTag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelTopLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelEstadoTag, jLabelIdOrdenTag});

        jPanelTopLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelEstado, jLabelIdOrden});

        jLabelTitle.getAccessibleContext().setAccessibleDescription("");
        jLabelIdOrden.getAccessibleContext().setAccessibleDescription("");
        jLabelEstado.getAccessibleContext().setAccessibleDescription("");

        jPanelButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonCerrarMesa.setText("CERRAR MESA");
        jButtonCerrarMesa.setPreferredSize(new java.awt.Dimension(100, 40));

        jButtonCobrar.setText("COBRAR");
        jButtonCobrar.setPreferredSize(new java.awt.Dimension(100, 40));

        jButtonBack.setText("VOLVER");
        jButtonBack.setPreferredSize(new java.awt.Dimension(100, 40));

        jButtonAbrir.setText("ABRIR");
        jButtonAbrir.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCerrarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelButtonsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAbrir, jButtonBack, jButtonCerrarMesa, jButtonCobrar});

        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCerrarMesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelButtonsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAbrir, jButtonBack, jButtonCerrarMesa, jButtonCobrar});

        jButtonCerrarMesa.getAccessibleContext().setAccessibleDescription("");
        jButtonCobrar.getAccessibleContext().setAccessibleDescription("");
        jButtonBack.getAccessibleContext().setAccessibleDescription("");
        jButtonAbrir.getAccessibleContext().setAccessibleDescription("");

        jPanelCenter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonLimpiarCuenta.setText("<html><p style=\"text-align:center;\">Limpiar<br>Cuenta</p></html>");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Categorias");

        jButtonCat0.setText("Bebidas");
        jButtonCat0.setMinimumSize(new java.awt.Dimension(90, 0));
        jButtonCat0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCat1ActionPerformed(evt);
            }
        });

        jButtonCat2.setText("Aperitivos");
        jButtonCat2.setMinimumSize(new java.awt.Dimension(90, 0));
        jButtonCat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCat1ActionPerformed(evt);
            }
        });

        jButtonCat4.setText("Menus");
        jButtonCat4.setMinimumSize(new java.awt.Dimension(90, 0));

        jButtonCat6.setText("Postres");
        jButtonCat6.setMinimumSize(new java.awt.Dimension(90, 0));

        jButtonCat7.setText("Cafes");
        jButtonCat7.setMinimumSize(new java.awt.Dimension(90, 0));
        jButtonCat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCat1ActionPerformed(evt);
            }
        });

        jButtonCat5.setText("Comidas");
        jButtonCat5.setMinimumSize(new java.awt.Dimension(90, 0));
        jButtonCat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCat1ActionPerformed(evt);
            }
        });

        jButtonCat3.setText("Tapas");
        jButtonCat3.setMinimumSize(new java.awt.Dimension(90, 0));
        jButtonCat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCat1ActionPerformed(evt);
            }
        });

        jButtonCat1.setText("Alcohol");
        jButtonCat1.setMinimumSize(new java.awt.Dimension(90, 0));

        javax.swing.GroupLayout jPanelCategoriasBtnsLayout = new javax.swing.GroupLayout(jPanelCategoriasBtns);
        jPanelCategoriasBtns.setLayout(jPanelCategoriasBtnsLayout);
        jPanelCategoriasBtnsLayout.setHorizontalGroup(
            jPanelCategoriasBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriasBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCategoriasBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCategoriasBtnsLayout.createSequentialGroup()
                        .addGroup(jPanelCategoriasBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCat4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCat2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jButtonCat0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCat6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCategoriasBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCat5, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jButtonCat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCat7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelCategoriasBtnsLayout.setVerticalGroup(
            jPanelCategoriasBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriasBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanelCategoriasBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCat0, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButtonCat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCategoriasBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCat2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButtonCat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCategoriasBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCat4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jButtonCat5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCategoriasBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCat6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButtonCat7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButtonCat0.getAccessibleContext().setAccessibleDescription("");
        jButtonCat2.getAccessibleContext().setAccessibleDescription("");
        jButtonCat4.getAccessibleContext().setAccessibleDescription("");
        jButtonCat6.getAccessibleContext().setAccessibleDescription("");
        jButtonCat7.getAccessibleContext().setAccessibleDescription("");
        jButtonCat5.getAccessibleContext().setAccessibleDescription("");
        jButtonCat3.getAccessibleContext().setAccessibleDescription("");
        jButtonCat1.getAccessibleContext().setAccessibleDescription("");

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableProductos);
        jTableProductos.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanelTablaProductosLayout = new javax.swing.GroupLayout(jPanelTablaProductos);
        jPanelTablaProductos.setLayout(jPanelTablaProductosLayout);
        jPanelTablaProductosLayout.setHorizontalGroup(
            jPanelTablaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTablaProductosLayout.setVerticalGroup(
            jPanelTablaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelCenterLeftLayout = new javax.swing.GroupLayout(jPanelCenterLeft);
        jPanelCenterLeft.setLayout(jPanelCenterLeftLayout);
        jPanelCenterLeftLayout.setHorizontalGroup(
            jPanelCenterLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelCategoriasBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelCenterLeftLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanelCategoriasBtns, jPanelTablaProductos});

        jPanelCenterLeftLayout.setVerticalGroup(
            jPanelCenterLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelCategoriasBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelCenterLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanelCategoriasBtns, jPanelTablaProductos});

        jTableServidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableServidos);
        jTableServidos.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanelTablaServidosLayout = new javax.swing.GroupLayout(jPanelTablaServidos);
        jPanelTablaServidos.setLayout(jPanelTablaServidosLayout);
        jPanelTablaServidosLayout.setHorizontalGroup(
            jPanelTablaServidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaServidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTablaServidosLayout.setVerticalGroup(
            jPanelTablaServidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaServidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelCenterRightLayout = new javax.swing.GroupLayout(jPanelCenterRight);
        jPanelCenterRight.setLayout(jPanelCenterRightLayout);
        jPanelCenterRightLayout.setHorizontalGroup(
            jPanelCenterRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTablaServidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCenterRightLayout.setVerticalGroup(
            jPanelCenterRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTablaServidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButtonInicio.setText("Inicio");

        jButtonQuitar.setText("Quitar");

        jButtonAgregar.setText("Agregar");

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCenterLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQuitar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpiarCuenta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCenterRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelCenterLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanelCenterLeft, jPanelCenterRight});

        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCenterRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCenterLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCenterLayout.createSequentialGroup()
                        .addComponent(jButtonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonQuitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimpiarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelCenterLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAgregar, jButtonInicio, jButtonLimpiarCuenta, jButtonQuitar});

        jPanelCenterLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanelCenterLeft, jPanelCenterRight});

        jButtonLimpiarCuenta.getAccessibleContext().setAccessibleDescription("");
        jButtonInicio.getAccessibleContext().setAccessibleDescription("");
        jButtonQuitar.getAccessibleContext().setAccessibleDescription("");
        jButtonAgregar.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCenter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCat1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    protected javax.swing.JButton jButtonAbrir;
    protected javax.swing.JButton jButtonAgregar;
    protected javax.swing.JButton jButtonBack;
    protected javax.swing.JButton jButtonCat0;
    protected javax.swing.JButton jButtonCat1;
    protected javax.swing.JButton jButtonCat2;
    protected javax.swing.JButton jButtonCat3;
    protected javax.swing.JButton jButtonCat4;
    protected javax.swing.JButton jButtonCat5;
    protected javax.swing.JButton jButtonCat6;
    protected javax.swing.JButton jButtonCat7;
    protected javax.swing.JButton jButtonCerrarMesa;
    protected javax.swing.JButton jButtonCobrar;
    protected javax.swing.JButton jButtonInicio;
    protected javax.swing.JButton jButtonLimpiarCuenta;
    protected javax.swing.JButton jButtonQuitar;
    private javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstadoTag;
    protected javax.swing.JLabel jLabelIdOrden;
    private javax.swing.JLabel jLabelIdOrdenTag;
    protected javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelButtons;
    protected javax.swing.JPanel jPanelCategoriasBtns;
    private javax.swing.JPanel jPanelCenter;
    protected javax.swing.JPanel jPanelCenterLeft;
    private javax.swing.JPanel jPanelCenterRight;
    private javax.swing.JPanel jPanelMain;
    protected javax.swing.JPanel jPanelTablaProductos;
    private javax.swing.JPanel jPanelTablaServidos;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTable jTableProductos;
    protected javax.swing.JTable jTableServidos;
    // End of variables declaration//GEN-END:variables
}
