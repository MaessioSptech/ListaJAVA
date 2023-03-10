/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;

/**
 *
 * @author Maecio
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite sua nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite sua nota: ");
        Double nota2 = leitor.nextDouble();
        
        System.out.println("Digite sua nota: ");
        Double nota3 = leitor.nextDouble();
        
        Double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Média "+media);
        
        if(media >= 6){
            System.out.println("APROVADO");
        } else{
            System.out.println("REPROVADO");
        }
    }
}
