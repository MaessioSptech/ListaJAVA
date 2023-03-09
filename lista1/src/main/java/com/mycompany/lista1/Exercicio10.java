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
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Double soma = 0.0;
        int i = 1;
        
        do{
            System.out.println(String.format("Digite a %d° nota: ", i));
            soma += leitor.nextDouble();
            i++;
        } while(i <= 10);
        
        System.out.println(String.format("A média é %.1f", (soma/10)));
    }
}
