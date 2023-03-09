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
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        if(idade >= 18){
            System.out.println("Você já é maior de idade.");
        } else{
            System.out.println("Você ainda é menor de idade.");
        }
    }
}
