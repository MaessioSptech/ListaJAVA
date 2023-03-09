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
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Boolean cond = true;
        
        Integer numDigitado;
        
        while(cond){
            System.out.println("Digite um número: ");
            numDigitado = leitor.nextInt();
            
            if(numDigitado != 0){
                System.out.println("Valor válido.");
            }else{
                cond = false;
            }
        }
    }
}
