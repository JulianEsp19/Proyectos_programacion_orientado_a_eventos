package practica2;

public class frmComputadora extends javax.swing.JFrame {

    
    //variables
    int tam=10;
    int contC = 0;
    //array que guarda las computadoras del programa
    Computadora[] aCompus = new Computadora[tam];
    /**
     * Creates new form frmComputadora
     */
    public frmComputadora() {
        initComponents();
        //for para inicializar las computadoras con sus valores por defecto
        for (int i = 0; i < tam; i++) {
            aCompus[i] = new Computadora();
        }
        
        limpiarCampos();
    }
    
    public void limpiarCampos(){
        jtfMarca.setText("");
        jtfModelo.setText("");
        jtfRam.setText("");
        jtfSerie.setText("");
        jlMensaje.setText("Bienvenido");
        
        jtfSerie.requestFocus();
    }
    
    //boolean para verificar que los campos de los textField no esten vacios
    public boolean isEmptyTextFields(){
        if(jtfMarca.getText().isEmpty() && jtfModelo.getText().isEmpty() && 
            jtfRam.getText().isEmpty() && jtfSerie.getText().isEmpty()) 
            return true;
        return false;           
    }
    
    //void para guardar los campos de los textField dentro del array de computadoras
    public void guardarComputadora(){
        int serie = Integer.parseInt(jtfSerie.getText());
        String marca = jtfMarca.getText();
        String modelo = jtfModelo.getText();
        int ram = Integer.parseInt(jtfRam.getText());
        
        aCompus[contC].setSerie(serie);
        aCompus[contC].setMarca(marca);
        aCompus[contC].setModelo(modelo);
        aCompus[contC].setRam(ram);
        
        contC++;
    }

    public int buscarComputadora(){
        int serie = Integer.parseInt(jtfSerie.getText());
        for (int i = 0; i < contC; i++) {
            if(serie == aCompus[i].getSerie()){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfSerie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jtfModelo = new javax.swing.JTextField();
        jtfRam = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jlMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Formulario de Computadoras ");

        jLabel2.setText("Serie");

        jtfSerie.setText("jTextField1");
        jtfSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSerieActionPerformed(evt);
            }
        });
        jtfSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSerieKeyTyped(evt);
            }
        });

        jLabel3.setText("Marca");

        jLabel4.setText("Modelo");

        jLabel5.setText("Ram");

        jtfMarca.setText("jTextField2");

        jtfModelo.setText("jTextField3");

        jtfRam.setText("jTextField4");
        jtfRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfRamKeyTyped(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                                    .addComponent(jtfMarca)
                                    .addComponent(jtfModelo)
                                    .addComponent(jtfRam)))
                            .addComponent(jlMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addGap(52, 52, 52)
                .addComponent(jButton3)
                .addGap(90, 90, 90)
                .addComponent(jButton2)
                .addGap(52, 52, 52)
                .addComponent(jButton4)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSerieActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        if(isEmptyTextFields()) 
            jlMensaje.setText("No se han rellenado los datos en los apartados");
        else if(contC < tam){
            guardarComputadora();
            limpiarCampos();
            jlMensaje.setText("La computadora se ha registrado con exito");
        }else{
            jlMensaje.setText("La memoria esta llena, ya no se pueden "
                    + "incluir mas computadoras");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!jtfSerie.getText().equals("")){
            int indiceBusqueda = buscarComputadora();
        
            if(indiceBusqueda != -1){
                jlMensaje.setText("la Computadora se ha encontrado con exito");

                jtfMarca.setText(aCompus[indiceBusqueda].getMarca());
                jtfModelo.setText(aCompus[indiceBusqueda].getModelo());
                jtfRam.setText(String.valueOf(aCompus[indiceBusqueda].getRam()));
            }else{
                jlMensaje.setText("no se ha encontrado la computadora");
            }
        }else{
            jlMensaje.setText("ingrese una serie para buscar");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtfSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSerieKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLetter(caracter)){
            evt.consume();
        }
    }//GEN-LAST:event_jtfSerieKeyTyped

    private void jtfRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRamKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLetter(caracter)){
            evt.consume();
        }
    }//GEN-LAST:event_jtfRamKeyTyped

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
            java.util.logging.Logger.getLogger(frmComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmComputadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfRam;
    private javax.swing.JTextField jtfSerie;
    // End of variables declaration//GEN-END:variables
}