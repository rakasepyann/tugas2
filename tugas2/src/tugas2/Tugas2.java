package tugas2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MYWINDOWS
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void tugas(String[] args) {
           Scanner Angka = new Scanner (System.in);
        int a;
        int b;
        int c;
    System.out.print("No 1 = ");
    a = Angka.nextInt();
    System.out.print("No 2 = ");
    b = Angka.nextInt();
    System.out.print("No 3 = ");
    c = Angka.nextInt();
    System.out.println("Rata-rata = " + ((a+b+c)/3));
    }
    
    public static void Tugas2 (){
        
         String number1 = JOptionPane.showInputDialog("No 1 = ");
         String number2 = JOptionPane.showInputDialog("No 2 = ");
         String number3 = JOptionPane.showInputDialog("No 3 = ");
   
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int n3 = Integer.parseInt(number3);
                
                int rata = (n1+n2+n3)/3;
                String msg = "Number 1 = " +n1+ "\n Number 2 = " +n2+ "\n Number 3 = " +n3+ "\n\n Rata-Rata = "+rata;
                JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tugas2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Tugas2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Tugas2.class.getName()).log(Level.SEVERE, null, ex); 
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Tugas2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Tugas2();
    }
    
    
}

    
    

