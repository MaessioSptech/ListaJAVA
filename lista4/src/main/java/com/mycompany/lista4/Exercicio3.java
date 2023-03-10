/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4;

import java.util.Scanner;

/**
 *
 * @author Maecio
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int vetor[] = new int[10];
        
        int vetorM[] = new int[10];
        
        for(int i = 0; i <= 9; i++){
            System.out.println(String.format("Digite o %d° número: ", i+1));
            vetor[i] = leitor.nextInt();
        }
        
        System.out.println("Digite um multiplicador: ");
        Integer mult = leitor.nextInt();
        
        for(int i = 0; i <= 9; i++){
            vetorM[i] = vetor[i] * mult;
            System.out.println(vetorM[i]);
        }
    }
}
