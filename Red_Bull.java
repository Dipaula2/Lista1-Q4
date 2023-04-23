/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formula1;

/**
 *
 * @author Gui
 */
public class Red_Bull extends Equipe {
    
    private String Marca;
    
     public Red_Bull(String modelo, int ano, String potencia, String piloto1, String piloto2,String Marca,int titulos) {
        super(modelo, ano, potencia, piloto1, piloto2,titulos);
        this.Marca = Marca;
    
}
     
     @Override
    public String toString(){
        return super.toString()
                + "\nMarca do Carro: " +Marca;
                 
}
     
     
     
     
     
     
     
     
     
     
     
     
}