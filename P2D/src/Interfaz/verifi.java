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
public class verifi {
    


    //mis atributos
    private String palabraR [] = {"funcion","principal","retornar","vacio","variable","entero","decimal","booleano","cadena","carácter","si","sino","mientras","para","hacer","imprimir"};
    private String ope [] = {"+","-","*","/","%","=","==","<",">",">=","<="};
    private String signosA [] = {"(",")","{","}"};
    private String signos [] = {"\"",";"};
    private String Nterminales [] = {"E","C","V","D","T","L","PARAMETRO","NUM" ,"DIGITO","OPERADOR"};
    
    
  /**
   * palabra reservada
   * @param palabra
   * @return 
   */
    public boolean PalabraR(String palabra){
        for (int i = 0; i < palabraR.length; i++) {
            if(palabraR[i].equals(palabra)){
                return true;
            }
        }
        return false;
    }

    
    
    /**
     * verifica si es un operador
     * @param palabra
     * @return 
     */
    public boolean Operador(String palabra){
        for (int i = 0; i < ope.length; i++) {
            if(ope[i].equals(palabra)){
                return true;
            }
        }
        return false;
    }
  
    
    
    /**
     * verifica es
     * @param palabra
     * @return 
     */
    public boolean SignoA (String palabra){
        for (int i = 0; i < signosA.length; i++) {
            if(signosA[i].equals(palabra)){
                return true;
            }
        }
        return false;
    }

    
    /**
     * verifica si es un tipo
     * @param palabra
     * @return 
     */
    public boolean Signo(String palabra){
        for (int i = 0; i < signos.length; i++) {
            if(signos[i].equals(palabra)){
                return true;
            }
        }
        return false;
    }
    //verifica si es un estado
    
    /**
     * Me mira si es estado
     * @param palabra
     * @return 
     */
    public boolean NTerminalesEstado(String palabra){
        for (int i = 0; i < Nterminales.length; i++) {
            if(Nterminales[i].equals(palabra)){
                return true;
            }
        }
        return false;
    }
 
    
    /**
     * verifica si la palabra y el ultimo simbolo de la pila de simbolos son iguales
     * @param simboloPila
     * @param simboloCadena
     * @return 
     */
    public boolean verificarIgualdad(String simboloPila,String simboloCadena){
        
        if(simboloPila.equals(simboloCadena)){
            return true;
        }
        return false;
    }
    
    
    /**
     * regresa a posicion oclumna
     * @param palabra
     * @return 
     */
    public int regresarPosicionColumna(String palabra){
        switch(palabra){
            case "funcion":
                return 1;
            case "for":
                return 2;
            case "V":
                return 3;
            case "imprimir":
                return 5;
            case "while":
                return 7;
            case "if":
                return 6;
            case "variable":
                return 2;
            case "entero":
                return 7;
            case "decimal":
                return 8;
            case "booleano":
                return 9;
            case "caracter":
                return 10;
            case "false":
                return 12;
            case ".":
                return 13;
            case "true":
                return 14;
            case "NUM":
                return 15;
            case "ID":
                return 0;
            case "e":
                return 3;
            case "D":
                return 7;
            case "DIGITO":
                return 15;
                default:
                    return 0;
        }
        
    }
        
    /**
     * regresando a posicion en fila
     * @param estado
     * @return 
     */
        public int regresarposicionFila(String estado){
            
            switch(estado){
                case "E":
                    return 1;
                case "C":
                    return 2;
                case "V":
                    return 3;
                case "D":
                    return 4;
                case "T":
                    return 5;
                case "L":
                    return 6;
                case "Parametro":
                    return 7;
                case "NUM":
                    return 8;
                case "DIGITO":
                    return 9;
                case "OPERADOR":
                    return 10;
                    default:
                        return 0;
            }
        }
        
    
}
