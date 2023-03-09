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
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o total de votos: ");
        Integer votosTotal = leitor.nextInt();
        
        System.out.println("Digite a quantidade de votos brancos: ");
        Integer votosBrancos = leitor.nextInt();
        
        System.out.println("Digite a quantidade de votos nulos: ");
        Integer votosNulos = leitor.nextInt();
        
        System.out.println("Digite a quantidade de votos válidos: ");
        Integer votosValidos = leitor.nextInt();
        
        Integer porcBrancos = votosBrancos / (votosTotal / 100);
        Integer porcNulos = votosNulos / (votosTotal / 100);
        Integer porcValidos = votosValidos / (votosTotal / 100);
        
        System.out.println(String.format("Porcentagem de votos brancos: %%%d\n"
                + "Porcentagem de votos nulos: %%%d\n"
                + "Porcentagem de votos válidos: %%%d\n", porcBrancos, porcNulos, porcValidos));
        
    }
}
