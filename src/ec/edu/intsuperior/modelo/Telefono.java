/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Santiago
 */
public class Telefono {
    //atributos
    private String modelo;
    private String marca;
    private int almacenamiento;
    private int ram;
    //constructores
    public Telefono(){
        
    }
   
    public Telefono(String modelo, String marca, int almacenamiento, int ram) {
        this.modelo = modelo;
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
    }
    
     
    //set y get
    public void setModelo(String modelo)   {
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    //funciones u operaciones

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    
}
