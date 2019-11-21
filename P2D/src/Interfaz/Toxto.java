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
public class Toxto {
    
    //atributos
     private String tipo;
    private String palabra;
    private int posicion;
    private int linea;
    private String estado;
/**
 * Constructor
 * @param pos
 * @param linea 
 */
    public Toxto(int pos, int linea){
        tipo ="";
        palabra ="";
        this.linea = linea;
        posicion = pos;
        estado = "S0";
    }
    
    /**
     * get
     * @param caracter 
     */
    public void getCharacter(Character caracter){
        palabra += caracter;
    }
    
    /**
     * 
     * @return 
     */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }
    
}
