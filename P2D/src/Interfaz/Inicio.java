package Interfaz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
           this.setLocationRelativeTo(null);
           setTitle("ANALIZADOR");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonSalir = new javax.swing.JButton();
        jButtonInstrucciones = new javax.swing.JButton();
        ButtonAnalizador = new javax.swing.JButton();
        lblBienvenidos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSalir.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 36)); // NOI18N
        ButtonSalir.setForeground(new java.awt.Color(0, 255, 0));
        ButtonSalir.setText("3. SALIR DEL ANALIZADOR");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSalir);
        ButtonSalir.setBounds(170, 400, 760, 90);

        jButtonInstrucciones.setBackground(new java.awt.Color(255, 255, 255));
        jButtonInstrucciones.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 36)); // NOI18N
        jButtonInstrucciones.setForeground(new java.awt.Color(51, 255, 51));
        jButtonInstrucciones.setText("2. INSTRUCCIONES");
        getContentPane().add(jButtonInstrucciones);
        jButtonInstrucciones.setBounds(240, 270, 580, 90);

        ButtonAnalizador.setBackground(new java.awt.Color(255, 255, 255));
        ButtonAnalizador.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 48)); // NOI18N
        ButtonAnalizador.setForeground(new java.awt.Color(51, 255, 0));
        ButtonAnalizador.setText("1. ANALIZADOR");
        ButtonAnalizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnalizadorActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAnalizador);
        ButtonAnalizador.setBounds(200, 120, 640, 110);

        lblBienvenidos.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        lblBienvenidos.setForeground(new java.awt.Color(0, 255, 0));
        lblBienvenidos.setText("! Analizador Léxico FEROVA !");
        lblBienvenidos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblBienvenidos);
        lblBienvenidos.setBounds(410, 710, 1030, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinesseGrande.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 1270, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonAnalizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnalizadorActionPerformed
        // TODO add your handling code here:
        

        Analizador entrada1 = new Analizador();
        entrada1.show();
       entrada1.setSize(1190, 960);
        
        dispose();
    }//GEN-LAST:event_ButtonAnalizadorActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAnalizador;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JButton jButtonInstrucciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBienvenidos;
    // End of variables declaration//GEN-END:variables
}
