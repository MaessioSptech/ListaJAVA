/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;

/**
 *
 * @author Maecio
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer num1 = leitor.nextInt();
        
        System.out.println("Digite um número: ");
        Integer num2 = leitor.nextInt();
        
        System.out.println("Digite um número: ");
        Integer num3 = leitor.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println("O número "+num1+" é maior que os outros");
        } else if(num2 > num3){
            System.out.println("O número "+num2+" é maior que os outros");
        }else{
            System.out.println("O número "+num3+" é maior que os outros");
        }
    }
}
