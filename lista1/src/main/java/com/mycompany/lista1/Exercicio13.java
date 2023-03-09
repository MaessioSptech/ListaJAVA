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
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer soma = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println(String.format("Digite o %d° número", i));
            soma += leitor.nextInt();
        }
        
        System.out.println("A soma dos 10 números é "+ soma);
    }
}
