/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package venta.de.medicamentos;

/**
 *
 * @author Administrador
 */
public class INTCalculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form INTCalculo
     */
    public INTCalculo() {
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

        dp = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btSocio1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btSocio2 = new javax.swing.JButton();
        btSocio3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfDescuento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Calculo");

        dp.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setText("Tipo");

        jLabel5.setText("15%");

        btSocio1.setText("Socio 1");
        btSocio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSocio1ActionPerformed(evt);
            }
        });

        jLabel4.setText("10%");

        btSocio2.setText("Socio 2");
        btSocio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSocio2ActionPerformed(evt);
            }
        });

        btSocio3.setText("Socio 3");
        btSocio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSocio3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Total");

        jLabel3.setText("5%");

        jLabel2.setText("Total con descuento");

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpLayout.createSequentialGroup()
                .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpLayout.createSequentialGroup()
                        .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dpLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1))
                            .addGroup(dpLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)))
                .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfDescuento)
                    .addGroup(dpLayout.createSequentialGroup()
                        .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSocio2)
                            .addComponent(btSocio1)
                            .addComponent(btSocio3))))
                .addGap(43, 43, 43))
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpLayout.createSequentialGroup()
                .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dpLayout.createSequentialGroup()
                                .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btSocio1)
                                    .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addComponent(btSocio2))
                            .addGroup(dpLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4))))
                    .addGroup(dpLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSocio3)
                            .addComponent(jLabel5))))
                .addGap(36, 36, 36)
                .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        dp.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(btSocio1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(btSocio2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(btSocio3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(tfDescuento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(tfTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSocio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSocio1ActionPerformed
        // TODO add your handling code here:
        int total = 0;
        int por = 0;
        int des = 0;
        
        //Rescatar los valores
        total = Integer.parseInt(tfTotal.getText());
        
        //Calcular el descuento del 5%
        por = 5 * total / 100;
        
        des = total - por;
        
        //Mostrar el resultado
        tfDescuento.setText(""+ des);
    }//GEN-LAST:event_btSocio1ActionPerformed

    private void btSocio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSocio2ActionPerformed
        // TODO add your handling code here:
        int total = 0;
        int por = 0;
        int des = 0;
        
        //Rescatar los valores
        total = Integer.parseInt(tfTotal.getText());
        
        //Calcular el descuento del 5%
        por = 10 * total / 100;
        
        des = total - por;
        
        //Mostrar el resultado
        tfDescuento.setText(""+ des);
    }//GEN-LAST:event_btSocio2ActionPerformed

    private void btSocio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSocio3ActionPerformed
        // TODO add your handling code here:
        int total = 0;
        int por = 0;
        int des = 0;
        
        //Rescatar los valores
        total = Integer.parseInt(tfTotal.getText());
        
        //Calcular el descuento del 5%
        por = 15 * total / 100;
        
        des = total - por;
        
        //Mostrar el resultado
        tfDescuento.setText(""+ des);
    }//GEN-LAST:event_btSocio3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSocio1;
    private javax.swing.JButton btSocio2;
    private javax.swing.JButton btSocio3;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfDescuento;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
