/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int num = 2;
        int valor_suma = 3;
        String mensaje = "";
        while (num <= 37) {
            mensaje = String.format("%s\n%S", mensaje, num);
        
            num = num + valor_suma;
            valor_suma = valor_suma + 2;
            

        }
        System.out.printf("%s\n", mensaje);
    }
    }
    }
    
}
