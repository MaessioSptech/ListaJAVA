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
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer num1 = leitor.nextInt();
        
        System.out.println("Digite um número: ");
        Integer num2 = leitor.nextInt();
        
        if(num1 > num2){
            System.out.println("Primeiro é maior");
        } else if(num2 > num1){
            System.out.println("Segundo maior");
        } else{
            System.out.println("Números iguais");
        }
    }
}
