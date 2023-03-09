/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

import java.util.Scanner;

/**
 *
 * @author Maecio
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite quanto tempo em segundo demora este evento: ");
        Integer duracao = leitor.nextInt();
        
        Integer horas = duracao / 3600;
        
        Integer minutos = (duracao % 3600) / 60;
        
        Integer segundos = ((duracao % 3600) % 60);
        
        System.out.println(String.format("Este processo demora %d hora(s),"
                + " %d minuto(s) e %d segundo(s).", horas, minutos, segundos));
        
    }
}
