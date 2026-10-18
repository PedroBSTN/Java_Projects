/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Arrays;

/**
 *
 * @author pedro
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n[] = {2, 4, 5, 67, 6, 7};
        Arrays.sort(n);
        for (int valor:n){
            System.out.print(valor + " ");
        }
        System.out.println(""
                + "");
        int p = Arrays.binarySearch(n, 67);
        System.out.println(p);
        }
}
