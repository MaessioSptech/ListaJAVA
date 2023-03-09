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
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu saldo: ");
        Integer saldo = leitor.nextInt();
        
        if(saldo <= 200){
            System.out.println("Nenhum crédito");
        } else if( saldo <= 400){
            System.out.println(String.format("Você tem disponível um crédito de %d", saldo*20/100));
        } else if(saldo <= 600){
            System.out.println(String.format("Você tem disponível um crédito de %d", saldo*30/100));
        }
    }
}
