package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite um número: ");
            int a = sc.nextInt();

            System.out.println("Digite outro número: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e){
            System.out.println("Erro: Não dá para dividir por zero!");
        } catch (InputMismatchException ex){
            System.out.println("Erro: Você precisa inserir apenas números! ");
        } catch (Exception ex2){
            System.out.println("Erro: " + ex2.getMessage());
        }
    }
}