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
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer numDigitado = leitor.nextInt();
        
        System.out.println("O dobro de seu antecessor é " + (numDigitado - 1) * 2);
    }
}
