
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class pangkat3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Bilangan : ");
        System.out.println(" *************************************************************");

        double a = sc.nextInt();

        double hasilpangkat2 = Math.pow(a, 2) ;
        double hasilakarpangkat2 = Math.cbrt(a) ;
        double hasilpangkat3 = Math.pow(a, 3) ;
        double hasilakarpangkat3 = Math.sqrt(a) ;

        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Hasil Pangkat 2 = " +hasilpangkat2);
        System.out.println(" *Maka Hasil Akar Pangkat 2 = " +hasilakarpangkat2);
        System.out.println(" *Maka Hasil Pangkat 3 = " +hasilpangkat3);
        System.out.println(" *Maka Hasil Akar Pangkat 3 = " +hasilakarpangkat3);
        System.out.println(" ********************************************************** ");
    }
    
}
