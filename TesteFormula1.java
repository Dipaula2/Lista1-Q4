/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Formula1;

/**
 *
 * @author Gui
 */
public class TesteFormula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Ferrari ferrari = new Ferrari("SF-23",2023,"1050cv","Charles Leclerc","Carlos Sainz","Vermelho",15);
        Mercedes mercedes = new Mercedes("W14",2023,"1063cv","Lewis Halmiton","George Russel","Petronas",8);
        Red_Bull red_bull = new Red_Bull("RB-19",2023,"1265cv","Max Verstappen","Sergio Perez","Red Bull",6);
        
        
        System.out.println(ferrari.toString());
        
        System.out.println("_____________________________");
        
        System.out.println(mercedes.toString());
        
        System.out.println("_____________________________");
        
        System.out.println(red_bull.toString());
        
        System.out.println("_____________________________");
        
        
        
        
    }
}
