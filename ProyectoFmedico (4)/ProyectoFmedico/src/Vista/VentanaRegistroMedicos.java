/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 *
 * @author USER
 */
public class VentanaRegistroMedicos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistroMedicos
     */
    public VentanaRegistroMedicos() {
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

        jlblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtextARespuesta = new javax.swing.JTextArea();
        JbuttonAvanzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblTitulo.setText("Medico Ingresado Correctamente");

        JtextARespuesta.setColumns(20);
        JtextARespuesta.setRows(5);
        JtextARespuesta.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                JtextARespuestaComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(JtextARespuesta);

        JbuttonAvanzar.setText("Volver...");
        JbuttonAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonAvanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JbuttonAvanzar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addComponent(jlblTitulo))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbuttonAvanzar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextARespuestaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_JtextARespuestaComponentAdded
        
    }//GEN-LAST:event_JtextARespuestaComponentAdded

    private void JbuttonAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonAvanzarActionPerformed
        
        VentanaMenu volver = new VentanaMenu();
        volver.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_JbuttonAvanzarActionPerformed

    public JButton getJbuttonAvanzar() {
        return JbuttonAvanzar;
    }

    public JTextArea getJtextARespuesta() {
        return JtextARespuesta;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbuttonAvanzar;
    private javax.swing.JTextArea JtextARespuesta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblTitulo;
    // End of variables declaration//GEN-END:variables
}
