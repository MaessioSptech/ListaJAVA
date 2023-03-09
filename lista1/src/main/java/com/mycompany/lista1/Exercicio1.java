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
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a largura do terreno: ");
        Integer largura = leitor.nextInt();
        
        System.out.println("Digite a profundidade do terreno: ");
        Integer profundidade = leitor.nextInt();
        
        System.out.println("A área do terreno é " + largura*profundidade);
    }
}
