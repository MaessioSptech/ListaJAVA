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
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nome[] = new String[5];
        
        for(int i = 0; i < 5; i++){
            System.out.println(String.format("Digite o %d° nome: ", i+1));
            nome[i] = leitor.nextLine();
        }
        
        System.out.println("Digite o nome que quer encontrar: ");
        String nomeDigitado = leitor.nextLine();
        
        Boolean item = false;
        
        for(int i = 0; i < nome.length; i++){
            if(nomeDigitado.equals(nome[i])){
                item = true;
            } 
        }
        
        if(item){
            System.out.println("ACHEI");
        }else{
            System.out.println("NÃO ACHEI");
        }
        
        for(int i = 0; i < nome.length; i++){
            System.out.println(nome[i]);
        }
    }
}
