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
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        Double num1 = leitor.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        Double num2 = leitor.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        Double num3 = leitor.nextDouble();
        
        Double calculo = Math.pow((num1 + num2), 2) + num3;
        
        System.out.println("O resultado da equação é "+ calculo);
    }
}
