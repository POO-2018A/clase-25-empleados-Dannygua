
package fabrica;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {

    
    String empleados [][];
    DefaultTableModel tablaEmpleados;
    
    String filtro [][];
    boolean vacio = true;
    DefaultTableModel tablaFiltro;
    ArrayList<Trabajadores> list = new ArrayList <Trabajadores>();

    public Ventana() {
        initComponents();
        
        String TituloEmpleados []= new String []{
        
            "Nombre","Apellido","Cargo"
        };
                
        tablaEmpleados = new DefaultTableModel (empleados,TituloEmpleados);
        tblEmpleados.setModel(tablaEmpleados);
        
         String TituloFiltro []= new String []{
            "Nombre","Apellido","Cargo"
        };
                
        tablaFiltro = new DefaultTableModel (filtro,TituloFiltro);
        tblFiltrar.setModel(tablaFiltro);        
        
                }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        boxCargo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        Fondo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        boxFiltrarCargo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFiltrar = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        Fondo2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 220, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 220, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel3.setText("Cargo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        boxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Vendedor", "Bodega" }));
        jPanel1.add(boxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 540, 230));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ddr.jpg"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 402));

        jTabbedPane1.addTab("Registrar Empleados", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Filtro");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        boxFiltrarCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Vendedor", "Bodega", "Todos" }));
        jPanel2.add(boxFiltrarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        tblFiltrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblFiltrar);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 130, 540, 250));

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fr.jpg"))); // NOI18N
        jPanel2.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 404));

        jTabbedPane1.addTab("Filtrar Cargo", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 630, 430));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ddfr.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 762, 541));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cargo = ""+boxCargo.getSelectedItem();
        
        Trabajadores newTrabajadores = new Trabajadores (nombre,apellido,cargo);
        
        list.add(newTrabajadores);
        
        tablaEmpleados.addRow(new String []{nombre,apellido,cargo});
        
        txtNombre.setText("");
        txtApellido.setText("");
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        
        String carg = ""+boxFiltrarCargo.getSelectedItem();
        int op = boxFiltrarCargo.getSelectedIndex();
        int size =tblFiltrar.getRowCount();
        
              
        for (int i = size-1; i>=0; i--) {
            tablaFiltro.removeRow(i);
        }
        
        if (op ==3){
                for (int i = 0; i < list.size(); i++) {
                    
                        tablaFiltro.addRow(new String []{list.get(i).getNombre(),list.get(i).getApellido(),list.get(i).getCargo()});                        
                                          
                    }
                
        }else{
                for (int i = 0; i < list.size(); i++) {
                    
                    if (list.get(i).getCargo().equals(carg)){
                        tablaFiltro.addRow(new String []{list.get(i).getNombre(),list.get(i).getApellido(),list.get(i).getCargo()});                        
                    }                   
                        
                    }            
        }
                  
    }//GEN-LAST:event_btnFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JComboBox<String> boxCargo;
    private javax.swing.JComboBox<String> boxFiltrarCargo;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblFiltrar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
