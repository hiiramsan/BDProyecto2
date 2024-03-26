/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author carlo
 */
public class AutomovilDTO {

    private String numeroSerie;
    private String marca;
    private String linea;
    private String color;
    private int modelo;

    public AutomovilDTO() {
    }
    
    public AutomovilDTO(String numeroSerie, String marca, String linea, String color, int modelo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "AutomovilDTO{" + "numeroSerie=" + numeroSerie + ", marca=" + marca + ", linea=" + linea + ", color=" + color + ", modelo=" + modelo + '}';
    }
    
    

}
