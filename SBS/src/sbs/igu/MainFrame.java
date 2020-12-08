package sbs.igu;

import sbs.igu.producto.ListaProductoPanel;
import sbs.igu.producto.AddProductoJInternalFrame;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        DesktopPaneEscritorio = new javax.swing.JDesktopPane();
        EscritorioPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CerrarSesionMenuItem = new javax.swing.JMenuItem();
        SalirMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AddVentaMenuItem = new javax.swing.JMenuItem();
        AddProductoMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        AddSocioMenuItem = new javax.swing.JMenuItem();
        DeleteSocioMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        CClientesMenuItem = new javax.swing.JMenuItem();
        CProductosMenuItem = new javax.swing.JMenuItem();
        CVentasMenuItem = new javax.swing.JMenuItem();
        CSociosMenuItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        RClientesMenuItem = new javax.swing.JMenuItem();
        RSociosMenuItem = new javax.swing.JMenuItem();
        RProductosMenuItem = new javax.swing.JMenuItem();
        RVentasMenuItem = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        AdminUserMenuItem = new javax.swing.JMenuItem();
        DeleteUserMenuItem = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesktopPaneEscritorio.setBackground(new java.awt.Color(153, 153, 153));
        DesktopPaneEscritorio.setForeground(new java.awt.Color(204, 204, 204));

        EscritorioPanel.setLayout(new javax.swing.BoxLayout(EscritorioPanel, javax.swing.BoxLayout.LINE_AXIS));

        DesktopPaneEscritorio.setLayer(EscritorioPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneEscritorioLayout = new javax.swing.GroupLayout(DesktopPaneEscritorio);
        DesktopPaneEscritorio.setLayout(DesktopPaneEscritorioLayout);
        DesktopPaneEscritorioLayout.setHorizontalGroup(
            DesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        DesktopPaneEscritorioLayout.setVerticalGroup(
            DesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("Archivo");

        CerrarSesionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CerrarSesionMenuItem.setText("Cerrar Sesion");
        CerrarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(CerrarSesionMenuItem);

        SalirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SalirMenuItem.setText("Salir");
        SalirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(SalirMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimiento");

        AddVentaMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        AddVentaMenuItem.setText("Agregar Nueva Venta");
        jMenu2.add(AddVentaMenuItem);

        AddProductoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        AddProductoMenuItem.setText("Agregar Producto");
        AddProductoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductoMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(AddProductoMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Socios");

        AddSocioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        AddSocioMenuItem.setText("Agregar Nuevo Socio");
        jMenu3.add(AddSocioMenuItem);

        DeleteSocioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        DeleteSocioMenuItem.setText("Eliminar Socio");
        jMenu3.add(DeleteSocioMenuItem);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        CClientesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CClientesMenuItem.setText("Lista de Clientes");
        CClientesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CClientesMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(CClientesMenuItem);

        CProductosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CProductosMenuItem.setText("Lista de Productos");
        CProductosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CProductosMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(CProductosMenuItem);

        CVentasMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CVentasMenuItem.setText("Lista de ventas");
        jMenu4.add(CVentasMenuItem);

        CSociosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CSociosMenuItem.setText("Lista de Socios");
        CSociosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSociosMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(CSociosMenuItem);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Reportes");

        RClientesMenuItem.setText("Reporte de Cientes");
        jMenu5.add(RClientesMenuItem);

        RSociosMenuItem.setText("Reporte de Socios");
        RSociosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSociosMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(RSociosMenuItem);

        RProductosMenuItem.setText("Reporte de Productos");
        jMenu5.add(RProductosMenuItem);

        RVentasMenuItem.setText("Reporte de Ventas");
        jMenu5.add(RVentasMenuItem);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Administración");

        AdminUserMenuItem.setText("Administración de Usuario");
        jMenu6.add(AdminUserMenuItem);

        DeleteUserMenuItem.setText("Eliminar Usuario");
        jMenu6.add(DeleteUserMenuItem);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPaneEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPaneEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionMenuItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CerrarSesionMenuItemActionPerformed

    private void SalirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirMenuItemActionPerformed

    private void CSociosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSociosMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CSociosMenuItemActionPerformed

    private void RSociosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSociosMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RSociosMenuItemActionPerformed

    private void AddProductoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductoMenuItemActionPerformed
        AddProductoJInternalFrame AddProd = new  AddProductoJInternalFrame();
        DesktopPaneEscritorio.add(AddProd);
        AddProd.show();
    }//GEN-LAST:event_AddProductoMenuItemActionPerformed

    private void CProductosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CProductosMenuItemActionPerformed
        // TODO add your handling code here:
        new ChangePanel1(EscritorioPanel, new ListaProductoPanel());
    }//GEN-LAST:event_CProductosMenuItemActionPerformed

    private void CClientesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CClientesMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CClientesMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddProductoMenuItem;
    private javax.swing.JMenuItem AddSocioMenuItem;
    private javax.swing.JMenuItem AddVentaMenuItem;
    private javax.swing.JMenuItem AdminUserMenuItem;
    private javax.swing.JMenuItem CClientesMenuItem;
    private javax.swing.JMenuItem CProductosMenuItem;
    private javax.swing.JMenuItem CSociosMenuItem;
    private javax.swing.JMenuItem CVentasMenuItem;
    private javax.swing.JMenuItem CerrarSesionMenuItem;
    private javax.swing.JMenuItem DeleteSocioMenuItem;
    private javax.swing.JMenuItem DeleteUserMenuItem;
    private javax.swing.JDesktopPane DesktopPaneEscritorio;
    public static javax.swing.JPanel EscritorioPanel;
    private javax.swing.JMenuItem RClientesMenuItem;
    private javax.swing.JMenuItem RProductosMenuItem;
    private javax.swing.JMenuItem RSociosMenuItem;
    private javax.swing.JMenuItem RVentasMenuItem;
    private javax.swing.JMenuItem SalirMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

}