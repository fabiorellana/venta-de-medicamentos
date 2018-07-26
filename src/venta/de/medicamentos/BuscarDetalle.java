/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package venta.de.medicamentos;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Administrador
 */
public class BuscarDetalle extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarDetalle
     */
    public BuscarDetalle() {
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
        jLabel1 = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setClosable(true);
        setTitle("BuscarDetalle Venta");

        dp.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Detalle Venta");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTabla);

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpLayout.createSequentialGroup()
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(dpLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        dp.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(tfBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(btBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        
        String b = tfBuscar.getText();
        String sql = "SELECT * FROM detalle_venta WHERE Numero_de_venta ='"+ b +"'";
        
        try{
            //Establecer el modelo al jTable
            DefaultTableModel modelo = new DefaultTableModel();
            this.jtTabla.setModel(modelo);
            
            //Conectar la base de datos
            String ser = "jdbc:mysql://localhost/medicamentos";
            String usr = "root";
            String pwd = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            //Mostrar los datos de la tabla ventas
            Connection con = DriverManager.getConnection(ser,usr,pwd);
            
            //Mostrar la conexion de el servidor 
            Statement st = con.createStatement();
            
            //Verificar un objeto para que muestre
            ResultSet rs = st.executeQuery(sql);
            
            //Obtener la informacion de la columnas que han sido buscadas
            ResultSetMetaData rsmd = rs.getMetaData();
            
            //Rescatar la cantidad de columnas
            int cantColumnas = rsmd.getColumnCount();
            int i;
            
            //Establecer como cabezeras el nombre de las columnas
            for(i = 1; i <= cantColumnas; i++){
              modelo.addColumn(rsmd.getColumnLabel(i));  
            }//fin for
            
            //Creando las filas para el JTable
            while(rs.next()){
               Object[] fila = new Object[cantColumnas];
               
               for(i = 0; i < cantColumnas; i++){
                 fila[i] = rs.getObject(i+1);  
               }//fin for
               modelo.addRow(fila);
            }//fin while
            rs.close();
            con.close();
            
        }catch(Exception ex){
            //Verificar el error en la consola
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        
        
    }//GEN-LAST:event_btBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
