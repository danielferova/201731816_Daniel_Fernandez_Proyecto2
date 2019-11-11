/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesP2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author danie
 */
public class LeerTxt {
    
     String ruta = "practica1.txt";
    boolean cargado;
    String texto = "";
    
    
   // Datos datos = new Datos(this);
    
    //errores error = new errores(this);
    
    public String leertxt(String direccion){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String t = "";
            String bfRead ;
            while ((bfRead = bf.readLine()) != null){
            t = t + bfRead;
            
                
            }
            
            texto= t;
            
        }catch(Exception e)
       {
           System.out.println("No se encontro el archivo");
           
        }
         return texto;
    }
    
    public void leer(String fichero){
         String tituloNombreFecha;
        String carnetCodigolibro;
        String cantidad;
        String autorCarreraCodigo;
        int contador=0;
        
        
        try{
          //  FileReader tx = new FileReader(fichero);
          //  BufferedReader br = new BufferedReader(tx);
            
            
        
        
    }catch(Exception e){
            
        }
     //   error.setVisible(true);
    }
          
}
