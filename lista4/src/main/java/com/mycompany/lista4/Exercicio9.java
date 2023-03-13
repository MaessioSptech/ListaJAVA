/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4;

import java.util.Scanner;

/**
 *
 * @author Maecio
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        UtilExercicio9 util = new UtilExercicio9();
        
        System.out.println("Digite um número inteiro: ");
        Integer num = leitor.nextInt();
        
        util.verificarExibir(num);
    }
}
