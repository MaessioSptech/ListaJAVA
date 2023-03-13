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
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        UtilExercicio8 util = new UtilExercicio8();
    
        System.out.println("Digite um número: ");
        Double num1 = leitor.nextDouble();
        
        System.out.println("Digite outro número: ");
        Double num2 = leitor.nextDouble();
        
        System.out.println("Digite o ultimo número: ");
        Double num3 = leitor.nextDouble();
        
        System.out.println(String.format("A soma dos três números é %.0f e sua média é %.0f.", (util.soma(num1, num2, num3)), (util.media(num1, num2, num3))));
    }
    
}
