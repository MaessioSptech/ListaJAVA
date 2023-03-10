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
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer num1 = leitor.nextInt();
        
        System.out.println("Digite um número: ");
        Integer num2 = leitor.nextInt();
        
        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São múltiplos");
        } else{
            System.out.println("Não são múltiplos");
        }
    }
}
