/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author Maecio
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int numeros[] = new int[15];
        
        for(int i = 0; i < 15; i++){
            System.out.println(String.format("Digite %d° valor: ", i+1));
            
            numeros[i] = leitor.nextInt();
        }
        
        for(int i = 0; i < 15; i++){
            System.out.println(String.format("%d° número multiplicado por 2: %d", i+1, numeros[i] *2));
        }
        
    }
}
