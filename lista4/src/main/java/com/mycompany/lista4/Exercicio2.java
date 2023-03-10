/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4;

/**
 *
 * @author Maecio
 */
public class Exercicio2 {
    public static void main(String[] args) {
        
        int vetor[] = new int[8];
        
        vetor[0] = 5;
        vetor[1] = 1;
        vetor[2] = 4;
        vetor[3] = 2;
        vetor[4] = 7;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 6;
        
        int vetor2[] = new int[8];
        
        for(int i = 0; i <= 7; i++){
            vetor2[i] = vetor[i] * 2;
            System.out.println(vetor2[i]);
        }
        
    }
}
