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
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int lista[] = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.println(String.format("Digite o %d° número: ", i+1));
            lista[i] = leitor.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
           if(lista[i] < 8){
               System.out.println(String.format("O %d° sendo ele %d é menor que 8.", i+1, lista[i]));
           }
        }
    }
}
