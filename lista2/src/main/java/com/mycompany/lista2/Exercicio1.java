/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

import java.util.Scanner;

/**
 *
 * @author Maecio
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o 1° número:");
        Integer num1 = leitor.nextInt();
        
        System.out.println("Digite o 2° número:");
        Integer num2 = leitor.nextInt();
        
        System.out.println("Digite o 3° número:");
        Integer num3 = leitor.nextInt();
        
        Integer equacao = num1 + (num2 / num3);
        
        System.out.println("O resultado da equação é "+ equacao);
    }
}
