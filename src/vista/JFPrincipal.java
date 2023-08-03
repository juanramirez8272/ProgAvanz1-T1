// eLABORADO POR KAREN LORENA MOLANO ARIAS CC 1002543562 Y JUAN JOSE RAMIREZ GUTIERREZ CC 1002543562
// LENGUAJE DE PROGRAMACION AVANZADA 1 - 2023-2 UNIREMINGTON

package vista;

import bean.Vehiculo;
import static java.lang.Double.parseDouble;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFPrincipal extends javax.swing.JFrame {

    static Vehiculo veh = null;
    DefaultTableModel modelPedido;

    public JFPrincipal() {
        initComponents();
        modelPedido = (DefaultTableModel) tblVehiAgre.getModel();
        this.setLocationRelativeTo(null);
        this.setTitle("SISTEMA DE ALQUILER DE VEHÍCULOS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipalBase = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblNombreVehi = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnBuscarVehi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jdcFechIni = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jdcFechFin = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiAgre = new javax.swing.JTable();
        lblNombreEmp = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtMontoFinal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnQuitarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 600));

        jpPrincipalBase.setBackground(new java.awt.Color(204, 204, 204));
        jpPrincipalBase.setMinimumSize(new java.awt.Dimension(1200, 600));
        jpPrincipalBase.setPreferredSize(new java.awt.Dimension(1200, 600));
        jpPrincipalBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(189, 189, 189));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("VEHÍCULO:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 30));

        lblNombreVehi.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreVehi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombreVehi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreVehi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNombreVehi.setOpaque(true);
        jPanel2.add(lblNombreVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 200, 30));

        btnAgregar.setBackground(new java.awt.Color(117, 117, 117));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR A LA COTIZACION");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 280, 40));

        btnBuscarVehi.setBackground(new java.awt.Color(117, 117, 117));
        btnBuscarVehi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarVehi.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVehi.setText("SELECCIONAR VEHÍCULO A RENTAR");
        btnBuscarVehi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscarVehi.setBorderPainted(false);
        btnBuscarVehi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 280, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("FECHA INICIO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 30));

        jdcFechIni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdcFechIni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jdcFechIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("FECHA FINAL:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 30));

        jdcFechFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdcFechFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jdcFechFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jpPrincipalBase.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 730, 210));
        jPanel2.getAccessibleContext().setAccessibleName("");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblVehiAgre.setBackground(new java.awt.Color(189, 189, 189));
        tblVehiAgre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblVehiAgre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIPO DE VEHICULO", "FECH. INICIO", "FECH. FINAL", "TOT.DÍAS", "COSTO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehiAgre);

        jpPrincipalBase.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 920, 240));

        lblNombreEmp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jpPrincipalBase.add(lblNombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 350, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ALQUILER DE VEHÍCULOS");
        jLabel14.setToolTipText("");
        jpPrincipalBase.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 700, 80));

        jPanel1.setBackground(new java.awt.Color(189, 189, 189));

        jLabel1.setText("1) Hacer click en el boton \"SELECCIONAR TIPO DE VEHÍCULO\".");

        jLabel3.setText("2) Hacer click en el boton \"LISTAR\" para ver los vehÍculos disponibles.");

        jLabel5.setText("3) Hacer doble click en el vehículo a agregar.");

        jLabel6.setText("4) Seleccionar las fechas para la cotización.");

        jLabel7.setText("5) Hacer clic en \"AGREGAR A LA COTIZACION\".");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("INSTRUCCIONES DE USO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel8)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jpPrincipalBase.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 410, 210));

        jPanel3.setBackground(new java.awt.Color(189, 189, 189));

        txtMontoFinal.setEditable(false);
        txtMontoFinal.setBackground(new java.awt.Color(117, 117, 117));
        txtMontoFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMontoFinal.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoFinal.setText("0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("COTIZACION TOTAL:");

        btnQuitarPedido.setBackground(new java.awt.Color(117, 117, 117));
        btnQuitarPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuitarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarPedido.setText("QUITAR PEDIDO");
        btnQuitarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnQuitarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMontoFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnQuitarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(btnQuitarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpPrincipalBase.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, 220, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPrincipalBase, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPrincipalBase, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarPedido();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiActionPerformed
        JFVehiculo jfv = new JFVehiculo();
        jfv.setVisible(true);
        //JFVehiculo.jtpCRUDVehi.setSelectedIndex(1);
    }//GEN-LAST:event_btnBuscarVehiActionPerformed

    private void btnQuitarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarPedidoActionPerformed
        quitarPedido();
    }//GEN-LAST:event_btnQuitarPedidoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarVehi;
    private javax.swing.JButton btnQuitarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jdcFechFin;
    private com.toedter.calendar.JDateChooser jdcFechIni;
    public static javax.swing.JPanel jpPrincipalBase;
    public static javax.swing.JLabel lblNombreEmp;
    public static javax.swing.JLabel lblNombreVehi;
    private javax.swing.JTable tblVehiAgre;
    private javax.swing.JTextField txtMontoFinal;
    // End of variables declaration//GEN-END:variables

    private String vehiculo() {
        int count = modelPedido.getRowCount();
        String vehiculos = "";
        if (count >= 1) {
            for (int i = 0; i < count; i++) {
                vehiculos += modelPedido.getValueAt(i, 0) + " "
                        + modelPedido.getValueAt(i, 1) + "/";
            }
        }
        return vehiculos;
    }

    private String fechaInicio() {
        return fechaString(fechIni());
    }

    private String fechaFinal() {
        return fechaString(fechFin());
    }

    private double monto() {
        return Double.parseDouble(txtMontoFinal.getText());
    }

    private Date fechIni() {
        return jdcFechIni.getDate();
    }

    private Date fechFin() {
        return jdcFechFin.getDate();
    }

    public static String fechaString(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
        return sdf.format(fecha);
    }

    private void agregarPedido() {
        boolean validar = lblNombreVehi.getText().equals("");
        if (!validar) {
            if (fechFin() != null && fechIni() != null) {
                int resta = 0;
                resta = fechIni().getDate() - fechFin().getDate();
                if (resta < 0) {
                    Object ar[] = new Object[6];
                    ar[0] = veh.getTipov();
                    ar[1] = fechaInicio();
                    ar[2] = fechaFinal();
                    long dias = (fechFin().getTime() - fechIni().getTime())/ 1000 / 60 / 60 / 24;
                    
                    ar[3] = String.valueOf(dias);
                    double precio = 0;
                    if (lblNombreVehi.getText().equals("Coche")) {
                        precio = veh.getCosto() * dias + 1.5 * dias;
                    } else if (lblNombreVehi.getText().equals("Microbuses")) {
                        precio = veh.getCosto() * dias + 1.5 * dias + 2;
                    } else if (lblNombreVehi.getText().equals("Furgonetas de carga")) {
                        double peso = parseDouble(JOptionPane.showInputDialog(null, "Ingrese peso en toneladas"));
                        precio = veh.getCosto() * dias + 20 * peso;
                    } else if (lblNombreVehi.getText().equals("Camiones")) {
                        double peso = parseDouble(JOptionPane.showInputDialog(null, "Ingrese peso en toneladas"));
                        precio = veh.getCosto() * dias + 20 * peso + 40;
                    }
                    double importe = precio;
                    ar[4] = String.format("%.2f", importe).replace(',', '.');
                    modelPedido.addRow(ar);
                    colocarMonto();
                } else {
                    JOptionPane.showMessageDialog(null, "Los dias de alquiler deben ser mayor a 0..");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Elija la fecha de alquiler.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Relleno los campos restantes.");
        }
    }

    private void quitarPedido() {
        int fila = tblVehiAgre.getSelectedRow();
        if (fila >= 0) {
            int preg = JOptionPane.showConfirmDialog(null, "Seguro que quieres remover esta fila");
            if (preg == 0) {
                this.modelPedido.removeRow(fila);
                txtMontoFinal.requestFocus();
                colocarMonto();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila de la Tabla para eliminar");
        }
    }

    private void colocarMonto() {
        double monto = 0;
        int filas = tblVehiAgre.getRowCount();
        for (int i = 0; i < filas; i++) {
            monto += Double.parseDouble((String) modelPedido.getValueAt(i, 4));
        }
        txtMontoFinal.setText(String.valueOf(monto));
    }

    private void limpiarPrincipal() {
        lblNombreVehi.setText("");
        txtMontoFinal.setText("0");
        jdcFechFin.setDate(StringADate(""));
        jdcFechIni.setDate(StringADate(""));
        int filas = tblVehiAgre.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelPedido.removeRow(0);
        }
    }

    public java.util.Date StringADate(String fecha) {
        SimpleDateFormat formato_del_texto = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaE = null;
        try {
            fechaE = formato_del_texto.parse(fecha);
            return fechaE;
        } catch (ParseException ex) {
            return null;
        }
    }
}
