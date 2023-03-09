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
public class Exercicio4 {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        Double nota2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        Double nota3 = leitor.nextDouble();
        
        Double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println(String.format("A média das 3 notas é %.2f", media));
    }
}
