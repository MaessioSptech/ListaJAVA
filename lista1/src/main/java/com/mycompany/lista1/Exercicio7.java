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
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua média: ");
        Double media = leitor.nextDouble();
        
        if(media >= 9.0){
            System.out.println("Conceito A");
        } else if(media >= 7.5){
            System.out.println("Conceito B");
        } else if(media >= 6){
            System.out.println("Conceito C");
        } else{
            System.out.println("Reprovado");
        }
    }
}
