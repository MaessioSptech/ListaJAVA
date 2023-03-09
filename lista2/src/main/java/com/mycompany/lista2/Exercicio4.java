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
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o tamanho de uma das arestas do triângulo: ");
        Double aresta = leitor.nextDouble();
        
        Double calculoArea = ((aresta * aresta) *  1.73205) / 4;
        
        System.out.println(calculoArea);
    }
}
