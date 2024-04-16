package practica08;

import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;

public class Cotizador extends javax.swing.JFrame {

    //Variable de la lista enlazada de las cotizaciones
    Cotizaciones cotizaciones = new Cotizaciones();
    //Variable donde se guardaran todos los datos para el jListCotizaciones
    DefaultListModel cotizacionesLista = new DefaultListModel();
    /**
     * Creates new form cotizador
     */
    public Cotizador() {
        initComponents();
        limpiar();
        jListCotizaciones.setModel(cotizacionesLista);
    }
    
    /*Funcion para limpiar los campos de la interfaz grafica donde los radioButtons
    pasan a uno por defecto*/
    public void limpiar(){
        
        textFieldCantidadDias.setText("");
        textFieldNombreCotizacion.setText("");
        
        labelMensaje.setText("");
        
        controlGrupo1RadioButtons(null);
        controlGrupo2RadioButtons(null);
        controlGrupo3RadioButtons(null);
        
    }
    
    public void controlGrupo1RadioButtons(java.awt.event.ActionEvent evt){
        radioGp1Kioto.setSelected(false);
        radioGp1Machu.setSelected(false);
        radioGp1Maldivas.setSelected(false);
        radioGp1Paris.setSelected(false);
        radioGp1Santorini.setSelected(false);
        
        if(evt == null) radioGp1Paris.setSelected(true);
        else if(evt.getSource().equals(radioGp1Kioto)) radioGp1Kioto.setSelected(true);
        else if(evt.getSource().equals(radioGp1Machu)) radioGp1Machu.setSelected(true);
        else if(evt.getSource().equals(radioGp1Maldivas)) radioGp1Maldivas.setSelected(true);
        else if(evt.getSource().equals(radioGp1Paris)) radioGp1Paris.setSelected(true);
        else if(evt.getSource().equals(radioGp1Santorini)) radioGp1Santorini.setSelected(true);
    }
    
    public String recuperarResultadoGrupo1RadioButtons(){
        if(radioGp1Kioto.isSelected()) return "Kioto, Japon";
        else if(radioGp1Machu.isSelected()) return "Machu Picchu, Peru";
        else if(radioGp1Maldivas.isSelected()) return "Maldivas, Republica de Maldivas";
        else if(radioGp1Santorini.isSelected()) return "Santorini, Grecia";
        return "Paris, Francia";
    }
    
    public void controlGrupo2RadioButtons(java.awt.event.ActionEvent evt){
        radioGp2Sencilla.setSelected(false);
        radioGp2Doble.setSelected(false);
        radioGp2Suite.setSelected(false);
        
        if(evt == null) radioGp2Sencilla.setSelected(true);
        else if(evt.getSource().equals(radioGp2Sencilla)) radioGp2Sencilla.setSelected(true);
        else if(evt.getSource().equals(radioGp2Doble)) radioGp2Doble.setSelected(true);
        else if(evt.getSource().equals(radioGp2Suite)) radioGp2Suite.setSelected(true);
    }
    
    public String recuperarResultadoGrupo2RadioButtons(){
        if(radioGp2Doble.isSelected()) return "Doble";
        else if(radioGp2Suite.isSelected()) return "Suite";
        return "Sencilla";
    }
    
    public void controlGrupo3RadioButtons(java.awt.event.ActionEvent evt){
        radioGp3Mensualidades.setSelected(false);
        radioGp3MontoUnico.setSelected(false);
        
        if(evt == null) radioGp3MontoUnico.setSelected(true);
        else if(evt.getSource().equals(radioGp3Mensualidades)) radioGp3Mensualidades.setSelected(true);
        else if(evt.getSource().equals(radioGp3MontoUnico)) radioGp3MontoUnico.setSelected(true);
    }
    
    public String recuperarResultadoGrupo3RadioButtons(){
        if(radioGp3Mensualidades.isSelected()) return "Mensualidades";
        return "Monto Unico";
    }
    
    public boolean valoresAgregados(){
        return textFieldCantidadDias.getText().isEmpty() && textFieldNombreCotizacion.getText().isEmpty();
    }
    
    public boolean nombreCotizacionExistente(String nombre){
        String resultado = cotizaciones.buscarCotizacion(nombre);
        return resultado.equals("No encontrado");
    }
    
    public void guardar(){
        if(valoresAgregados()) labelMensaje.setText("No se han rellenado todos los campos");
        else{
            if(!nombreCotizacionExistente(textFieldNombreCotizacion.getText())) labelMensaje.setText("El nombre de la cotizacion ya existe");
            else{
                String nombre = textFieldNombreCotizacion.getText();
                int cantidadDias = Integer.parseInt(textFieldCantidadDias.getText());
                String destinoTuristico = recuperarResultadoGrupo1RadioButtons();
                String tipoHabitacion = recuperarResultadoGrupo2RadioButtons();
                String tipoPago = recuperarResultadoGrupo3RadioButtons();
                
                cotizaciones.anadirCotizacion(nombre, cantidadDias, destinoTuristico, tipoHabitacion, tipoPago);
                cotizacionesLista.addElement(nombre);
                jListCotizaciones.repaint();
            }
        }
    }
    
    public void consultar(){
        int indice = jListCotizaciones.getSelectedIndex();
        String valor = String.valueOf(cotizacionesLista.get(indice));
        String datos = cotizaciones.buscarCotizacion(valor);
        
        VisualizarCotizacion visualizar = new VisualizarCotizacion();
        visualizar.setDatos(datos);
        visualizar.setVisible(true);
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
        radioGp1Paris = new javax.swing.JRadioButton();
        radioGp1Santorini = new javax.swing.JRadioButton();
        radioGp1Machu = new javax.swing.JRadioButton();
        radioGp1Maldivas = new javax.swing.JRadioButton();
        radioGp1Kioto = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        textFieldCantidadDias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radioGp2Sencilla = new javax.swing.JRadioButton();
        radioGp2Doble = new javax.swing.JRadioButton();
        radioGp2Suite = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        radioGp3MontoUnico = new javax.swing.JRadioButton();
        radioGp3Mensualidades = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        textFieldNombreCotizacion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCotizaciones = new javax.swing.JList<>();
        btnLimpiar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        labelMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cotizador");

        radioGp1Paris.setText("París, Francia $50,000");
        radioGp1Paris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp1ParisActionPerformed(evt);
            }
        });

        radioGp1Santorini.setText("Santorini, Grecia $60,000");
        radioGp1Santorini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp1SantoriniActionPerformed(evt);
            }
        });

        radioGp1Machu.setText("Machu Picchu, Perú $20,000");
        radioGp1Machu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp1MachuActionPerformed(evt);
            }
        });

        radioGp1Maldivas.setText("Maldivas, República de Maldivas $55,000");
        radioGp1Maldivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp1MaldivasActionPerformed(evt);
            }
        });

        radioGp1Kioto.setText("Kioto, Japón $40,000");
        radioGp1Kioto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp1KiotoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Cantidad de dias:");

        textFieldCantidadDias.setText("jTextField1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Destino turistico:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tipo de habitacion:");

        radioGp2Sencilla.setText("Sencilla $1,200");
        radioGp2Sencilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp2SencillaActionPerformed(evt);
            }
        });

        radioGp2Doble.setText("Doble $2100");
        radioGp2Doble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp2DobleActionPerformed(evt);
            }
        });

        radioGp2Suite.setText("Suite $3500");
        radioGp2Suite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp2SuiteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de pago: ");

        radioGp3MontoUnico.setText("Monto unico");
        radioGp3MontoUnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp3MontoUnicoActionPerformed(evt);
            }
        });

        radioGp3Mensualidades.setText("Mensualidades");
        radioGp3Mensualidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGp3MensualidadesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Nombre cotizacion:");

        textFieldNombreCotizacion.setText("jTextField2");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListCotizaciones);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        labelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMensaje.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioGp1Kioto)
                                .addGap(16, 16, 16)
                                .addComponent(radioGp1Maldivas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioGp1Paris)
                                .addGap(18, 18, 18)
                                .addComponent(radioGp1Machu)
                                .addGap(18, 18, 18)
                                .addComponent(radioGp1Santorini))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioGp2Sencilla)
                                .addGap(18, 18, 18)
                                .addComponent(radioGp2Doble, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioGp2Suite, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioGp3MontoUnico, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioGp3Mensualidades, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldNombreCotizacion))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textFieldCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textFieldNombreCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioGp1Paris)
                    .addComponent(radioGp1Machu)
                    .addComponent(radioGp1Santorini))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioGp1Kioto)
                    .addComponent(radioGp1Maldivas))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioGp2Sencilla)
                    .addComponent(radioGp2Doble)
                    .addComponent(radioGp2Suite))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioGp3MontoUnico)
                    .addComponent(radioGp3Mensualidades))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(labelMensaje)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioGp1KiotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp1KiotoActionPerformed
        // TODO add your handling code here:
        controlGrupo1RadioButtons(evt);
    }//GEN-LAST:event_radioGp1KiotoActionPerformed

    private void radioGp2SencillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp2SencillaActionPerformed
        // TODO add your handling code here:
        controlGrupo2RadioButtons(evt);
    }//GEN-LAST:event_radioGp2SencillaActionPerformed

    private void radioGp1ParisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp1ParisActionPerformed
        // TODO add your handling code here:
        controlGrupo1RadioButtons(evt);
    }//GEN-LAST:event_radioGp1ParisActionPerformed

    private void radioGp1MachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp1MachuActionPerformed
        // TODO add your handling code here:
        controlGrupo1RadioButtons(evt);
    }//GEN-LAST:event_radioGp1MachuActionPerformed

    private void radioGp1SantoriniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp1SantoriniActionPerformed
        // TODO add your handling code here:
        controlGrupo1RadioButtons(evt);
    }//GEN-LAST:event_radioGp1SantoriniActionPerformed

    private void radioGp1MaldivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp1MaldivasActionPerformed
        // TODO add your handling code here:
        controlGrupo1RadioButtons(evt);
    }//GEN-LAST:event_radioGp1MaldivasActionPerformed

    private void radioGp2DobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp2DobleActionPerformed
        // TODO add your handling code here:
        controlGrupo2RadioButtons(evt);
    }//GEN-LAST:event_radioGp2DobleActionPerformed

    private void radioGp2SuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp2SuiteActionPerformed
        // TODO add your handling code here:
        controlGrupo2RadioButtons(evt);
    }//GEN-LAST:event_radioGp2SuiteActionPerformed

    private void radioGp3MontoUnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp3MontoUnicoActionPerformed
        // TODO add your handling code here:
        controlGrupo3RadioButtons(evt);
    }//GEN-LAST:event_radioGp3MontoUnicoActionPerformed

    private void radioGp3MensualidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGp3MensualidadesActionPerformed
        // TODO add your handling code here:
        controlGrupo3RadioButtons(evt);
    }//GEN-LAST:event_radioGp3MensualidadesActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListCotizaciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JRadioButton radioGp1Kioto;
    private javax.swing.JRadioButton radioGp1Machu;
    private javax.swing.JRadioButton radioGp1Maldivas;
    private javax.swing.JRadioButton radioGp1Paris;
    private javax.swing.JRadioButton radioGp1Santorini;
    private javax.swing.JRadioButton radioGp2Doble;
    private javax.swing.JRadioButton radioGp2Sencilla;
    private javax.swing.JRadioButton radioGp2Suite;
    private javax.swing.JRadioButton radioGp3Mensualidades;
    private javax.swing.JRadioButton radioGp3MontoUnico;
    private javax.swing.JTextField textFieldCantidadDias;
    private javax.swing.JTextField textFieldNombreCotizacion;
    // End of variables declaration//GEN-END:variables
}
