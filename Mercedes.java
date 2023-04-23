/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formula1;

/**
 *
 * @author Gui
 */
public class Mercedes extends Equipe {
    
    private String patrocinador;

    public Mercedes(String modelo, int ano, String potencia, String piloto1, String piloto2,String patrocinador,int titulos) {
        super(modelo, ano, potencia, piloto1, piloto2,titulos);
        this.patrocinador = patrocinador;
    }

   
  

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }
    
    
    @Override
    public String toString(){
        return super.toString()
                + "\nPatrocinador: " +patrocinador;
                 
}
    
    
    
    
    
    
}
