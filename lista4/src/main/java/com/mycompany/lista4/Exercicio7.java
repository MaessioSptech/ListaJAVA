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
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int lista[] = new int[4];
        
        for(int i = 0; i < 4; i++){
            System.out.println(String.format("Digite o %dº número", i + 1));
            
            lista[i] = leitor.nextInt();
        }
        
        Integer maior = lista[0];
        
        int listaCrescente[] = new int[4];
        
        for(int i = 0; i < 4; i++){
            for(int j = i + 1; j < 4; j++){
                if(lista[i] > lista[j]){
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
            
            System.out.println(lista[i]);
        }
    }
}
