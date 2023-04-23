/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formula1;

/**
 *
 * @author Gui
 */
public class Ferrari extends Equipe {
    
    private String cor;
    
    
    public Ferrari(String modelo, int ano, String potencia, String piloto1, String piloto2,String cor,int titulos){
        super(modelo, ano, potencia, piloto1, piloto2,titulos);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

@Override
    public String toString(){
        return super.toString()
                + "\nCor do Carro: " +cor;
                 
}
  
}