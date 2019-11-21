/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;


import java.awt.Desktop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author danie
 */
public class Analizador extends javax.swing.JFrame {
    //mis atributos

    private leer leectura = new leer();
    Analizador analisis = null;

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    JFileChooser ArchivoLeer;
    File archivo1;
    String linea;
    String buscar;
    String b;

    String rn;
    char alamacen;
    int contadorPalabras;
    int numTokens;
    FileReader fr;
    BufferedReader entrada1;
    File leer;

    public static String[] base; //vector almacena
    public static String[] reconoce;
    public String Almacena;
    public int ConERROR;

//variables para mandar
    String palabra;

    public int fil = 0;
    public int colu = 0;
    int No = 0;
    public int salto = 0;

    public int fila1 = 0;
    public int columna1 = 0;
    public int[] Rfila;
    public int[] Rcolumna;

    public String[] Errores;

//TextArea T_texto;
    char[] caracter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    //strings
    String identificadores = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
    String numeros = "0,1,2,3,4,5,6,7,8,9";
    String operacionales = "+,-,*,/,^,**,//,++,--,^^";
    String[] agrupacion = {"(,),[,],{,}"};
    String[] relacionales = {"<,>,==,="};

    String[] errores1;
    private Object data;
    String Copiar;

    /**
     * Creates new form Analizador
     */
    public Analizador() {
        initComponents();

        this.setLocationRelativeTo(null);
        setSize(1190, 960);
        setTitle("ANALIZADOR");
    }

    /**
     * Método para abrir el archivo de entrada
     *
     * @param archivo
     * @return
     */
    public String AbrirArchivo(File archivo) {
        String docu = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                docu += caracter;
            }
        } catch (Exception e) {
        }
        return docu;
    }

    /**
     * Método para guardar archivo
     *
     * @param archivo
     * @param docu
     * @return
     */
    public String GuardarArchivo(File archivo, String docu) {
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = docu.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo guardado";
        } catch (Exception e) {
        }
        return mensaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRecuento = new javax.swing.JButton();
        jButtonHaciaInicio = new javax.swing.JButton();
        jButtonSalidaError = new javax.swing.JButton();
        jbArchsalida = new javax.swing.JButton();
        jButtonAnalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        jButtonAtxt = new javax.swing.JButton();
        jButtonGuardarA = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        M_Archivo = new javax.swing.JMenu();
        MI_Abrir = new javax.swing.JMenuItem();
        MI_Guardar = new javax.swing.JMenuItem();
        MI_Salir = new javax.swing.JMenuItem();
        M_edicion = new javax.swing.JMenu();
        MI_copiar = new javax.swing.JMenuItem();
        MI_Ayuda = new javax.swing.JMenu();
        MI_mu = new javax.swing.JMenuItem();
        MI_ac = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonRecuento.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRecuento.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        jButtonRecuento.setForeground(new java.awt.Color(0, 255, 0));
        jButtonRecuento.setText("Ver recuento");
        jButtonRecuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecuentoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRecuento);
        jButtonRecuento.setBounds(720, 300, 170, 60);

        jButtonHaciaInicio.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHaciaInicio.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        jButtonHaciaInicio.setForeground(new java.awt.Color(0, 255, 0));
        jButtonHaciaInicio.setText("Regresar");
        jButtonHaciaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHaciaInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHaciaInicio);
        jButtonHaciaInicio.setBounds(30, 610, 170, 60);

        jButtonSalidaError.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalidaError.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jButtonSalidaError.setForeground(new java.awt.Color(0, 255, 0));
        jButtonSalidaError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/copy.png"))); // NOI18N
        jButtonSalidaError.setText("Archivo de Errores");
        jButtonSalidaError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaErrorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalidaError);
        jButtonSalidaError.setBounds(720, 250, 220, 50);

        jbArchsalida.setBackground(new java.awt.Color(255, 255, 255));
        jbArchsalida.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jbArchsalida.setForeground(new java.awt.Color(51, 255, 0));
        jbArchsalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte.png"))); // NOI18N
        jbArchsalida.setText("Archivo de Salida");
        jbArchsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArchsalidaActionPerformed(evt);
            }
        });
        getContentPane().add(jbArchsalida);
        jbArchsalida.setBounds(720, 200, 220, 50);

        jButtonAnalizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAnalizar.setFont(new java.awt.Font("Dubai", 3, 36)); // NOI18N
        jButtonAnalizar.setForeground(new java.awt.Color(0, 255, 0));
        jButtonAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1073681.png"))); // NOI18N
        jButtonAnalizar.setText("Analizar");
        jButtonAnalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAnalizarMouseClicked(evt);
            }
        });
        jButtonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAnalizar);
        jButtonAnalizar.setBounds(400, 610, 210, 70);

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dubai Light", 0, 36)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 120, 690, 460);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Analizador Léxico");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 70, 340, 40);

        jButtonAtxt.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAtxt.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jButtonAtxt.setForeground(new java.awt.Color(0, 255, 0));
        jButtonAtxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/open.png"))); // NOI18N
        jButtonAtxt.setText("Archivo de Texto");
        jButtonAtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtxtActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtxt);
        jButtonAtxt.setBounds(720, 120, 220, 40);

        jButtonGuardarA.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGuardarA.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jButtonGuardarA.setForeground(new java.awt.Color(0, 255, 0));
        jButtonGuardarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        jButtonGuardarA.setText("Guardar Archivo");
        jButtonGuardarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardarA);
        jButtonGuardarA.setBounds(720, 160, 220, 40);

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinesseGrande.png"))); // NOI18N
        getContentPane().add(lblImg);
        lblImg.setBounds(0, 0, 1810, 1300);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        M_Archivo.setBackground(new java.awt.Color(102, 102, 102));
        M_Archivo.setForeground(new java.awt.Color(51, 255, 51));
        M_Archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo.png"))); // NOI18N
        M_Archivo.setText("Archivo");
        M_Archivo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        MI_Abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MI_Abrir.setBackground(new java.awt.Color(255, 255, 255));
        MI_Abrir.setForeground(new java.awt.Color(255, 0, 51));
        MI_Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/open.png"))); // NOI18N
        MI_Abrir.setText("Abrir TXT");
        MI_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_AbrirActionPerformed(evt);
            }
        });
        M_Archivo.add(MI_Abrir);

        MI_Guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        MI_Guardar.setBackground(new java.awt.Color(255, 255, 255));
        MI_Guardar.setForeground(new java.awt.Color(255, 0, 51));
        MI_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        MI_Guardar.setText("Guardar TXT");
        MI_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_GuardarActionPerformed(evt);
            }
        });
        M_Archivo.add(MI_Guardar);

        MI_Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MI_Salir.setBackground(new java.awt.Color(255, 255, 255));
        MI_Salir.setForeground(new java.awt.Color(255, 0, 0));
        MI_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5215.png"))); // NOI18N
        MI_Salir.setText("Salir");
        MI_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_SalirActionPerformed(evt);
            }
        });
        M_Archivo.add(MI_Salir);

        jMenuBar1.add(M_Archivo);

        M_edicion.setBackground(new java.awt.Color(102, 102, 102));
        M_edicion.setForeground(new java.awt.Color(51, 255, 0));
        M_edicion.setText("Borrar TXT");
        M_edicion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        MI_copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        MI_copiar.setBackground(new java.awt.Color(255, 255, 255));
        MI_copiar.setForeground(new java.awt.Color(255, 0, 0));
        MI_copiar.setText("Borrar");
        MI_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_copiarActionPerformed(evt);
            }
        });
        M_edicion.add(MI_copiar);

        jMenuBar1.add(M_edicion);

        MI_Ayuda.setBackground(new java.awt.Color(102, 102, 102));
        MI_Ayuda.setForeground(new java.awt.Color(51, 255, 51));
        MI_Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        MI_Ayuda.setText("Información");

        MI_mu.setBackground(new java.awt.Color(255, 255, 255));
        MI_mu.setForeground(new java.awt.Color(255, 0, 0));
        MI_mu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        MI_mu.setText("GRAMATICA");
        MI_mu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_muActionPerformed(evt);
            }
        });
        MI_Ayuda.add(MI_mu);

        MI_ac.setBackground(new java.awt.Color(255, 255, 255));
        MI_ac.setForeground(new java.awt.Color(255, 0, 51));
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

    /**
     * Botón de guardar mi txt
     *
     * @param evt
     */
    private void jButtonGuardarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarAActionPerformed
        // TODO add your handling code here:
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String Documento = jTextArea1.getText();
                String mensaje = GuardarArchivo(archivo, Documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);

                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");

                }

            } else {
                JOptionPane.showMessageDialog(null, "Guardar Documento de texto");
            }
        }

        //gTablero(6, 4);
    }//GEN-LAST:event_jButtonGuardarAActionPerformed

    /**
     * Botón abrir txt
     *
     * @param evt
     */
    private void jButtonAtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtxtActionPerformed

        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(archivo);
                    jTextArea1.setText(documento);

                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no disponible");
                }
            }

        }

    }//GEN-LAST:event_jButtonAtxtActionPerformed

    /**
     * Método para abrir mi txt
     *
     * @param evt
     */
    private void MI_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AbrirActionPerformed

        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbrirArchivo(archivo);
                    jTextArea1.setText(documento);

                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no disponible");
                }
            }

        }


    }//GEN-LAST:event_MI_AbrirActionPerformed

    /**
     * Método para guardar mi txt
     *
     * @param evt
     */
    private void MI_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_GuardarActionPerformed

        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String Documento = jTextArea1.getText();
                String mensaje = GuardarArchivo(archivo, Documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);

                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");

                }

            } else {
                JOptionPane.showMessageDialog(null, "Guardar Documento de texto");
            }
        }


    }//GEN-LAST:event_MI_GuardarActionPerformed
    /**
     * Salir en la pestaña
     *
     * @param evt
     */
    private void MI_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_SalirActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_MI_SalirActionPerformed

    private void MI_muActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_muActionPerformed

        try {
            File path;
            path = new File ("Manuales/GramaticaP2.pdf");
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
        }

    }//GEN-LAST:event_MI_muActionPerformed

    /**
     * Mostrar mi acerca de...
     *
     * @param evt
     */
    private void MI_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_acActionPerformed
        JOptionPane.showMessageDialog(null, "Creado por : Daniel Eduardo Fernández Ovando" + "\n" + "No. Carnet: 201731816" + "\n" + "Versión: 1.0");
    }//GEN-LAST:event_MI_acActionPerformed

    private void MI_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_copiarActionPerformed
        jTextArea1.setText("");

        /* Copiar = T_texto.getText();
        JOptionPane.showMessageDialog(null, "Su área de texto a sido copiada");*/
    }//GEN-LAST:event_MI_copiarActionPerformed

    private void jButtonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalizarActionPerformed
     
        String almacenA = jTextArea1.getText();
        String L = "";
        int ConOperacional = 0;
        int ConAgrupacion = 0;
        int ConRelacionales = 0;
        int ConLetra = 0;
        int ConNumero = 0;

        ConERROR = 0;

        for (int j = 0; j <= almacenA.length() - 1; j++) {
            L = "" + almacenA.charAt(j);

            if (L.equals("+") | L.equals("-") | L.equals("*") | L.equals("/") | L.equals("^") | L.equals("**") | L.equals("//") | L.equals("^^")) {

                ConOperacional++;
                System.out.println("Operacional" + " * " + ConOperacional);

            } else if ((L.equals("(") | L.equals(")") | L.equals("[") | L.equals("]") | L.equals(":") || L.equals(";") | L.equals(",") | L.equals(";") | L.equals(":") | L.equals("."))) {

                ConAgrupacion++;
                System.out.println("Agrupación " + " * " + ConAgrupacion);

            } else if ((L.equals("<") | L.equals(">") | L.equals("==") | (L.equals("=")))) {

                ConRelacionales++;
                System.out.println("Relacional" + " * " + ConRelacionales);

            } else if ((L.equals("@"))) {
                //jtA.setText("@" + "\n");
                rn = "@";

                ConERROR++;
                System.out.println("ERROR" + " * " + ConERROR);

            } else if ((L.equals("#"))) {
                //jtA.setText("@" + "\n");
                rn = "#";

                ConERROR++;
                System.out.println("ERROR" + " * " + ConERROR);

            } else if ((L.equals("0") | L.equals("1") | L.equals("2") | L.equals("3") | L.equals("4") | L.equals("5") | L.equals("6") | L.equals("7") | L.equals("8") | L.equals("9"))) {

                ConNumero++;
                System.out.println("Número " + " * " + ConLetra);

            } else if (L.equals(identificadores)) {
                ConLetra++;
                System.out.println("Letra" + " * " + ConLetra);

            } else if (L.equals("\n")) {
                fila1++;
                columna1 = 0;
                //Rfila[j]=fila1;
                //Rcolumna[j]=columna1;

                  System.out.println("FILA: "+ ""+ fila1 +" "+ "COLUMNA: "+ columna1 );
            } else if (L.equals(" ")) {
                columna1++;
                System.out.println("COLUMNA: " + columna1);
                //Rcolumna[j]=columna1;

            } else {
                System.out.println("ID");
            }

        }

        //System.out.println("Operacionales: " + ConOperacional + " Relacionales: " + ConOperacional + " Agrupación: " + ConAgrupacion + " Errores:" + ConERROR);

    }//GEN-LAST:event_jButtonAnalizarActionPerformed

    /**
     * Arhivo de salida de HTML mostrando tokens
     *
     * @param evt
     */
    private void jbArchsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArchsalidaActionPerformed
        int numero = 0;
        if (ConERROR < 1) {

            String b = jTextArea1.getText();
            base = jTextArea1.getText().split("\\s");
            //String[] o=base;
            String L = "";

            try {
                FileWriter fw = new FileWriter("Reportes1/Tokens.html");
                fw.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />" + "\n" + "\n");
                fw.write("<HTML><HEAD><TITLE>LENGUAJES FORMALES DE PROGRAMACIÓN</TITLE></HEAD>" + "\n" + "\n");
                fw.write("<H1><CENTER><B><FONT SIZE=\"9\" COLOR=\"BLUE\">LISTADO DE TOKEN'S</FONT></B><BR></H1>" + "\n" + "\n");
                fw.write("<HR>" + "\n" + "\n");
                fw.write("<BR><CENTER><TABLE BORDER=1>\n");
                fw.write("	<TR>\n");
                fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>NO.</B></FONT></TD>\n");
                fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>DESCRIPCIÓN</B></FONT></TD>\n");
                fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>LEXEMA</B></FONT></TD>\n");

                fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>FILA</B></FONT></TD>\n");
                fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>COLUMNA</B></FONT></TD>\n");
                fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>TOKEN</B></FONT></TD>\n");
                fw.write("	</TR>\n");

                for (int i = 0; i < base.length; i++) {
                    numero++;

                    fw.write("	<TR>\n");
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"RED\">" + numero + "</FONT></TD>\n");
                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + base[i] + "</FONT></TD>\n");

                    if (base[i].equals("*") | base[i].equals("+") | base[i].equals("/") | base[i].equals("-")) {
                        fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "Operacional" + "</FONT></TD>\n");

                    } else if (base[i].equals("(") | base[i].equals(")") | base[i].equals("[") | base[i].equals("]") | base[i].equals("{") | base[i].equals("}")) {
                        fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "Agrupación" + "</FONT></TD>\n");

                    } else if (base[i].equals("<") | base[i].equals(">") | base[i].equals("==") | base[i].equals("=")) {
                        fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "Relacionales" + "</FONT></TD>\n");

                    } else if (base[i].equals("")) {
                        colu++;
                        fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "Espacio" + "</FONT></TD>\n");

                    } else if (base[i].equals(",") | base[i].equals(":") | base[i].equals(";") | base[i].equals(".")) {
                        fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "Signo" + "</FONT></TD>\n");

                    } else if (base[i].equals("0") | base[i].equals("1") | base[i].equals("2") | base[i].equals("3") | base[i].equals("4") | base[i].equals("5") | base[i].equals("6") | base[i].equals("7") | base[i].equals("8") | base[i].equals("9")) {
                        fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "Número" + "</FONT></TD>\n");

                    } else if (base[i].equals(identificadores)) {
                        fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "Palabras" + "</FONT></TD>\n");

                    } else if (base[i].equals("\n")) {
                        fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "Salto de linea" + "</FONT></TD>\n");
                        colu = 0;
                        fil++;

                    } else {
                        fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "ID" + "</FONT></TD>\n");
                    }

                    fw.write("<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + fil + "</FONT></TD>\n");

                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + colu + "</FONT></TD>\n");

                    //   separa las palabras y cuenta las veces que aparece.
                    String t = base[i];
                    String[] pala = t.split("");
                    int canti = pala.length;

                    fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + canti + "</FONT></TD>\n");
                    fw.write("	</TR>\n");

                }
                //   }
                fw.write("</TABLE>" + "\n");
                fw.flush();
                fw.close();

            } catch (IOException er) {
                System.out.println(er);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Su analisis tiene algun error, No se puede Realizar el Archivo de Tokens");
        }

        try {
            File path;
            path = new File("Reportes1/Tokens.html");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jbArchsalidaActionPerformed

    /**
     * Arhivo de salida mostrando errores
     *
     * @param evt
     */
    private void jButtonSalidaErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaErrorActionPerformed

        String ErrorDeToken = jTextArea1.getText();
        int contadorToken = 0;
        String raiz2 = "";
        int numero = 0;
        String[] Error1 = new String[1000000];
        String[] vacio = new String[1000000];
        int existe1 = 0;
        do {
            raiz2 = "" + ErrorDeToken.charAt(contadorToken);
            if (raiz2.equals("@")) {
                System.out.println("existe un @");
                Error1[existe1] = "@";
                existe1++;
            } else if (raiz2.equals("#")) {
                Error1[existe1] = "#";
                existe1++;
            } else {
                vacio[contadorToken] = "";
            }
            contadorToken++;
        } while (contadorToken < ErrorDeToken.length());
        System.out.println("El existe1 tiene=" + existe1);

        try {
            FileWriter fw = new FileWriter("Reportes1/Errores.html");
            fw.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />" + "\n" + "\n");
            fw.write("<HTML><HEAD><TITLE>LENGUAJES FORMALES DE PROGRAMACIÓN</TITLE></HEAD>" + "\n" + "\n");
            fw.write("<H1><CENTER><B><FONT SIZE=\"9\" COLOR=\"BLACK\">LISTADO DE ERRORES" + "</FONT></B></H1>" + "\n" + "\n");
            fw.write("<HR>" + "\n" + "\n");
            fw.write("<BR><CENTER><TABLE BORDER=1>\n");
            fw.write("	<TR>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>NO.</B></FONT></TD>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>Lexema</B></FONT></TD>\n");
            fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLACK\"><B>Descripcion</B></FONT></TD>\n");

            fw.write("	</TR>\n");
            String[] result = jTextArea1.getText().split("\\s");
            // Nodo registro = new Nodo();
            //registro = lista.getInicio();
            for (int so = 0; so < existe1; so++) {
                numero++;
                fw.write("	<TR>\n");
                fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"RED\">" + numero + "</FONT></TD>\n");
                fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + Error1[so] + "</FONT></TD>\n");
                fw.write("	<TD ALIGN=\"CENTER\"><FONT COLOR=\"BLUE\">" + "Error Lexico" + "</FONT></TD>\n");

                fw.write("	</TR>\n");

                //registro=registro.sig;
            }
            fw.write("</TABLE>" + "\n");
            fw.flush();
            fw.close();

        } catch (IOException er) {
            System.out.println(er);
        }
        try {
            File path;
            path = new File("Reportes1/Errores.html");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_jButtonSalidaErrorActionPerformed

    /**
     * Hacia inicio
     *
     * @param evt
     */
    private void jButtonHaciaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHaciaInicioActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        new Inicio().setVisible(true);

        setSize(1190, 960);
        dispose();
    }//GEN-LAST:event_jButtonHaciaInicioActionPerformed

    private void jButtonAnalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAnalizarMouseClicked
        // TODO add your handling code here:
        /* botonSolicitar.setVisible(true);
        String textoArea [] = jTextArea1.getText().split(" ");
        analisis = new Analizador(jTextArea1.getText(),this);
//        analisis.insertarCadena(textoArea);
        botonAnalizar.setEnabled(false);*/
    }//GEN-LAST:event_jButtonAnalizarMouseClicked

    private void jButtonRecuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecuentoActionPerformed
        // TODO add your handling code here:
        
        Analizador1 entrada2 = new Analizador1();
        entrada2.show();
        entrada2.setSize(1190, 960);

        dispose();
    }//GEN-LAST:event_jButtonRecuentoActionPerformed

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
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MI_Abrir;
    private javax.swing.JMenu MI_Ayuda;
    private javax.swing.JMenuItem MI_Guardar;
    private javax.swing.JMenuItem MI_Salir;
    private javax.swing.JMenuItem MI_ac;
    private javax.swing.JMenuItem MI_copiar;
    private javax.swing.JMenuItem MI_mu;
    private javax.swing.JMenu M_Archivo;
    private javax.swing.JMenu M_edicion;
    private javax.swing.JButton jButtonAnalizar;
    private javax.swing.JButton jButtonAtxt;
    private javax.swing.JButton jButtonGuardarA;
    private javax.swing.JButton jButtonHaciaInicio;
    private javax.swing.JButton jButtonRecuento;
    private javax.swing.JButton jButtonSalidaError;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTextArea jTextArea1 = new javax.swing.JTextArea();
    private javax.swing.JButton jbArchsalida;
    private javax.swing.JLabel lblImg;
    // End of variables declaration//GEN-END:variables
}
