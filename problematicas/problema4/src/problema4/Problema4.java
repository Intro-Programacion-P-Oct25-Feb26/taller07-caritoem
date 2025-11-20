/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero = 1;
        int impares = 3;
        int contador = 1;
        int contadorsigno = 1;
        int limite = 7;
        String signo = "";
        String mensajeF = "";

        while (contador <= limite) {
            if (contadorsigno %2 == 0){
                signo = "-";
            }else{
                signo = "+";
            }
           
            mensajeF = String.format("%s%s%d/%d", mensajeF, signo, numero, impares);

            contador = contador + 1;
            contadorsigno = contadorsigno + 1;
            impares = impares + 2;
        }

        System.out.printf("%d %s", numero, mensajeF);
        
        
    }
    
}
