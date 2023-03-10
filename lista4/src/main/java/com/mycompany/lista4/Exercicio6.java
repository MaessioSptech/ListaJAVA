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
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Double temp[] = new Double[7];
        
        Double soma = 0.0;
        
        Double maior = -999.9;
        Double menor = 999.9;
        
        for(int i = 0; i < 7; i++){
            System.out.println(String.format("Digite a temperatura média do %d° dia", i + 1));
            temp[i] = leitor.nextDouble();
            soma += temp[i];
            
            if(temp[i] > maior){
                maior = temp[i];
            } 
            if(temp[i] < menor){
                menor = temp[i];
            }
        }
        
        System.out.println("A menor temperatura da semana foi "+menor);
        System.out.println("A maior temperatura da semana foi "+maior);
        System.out.println(String.format("A média da temperatura da semana foi ", soma / 7));
        
        Integer qtdMenor = 0;
        
        for(int i = 0; i < 7; i++){
            if(temp[i] < (soma / 7)){
                qtdMenor++;
            }
        }
        
        System.out.println(String.format("Tivemos %d dias com temperatura a baixo da média", qtdMenor));
        
    }
}
