
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int pernas = tec.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupe";
                break;
            case 6:
                tipo = "Formiga";
                break;
            case 8:
                tipo = "Aranha";
                break; 
            default:
                tipo ="ET";

        }
        System.out.println(tipo);
    }
}   
