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
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        if(idade >= 19){
            System.out.println("Você está classificado como adulto.");
        } else if(idade >= 11){
            System.out.println("Você está classificado como juvenil.");
        } else if(idade >= 5){
            System.out.println("Você está classificado como infantil.");
        }
    }
}
