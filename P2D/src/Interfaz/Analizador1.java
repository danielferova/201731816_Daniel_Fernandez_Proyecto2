/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author danie
 */
public class Analizador1 extends javax.swing.JFrame  {

    /**
     * Creates new form Analizador1
     */
    public Analizador1() {
        initComponents();
        
        this.setLocationRelativeTo(null);
         
        setSize(1190, 960);
        
        setTitle("ANALIZADOR");
        
    }

    String palabras;
public String [] cuento;   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMostrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtrecuento = new javax.swing.JTextArea();
        jButtonsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonHaciaE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jbMostrar.setBackground(new java.awt.Color(255, 255, 255));
        jbMostrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbMostrar.setForeground(new java.awt.Color(51, 255, 51));
        jbMostrar.setText("Mostrar");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbMostrar);
        jbMostrar.setBounds(580, 120, 140, 50);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.setText("Más repetido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 190, 190, 50);

        jtrecuento.setBackground(new java.awt.Color(255, 255, 255));
        jtrecuento.setColumns(20);
        jtrecuento.setForeground(new java.awt.Color(0, 0, 0));
        jtrecuento.setRows(5);
        jtrecuento.setKeymap(null);
        jScrollPane2.setViewportView(jtrecuento);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 110, 490, 330);

        jButtonsalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonsalir.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        jButtonsalir.setForeground(new java.awt.Color(0, 255, 0));
        jButtonsalir.setText("Salir");
        jButtonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsalir);
        jButtonsalir.setBounds(320, 520, 200, 80);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("Componentes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 60, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 60, 60, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Recuento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 60, 110, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Recuento");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 10, 180, 40);

        jButtonHaciaE.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHaciaE.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        jButtonHaciaE.setForeground(new java.awt.Color(0, 255, 0));
        jButtonHaciaE.setText("Regresar");
        jButtonHaciaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHaciaEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHaciaE);
        jButtonHaciaE.setBounds(40, 520, 200, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinesseGrande.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1810, 1300);

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dubai Light", 0, 36)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 160, 690, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHaciaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHaciaEActionPerformed
        // TODO add your handling code here:

         this.setVisible(false);

        new Analizador().setVisible(true);
        
       setSize(1190, 960);
       dispose();

    }//GEN-LAST:event_jButtonHaciaEActionPerformed

    
    /**
     * Mostrar lo del txt
     * @param evt 
     */
    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        String [] palabras=Analizador.jTextArea1.getText().split("\\s");
        String buscar = Analizador.jTextArea1.getText();
        String [] pal =jTextArea1.getText().split(" ");

        String p="";
        String  a;
        int contador=0;

        for (int i=0; i<palabras.length;i++) {
            p= i+1 +" " +" "+ palabras[i]+ " \n ";
            a= palabras [i];
            System.out.println(palabras[i]);

            String t = palabras[i];
            String [] pala = t.split(" ");
            int canti = pala.length;

            jtrecuento.setText(jtrecuento.getText()+ "" +canti + " ------------ " +p +"-----");
        }
    }//GEN-LAST:event_jbMostrarActionPerformed

    /**
     * Más repetidos
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cadena=jTextArea1.getText();
        char charCadena='\n';
        int[] resul = new int[300];
        int numeroVeces=0, letraRepetida=0;

        //suma un punto cada vez que se repite.
        for(int i=0;i<cadena.length();i++)
        resul[cadena.codePointAt(i)]++;

        //busca el que tiene mas punto
        for(int i=48;i<resul.length;i++){
            if(resul[i]>=numeroVeces){
                numeroVeces=resul[i];
                letraRepetida=i;
            }}

            //busca en la cadena original.
            for(int i=0;i<cadena.length();i++){
                if (letraRepetida==cadena.codePointAt(i)){
                    charCadena=cadena.charAt(i);
                }

            }
            System.out.println("\nEl caracter mas repitdo es = "+charCadena);
            System.out.println("y se repite "+numeroVeces+" veces");

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Salir
     * @param evt 
     */
    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jButtonsalirActionPerformed

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
            java.util.logging.Logger.getLogger(Analizador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analizador1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHaciaE;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbMostrar;
    public static javax.swing.JTextArea jtrecuento;
    // End of variables declaration//GEN-END:variables
}
