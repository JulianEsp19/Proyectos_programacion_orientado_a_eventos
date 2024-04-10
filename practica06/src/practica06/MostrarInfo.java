package practica06;

public class MostrarInfo extends javax.swing.JFrame {
    
    public MostrarInfo() {
        initComponents();
    }

    public void setData(SmartTv smartv){
        labelMarca.setText("Marca: " + smartv.getMarca());
        labelModelo.setText("Marca: " + smartv.getModelo());
        labelPrecio.setText("Marca: " + smartv.getPrecio());
        labelResolucion.setText("Marca: " + smartv.getResolucion());
        labelSO.setText("Marca: " + smartv.getSistemaOperativo());
        labelTamanoPantalla.setText("Marca: " + smartv.getTamanoPantalla());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelTamanoPantalla = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelSO = new javax.swing.JLabel();
        labelResolucion = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(870, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informacion Guardada");

        labelMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMarca.setText("jLabel2");

        labelModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelModelo.setText("jLabel3");

        labelTamanoPantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTamanoPantalla.setText("jLabel4");

        labelPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPrecio.setText("jLabel5");

        labelSO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSO.setText("jLabel6");

        labelResolucion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelResolucion.setText("jLabel7");

        btnVolver.setText("volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addComponent(labelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelResolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTamanoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(labelMarca)
                .addGap(18, 18, 18)
                .addComponent(labelModelo)
                .addGap(18, 18, 18)
                .addComponent(labelTamanoPantalla)
                .addGap(18, 18, 18)
                .addComponent(labelPrecio)
                .addGap(18, 18, 18)
                .addComponent(labelSO)
                .addGap(18, 18, 18)
                .addComponent(labelResolucion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelResolucion;
    private javax.swing.JLabel labelSO;
    private javax.swing.JLabel labelTamanoPantalla;
    // End of variables declaration//GEN-END:variables
}
