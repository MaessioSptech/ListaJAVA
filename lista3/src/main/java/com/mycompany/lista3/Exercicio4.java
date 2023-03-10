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
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu sexo (m/f): ");
        String sexo = leitor.nextLine();
        
        System.out.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();
        
        if(sexo.equals("m")){
            System.out.println(String.format("Seu IMC é de %.1f.", (72.7 * altura - 58)));
        }else{
            System.out.println(String.format("Seu IMC é de %.1f.", (62.1 * altura - 44.7)));
        }
    }
}
