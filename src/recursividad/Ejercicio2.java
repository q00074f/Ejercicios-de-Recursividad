/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    int n = 5;
    decre(n);
    }
    //método que imprime dígitos de n hasta 1
    //ejemplo: n=5 -> 54321
    //ejemplo: n=8 -> 87654321
    static void decre(int n)
    {
    if(n>0)
    {
        System.out.print(n);
        decre(n-1);
    }
    else
    System.out.println();
}
}
