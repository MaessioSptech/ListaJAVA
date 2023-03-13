/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4;

/**
 *
 * @author Maecio
 */
public class UtilExercicio10 {
    void exibirCaracter(Integer num){
        
        Integer qtdCaracter = 0;
        
        for(int i = 1; i < num; i = i * 10){
            if(num / i > 0){
                qtdCaracter++;
            } else{
                i = num;
            }
        }
        
        System.out.println("Este número tem "+ qtdCaracter +" caracteres.");
        
    }
}
