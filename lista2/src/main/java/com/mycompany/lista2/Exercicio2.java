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
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a 1° nota:");
        Integer nota1 = leitor.nextInt();
        
        System.out.println("Digite a 2° nota:");
        Integer nota2 = leitor.nextInt();
        
        System.out.println("Digite a 3° nota:");
        Integer nota3 = leitor.nextInt();
        
        Integer equacao = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
        
        System.out.println("A média ponderada das 3 notas é "+ equacao/10);
    }
}
