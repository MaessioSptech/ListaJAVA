/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4;

/**
 *
 * @author Maecio
 */
public class UtilExercicio8 {
    Double soma(Double num1, Double num2, Double num3){
        Double somaTotal = num1 + num2 + num3;
        
        return somaTotal;
    }
    
    Double media(Double num1, Double num2, Double num3){
        Double somaFinal = soma( num1, num2, num3);
        
        return somaFinal / 3;
    }
}
