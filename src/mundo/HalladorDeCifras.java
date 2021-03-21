/*Ejercicio: Programa en java que pida un numero entre (0 y 99.999.9999)
* y diga cuántas cifras tiene el numero ingresado.
*----------------------------------------------------------------------*
* UMD Creator: Josue_RomeroJ
* Date: 21/Marzo/2021 5:29 p.m COL.
*/
package Exercies_ATS;
import javax.swing.JOptionPane;

public class HalladorDeCifras 
{
    public static void main(String[] args) 
    {
        double cifra;
        
        cifra = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0/99.999.999"));
        
        if(cifra > 9999999) {
            JOptionPane.showMessageDialog(null, "El numero > " + cifra + " es de 8 cifras");
        }else if(cifra > 999999) {
            JOptionPane.showMessageDialog(null, "El numero > " + cifra + " es de 7 cifras");
        }else if(cifra > 99999) {
            JOptionPane.showMessageDialog(null, "El numero > " + cifra + " es de 6 cifras");
        }else if(cifra > 9999){
            JOptionPane.showMessageDialog(null, "El numero > " + cifra + " es de 5 cifras");
        }else if(cifra >999){
            JOptionPane.showMessageDialog(null, "El numero > " + cifra + " es de 4 cifras");
        }else if(cifra > 99){
            JOptionPane.showMessageDialog(null, "El numero > " + cifra + " es de 3 cifras");
        }else if(cifra > 9){
            JOptionPane.showMessageDialog(null, "El numero > " + cifra + " es de 2 cifras");
        }else{
            JOptionPane.showMessageDialog(null, "El numero > " + cifra + " es de 1 cifra");
        }
    }
}
