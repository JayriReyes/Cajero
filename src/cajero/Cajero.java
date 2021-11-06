/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import javax.swing.JOptionPane;
/**
 *
 * @author familia
 */
public class Cajero {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int saldo = 6000; 
        int opcion=0; 
        float deposito, saldoFinal, retirar;
        
        do{
        opcion = opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona una opción: \n "
                + "1.-Ver saldo. \n"
                + "2.-Depositar en la cuenta. \n"
                + "3.-Retirar saldo de la cuenta. \n"
                + "4.- Salir \n", JOptionPane.QUESTION_MESSAGE));
        
        switch (opcion){
            do{
            
            case 1:
                
                JOptionPane.showMessageDialog(null, "Tu saldo actual es de: " +saldo);
            
            break;
            case 2:
                deposito = Float.parseFloat(JOptionPane.showInputDialog(null, "¿Que cantidad quieres depositar? \n ");
                saldoFinal= saldo + deposito;
                JOptionPane.showMessageDialog(null, "Tu saldo actual es de: " +saldoFinal);
            break;  
            
            case 3: 
                retirar= Float.parseFloat(JOptionPane.showInputDialog(null, "¿Que cantidad quieres retirar? \n ");
                
                if(retirar>saldo){
                    JOptionPane.showMessageDialog(null, "No tienes la cantidad deseada a retirar");
                    
                }if (retirar<0){
                    JOptionPane.showMessageDialog(null, "Error de cantidad a retirar");
                }else{
                    saldoFinal = saldo - retirar;
                    JOptionPane.showMessageDialog(null, "Tu saldo actual es de: " +saldoFinal);
                }
                break; 
                
            case 4:
                JOptionPane.showMessageDialog (null, "Que tenga buen dia, hasta luego (: ");
                System.exit(0);
                break;
            default:JOptionPane.showMessageDialog(null, "Elija una opcion valida");
                
        }}while(opcion!=4);

    }
}
