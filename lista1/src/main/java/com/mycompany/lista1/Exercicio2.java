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
public class Exercicio2 {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         
         System.out.println("Digite quantos anos você tem: ");
         Integer anos = leitor.nextInt();
         
         System.out.println(String.format("Você já viveu %d dias", anos*365));
    }
}
