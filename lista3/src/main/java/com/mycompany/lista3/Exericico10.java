/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

/**
 *
 * @author Maecio
 */
public class Exericico10 {
    public static void main(String[] args) {
        
        Integer num1 = 1;
        Integer num2 = 1;
        
        System.out.println(num1);
        System.out.println(num2);
        
        Integer conta;
        
        for(int i = 3; i <= 15; i++){
            conta = num1 + num2;
            
            System.out.println(conta);
            
            num1 = num2;
            num2 = conta;
        }
    }
}
