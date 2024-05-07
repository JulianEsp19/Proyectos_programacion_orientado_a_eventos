package examen2;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    Lista productos = new Lista();

    public Main() {
        initComponents();
    }

    public void setProductos(Lista productos) {
        this.productos = productos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRefaccionaria = new javax.swing.JMenu();
        menuItemRegistrar = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        menuItemBusqueda = new javax.swing.JMenuItem();
        menuNosotros = new javax.swing.JMenu();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Refaccionaria");

        menuRefaccionaria.setText("Refaccionaria");

        menuItemRegistrar.setText("Registrar");
        menuItemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistrarActionPerformed(evt);
            }
        });
        menuRefaccionaria.add(menuItemRegistrar);

        jMenuBar1.add(menuRefaccionaria);

        menuReportes.setText("Reportes ");

        menuItemBusqueda.setText("Busqueda");
        menuItemBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBusquedaActionPerformed(evt);
            }
        });
        menuReportes.add(menuItemBusqueda);

        jMenuBar1.add(menuReportes);

        menuNosotros.setText("Nosotros");

        menuItemAcercaDe.setText("Acerca de ");
        menuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcercaDeActionPerformed(evt);
            }
        });
        menuNosotros.add(menuItemAcercaDe);

        jMenuBar1.add(menuNosotros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelTitulo)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBusquedaActionPerformed
        // TODO add your handling code here:
        FrmRegistrarBuscar busqueda = new FrmRegistrarBuscar(productos, this);
        busqueda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemBusquedaActionPerformed

    private void menuItemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistrarActionPerformed
        // TODO add your handling code here:
        FrmRegistrarBuscar registrar = new FrmRegistrarBuscar(productos, this);
        registrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuItemRegistrarActionPerformed

    private void menuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcercaDeActionPerformed
        // TODO add your handling code here:
        String opciones[] = {"Bujia", "Filtro", "Aceite"};
        
        int respuesta = JOptionPane.showOptionDialog(this, "Elige una de las opciones", 
                "Acerca de", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,null, opciones, opciones[0]);
        
        JOptionPane.showMessageDialog(this, "La opcion elegida fue: \n" + opciones[respuesta]);
    }//GEN-LAST:event_menuItemAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JMenuItem menuItemAcercaDe;
    private javax.swing.JMenuItem menuItemBusqueda;
    private javax.swing.JMenuItem menuItemRegistrar;
    private javax.swing.JMenu menuNosotros;
    private javax.swing.JMenu menuRefaccionaria;
    private javax.swing.JMenu menuReportes;
    // End of variables declaration//GEN-END:variables
}
