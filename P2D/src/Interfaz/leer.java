/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author danie
 */
public class leer {
    
    private String texto;
    Analizador analisis = null;
    
    public void leer(String fichero) throws IOException{

        try{
            FileReader tx = new FileReader(fichero);
            BufferedReader br = new BufferedReader(tx);
                texto = "";
                String cadena;
                while((cadena=br.readLine())!=null){   
                    texto += cadena+"\n";

                }             
            br.close();     
        }catch(Exception e){
            
        }
    }
    
    public String getTexto(){
        
        return texto;
    }
    
}
