package examen;

public class Main extends javax.swing.JFrame {

    Automovil[] automoviles = new Automovil[15];
    int indiceAutomovil = 0;
    
    public Main() {
        initComponents();
        
        limpiar();
    }
    
    private void limpiar(){
        
        textFieldModelo.setText("");
        textFieldNumPasajeros.setText("");
        textFieldTipoGasolina.setText("");
        textFieldTipoMotor.setText("");
        
        labelMensaje.setText("");
        
        textFieldModelo.requestFocus();
    }
    
    private boolean camposVacios(){
        return (textFieldModelo.getText().isEmpty() && textFieldNumPasajeros.getText().isEmpty()
                && textFieldTipoGasolina.getText().isEmpty() && textFieldTipoMotor.getText().isEmpty());
    }
    
    private void registrar(){
        
        if(indiceAutomovil<15){
            if(!camposVacios()){
                int modeloAuto = Integer.parseInt(textFieldModelo.getText());
                int capacidadPasajeros = Integer.parseInt(textFieldNumPasajeros.getText());
                String tipoMotor = textFieldTipoMotor.getText();
                String tipoGas = textFieldTipoGasolina.getText();

                automoviles[indiceAutomovil] = new Automovil(modeloAuto, capacidadPasajeros, tipoMotor, tipoGas);

                indiceAutomovil++;
                limpiar();
            }else labelMensaje.setText("No se ha podido guardar, por favor llene todos los campos");
        }else labelMensaje.setText("Se ha sobrepasado el limite del arreglo");
    }
    
    private int buscar(int modeloBusqueda){
        for(int i=0; i<indiceAutomovil; i++){
            if(automoviles[i].getModeloAuto() == modeloBusqueda) return i;
        }
        return -1;
    }
    
    private void busquedaAutomovil(){
        if(indiceAutomovil>0){
            if(!textFieldModelo.getText().isEmpty()){
                int modelo = Integer.parseInt(textFieldModelo.getText());
                int busqueda = buscar(modelo);
                if(busqueda>=0){
                    textFieldNumPasajeros.setText(String.valueOf(automoviles[busqueda].getCapacidadPasajeros()));
                    textFieldTipoGasolina.setText(automoviles[busqueda].getTipoGas());
                    textFieldTipoMotor.setText(automoviles[busqueda].getTipoMotor());
                }else labelMensaje.setText("No se ha encontrado el modelo que esta buscando");
            }else labelMensaje.setText("No se ha ingresado ningun modelo a buscar");
        }else labelMensaje.setText("No hay automoviles para buscar dentro del arreglo");
    }
    
    private void primerRegistro(){
        if(indiceAutomovil>0){
            textFieldModelo.setText(String.valueOf(automoviles[0].getModeloAuto()));
            textFieldNumPasajeros.setText(String.valueOf(automoviles[0].getCapacidadPasajeros()));
            textFieldTipoGasolina.setText(automoviles[0].getTipoGas());
            textFieldTipoMotor.setText(automoviles[0].getTipoMotor());
        }else labelMensaje.setText("No hay un automovil como primer registro");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldModelo = new javax.swing.JTextField();
        textFieldNumPasajeros = new javax.swing.JTextField();
        textFieldTipoMotor = new javax.swing.JTextField();
        textFieldTipoGasolina = new javax.swing.JTextField();
        labelMensaje = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modelo auto:");

        jLabel2.setText("Numero de pasajeros:");

        jLabel3.setText("Tipo de motor:");

        jLabel4.setText("Tipo de gasolina");

        textFieldModelo.setText("jTextField1");
        textFieldModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldModeloKeyTyped(evt);
            }
        });

        textFieldNumPasajeros.setText("jTextField2");
        textFieldNumPasajeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNumPasajerosKeyTyped(evt);
            }
        });

        textFieldTipoMotor.setText("jTextField3");

        textFieldTipoGasolina.setText("jTextField4");

        labelMensaje.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMensaje.setText("jLabel5");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Primer registro");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addComponent(textFieldNumPasajeros)
                            .addComponent(textFieldTipoMotor)
                            .addComponent(textFieldTipoGasolina))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(71, 71, 71)
                .addComponent(jButton2)
                .addGap(93, 93, 93)
                .addComponent(jButton3)
                .addGap(115, 115, 115)
                .addComponent(jButton4)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNumPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldTipoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldTipoGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(labelMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        primerRegistro();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        registrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textFieldModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldModeloKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isAlphabetic(caracter)) evt.consume();
    }//GEN-LAST:event_textFieldModeloKeyTyped

    private void textFieldNumPasajerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNumPasajerosKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isAlphabetic(caracter)) evt.consume();
    }//GEN-LAST:event_textFieldNumPasajerosKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        busquedaAutomovil();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JTextField textFieldModelo;
    private javax.swing.JTextField textFieldNumPasajeros;
    private javax.swing.JTextField textFieldTipoGasolina;
    private javax.swing.JTextField textFieldTipoMotor;
    // End of variables declaration//GEN-END:variables
}