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
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int lista[] = new int[10];
        
        int maior = 0;
        int posicao = 0;
        
        for(int i = 0;  i < 10; i++){
            System.out.println("Digite um número par: ");
            Integer numDigitado = leitor.nextInt();
            
            if(numDigitado % 2 == 0){
                lista[i] = numDigitado;
                if(lista[i] > maior){
                    maior = lista[i];
                    posicao = i + 1;
                }
            } else{
                System.out.println("Inválido. Digite outro número: ");
                i--;
            }
        }
        
        System.out.println(String.format("O maior valor se encontra"
                + "na posição %d e seu velor é de %d", posicao, maior));
        
        for(int i = 0; i < 10; i++){
            System.out.println(lista[i]);
        }
    }
}
