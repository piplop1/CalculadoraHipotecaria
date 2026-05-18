package mibanka.calculadorahipotecaria;

import java.awt.Rectangle;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;

public class PrestamoHipotecario extends javax.swing.JFrame {
    private final NumberFormat currency;
    private DefaultTableModel tableModel;
    private int totalMeses;
    
    //se define la interfaz grafica de la tabla de la calculadora de prestamos hipotecarios
    public PrestamoHipotecario() {
        currency = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-PE"));
        initComponents();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Mes");
        tableModel.addColumn("Balance total Inicial");
        tableModel.addColumn("Balance inicial");
        tableModel.addColumn("Pago normal");
        tableModel.addColumn("Intereses");
        tableModel.addColumn("Pago mensual");
        jTable2.setModel(tableModel);
        //llena el JComboBox con los años
        jComboBox1.setModel(new DefaultComboBoxModel<>(llenarAnios()));
        
        // Establecer el tamaño por defecto como el tamaño mínimo permitido
        this.setMinimumSize(this.getPreferredSize());
        
        // Bloquear la redimensión para mantener el diseño intacto y la tabla funcional
        this.setResizable(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtInteresAnual = new javax.swing.JTextField();
        txtAños = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPagoMensual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValorFinal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calculadora Hipotecaria");

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Monto a prestar:");

        jLabel3.setText("Tasa de interes anual:");

        jLabel4.setText("Periodo (años):");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel5.setText("Pago total:");

        txtPagoMensual.setEditable(false);
        txtPagoMensual.setBackground(new java.awt.Color(204, 204, 204));
        txtPagoMensual.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel7.setText("Pago mensual:");

        txtValorFinal.setEditable(false);
        txtValorFinal.setBackground(new java.awt.Color(204, 204, 204));
        txtValorFinal.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mes", "Balance total Inicial", "Balance inicial", "Pago normal", "Intereses", "Pago mensual"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAños, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInteresAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBorrar)
                                    .addComponent(btnCalcular)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPagoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(277, 277, 277))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInteresAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPagoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //se realiza un try-catch para actualizar la tabla una vez se hayan ingresado los datos
    private void actualizarTabla() {
    try {
        int capital = Integer.parseInt(txtMonto.getText());
        float tasaInteresAnual = Float.parseFloat(txtInteresAnual.getText());
        byte tiempoAnos = Byte.parseByte(txtAños.getText());

        Cuota cuota = new Cuota(capital, tasaInteresAnual, tiempoAnos);
        double pagoMensual = cuota.calcularCuota();
        double pagoTotal = cuota.calcularPagoTotal();

        // Limpiar la tabla antes de agregar nuevos datos
        while (tableModel.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
        int numeroDeCuotas = cuota.getNumeroDeCuotas();

        double balanceTotalInicial = pagoTotal; // Inicialmente es igual al pagoTotal
        double balanceInicial = capital; // Inicialmente es igual a capital
        for (int mes = 1; mes <= numeroDeCuotas; mes++) {
            double intereses = balanceInicial * cuota.getInteresMensual();
            double pagoNormal = pagoMensual - intereses;
            
                String formattedBalanceTotalInicial = currency.format(balanceTotalInicial);
                String formattedBalanceInicial = currency.format(balanceInicial);
                String formattedPagoNormal = currency.format(pagoNormal);
                String formattedIntereses = currency.format(intereses);
                String formattedPagoMensual = currency.format(pagoMensual);
            // Agregar una fila a la tabla con los datos calculados
            tableModel.addRow(new Object[] { mes, formattedBalanceTotalInicial, formattedBalanceInicial,
                formattedPagoNormal, formattedIntereses, formattedPagoMensual });

            balanceTotalInicial = balanceTotalInicial - pagoMensual;
            balanceInicial = balanceInicial - pagoNormal;
        }
        // Actualizar el valor final
        txtValorFinal.setText(currency.format(pagoTotal));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Solo números enteros sin espacios ni comas."
                + "\nPara monto a prestar ingresa números entre 1,000 y 1,000,000."
                + "\nPara tasa de interés ingresa números entre 1 y 100."
                + "\nPara años ingresa números entre 1 y 30.");
    }
    }     
    
    //se actualiza el seleccionador de años cada vez que se genere una tabla
    private void actualizarComboBox() {
        jComboBox1.setModel(new DefaultComboBoxModel<>(llenarAnios()));
    }

    

    //se borran todos los textBox y la tabla
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtMonto.setText("");
        txtInteresAnual.setText("");
        txtAños.setText("");
        txtPagoMensual.setText("");
        txtValorFinal.setText("");
        while (tableModel.getRowCount() > 0) {
           tableModel.removeRow(0);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed
    //se hace los calculos correspondientes con validaciones una vez ingresados los datos correctamente 
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtMonto.getText().trim().isEmpty() || 
            txtInteresAnual.getText().trim().isEmpty() || 
            txtAños.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos antes de calcular.");
            return;
        }

        try {
            double parsedCapital = Double.parseDouble(txtMonto.getText());
            if (parsedCapital < 1000 || parsedCapital > 1000000) {
                throw new IllegalArgumentException("El monto a prestar debe estar entre 1,000 y "
                        + "1,000,000.");
            }
            int capital = (int) parsedCapital;

            float tasaInteresAnual = Float.parseFloat(txtInteresAnual.getText());
            if (tasaInteresAnual < 1 || tasaInteresAnual > 100) {
                throw new IllegalArgumentException("La tasa de interés debe estar entre 1 y 100.");
            }

            int parsedAnos = Integer.parseInt(txtAños.getText());
            if (parsedAnos < 1 || parsedAnos > 30) {
                throw new IllegalArgumentException("Los años deben estar entre 1 y 30.");
            }
            byte tiempoAnos = (byte) parsedAnos;

            Cuota cuota = new Cuota(capital, tasaInteresAnual, tiempoAnos);
            double pagoMensual = cuota.calcularCuota();
            double pagoTotal = cuota.calcularPagoTotal();

            txtPagoMensual.setText(currency.format(pagoMensual));
            txtValorFinal.setText(currency.format(pagoTotal));
            actualizarTabla();
            actualizarComboBox();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa únicamente valores numéricos "
                    + "válidos, sin letras, espacios ni caracteres especiales.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
    }//GEN-LAST:event_btnCalcularActionPerformed
   
    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed
    //se muestra el seleccionador de años una vez ejecutado el programa con el boton calcular
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        JComboBox combo = (JComboBox) evt.getSource();
        int yearIndex = combo.getSelectedIndex();

        if (yearIndex >= 0) {
            int firstMonthRow = yearIndex * 12; // Índice de la fila (0-based) del primer mes del año

            // Obtener el JViewport del JScrollPane que contiene la tabla
            JViewport viewport = jScrollPane2.getViewport();
            Rectangle rect = jTable2.getCellRect(firstMonthRow, 0, true);

            // Para que la fila quede exactamente arriba, calculamos el límite máximo de desplazamiento
            int maxY = jTable2.getHeight() - viewport.getHeight();
            if (maxY < 0) maxY = 0;
            
            int viewY = Math.min(rect.y, maxY);

            // Desplazar la vista a la posición exacta
            viewport.setViewPosition(new java.awt.Point(0, viewY));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    //sirve para que funcione el seleccionador
    private String[] llenarAnios() {
        if (txtAños.getText().isEmpty()) {
            return new String[0]; // Si no se ha ingresado un número de años, devuelve un arreglo vacío
        }

        int tiempoAnios = Integer.parseInt(txtAños.getText());
        String[] anios = new String[tiempoAnios];
        for (int i = 1; i <= tiempoAnios; i++) {
            anios[i - 1] = "Año " + i;
        }
        // Calcular el número total de meses
        totalMeses = tiempoAnios * 12;
        return anios;
    }

    
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
            java.util.logging.Logger.getLogger(PrestamoHipotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamoHipotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamoHipotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamoHipotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestamoHipotecario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtAños;
    private javax.swing.JTextField txtInteresAnual;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtPagoMensual;
    private javax.swing.JTextField txtValorFinal;
    // End of variables declaration//GEN-END:variables
}
