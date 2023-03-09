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
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o custo de fabricação do carro: ");
        Integer custoFab = leitor.nextInt();
        
        Integer custoTotal = (custoFab * 100) / 25;
        
        System.out.println("O custo para o consumidor é de R$" + custoTotal);
    }
}
