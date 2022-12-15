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
public class Chocolate {
    private String marca;
    private String peso;
    private String tipoChocolate;

    public Chocolate() {
    }

    public Chocolate(String marca, String peso, String tipoChocolate) {
        this.marca = marca;
        this.peso = peso;
        this.tipoChocolate = tipoChocolate;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setTipoChocolate(String tipoChocolate) {
        this.tipoChocolate = tipoChocolate;
    }

    public String getMarca() {
        return marca;
    }

    public String getPeso() {
        return peso;
    }

    public String getTipoChocolate() {
        return tipoChocolate;
    }

    @Override
    public String toString() {
        return "Los datos del chocolate son: \n"
                + "Marca: "+getMarca()+"\n"
                + "Peso: "+getPeso()+"\n"
                + "Tipo: "+getTipoChocolate(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
