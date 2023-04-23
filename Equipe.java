/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formula1;

/**
 *
 * @author Gui
 */
public class Equipe {
    
    private String modelo;
    private int ano;        
    private String potencia;
    private String piloto1;
    private String piloto2;
    private int titulos;
    
public Equipe(String modelo, int ano, String potencia,String piloto1,String piloto2,int titulos){
    this.ano = ano;
    this.modelo = modelo;
    this.potencia = potencia;
    this.piloto1 = piloto1;
    this.piloto2 = piloto2;
    this.titulos = titulos;
}  
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    
    
    public String getPiloto1() {
        return piloto1;
    }

    public void setPiloto1(String piloto1) {
        this.piloto1 = piloto1;
    }

    public String getPiloto2() {
        return piloto2;
    }

    public void setPiloto2(String piloto2) {
        this.piloto2 = piloto2;
    }
    
     public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
    
   
     @Override
    public String toString(){
        return "Modelo: " +modelo
                +"\nAno do Carro: "+ano
                +"\nPotencia: " +potencia
                +"\nPiloto 1: "+piloto1
                +"\nPiloto 2: " +piloto2
                +"\nTitulos: " +titulos;
    
    
}

   
    
    
    
}



