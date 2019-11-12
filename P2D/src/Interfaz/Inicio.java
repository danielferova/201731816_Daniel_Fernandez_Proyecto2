package Interfaz;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

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
        ButtonAnalizador = new javax.swing.JButton();
        lblBienvenidos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MI_Ayuda = new javax.swing.JMenu();
        MI_mu = new javax.swing.JMenuItem();
        MI_mt = new javax.swing.JMenuItem();
        MI_ac = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSalir.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 36)); // NOI18N
        ButtonSalir.setForeground(new java.awt.Color(0, 255, 0));
        ButtonSalir.setText("2. SALIR DEL ANALIZADOR");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSalir);
        ButtonSalir.setBounds(150, 300, 760, 90);

        ButtonAnalizador.setBackground(new java.awt.Color(255, 255, 255));
        ButtonAnalizador.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 48)); // NOI18N
        ButtonAnalizador.setForeground(new java.awt.Color(51, 255, 0));
        ButtonAnalizador.setText("1. Ir AL ANALIZADOR");
        ButtonAnalizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnalizadorActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAnalizador);
        ButtonAnalizador.setBounds(150, 140, 780, 120);

        lblBienvenidos.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        lblBienvenidos.setForeground(new java.awt.Color(0, 255, 0));
        lblBienvenidos.setText("! Analizador Léxico FEROVA !");
        lblBienvenidos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblBienvenidos);
        lblBienvenidos.setBounds(110, 680, 1030, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinesseGrande.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 1270, 800);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        MI_Ayuda.setBackground(new java.awt.Color(102, 102, 102));
        MI_Ayuda.setForeground(new java.awt.Color(51, 255, 51));
        MI_Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        MI_Ayuda.setText("Información");

        MI_mu.setBackground(new java.awt.Color(255, 255, 255));
        MI_mu.setForeground(new java.awt.Color(255, 0, 0));
        MI_mu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        MI_mu.setText("Manual de Usuario");
        MI_mu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_muActionPerformed(evt);
            }
        });
        MI_Ayuda.add(MI_mu);

        MI_mt.setBackground(new java.awt.Color(255, 255, 255));
        MI_mt.setForeground(new java.awt.Color(255, 0, 0));
        MI_mt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tec.png"))); // NOI18N
        MI_mt.setText("Manual Tecnico");
        MI_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_mtActionPerformed(evt);
            }
        });
        MI_Ayuda.add(MI_mt);

        MI_ac.setBackground(new java.awt.Color(255, 255, 255));
        MI_ac.setForeground(new java.awt.Color(255, 0, 0));
        MI_ac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ac.png"))); // NOI18N
        MI_ac.setText("Acerca de...");
        MI_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_acActionPerformed(evt);
            }
        });
        MI_Ayuda.add(MI_ac);

        jMenuBar1.add(MI_Ayuda);

        setJMenuBar(jMenuBar1);

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

    private void MI_muActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_muActionPerformed
        /*try {
            File path;
            path = new File ("Manuales/ManualdeUsuario.pdf");
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
        }*/

    }//GEN-LAST:event_MI_muActionPerformed

    private void MI_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_mtActionPerformed
        try {
            File path;
            path = new File ("Manuales/ManualTecnicoP2.docx");
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
        }
    }//GEN-LAST:event_MI_mtActionPerformed

    private void MI_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_acActionPerformed
        JOptionPane.showMessageDialog(null,"Creado por : Daniel Eduardo Fernández Ovando"+ "\n"+ "No. Carnet: 201731816" +"\n" + "Versión: 1.0");
    }//GEN-LAST:event_MI_acActionPerformed

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
    private javax.swing.JMenu MI_Ayuda;
    private javax.swing.JMenuItem MI_ac;
    private javax.swing.JMenuItem MI_mt;
    private javax.swing.JMenuItem MI_mu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblBienvenidos;
    // End of variables declaration//GEN-END:variables
}
